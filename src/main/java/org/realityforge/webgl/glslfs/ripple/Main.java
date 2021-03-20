package org.realityforge.webgl.glslfs.ripple;

import akasha.HTMLCanvasElement;
import akasha.core.Float32Array;
import akasha.gl.GLSL;
import akasha.gl.WebGL2RenderingContext;
import akasha.gl.WebGLProgram;
import akasha.gl.WebGLUniformLocation;
import com.google.gwt.core.client.EntryPoint;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.Accessor;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.AttributeBuffer;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.TextureUniform;

public final class Main
  implements EntryPoint
{
  private TextureUniform u_image;
  private WebGLUniformLocation u_resolution;
  private WebGLUniformLocation u_time;
  private final long startedAt = System.currentTimeMillis();
  private HTMLCanvasElement _canvas;

  @Override
  public void onModuleLoad()
  {
    _canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( _canvas );

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
      "uniform float u_time;\n" +
      "uniform vec2 u_resolution;\n" +
      "uniform sampler2D u_image;\n" +

      "void main()\n" +
      "{\n" +
      "  const float rippleDuration = 2.0;\n" +
      "  vec2 uv = gl_FragCoord.xy/u_resolution;\n" +
      // Convert it into the range -1.0 to 1.0
      "  vec2 p = uv * 2.0 - 1.0;\n" +
      // Length of p relative to center of image in new space
      "  float len = length(p);\n" +
      // p/len is the unit vector for vector from center to pixel
      // the rest creates the ripple
      "  vec2 ripple = uv + p / len * 0.03 * cos(len * 12.0 - u_time * 4.0);\n" +
      // add delay between ripples between ripples
      "  float delta = (((sin(u_time) + 1.0) / 2.0) * rippleDuration) / rippleDuration;\n" +

      // Determine whether we are rippling or resting
      "  vec2 st = mix(ripple, uv, delta);\n" +

      // Flip image and get texture coordinate based on whether we are rippling ot nor
      "  color = vec4(texture(u_image, vec2(1.0) - st).rgb, 1.0);\n" +
      "}\n";

    final WebGLProgram program = GL.createProgram( gl, vertexShaderSource, fragmentShaderSource );
    assert null != program;

    final AttributeBuffer positionsBuffer =
      new AttributeBuffer( gl, new Float32Array( positions ), new Accessor( 2 ) );
    final Attribute a_position = new Attribute( positionsBuffer, GL.getAttribLocation( gl, program, "a_position" ) );
    final AttributeBuffer textureCoordinatesBuffer =
      new AttributeBuffer( gl, new Float32Array( textureCoordinates ), new Accessor( 2 ) );
    final Attribute a_textureCoordinate =
      new Attribute( textureCoordinatesBuffer, GL.getAttribLocation( gl, program, "a_textureCoordinate" ) );

    u_image = new TextureUniform( gl, program, "u_image", "img/4KSample.jpg", 0 );
    u_resolution = GL.getUniformLocation( gl, program, "u_resolution" );
    u_time = GL.getUniformLocation( gl, program, "u_time" );

    // Start using the program for all vertexes pass through gl until the program is changed
    gl.useProgram( program );

    positionsBuffer.allocate();
    textureCoordinatesBuffer.allocate();
    a_position.sendToGpu();
    a_textureCoordinate.sendToGpu();

    CanvasUtil.renderLoop( _canvas, gl, this::renderFrame );
  }

  private void renderFrame( @Nonnull final WebGL2RenderingContext gl )
  {
    if ( !u_image.isReady() )
    {
      return;
    }
    else
    {
      u_image.sendToGpu( gl );
    }

    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT );

    final float time = ( ( System.currentTimeMillis() - startedAt ) / 50.0F ) / (float) ( 2 * Math.PI );
    gl.uniform1f( u_time, time );
    gl.uniform2f( u_resolution, _canvas.width, _canvas.height );

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 6 );
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
