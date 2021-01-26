package org.realityforge.webgl.glslfs.brick;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.core.Float32Array;
import elemental3.core.Uint16Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLUniformLocation;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.webgl.util.Accessor;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.AttributeBuffer;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry2;
import org.realityforge.webgl.util.IndexBuffer;
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
  private Geometry2 _geometry;

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

    _geometry = new Geometry2( gl,
                               WebGL2RenderingContext.TRIANGLES,
                               0,
                               6,
                               new IndexBuffer( gl,
                                                new Uint16Array( INDEXES ),
                                                WebGL2RenderingContext.UNSIGNED_SHORT ),
                               new Attribute( new AttributeBuffer( gl,
                                                                   new Float32Array( POSITIONS ),
                                                                   new Accessor( 3 ) ),
                                              GL.getAttribLocation( gl, _program, "position" ) ) );
    _geometry.allocate();

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
    gl.uniformMatrix4fv( _modelMatrixLocation, false, new Float32Array( _modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _viewMatrixLocation, false, new Float32Array( _viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _projectionMatrixLocation, false, new Float32Array( _projectionMatrix.toArray() ) );
    gl.uniform2f( _resolutionLocation, canvas.width, canvas.height );

    _geometry.draw();
  }
}
