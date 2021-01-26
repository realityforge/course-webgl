package org.realityforge.webgl.cube2;

import com.google.gwt.core.client.EntryPoint;
import elemental3.HTMLCanvasElement;
import elemental3.core.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.vecmath.Vector4d;
import org.realityforge.webgl.util.Accessor;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.AttributeBuffer;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.Geometry2;
import org.realityforge.webgl.util.MathUtil;

public final class Main
  implements EntryPoint
{
  // Vertices position data
  private static final double[] POSITIONS = new double[]
    {
      -0.5, -0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, 0.5, -0.5,
      0.5, 0.5, -0.5,
      -0.5, 0.5, -0.5,
      -0.5, -0.5, -0.5,

      -0.5, -0.5, 0.5,
      0.5, -0.5, 0.5,
      0.5, 0.5, 0.5,
      0.5, 0.5, 0.5,
      -0.5, 0.5, 0.5,
      -0.5, -0.5, 0.5,

      -0.5, 0.5, 0.5,
      -0.5, 0.5, -0.5,
      -0.5, -0.5, -0.5,
      -0.5, -0.5, -0.5,
      -0.5, -0.5, 0.5,
      -0.5, 0.5, 0.5,

      0.5, 0.5, 0.5,
      0.5, 0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, -0.5, 0.5,
      0.5, 0.5, 0.5,

      -0.5, -0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, -0.5, 0.5,
      0.5, -0.5, 0.5,
      -0.5, -0.5, 0.5,
      -0.5, -0.5, -0.5,

      -0.5, 0.5, -0.5,
      0.5, 0.5, -0.5,
      0.5, 0.5, 0.5,
      0.5, 0.5, 0.5,
      -0.5, 0.5, 0.5,
      -0.5, 0.5, -0.5
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
    // The output vertex color that will be fed to the next shader
    "out vec4 fcolor;\n" +
    "\n" +
    // Instance data contain colors for all the instances
    "uniform vec4 u_colors[3];\n" +
    // Instance data containing x positions for all the instances
    "uniform vec3 u_xOffsets;\n" +
    // The following are the uniforms (aka constant across multiple vertices)
    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    // The main program/kernel
    "void main()\n" +
    "{\n" +
    // Copy position from input to output, converting to vec4 by adding using 1 for 4th dimension
    // and transforming via model/view/project matrices
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(position.x + u_xOffsets[gl_InstanceID], position.y, position.z, 1);" +
    // Copy color from instance array based on current instance
    "  fcolor = u_colors[gl_InstanceID];" +
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
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _viewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();
  // Cube rotation angle
  private double _angle;
  private Geometry2 _geometry2;
  private Material _material;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _projectionMatrix.setPerspective( MathUtil.degreesToRadians( 45 ), CanvasUtil.getAspect( canvas ), 0.1, 10.0 );

    _geometry2 = new Geometry2( gl,
                                WebGL2RenderingContext.TRIANGLE_FAN,
                                0,
                                36,
                                3,
                                null,
                                new Attribute( new AttributeBuffer( gl,
                                                                    new Float32Array( POSITIONS ),
                                                                    new Accessor( 3 ) ) ) );
    _material = new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE );
    _geometry2.getAttribute( 0 ).setLocation( _material.getPositionIndex() );
    _geometry2.allocate();

    CanvasUtil.renderLoop( canvas, gl, this::renderFrame );
  }

  private void renderFrame( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    _modelMatrix.setTranslation( 0, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    _viewMatrix.setIdentity();

    gl.useProgram( _material.getProgram() );
    final Vector4d[] colors = { new Vector4d( 1, 0, 0, 1 ),
                                new Vector4d( 0, 1, 0, 1 ),
                                new Vector4d( 0, 0, 1, 1 ) };
    final Vector3f offsets = new Vector3f( -2, 0, 2 );

    gl.uniformMatrix4fv( _material.getModelMatrixLocation(), false, new Float32Array( _modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getViewMatrixLocation(), false, new Float32Array( _viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getProjectionMatrixLocation(), false,
                         new Float32Array( _projectionMatrix.toArray() ) );
    gl.uniform4fv( _material.getColorsLocation1(), new Float32Array( colors[ 0 ].toArray() ) );
    gl.uniform4fv( _material.getColorsLocation2(), new Float32Array( colors[ 1 ].toArray() ) );
    gl.uniform4fv( _material.getColorsLocation3(), new Float32Array( colors[ 2 ].toArray() ) );
    gl.uniform3fv( _material.getOffsetsLocation(), new Float32Array( offsets.toArray() ) );

    _angle += 0.1;

    _geometry2.drawInstanced( 3 );
  }
}
