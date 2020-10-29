package org.realityforge.webgl.webglacademy.l8;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.HTMLElement;
import elemental3.HTMLVideoElement;
import elemental3.Window;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLTexture;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.Geometry;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.util.Scene;
import org.realityforge.webgl.util.geometries.CuboidGeometryFactory;

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
    "in vec2 v_uv;\n" +
    "out vec4 o_color;\n" +
    "uniform sampler2D u_textureData;\n" +

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
  private HTMLVideoElement _video;
  private WebGLTexture _texture;
  private double _lastFrameAt = -1;

  @Override
  public void onModuleLoad()
  {
    final Window window = Global.globalThis();
    final Document document = window.document();
    _video = (HTMLVideoElement) document.createElement( "video" );
    _video.src = "assets/video.ogv";
    _video.loop = true;
    _video.muted = true;
    _video.style().setProperty( "display", "none" );
    final HTMLElement body = document.body;
    assert null != body;
    body.appendChild( _video );
    _video.play();

    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final AppState appState = AppState.create( CanvasUtil.getWebGL2RenderingContext( canvas ) );

    _projectionMatrix.perspective( MathUtil.degreesToRadians( 40 ), CanvasUtil.getAspect( canvas ), 1, 100 );

    final Geometry geometry =
      CuboidGeometryFactory.create( WebGL2RenderingContext.TRIANGLES,
                                    5,
                                    5,
                                    5,
                                    1,
                                    1,
                                    1,
                                    CuboidGeometryFactory.NORMALS | CuboidGeometryFactory.UVS );
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();
      _mesh = new Mesh( geometry, new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE ) );
      _mesh.sendToGpu( gl );

      _texture = Objects.requireNonNull( gl.createTexture() );
      gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
      gl.pixelStorei( WebGL2RenderingContext.UNPACK_FLIP_Y_WEBGL, 1 );
      gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MAG_FILTER,
                        WebGL2RenderingContext.NEAREST );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MIN_FILTER,
                        WebGL2RenderingContext.NEAREST );

      // The video texture is not POT (Power Of Two). So we cannot use
      // default clamp mode which is GL.REPEAT (tiling). We change that.
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_WRAP_S,
                        WebGL2RenderingContext.CLAMP_TO_EDGE );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_WRAP_T,
                        WebGL2RenderingContext.CLAMP_TO_EDGE );

      // Make sure texture is unbound to stop accidents happening...
      gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, null );
    } );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, appState ) );
  }

  private void refreshTexture( @Nonnull final WebGL2RenderingContext gl )
  {
    // Upload the current frame of the video to texture
    gl.activeTexture( WebGL2RenderingContext.TEXTURE0 );
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture );
    gl.texImage2D( WebGL2RenderingContext.TEXTURE_2D,
                   0,
                   WebGL2RenderingContext.RGBA,
                   WebGL2RenderingContext.RGBA,
                   WebGL2RenderingContext.UNSIGNED_BYTE,
                   _video );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final AppState appState )
  {
    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, appState ) );
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();
      CanvasUtil.resize( gl, canvas );

      final Vector3f backgroundColor = _scene.getBackgroundColor();
      gl.clearColor( backgroundColor.x, backgroundColor.y, backgroundColor.z, 1 );
      gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
      gl.enable( WebGL2RenderingContext.DEPTH_TEST );

      final double currentTime = _video.currentTime;
      if ( currentTime > 0 )
      {
        _modelMatrix.translation( 0, 1, -20 );
        _modelMatrix.rotateY( _angle );
        _modelMatrix.rotateX( 0.25 );

        _viewMatrix.identity();

        if ( _lastFrameAt != currentTime )
        {
          refreshTexture( gl );
          _lastFrameAt = currentTime;
        }

        _mesh.render( _modelMatrix, _viewMatrix, _projectionMatrix, _texture );
      }
      gl.flush();
      _angle += 0.005;
    } );
  }
}
