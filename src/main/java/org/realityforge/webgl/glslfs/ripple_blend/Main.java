package org.realityforge.webgl.glslfs.ripple_blend;

import com.google.gwt.core.client.EntryPoint;
import elemental3.HTMLCanvasElement;
import elemental3.core.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLTexture;
import elemental3.gl.WebGLUniformLocation;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.Accessor;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.AttributeBuffer;
import org.realityforge.webgl.util.CanvasUtil;
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

    final WebGLProgram program = GL.createProgram( gl, vertexShaderSource, fragmentShaderSource );
    assert null != program;

    final AttributeBuffer positionBuffer = new AttributeBuffer( gl, new Float32Array( positions ), new Accessor( 2 ) );
    final Attribute a_position = new Attribute( positionBuffer, GL.getAttribLocation( gl, program, "a_position" ) );
    final AttributeBuffer textureCoordinatesBuffer =
      new AttributeBuffer( gl, new Float32Array( textureCoordinates ), new Accessor( 2 ) );
    final Attribute a_textureCoordinate =
      new Attribute( textureCoordinatesBuffer, GL.getAttribLocation( gl, program, "a_textureCoordinate" ) );

    GL.loadTexture( gl, "img/sa1.jpg" ).thenAccept( texture -> _texture1 = texture );
    GL.loadTexture( gl, "img/sa2.jpg" ).thenAccept( texture -> _texture2 = texture );

    u_resolution = GL.getUniformLocation( gl, program, "u_resolution" );
    u_time = GL.getUniformLocation( gl, program, "u_time" );
    u_image1 = GL.getUniformLocation( gl, program, "u_image1" );
    u_image2 = GL.getUniformLocation( gl, program, "u_image2" );

    // Start using the program for all vertexes pass through gl until the program is changed
    gl.useProgram( program );

    positionBuffer.allocate();
    textureCoordinatesBuffer.allocate();
    a_position.sendToGpu();
    a_textureCoordinate.sendToGpu();

    CanvasUtil.renderLoop( _canvas, gl, this::renderFrame );
  }

  private void renderFrame( @Nonnull final WebGL2RenderingContext gl )
  {
    if ( null == _texture1 || null == _texture2 )
    {
      return;
    }

    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT );

    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture1 );
    gl.uniform1i( u_image1, 0 );

    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 + 1 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture2 );
    gl.uniform1i( u_image2, 1 );

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
