package org.realityforge.webgl.glslfs.radar;

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
    "uniform float u_time;\n" +
    "float plot(float x, float y, float lineWidth, float edgeWidth)\n" +
    "{\n" +
    "  float lineWidthHalved = lineWidth / 2.0;" +
    "  return smoothstep(y - lineWidthHalved - edgeWidth, y - lineWidthHalved, x) - smoothstep(y + lineWidthHalved, y + lineWidthHalved + edgeWidth, x);" +
    "}\n" +
    "float circle(float x, float y, vec2 center, float radius, float lineWidth, float edgeWidth)\n" +
    "{\n" +
    "  float lineWidthHalved = lineWidth / 2.0;" +
    "  float distanceFromCenter = distance(vec2(x,y), center);" +
    "  return smoothstep(radius - lineWidthHalved - edgeWidth, radius - lineWidthHalved, distanceFromCenter) - smoothstep(radius + lineWidthHalved, radius + lineWidthHalved + edgeWidth, distanceFromCenter);" +
    "}\n" +
    "float sweep(float x, float y, vec2 center, float radius, float lineWidth, float edgeWidth)\n" +
    "{\n" +
    // How long does it take to make a full sweep
    "  float secondsPerRotation = 4.0;\n" +
    // Derive angle of sweep from time and convert into radians
    "  float theta = fract( u_time / secondsPerRotation ) * PI * 2.0;\n" +
    // The outer point of sweep that tracing around circle
    // Derived via basic trig
    "  vec2 sweepPoint = vec2(cos(theta), sin(theta)) * radius;\n" +

    // Pixel coordinate relative to center of cell
    "  vec2 relativePixelCoordinate = vec2(x, y) - center;\n" +
    // Project the pixel coordinate vector onto sweepPoint vector to see how similar the two vectors are and then divide
    // by dot(sweepPoint, sweepPoint) to normalize it between -1.0 to 1.0, then clamp the value 0.0 so anything on the
    // opposite side of the sweep arm is ignored.
    // Another way to to think of this is how far along the sweep vector would a normal need to be placed to intersect
    // the pixel of interest
    "  float h = clamp( dot(relativePixelCoordinate, sweepPoint) / dot(sweepPoint, sweepPoint), 0.0, 1.0 );\n" +

    // Then calculate the length of the normal from the sweep vector
    "  float l = distance(relativePixelCoordinate, sweepPoint * h);\n" +

    // Then decide how much of pixel we let through based on the length of the normal
    "  float sweepArm = 1.0 - smoothstep(lineWidth, lineWidth + edgeWidth, l);\n" +

    // The gradiant is the trail left behind by the sweep arm
    "  float sweepGradient = 0.0;\n" +

    // If we are inside our radar sweep
    "  if( length( relativePixelCoordinate ) < radius )\n" +
    "  {\n" +
    // How wide is the sweep angle?
    "     const float sweepGradiantAngle = 1.0;\n" +

    // atan calculates the angle between current pixel and center of radar but we need to mod it as u_time
    // is quite large. We also remove it from theta to produce the angle from the sweep
    "     float angle = mod(theta - atan(relativePixelCoordinate.y, relativePixelCoordinate.x), PI * 2.0);\n" +

    // What range do we want to restrict gradiant to?
    "     float maxGradiantContrib = 0.5;\n" +

    // If the pixel is within the gradiant arc then it will contribute
    "     sweepGradient = clamp(sweepGradiantAngle - angle, 0.0, sweepGradiantAngle) * maxGradiantContrib;\n" +
    "  }\n" +

    "  return sweepGradient + sweepArm;\n" +
    "}\n" +
    "void main()\n" +
    "{\n" +
    "  vec2 uv = gl_FragCoord.xy/u_resolution;" +

    "  vec3 axisColor = vec3(0.8);" +
    "  vec3 sweepColor = vec3(0.1, 0.3, 1.0);" +
    "  vec2 center = vec2(0.5);" +

    "  vec3 tempColor =\n" +
    "    circle(uv.x, uv.y, center, 0.1, 0.002, 0.001) * axisColor +\n" +
    "    circle(uv.x, uv.y, center, 0.2, 0.002, 0.001) * axisColor +\n" +
    "    circle(uv.x, uv.y, center, 0.3, 0.002, 0.001) * axisColor +\n" +
    "    plot(uv.x, 0.5, 0.002, 0.001) * axisColor +\n" +
    "    plot(uv.y, 0.5, 0.002, 0.001) * axisColor +\n" +
    "    sweep(uv.x, uv.y, center, 0.3, 0.003, 0.001) * sweepColor;\n" +
    "  color = vec4(tempColor, 1.0);" +
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

    _modelMatrix.translation( 0, 0, -1 );

    _viewMatrix.identity();

    gl.useProgram( _program );
    gl.bindVertexArray( _vertexArrayObject );
    gl.uniformMatrix4fv( _modelMatrixLocation, false, MathUtil.toFloat32Array( _modelMatrix ) );
    gl.uniformMatrix4fv( _viewMatrixLocation, false, MathUtil.toFloat32Array( _viewMatrix ) );
    gl.uniformMatrix4fv( _projectionMatrixLocation, false, MathUtil.toFloat32Array( _projectionMatrix ) );
    gl.uniform2f( _resolutionLocation, canvas.width, canvas.height );

    final float time = ( System.currentTimeMillis() - startedAt ) / 1000.0F;
    gl.uniform1f( _timeLocation, time );

    gl.drawElements( WebGL2RenderingContext.TRIANGLES, 6, WebGL2RenderingContext.UNSIGNED_SHORT, 0 );
  }
}
