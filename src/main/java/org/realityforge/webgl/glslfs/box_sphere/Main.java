package org.realityforge.webgl.glslfs.box_sphere;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.geometries.CuboidGeometryFactory;

public final class Main
  implements EntryPoint
{
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER_SOURCE =
    "#version 300 es\n" +
    "in vec3 position;\n" +
    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    "uniform float u_time;\n" +
    "void main()\n" +
    "{\n" +
    // circle position is the position when pushed out to surface of sphere of specified radius
    "  float radius = 2.0;\n" +
    "  vec3 circlePosition = normalize(position) * radius;\n" +

    // merge between the box to the sphere and back as time passes
    "  float delta = (sin(u_time) + 1.0) / 2.0;\n" +
    "  vec3 finalPosition = mix(position, circlePosition, delta);\n" +

    // Transform from objectspace to clipspace
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(finalPosition, 1);\n" +
    "}\n";
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    "#version 300 es\n" +
    "precision mediump float;\n" +
    "out vec4 color;\n" +
    "void main()\n" +
    "{\n" +
    "  color = vec4(vec3(1.0), 1.0);" +
    "}\n";
  // Cube rotation angle
  private static double c_angle;
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _viewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();
  @Nonnull
  private final Scene _scene = new Scene();
  private Mesh _mesh;
  private final long startedAt = System.currentTimeMillis();

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final AppState appState = AppState.create( CanvasUtil.getWebGL2RenderingContext( canvas ) );

    _projectionMatrix.perspective( 45 * Math.PI / 180.0, canvas.clientWidth() / ( (double) canvas.clientHeight() ), 0.1, 10.0 );

    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();
      _mesh = new Mesh( CuboidGeometryFactory.create( WebGL2RenderingContext.LINE_LOOP, 2, 2, 2, 5, 5, 5 ),
                        new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE ) );
      _mesh.sendToGpu( gl );
    } );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, appState ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final AppState appState )
  {
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();

      CanvasUtil.resize( gl, canvas );

      final Vector3f backgroundColor = _scene.getBackgroundColor();
      gl.clearColor( backgroundColor.x, backgroundColor.y, backgroundColor.z, 1 );
      gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
      gl.enable( WebGL2RenderingContext.DEPTH_TEST );

      _modelMatrix.translation( 0, 0, -7 );
      _modelMatrix.rotateY( c_angle );
      _modelMatrix.rotateX( 0.25 );

      _viewMatrix.identity();

      final float time = ( ( System.currentTimeMillis() - startedAt ) / 100.0F ) / (float) ( 2 * Math.PI );
      _mesh.render( _modelMatrix, _viewMatrix, _projectionMatrix, time );

      c_angle += 0.01;
    } );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, appState ) );
  }
}
