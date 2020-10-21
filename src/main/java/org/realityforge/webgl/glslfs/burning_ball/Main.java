package org.realityforge.webgl.glslfs.burning_ball;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.Response;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLTexture;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.GL;
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

    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    "uniform float u_time;\n" +
    "void main()\n" +
    "{\n" +
    // get a turbulent 3d noise using the normal, normal to high freq
    // and add time to the noise parameters so it's animated
    "  v_noise = 10.0 * -0.1 * turbulence(0.5 * normal + u_time);\n" +

    // get a 3d noise using the position, low frequency
    // and add time to the noise parameters so it's animated
    "  float b = 5.0 * pnoise(0.05 * position + vec3( 2.0 * u_time ), vec3(100.0));\n" +
    // compose both noises
    //b = 5.0 * cnoise(position.xy);//spiky
    //b = 5.0 * cnoise(vUv);//smooth
    //b = 5.0 * cnoise(position);//super-spiky
    //b = turbulence(position);//smooth
    //b = srnoise(vUv, 0.0);
    "  float displacement = b - v_noise;\n" +

    // move the position along the normal and transform it
    "  vec3 newPosition = position + (normal *  displacement);\n" +

    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(newPosition, 1);\n" +
    "}\n";
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    "#version 300 es\n" +
    "precision mediump float;\n" +
    "in float v_noise;\n" +
    "uniform sampler2D u_tex;\n" +
    "out vec4 color;\n" +

    // <https://www.shadertoy.com/view/4dS3Wd>
    // By Morgan McGuire @morgan3d, http://graphicscodex.com

    //https://www.clicktorelease.com/blog/vertex-displacement-noise-3d-webgl-glsl-three-js/
    "float random( vec3 scale, float seed ){\n" +
    "  return fract( sin( dot( gl_FragCoord.xyz + seed, scale ) ) * 43758.5453 + seed ) ;\n" +
    "}\n" +
    "void main()\n" +
    "{\n" +
    // get a random offset
    "  float r = .01 * random( vec3( 12.9898, 78.233, 151.7182 ), 0.0 );" +
    // lookup vertically in the texture, using noise and offset
    // to get the right RGB colour
    "  vec2 uv = vec2( 0, 1.3 * v_noise + r );" +
    "  vec3 tColor = texture( u_tex, uv ).rgb;\n" +
    "  color = vec4( tColor, 1.0 );" +
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
  private WebGLTexture _texture;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final AppState appState = AppState.create( CanvasUtil.getWebGL2RenderingContext( canvas ) );

    _projectionMatrix.perspective( 45 * Math.PI / 180.0, canvas.width / ( (double) canvas.height ), 1, 10000 );

    Global
      .globalThis()
      .fetch( "materials/noise.shader" )
      .then( Response::text )
      .thenAccept( shaderPrefix -> appState.in( () -> {
        // This dynamic composition of shaders should be done at compile time
        @GLSL
        final String vertexShaderSource = "#version 300 es\n" + shaderPrefix + VERTEX_SHADER_SOURCE;
        final WebGL2RenderingContext gl = appState.gl();
                                                                       PolyhedronGeometryFactory.UVS |
        final Mesh mesh = new Mesh( PolyhedronGeometryFactory.createIsocahedron( WebGL2RenderingContext.TRIANGLES,
                                                                                 20,
                                                                                 4,
                                                                                 PolyhedronGeometryFactory.NORMALS ),
                                    new Material( gl, vertexShaderSource, FRAGMENT_SHADER_SOURCE ) );
        mesh.sendToGpu( gl );
        _mesh = mesh;
      } ) );
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();
      GL.loadTexture( gl, "img/explosion.png" ).thenAccept( texture -> _texture = texture );
    } );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, appState ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final AppState appState )
  {
    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, appState ) );
    if ( null == _mesh || null == _texture )
    {
      return;
    }
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();

      CanvasUtil.resize( gl, canvas );

      final Vector3f backgroundColor = _scene.getBackgroundColor();
      gl.clearColor( backgroundColor.x, backgroundColor.y, backgroundColor.z, 1 );
      gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
      gl.enable( WebGL2RenderingContext.DEPTH_TEST );

      _modelMatrix.identity();
      _modelMatrix.translate( 0, 0, -100 );
      _modelMatrix.rotateY( 0 );
      _modelMatrix.rotateX( 0.25 );

      _viewMatrix.identity();

      final float time = ( System.currentTimeMillis() - startedAt ) * 0.00025F;
      _mesh.render( _modelMatrix, _viewMatrix, _projectionMatrix, _texture, time );
    } );
  }
}
