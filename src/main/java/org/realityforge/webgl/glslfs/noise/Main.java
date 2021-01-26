package org.realityforge.webgl.glslfs.noise;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.core.Float32Array;
import elemental3.core.Uint16Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLUniformLocation;
import elemental3.gl.WebGLVertexArrayObject;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
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
    // uv is the input coordinate, seed is some value added to
    "float random( vec2 uv, float seed )\n" +
    "{\n" +
    // These magic number constants are used to produce randomness
    // a/b MUST not divide into each other otherwise it will be less random with stripes
    "  const float a = 12.987;" +
    "  const float b = 73.921;" +
    "  const float c = 47243.22137;" +
    "  return fract( sin( dot( uv, vec2( a, b ) ) + seed ) * c );" +
    "}\n" +
    "void main()\n" +
    "{\n" +
    "  vec2 uv = gl_FragCoord.xy/u_resolution;" +
    "  vec3 outputColor = random(uv, u_time) * vec3(1.0);" +
    "  color = vec4(outputColor, 1.0);" +
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
  private WebGLVertexArrayObject _vertexArrayObject;
  private final long startedAt = System.currentTimeMillis();

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _projectionMatrix.setPerspective( MathUtil.degreesToRadians( 45 ), CanvasUtil.getAspect( canvas ), 0.1, 10.0 );

    final WebGLProgram program = GL.createProgram( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE );
    assert null != program;
    _program = program;
    _modelMatrixLocation = GL.getUniformLocation( gl, _program, "modelMatrix" );
    _viewMatrixLocation = GL.getUniformLocation( gl, _program, "viewMatrix" );
    _projectionMatrixLocation = GL.getUniformLocation( gl, _program, "projectionMatrix" );
    _resolutionLocation = GL.getUniformLocation( gl, _program, "u_resolution" );
    _timeLocation = GL.getUniformLocation( gl, _program, "u_time" );

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

    Global.requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final WebGL2RenderingContext gl )
  {
    Global.requestAnimationFrame( t -> renderFrame( canvas, gl ) );
    CanvasUtil.resize( gl, canvas );

    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    _modelMatrix.setTranslation( 0, 0, -1 );

    _viewMatrix.setIdentity();

    gl.useProgram( _program );
    gl.bindVertexArray( _vertexArrayObject );
    gl.uniformMatrix4fv( _modelMatrixLocation, false, new Float32Array( _modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _viewMatrixLocation, false, new Float32Array( _viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _projectionMatrixLocation, false, new Float32Array( _projectionMatrix.toArray() ) );
    gl.uniform2f( _resolutionLocation, canvas.width, canvas.height );
    final float time = ( ( System.currentTimeMillis() - startedAt ) / 1000.0F ) / (float) ( 2 * Math.PI );
    gl.uniform1f( _timeLocation, time );

    gl.drawElements( WebGL2RenderingContext.TRIANGLES, 6, WebGL2RenderingContext.UNSIGNED_SHORT, 0 );
  }
}
