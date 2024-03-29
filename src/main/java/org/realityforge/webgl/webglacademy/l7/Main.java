package org.realityforge.webgl.webglacademy.l7;

import akasha.HTMLCanvasElement;
import akasha.Response;
import akasha.WindowGlobal;
import akasha.core.Float32Array;
import akasha.core.Uint32Array;
import akasha.gl.GLSL;
import akasha.gl.WebGL2RenderingContext;
import com.google.gwt.core.client.EntryPoint;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.Accessor;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.AttributeBuffer;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.Geometry;
import org.realityforge.webgl.util.IndexBuffer;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.util.Scene;

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
    "out vec3 v_positionInCameraSpace;\n" +
    "uniform mat4 projectionMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 modelMatrix;\n" +

    "void main()\n" +
    "{\n" +
    "  v_uv = uv;\n" +
    "  v_normal = vec3(modelMatrix * vec4(normal, 0.));\n" +
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(position, 1);\n" +
    "  v_positionInCameraSpace = (viewMatrix * modelMatrix * vec4(position, 1)).xyz;\n" +
    "}\n";
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    "#version 300 es\n" +
    "precision mediump float;\n" +
    "in vec3 v_normal;\n" +
    "in vec2 v_uv;\n" +
    "in vec3 v_positionInCameraSpace;\n" +
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

    // Ambient intensity is a function of the light and the material properties
    "  vec3 ambientIntensity = source_ambient_color * mat_ambient_color;\n" +

    // Diffuse lighting is proportional to the scalar product between point normal and lighting direction.
    "  vec3 diffuseIntensity = source_diffuse_color * mat_diffuse_color * max(0.0, dot(v_normal, source_direction));\n" +

    // Specular lighting requires the view vector, ie the vector between the point and
    // the camera. Unlike ambient and diffuse lighting, specular lighting depends on
    // the position of the camera.
    "  vec3 V = normalize(v_positionInCameraSpace);\n" +
    "  vec3 R = reflect(source_direction, v_normal);\n" +
    "  vec3 specularIntensity = source_specular_color * mat_specular_color * pow(max(dot(R,V),0.0), mat_shininess);\n" +

    // Calculate the final color
    "  vec3 intensity = ambientIntensity + diffuseIntensity + specularIntensity;\n" +
    "  o_color = vec4(intensity * color, 1.0);" +
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

    _projectionMatrix.setPerspective( MathUtil.degreesToRadians( 40 ), CanvasUtil.getAspect( canvas ), 1, 100 );

    WindowGlobal
      .fetch( "assets/dragon.json" )
      .then( Response::json )
      .thenAccept( data -> appState.in( () -> {
        final Asset asset = data.cast();
        final WebGL2RenderingContext gl = appState.gl();
        //Vertices are laid out as:
        // - 3 floats for position vertex,
        // - 3 floats for vertex normal,
        // -  floats for uv coordinates
        final int stride = 4 * ( 3 + 3 + 2 );
        final Float32Array vertices = new Float32Array( asset.getVertices() );
        final AttributeBuffer positionBuffer =
          new AttributeBuffer( gl,
                               vertices,
                               WebGL2RenderingContext.STATIC_DRAW,
                               new Accessor( 3, WebGL2RenderingContext.FLOAT, stride, 0 ) );
        final AttributeBuffer normalBuffer =
          new AttributeBuffer( gl,
                               vertices,
                               WebGL2RenderingContext.STATIC_DRAW,
                               new Accessor( 3, WebGL2RenderingContext.FLOAT, stride, 4 * 3 ) );
        final AttributeBuffer uvBuffer =
          new AttributeBuffer( gl,
                               vertices,
                               WebGL2RenderingContext.STATIC_DRAW,
                               new Accessor( 2, WebGL2RenderingContext.FLOAT, stride, 4 * ( 3 + 3 ) ) );
        final Geometry geometry =
          new Geometry( WebGL2RenderingContext.TRIANGLES,
                        0,
                        asset.getIndices().length,
                        new IndexBuffer( gl,
                                         new Uint32Array( asset.getIndices() ),
                                         WebGL2RenderingContext.UNSIGNED_INT ),
                        new Attribute( positionBuffer ),
                        new Attribute( normalBuffer ),
                        new Attribute( uvBuffer ) );
        _mesh = new Mesh( gl, geometry, new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE ) );
      } ) );

    WindowGlobal.requestAnimationFrame( t -> renderFrame( canvas, appState ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final AppState appState )
  {
    WindowGlobal.requestAnimationFrame( t -> renderFrame( canvas, appState ) );
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

      final Vector3f clearColor = _scene.getClearColor();
      gl.clearColor( clearColor.x, clearColor.y, clearColor.z, 1 );
      gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
      gl.enable( WebGL2RenderingContext.DEPTH_TEST );

      _modelMatrix.setTranslation( 0, -4, -20 );
      _modelMatrix.rotateY( _angle );
      _modelMatrix.rotateX( 0.25 );

      _viewMatrix.setIdentity();

      _mesh.render( _modelMatrix, _viewMatrix, _projectionMatrix );
      gl.flush();
      _angle += 0.005;
    } );
  }
}
