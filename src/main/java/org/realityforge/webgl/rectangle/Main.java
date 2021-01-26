package org.realityforge.webgl.rectangle;

import com.google.gwt.core.client.EntryPoint;
import elemental3.HTMLCanvasElement;
import elemental3.core.Float32Array;
import elemental3.core.Uint16Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.webgl.util.Accessor;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.AttributeBuffer;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.Geometry2;
import org.realityforge.webgl.util.IndexBuffer;
import org.realityforge.webgl.util.MathUtil;

public final class Main
  implements EntryPoint
{
  // indexes into vertex attribute buffers
  private static final double[] INDEXES = new double[]
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
  // Vertices color data in RGBA form
  private static final double[] COLORS = new double[]
    {
      1.0, 0.0, 0.0, 1.0,
      1.0, 0.0, 0.0, 1.0,
      1.0, 0.0, 0.0, 1.0,
      1.0, 0.0, 0.0, 1.0
    };
  // The vertex shader that will be run for every vertex
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER_SOURCE =
    // The shader language is OpenGL 3 (i.e. 300) ES and this version pragma must
    // be the first thing present in the shader source
    "#version 300 es\n" +
    // The incoming vertex position
    "in vec3 position;\n" +
    // The incoming vertex color
    "in vec4 color;\n" +
    // The output vertex color that will be fed to the next shader
    "out vec4 fcolor;\n" +
    "\n" +
    // The following are the unions (aka constant across multiple vertices)
    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    // The main program/kernel
    "void main()\n" +
    "{\n" +
    // Copy position from input to output, converting to vec4 by adding using 1 for 4th dimension
    // and transforming via model/view/project matrices
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(position, 1);" +
    // Copy color from input to output
    "  fcolor = color;" +
    "}\n";
  // The fragment shader that will be run for every pixel
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    // The version of language in use
    "#version 300 es\n" +
    // There is no default precision for floats in fragment shaders so specify it
    "precision mediump float;\n" +
    // The incoming fragment color
    "in vec4 fcolor;\n" +
    // The output fragment color
    "out vec4 finalColor;\n" +
    "" +
    // The main program/kernel
    "void main()\n" +
    "{\n" +
    // Copy color from input to output
    "  finalColor = fcolor;" +
    "}\n";
  // Cube rotation angle
  private static double c_angle;
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _viewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();
  private Geometry2 _geometry;
  private Material _material;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _projectionMatrix.setPerspective( MathUtil.degreesToRadians( 45 ), CanvasUtil.getAspect( canvas ), 0.1, 10.0 );

    _geometry =
      new Geometry2( gl,
                     WebGL2RenderingContext.TRIANGLES,
                     0,
                     6,
                     new IndexBuffer( gl, new Uint16Array( INDEXES ), WebGL2RenderingContext.UNSIGNED_SHORT ),
                     new Attribute( new AttributeBuffer( gl,
                                                         new Float32Array( POSITIONS ),
                                                         new Accessor( 3 ) ) ),
                     new Attribute( new AttributeBuffer( gl,
                                                         new Float32Array( COLORS ),
                                                         new Accessor( 4 ) ) ) );
    _material = new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE );
    _geometry.getAttribute( 0 ).setLocation( _material.getPositionIndex() );
    _geometry.getAttribute( 1 ).setLocation( _material.getColorIndex() );
    _geometry.allocate();

    CanvasUtil.renderLoop( canvas, gl, this::renderFrame );
  }

  private void renderFrame( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    _modelMatrix.setTranslation( 0, 0, -7 );
    _modelMatrix.rotateY( c_angle );
    _modelMatrix.rotateX( 0.25 );

    _viewMatrix.setIdentity();

    gl.useProgram( _material.getProgram() );
    gl.uniformMatrix4fv( _material.getModelMatrixLocation(), false, new Float32Array( _modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getViewMatrixLocation(), false, new Float32Array( _viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getProjectionMatrixLocation(),
                         false,
                         new Float32Array( _projectionMatrix.toArray() ) );

    _geometry.draw();

    c_angle += 0.1;
  }
}
