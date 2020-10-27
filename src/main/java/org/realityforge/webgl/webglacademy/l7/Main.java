package org.realityforge.webgl.webglacademy.l7;

import com.google.gwt.core.client.EntryPoint;
import elemental2.core.Float32Array;
import elemental2.core.Uint32Array;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.Response;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.Geometry;
import org.realityforge.webgl.util.Uint32IndexBuffer;

public final class Main
  implements EntryPoint
{
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER_SOURCE =
    "#version 300 es\n" +
    "in vec3 position;\n" +
    "in vec3 normal;\n" +
    "in vec2 uv;\n" +
    "out vec2 v_uv;\n" +
    "out vec3 v_normal;\n" +
    "uniform mat4 projectionMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 modelMatrix;\n" +

    "void main()\n" +
    "{\n" +
    "  v_uv = uv;\n" +
    "  v_normal = vec3(modelMatrix * vec4(normal, 0.));\n" +
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(position, 1);\n" +
    "}\n";
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    "#version 300 es\n" +
    "precision mediump float;\n" +
    "in vec3 v_normal;\n" +
    "in vec2 v_uv;\n" +
    "out vec4 o_color;\n" +
    "uniform sampler2D u_textureData;\n" +

    // Hardcode all the light source parameters for the sake of convenience.
    // We could pass the lighting parameters in if we wanted
    "const vec3 source_ambient_color = vec3(1.0, 1.0, 1.0);\n" +
    "const vec3 source_diffuse_color = vec3(1.0, 2.0, 4.0);\n" +
    "const vec3 source_specular_color = vec3(1.0, 1.0, 1.0);\n" +
    "const vec3 source_direction = vec3(0.0, 0.0, 1.0);\n" +

    // Hardcode the material parameters. These could likewise be passed in
    // but we don't do it at this stage
    "const vec3 mat_ambient_color = vec3(0.3, 0.3, 0.3);\n" +
    "const vec3 mat_diffuse_color = vec3(1.0, 1.0, 1.0);\n" +
    "const vec3 mat_specular_color = vec3(1.0, 1.0, 1.0);\n" +
    "const float mat_shininess = 10.0;\n" +

    "void main()\n" +
    "{\n" +
    "  vec3 color = texture(u_textureData, v_uv).rgb;\n" +
    "  o_color = vec4(color, 1.0);" +
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
  private double _angle;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final AppState appState = AppState.create( CanvasUtil.getWebGL2RenderingContext( canvas ) );

    _projectionMatrix.perspective( 40 * Math.PI / 180.0, canvas.width / ( (double) canvas.height ), 1, 100 );

    Global
      .globalThis()
      .fetch( "assets/dragon.json" )
      .then( Response::json )
      .thenAccept( data -> appState.in( () -> {
        final Asset asset = data.cast();
        //Vertices are laid out as:
        // - 3 floats for position vertex,
        // - 3 floats for vertex normal,
        // -  floats for uv coordinates
        final int stride = 4 * ( 3 + 3 + 2 );
        final Float32Array vertices = new Float32Array( asset.getVertices() );
        final Float32Buffer positionBuffer =
          new Float32Buffer( vertices,
                             WebGL2RenderingContext.ARRAY_BUFFER,
                             WebGL2RenderingContext.STATIC_DRAW,
                             3,
                             false,
                             stride,
                             0 );
        final Float32Buffer normalBuffer =
          new Float32Buffer( vertices,
                             WebGL2RenderingContext.ARRAY_BUFFER,
                             WebGL2RenderingContext.STATIC_DRAW,
                             3,
                             false,
                             stride,
                             4 * 3 );
        final Float32Buffer uvBuffer =
          new Float32Buffer( vertices,
                             WebGL2RenderingContext.ARRAY_BUFFER,
                             WebGL2RenderingContext.STATIC_DRAW,
                             2,
                             false,
                             stride,
                             4 * ( 3 + 3 ) );
        final Geometry geometry =
          new Geometry( WebGL2RenderingContext.TRIANGLES,
                        0,
                        asset.getIndices().length,
                        new Uint32IndexBuffer( new Uint32Array( asset.getIndices() ) ),
                        new Attribute( positionBuffer ),
                        new Attribute( normalBuffer ),
                        new Attribute( uvBuffer ) );
        final WebGL2RenderingContext gl = appState.gl();
        _mesh = new Mesh( gl, geometry, new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE ) );
      } ) );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, appState ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final AppState appState )
  {
    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, appState ) );
    if ( null == _mesh || !_mesh.areTexturesLoaded() )
    {
      return;
    }
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();
      if ( _mesh.needsUploadToGpu() )
      {
        _mesh.sendToGpu( gl );
      }
      CanvasUtil.resize( gl, canvas );

      final Vector3f backgroundColor = _scene.getBackgroundColor();
      gl.clearColor( backgroundColor.x, backgroundColor.y, backgroundColor.z, 1 );
      gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
      gl.enable( WebGL2RenderingContext.DEPTH_TEST );

      _modelMatrix.translation( 0, -4, -20 );
      _modelMatrix.rotateY( _angle );
      _modelMatrix.rotateX( 0.25 );

      _viewMatrix.identity();

      _mesh.render( _modelMatrix, _viewMatrix, _projectionMatrix );
      gl.flush();
      _angle += 0.005;
    } );
  }
}
