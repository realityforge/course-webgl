package org.realityforge.webgl.glslfs.ripple_blend;

import com.google.gwt.core.client.EntryPoint;
import elemental2.core.Float32Array;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import elemental3.gl.WebGLTexture;
import elemental3.gl.WebGLUniformLocation;
import javax.annotation.Nonnull;
import elemental3.gl.GLSL;
import org.realityforge.webgl.util.BufferAttributeBinding;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.GL;

public final class Main
  implements EntryPoint
{
  private WebGLTexture _texture1;
  private WebGLTexture _texture2;
  private WebGLUniformLocation u_resolution;
  private WebGLUniformLocation u_time;
  private WebGLUniformLocation u_image1;
  private WebGLUniformLocation u_image2;
  private WebGL2RenderingContext _gl;
  private final long startedAt = System.currentTimeMillis();

  @Override
  public void onModuleLoad()
  {
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
      "uniform int u_index;\n" +
      "uniform float u_time;\n" +
      "uniform vec2 u_resolution;\n" +
      "uniform sampler2D u_image1;\n" +
      "uniform sampler2D u_image2;\n" +

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

      "  vec3 color1 = texture(u_image1, vec2(1.0) - uv).rgb;\n" +
      "  vec3 color2 = texture(u_image2, vec2(1.0) - uv).rgb;\n" +

      "  float fade = smoothstep(delta * 1.4, delta * 2.5, len);\n" +

    // Flip image and get texture coordinate based on whether we are rippling ot nor
      "  color = vec4(mix(color2, color1, fade).rgb, 1.0);\n" +
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

    final BufferAttributeBinding a_position =
      new BufferAttributeBinding( _gl,
                                  program,
                                  "a_position",
                                  new Float32Buffer( _gl, new Float32Array( positions ), 2 ) );
    final BufferAttributeBinding a_textureCoordinate =
      new BufferAttributeBinding( _gl,
                                  program,
                                  "a_textureCoordinate",
                                  new Float32Buffer( _gl, new Float32Array( textureCoordinates ), 2 ) );

    GL.loadTexture( _gl, "img/sa1.jpg" ).thenAccept( texture -> _texture1 = texture );
    GL.loadTexture( _gl, "img/sa2.jpg" ).thenAccept( texture -> _texture2 = texture );

    u_resolution = getUniformLocation( _gl, program, "u_resolution" );
    u_time = getUniformLocation( _gl, program, "u_time" );
    u_image1 = getUniformLocation( _gl, program, "u_image1" );
    u_image2 = getUniformLocation( _gl, program, "u_image2" );

    // Start using the program for all vertexes pass through gl until the program is changed
    _gl.useProgram( program );

    a_position.sendToGpu( _gl );
    a_textureCoordinate.sendToGpu( _gl );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas )
  {
    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas ) );
    if ( null == _texture1 || null == _texture2 )
    {
      return;
    }
    CanvasUtil.resize( _gl, canvas );

    _gl.clearColor( 0, 0, 0, 1 );
    _gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT );

    _gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
    _gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture1 );
    _gl.uniform1i( u_image1, 0 );

    _gl.activeTexture( WebGL2RenderingContext.TEXTURE0 + 1 );
    _gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture2 );
    _gl.uniform1i( u_image2, 1 );

    final float time = ( ( System.currentTimeMillis() - startedAt ) / 50.0F ) / (float) ( 2 * Math.PI );
    _gl.uniform1f( u_time, time );
    _gl.uniform2f( u_resolution, canvas.width, canvas.height );

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

  @Nonnull
  private static WebGLUniformLocation getUniformLocation( @Nonnull final WebGL2RenderingContext gl,
                                                          @Nonnull final WebGLProgram program,
                                                          @Nonnull final String name )
  {
    final WebGLUniformLocation location = gl.getUniformLocation( program, name );
    assert null != location;
    return location;
  }
}
