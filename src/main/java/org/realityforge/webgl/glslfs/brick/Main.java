package org.realityforge.webgl.glslfs.brick;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Float32Array;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.Uint16Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
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
    "#define PI 3.1415926538\n" +
    "precision mediump float;\n" +
    "out vec4 color;\n" +
    "uniform vec2 u_resolution;\n" +
    "float plot(float x, float y, float lineWidth, float edgeWidth)\n" +
    "{\n" +
    "  float lineWidthHalved = lineWidth / 2.0;" +
    "  return smoothstep(y - lineWidthHalved - edgeWidth, y - lineWidthHalved, x) - smoothstep(y + lineWidthHalved, y + lineWidthHalved + edgeWidth, x);" +
    "}\n" +
    "float brick(float x, float y, float lineWidth, float edgeWidth)\n" +
    "{\n" +
    // First the 3 horizontal lines
    "  return plot(0.0, y, lineWidth, edgeWidth) + " +
    "         plot(0.5, y, lineWidth, edgeWidth) +" +
    "         plot(1.0, y, lineWidth, edgeWidth) + " +

    // Then three vertical line segments
    "         (\n" +
    "           y > 0.5 ? \n" +
    "           plot(x, 0.0, lineWidth, edgeWidth) + plot(x, 1.0, lineWidth, edgeWidth) :\n" +
    "           plot(x, 0.5, lineWidth, edgeWidth)" +
    "         );" +
    "}\n" +
    "void main()\n" +
    "{\n" +
    "  vec2 uv = gl_FragCoord.xy/u_resolution;" +

    // This line effectively tiles it 10 times in each dimension
    "  uv = fract(uv * 10.0);" +

    "  float lightFactor = brick(uv.x, uv.y, 0.05, 0.001);" +
    "  color = mix(vec4(203.0/256.0, 65.0/256.0, 84.0/256.0, 1.0), vec4(40.0/256.0, 40.0/256.0, 40.0/256.0, 1.0), lightFactor);" +
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
  private WebGLVertexArrayObject _vertexArrayObject;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _projectionMatrix.perspective( MathUtil.degreesToRadians( 45 ), CanvasUtil.getAspect( canvas ), 0.1, 10.0 );

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

    final int positionIndex = gl.getAttribLocation( _program, "position" );
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

    _modelMatrix.translation( 0, 0, -1 );

    _viewMatrix.identity();

    gl.useProgram( _program );
    gl.bindVertexArray( _vertexArrayObject );
    gl.uniformMatrix4fv( _modelMatrixLocation, false, MathUtil.toFloat32Array( _modelMatrix ) );
    gl.uniformMatrix4fv( _viewMatrixLocation, false, MathUtil.toFloat32Array( _viewMatrix ) );
    gl.uniformMatrix4fv( _projectionMatrixLocation, false, MathUtil.toFloat32Array( _projectionMatrix ) );
    gl.uniform2f( _resolutionLocation, canvas.width, canvas.height );

    gl.drawElements( WebGL2RenderingContext.TRIANGLES, 6, WebGL2RenderingContext.UNSIGNED_SHORT, 0 );
  }
}
