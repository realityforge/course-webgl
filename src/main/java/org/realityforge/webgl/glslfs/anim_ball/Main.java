package org.realityforge.webgl.glslfs.anim_ball;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.Response;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.util.Scene;
import org.realityforge.webgl.util.geometries.PolyhedronGeometryFactory;

public final class Main
  implements EntryPoint
{
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER_SOURCE =

    "\n" +
    "in vec3 position;\n" +
    "in vec3 normal;\n" +
    "in vec2 uv;\n" +
    "out float v_noise;\n" +
    "out vec2 v_uv;\n" +
    "out vec3 v_normal;\n" +

    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    "uniform float u_time;\n" +
    "void main()\n" +
    "{\n" +
    // get a turbulent 3d noise using the normal, normal to high freq
    // and add time to the noise parameters so it's animated
    "  v_noise = 10.0 * -0.1 * turbulence(0.5 * normal * u_time);\n" +

    // get a 3d noise using the position, low frequency
    // and add time to the noise parameters so it's animated
    "  float b = 5.0 * pnoise(0.05 * position + vec3( 0.3 * u_time ), vec3(100.0));\n" +
    // compose both noises
    //b = 5.0 * cnoise(position.xy);//spiky
    //b = 5.0 * cnoise(vUv);//smooth
    //b = 5.0 * cnoise(position);//super-spiky
    //b = turbulence(position);//smooth
    //b = srnoise(vUv, 0.0);
    "  float displacement = b - 10.0 * v_noise;\n" +

    // move the position along the normal and transform it
    "  vec3 newPosition = position + (normal *  0.1 * displacement);\n" +
    "  v_uv = uv;\n" +
    "  v_normal = normal;\n" +

    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(newPosition, 1);\n" +
    "}\n";
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    "#version 300 es\n" +
    "precision mediump float;\n" +
    "in vec3 v_normal;\n" +
    "in vec2 v_uv;\n" +
    "in float v_noise;\n" +
    "out vec4 color;\n" +
    "void main()\n" +
    "{\n" +
    "  color = vec4(vec3(v_uv * ( 1.0 - 2.0 * v_noise ), 0.0 ), 1.0);" +
    "}\n";
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

    _projectionMatrix.setPerspective( MathUtil.degreesToRadians( 45 ), CanvasUtil.getAspect( canvas ), 0.1, 10.0 );

    Global
      .fetch( "materials/noise.shader" )
      .then( Response::text )
      .thenAccept( shaderPrefix -> appState.in( () -> {
        // This dynamic composition of shaders should be done at compile time
        @GLSL
        final String vertexShaderSource = "#version 300 es\n" + shaderPrefix + VERTEX_SHADER_SOURCE;
        final WebGL2RenderingContext gl = appState.gl();
        _mesh = new Mesh( PolyhedronGeometryFactory.createIsocahedron( gl,
                                                                       WebGL2RenderingContext.TRIANGLES,
                                                                       1,
                                                                       4,
                                                                       PolyhedronGeometryFactory.UVS |
                                                                       PolyhedronGeometryFactory.NORMALS ),
                          new Material( gl, vertexShaderSource, FRAGMENT_SHADER_SOURCE ) );
        _mesh.sendToGpu( gl );
      } ) );

    Global.requestAnimationFrame( t -> renderFrame( canvas, appState ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final AppState appState )
  {
    Global.requestAnimationFrame( t -> renderFrame( canvas, appState ) );
    if ( null == _mesh )
    {
      return;
    }
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();

      CanvasUtil.resize( gl, canvas );

      final Vector3f clearColor = _scene.getClearColor();
      gl.clearColor( clearColor.x, clearColor.y, clearColor.z, 1 );
      gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
      gl.enable( WebGL2RenderingContext.DEPTH_TEST );

      _modelMatrix.setTranslation( 0, 0, -7 );
      _modelMatrix.rotateY( 0 );
      _modelMatrix.rotateX( 0.25 );

      _viewMatrix.setIdentity();

      final float time = ( ( System.currentTimeMillis() - startedAt ) / 100.0F ) / (float) ( 2 * Math.PI );
      _mesh.render( _modelMatrix, _viewMatrix, _projectionMatrix, time );
    } );
  }
}
