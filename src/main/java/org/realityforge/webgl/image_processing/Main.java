package org.realityforge.webgl.image_processing;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Document;
import elemental3.Float32Array;
import elemental3.Global;
import elemental3.HTMLButtonElement;
import elemental3.HTMLCanvasElement;
import elemental3.HTMLElement;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.BoolUniform;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.FloatUniform;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.TextureUniform;
import org.realityforge.webgl.util.VecfUniform;

public final class Main
  implements EntryPoint
{
  private TextureUniform u_image;
  private TextureUniform u_colorPalette;
  private BoolUniform u_isGrayscale;
  private BoolUniform u_isColorPalette;
  private BoolUniform u_isKernel;
  private BoolUniform u_isInverse;
  private WebGL2RenderingContext _gl;

  @Override
  public void onModuleLoad()
  {
    final Document document = Global.document();
    final HTMLElement body = document.body;
    assert null != body;
    final HTMLButtonElement button1 = (HTMLButtonElement) document.createElement( "button" );
    button1.textContent = "Greyscale";
    button1.onclick = e -> updateMode( true, false, false, false );
    body.appendChild( button1 );

    final HTMLButtonElement button2 = (HTMLButtonElement) document.createElement( "button" );
    button2.textContent = "Inverse";
    button2.onclick = e -> updateMode( false, true, false, false );
    body.appendChild( button2 );

    final HTMLButtonElement button3 = (HTMLButtonElement) document.createElement( "button" );
    button3.textContent = "Apply Image Kernel";
    button3.onclick = e -> updateMode( false, false, true, false );
    body.appendChild( button3 );

    final HTMLButtonElement button4 = (HTMLButtonElement) document.createElement( "button" );
    button4.textContent = "Apply Color Palette";
    button4.onclick = e -> updateMode( false, false, false, true );
    body.appendChild( button4 );

    final HTMLButtonElement button5 = (HTMLButtonElement) document.createElement( "button" );
    button5.textContent = "Reset";
    button5.onclick = e -> updateMode( false, false, false, false );
    body.appendChild( button5 );

    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    _gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    final double[] positions = prepareRectVec2( -1.0, -1.0, 1.0, 1.0 );
    final double[] textureCoordinates = prepareRectVec2( 0.0, 0.0, 1.0, 1.0 );

    @GLSL
    final String vertexShaderSource =
      "#version 300 es\n" +
      "precision mediump float;\n" +
      "in vec2 a_position;\n" +
      "in vec2 a_textureCoordinate;\n" +
      "out vec2 v_textureCoordinate;\n" +
      "void main () {\n" +
      "  gl_Position = vec4(a_position.x, a_position.y * -1.0, 0.0, 1.0);\n" +
      "  v_textureCoordinate = a_textureCoordinate;\n" +
      "}\n";

    // The fragment shader that will be run for every pixel
    @GLSL
    final String fragmentShaderSource =
      "#version 300 es\n" +
      "precision mediump float;\n" +
      "in vec2 v_textureCoordinate;\n" +
      "out vec4 color;\n" +
      "uniform sampler2D u_image;\n" +
      "uniform sampler2D u_colorPalette;\n" +
      "uniform float u_kernel[9];\n" +
      "uniform float u_kernelWeight;\n" +

      // Arbitrary flags for applying some processing
      // Should only have one boolen set to true ... worst design ever
      "uniform bool u_isGrayscale;\n" +
      "uniform bool u_isInverse;\n" +
      "uniform bool u_isKernel;\n" +
      "uniform bool u_isColorPalette;\n" +

      "vec4 applyKernel() {\n" +
      // compute 1 pixel in texture coordinates.
      "  ivec2 dims = textureSize(u_image, 0);\n" +
      "  vec2 onePixel = 1.0 / vec2(dims);\n " +
      // Compute the unweighted value based on the kernel
      "  vec4 values =\n" +
      "    texture(u_image, v_textureCoordinate + onePixel * vec2(-1, -1)) * u_kernel[0] +\n" +
      "    texture(u_image, v_textureCoordinate + onePixel * vec2(0, -1)) * u_kernel[1] +\n" +
      "    texture(u_image, v_textureCoordinate + onePixel * vec2(1, -1)) * u_kernel[2] +\n" +
      "    texture(u_image, v_textureCoordinate + onePixel * vec2(-1, 0)) * u_kernel[3] +\n" +
      "    texture(u_image, v_textureCoordinate + onePixel * vec2(0, 0)) * u_kernel[4] +\n" +
      "    texture(u_image, v_textureCoordinate + onePixel * vec2(1, 0)) * u_kernel[5] +\n" +
      "    texture(u_image, v_textureCoordinate + onePixel * vec2(-1, 1)) * u_kernel[6] +\n" +
      "    texture(u_image, v_textureCoordinate + onePixel * vec2(0, 1)) * u_kernel[7] +\n" +
      "    texture(u_image, v_textureCoordinate + onePixel * vec2(1, 1)) * u_kernel[8];\n" +
      "\n" +
      "  return vec4(vec3((values/u_kernelWeight).rgb), 1.0);\n" +
      "}\n" +
      "void main()\n" +
      "{\n" +
      "  if (u_isGrayscale) {\n" +
      "    vec4 tex = texture(u_image, v_textureCoordinate);\n" +
      "    float newPixelVal = tex.r * 0.59 +  tex.g * 0.30 +  tex.b * 0.11;\n" +
      "    color = vec4(vec3(newPixelVal), 1.0);\n" +
      "  } else if (u_isInverse) {\n" +
      "    vec4 tex = texture(u_image, v_textureCoordinate);\n" +
      "    color = vec4(1.0 - tex.rgb, 1.0);\n" +
      "  } else if (u_isKernel) {\n" +
      "        color = applyKernel();\n" +
      "  } else if (u_isColorPalette) {\n" +
      "    vec4 tex = texture(u_image, v_textureCoordinate);\n" +
      "    color = texture(u_colorPalette, vec2(1.0 - tex.r, 0.0));\n" +
      "  } else {\n" +
      "    color = texture(u_image, v_textureCoordinate);\n" +
      "  }\n" +
      "}\n";

    // Build and compile the vertex shader
    final WebGLShader vertexShader = GL.createShader( _gl, WebGL2RenderingContext.VERTEX_SHADER, vertexShaderSource );
    assert null != vertexShader;

    final WebGLShader fragmentShader =
      GL.createShader( _gl, WebGL2RenderingContext.FRAGMENT_SHADER, fragmentShaderSource );
    assert null != fragmentShader;

    // Combine the shaders into a program
    final WebGLProgram program = GL.createProgram( _gl, vertexShader, fragmentShader );
    assert null != program;

    final Attribute a_position =
      new Attribute( new Float32Buffer( _gl, new Float32Array( positions ), 2 ),
                     GL.getAttribLocation( _gl, program, "a_position" ) );
    final Attribute a_textureCoordinate =
      new Attribute( new Float32Buffer( _gl, new Float32Array( textureCoordinates ), 2 ),
                     GL.getAttribLocation( _gl, program, "a_textureCoordinate" ) );

    u_image = new TextureUniform( _gl, program, "u_image", "img/4KSample.jpg", 0 );
    u_colorPalette = new TextureUniform( _gl, program, "u_colorPalette", "img/ColorPalette.jpg", 1 );
    u_isGrayscale = new BoolUniform( _gl, program, "u_isGrayscale", false );
    u_isInverse = new BoolUniform( _gl, program, "u_isInverse", false );
    u_isKernel = new BoolUniform( _gl, program, "u_isKernel", false );
    u_isColorPalette = new BoolUniform( _gl, program, "u_isColorPalette", false );

    // Kernel Weight = su of each kernel element
    final FloatUniform u_kernelWeight = new FloatUniform( _gl, program, "u_kernelWeight", 2 );
    final double[] sharpenKernel = new double[]{ -1, -1, -1, -1, 10, -1, -1, -1, -1 };
    final VecfUniform u_kernel =
      new VecfUniform( _gl, program, "u_kernel", new Float32Array( sharpenKernel ) );

    // Start using the program for all vertexes pass through gl until the program is changed
    _gl.useProgram( program );

    a_position.sendToGpu( _gl );
    a_textureCoordinate.sendToGpu( _gl );
    u_isGrayscale.sendToGpu( _gl );
    u_isInverse.sendToGpu( _gl );
    u_isKernel.sendToGpu( _gl );
    u_isColorPalette.sendToGpu( _gl );
    u_kernelWeight.sendToGpu( _gl );
    u_kernel.sendToGpu( _gl );

    Global.requestAnimationFrame( t -> renderFrame( canvas ) );
  }

  private void updateMode( final boolean greyScale,
                           final boolean inverse,
                           final boolean imageKernel,
                           final boolean colorPalette )
  {
    u_isGrayscale.setValue( greyScale );
    u_isInverse.setValue( inverse );
    u_isKernel.setValue( imageKernel );
    u_isColorPalette.setValue( colorPalette );
    u_isGrayscale.sendToGpu( _gl );
    u_isInverse.sendToGpu( _gl );
    u_isKernel.sendToGpu( _gl );
    u_isColorPalette.sendToGpu( _gl );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas )
  {
    Global.requestAnimationFrame( t -> renderFrame( canvas ) );
    if ( !u_image.isReady() || !u_colorPalette.isReady() )
    {
      return;
    }
    else
    {
      u_image.sendToGpu( _gl );
      u_colorPalette.sendToGpu( _gl );
    }
    CanvasUtil.resize( _gl, canvas );

    _gl.clearColor( 0, 0, 0, 1 );
    _gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT );

    _gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 6 );
  }

  @SuppressWarnings( "SameParameterValue" )
  @Nonnull
  private double[] prepareRectVec2( final double startX, final double startY, final double endX, final double endY )
  {
    return new double[]
      {
        startX, startY,
        endX, startY,
        startX, endY,
        startX, endY,
        endX, endY,
        endX, startY
      };
  }
}
