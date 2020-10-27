package org.realityforge.webgl.glslfs.texture_fire;

import com.google.gwt.core.client.EntryPoint;
import elemental2.core.Float32Array;
import elemental2.core.Uint16Array;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import elemental3.gl.WebGLTexture;
import elemental3.gl.WebGLUniformLocation;
import elemental3.gl.WebGLVertexArrayObject;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.MathUtil;

public final class Main
  implements EntryPoint
{
  // indexes into vertex attribute buffers
  public static final double[] INDEXES = new double[]
    {
      // Triangle 1
      0, 1, 2,
      // Triangle 2
      0, 2, 3
    };
  // Vertices position data
  private static final double[] POSITIONS = new double[]
    {
      -1.0, -1.0, 0.0, //0
      1.0, -1.0, 0.0, //1
      1.0, 1.0, 0.0, //2
      -1.0, 1.0, 0.0 //3
    };
  // The vertex shader that will be run for every vertex
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER_SOURCE =
    "#version 300 es\n" +
    "in vec3 position;\n" +
    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    "void main()\n" +
    "{\n" +
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(position, 1);" +
    "}\n";
  // The fragment shader that will be run for every pixel
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    "#version 300 es\n" +
    "precision mediump float;\n" +
    "out vec4 color;\n" +
    "uniform vec2 u_resolution;\n" +
    "uniform float u_time;\n" +
    "uniform sampler2D u_textureData;\n" +
    // uv is the input coordinate
    "float random( vec2 uv )\n" +
    "{\n" +
    // These magic number constants are used to produce randomness
    // a/b MUST not divide into each other otherwise it will be less random with stripes
    "  const float a = 12.987;" +
    "  const float b = 73.921;" +
    "  const float c = 47243.22137;" +
    "  return fract( sin( dot( uv, vec2( a, b ) ) ) * c );" +
    "}\n" +
    // 2D Noise based on Morgan McGuire @morgan3d
    // https://www.shadertoy.com/view/4dS3Wd
    "float noise(vec2 st) {\n" +
    "    vec2 i = floor(st);\n" +
    "    vec2 f = fract(st);\n" +

    // Four corners in 2D of a tile
    "    float a = random(i);\n" +
    "    float b = random(i + vec2(1.0, 0.0));\n" +
    "    float c = random(i + vec2(0.0, 1.0));\n" +
    "    float d = random(i + vec2(1.0, 1.0));\n" +
    // Smooth Interpolation
    // Cubic Hermine Curve. same as SmoothStep() ala u = smoothstep(0.,1.,f)
    "    vec2 u = f*f*(3.0-2.0*f);\n" +
    // Mix 4 corners percentages
    "    return mix(a, b, u.x) +\n" +
    "           (c - a) * u.y * (1.0 - u.x) +\n" +
    "           (d - b) * u.x * u.y;\n" +
    "}\n" +
    "void main()\n" +
    "{\n" +
    // red
    "  vec3 color1 = vec3(1.0, 0.0, 0.0);" +
    // yellow
    "  vec3 color2 = vec3(1.0, 1.0, 0.0);" +

    "  vec2 uv = gl_FragCoord.xy/u_resolution;" +

    "  float x = noise(vec2(uv.x * 1.4 + 0.01, uv.y - u_time * 0.69) * 9.0) + \n" +
    "            noise(vec2(uv.x * 0.5 - 0.033, uv.y * 2.0 - u_time * 0.12) * 6.0) + \n" +
    "            noise(vec2(uv.x * 0.94 + 0.02, uv.y * 3.0 - u_time * 0.61) * 4.0);\n" +
    "  float y = noise(vec2(uv.x * 0.7 - 0.01, uv.y - u_time * 0.27) * 9.0) + \n" +
    "            noise(vec2(uv.x * 0.45 + 0.033, uv.y * 1.9 - u_time * 0.61) * 6.0) + \n" +
    "            noise(vec2(uv.x * 0.8 - 0.02, uv.y * 2.5 - u_time * 0.51) * 4.0);\n" +

    // This is partially based on lesson and partially based on
    // https://clockworkchilli.com/blog/8_a_fire_shader_in_glsl_for_your_webgl_games

    "  float perturb = (1.0 - uv.x) * 0.35 + 0.02;\n" +
    "  x = (x * perturb) + x - 0.02;\n" +
    "  y = (y * perturb) + y - 0.02;\n" +
    "  color = vec4(mix(color1, color2, (y * x) / 3.0), 1.0);\n" +

    "  color.a = texture( u_textureData, vec2(x,y) ).b * 0.3 + texture( u_textureData, 1.0 - uv ).b;\n" +

    "}\n";
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _viewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();
  private WebGLProgram _program;
  private WebGLUniformLocation _modelMatrixLocation;
  private WebGLUniformLocation _viewMatrixLocation;
  private WebGLUniformLocation _projectionMatrixLocation;
  private WebGLUniformLocation _resolutionLocation;
  private WebGLUniformLocation _timeLocation;
  private WebGLUniformLocation _textureLocation;
  private WebGLVertexArrayObject _vertexArrayObject;
  private final long startedAt = System.currentTimeMillis();
  private WebGLTexture _texture;
  private boolean _sentToCPU;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _projectionMatrix.perspective( 45 * Math.PI / 180.0, canvas.clientWidth() / ( (double) canvas.clientHeight() ), 0.1, 10.0 );

    final WebGLShader vertexShader = GL.createShader( gl, WebGL2RenderingContext.VERTEX_SHADER, VERTEX_SHADER_SOURCE );
    final WebGLShader fragmentShader =
      GL.createShader( gl, WebGL2RenderingContext.FRAGMENT_SHADER, FRAGMENT_SHADER_SOURCE );
    assert null != vertexShader;
    assert null != fragmentShader;
    final WebGLProgram program = GL.createProgram( gl, vertexShader, fragmentShader );
    assert null != program;
    _program = program;
    _modelMatrixLocation = GL.getUniformLocation( gl, _program, "modelMatrix" );
    _viewMatrixLocation = GL.getUniformLocation( gl, _program, "viewMatrix" );
    _projectionMatrixLocation = GL.getUniformLocation( gl, _program, "projectionMatrix" );
    _resolutionLocation = GL.getUniformLocation( gl, _program, "u_resolution" );
    _timeLocation = GL.getUniformLocation( gl, _program, "u_time" );
    _textureLocation = GL.getUniformLocation( gl, _program, "u_textureData" );

    GL.loadTexture( gl, "img/flame.png" ).thenAccept( texture -> _texture = texture );

    final int positionIndex = GL.getAttribLocation( gl, _program, "position" );
    final WebGLVertexArrayObject vertexArrayObject = gl.createVertexArray();
    assert null != vertexArrayObject;
    // A bound vertexArrayObject will record the subsequent binds
    gl.bindVertexArray( vertexArrayObject );

    _vertexArrayObject = vertexArrayObject;

    // The ELEMENT_ARRAY_BUFFER is accessed later "magically" via drawElements call
    GL.prepareBuffer( gl,
                      WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER,
                      WebGL2RenderingContext.STATIC_DRAW,
                      new Uint16Array( INDEXES ) );
    final WebGLBuffer positionBuffer = GL.prepareBuffer( gl,
                                                         WebGL2RenderingContext.ARRAY_BUFFER,
                                                         WebGL2RenderingContext.STATIC_DRAW,
                                                         new Float32Array( POSITIONS ) );
    // Tell GPU to load position data into program from out buffer
    GL.sendToGpu( gl,
                  positionBuffer,
                  positionIndex,
                  WebGL2RenderingContext.ARRAY_BUFFER,
                  3,
                  WebGL2RenderingContext.FLOAT,
                  0,
                  0 );
    gl.bindVertexArray( null );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final WebGL2RenderingContext gl )
  {
    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, gl ) );
    if ( null == _texture )
    {
      return;
    }
    else if ( !_sentToCPU )
    {
      _sentToCPU = true;
      gl.useProgram( _program );
      gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
      gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture );
      gl.uniform1i( _textureLocation, 0 );
    }
    CanvasUtil.resize( gl, canvas );

    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    _modelMatrix.translation( 0, 0, -1 );

    _viewMatrix.identity();

    gl.useProgram( _program );
    gl.bindVertexArray( _vertexArrayObject );
    gl.uniformMatrix4fv( _modelMatrixLocation, false, MathUtil.toFloat32Array( _modelMatrix ) );
    gl.uniformMatrix4fv( _viewMatrixLocation, false, MathUtil.toFloat32Array( _viewMatrix ) );
    gl.uniformMatrix4fv( _projectionMatrixLocation, false, MathUtil.toFloat32Array( _projectionMatrix ) );
    gl.uniform2f( _resolutionLocation, canvas.width, canvas.height );
    final float time = ( ( System.currentTimeMillis() - startedAt ) / 50.0F ) / (float) ( 2 * Math.PI );
    gl.uniform1f( _timeLocation, time );

    gl.drawElements( WebGL2RenderingContext.TRIANGLES, 6, WebGL2RenderingContext.UNSIGNED_SHORT, 0 );
  }
}
