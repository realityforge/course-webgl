package org.realityforge.webgl.webglacademy.l10;

import akasha.HTMLCanvasElement;
import akasha.WindowGlobal;
import akasha.core.ArrayBufferView;
import akasha.gl.GLSL;
import akasha.gl.WebGL2RenderingContext;
import akasha.gl.WebGLFramebuffer;
import akasha.gl.WebGLRenderbuffer;
import akasha.gl.WebGLTexture;
import com.google.gwt.core.client.EntryPoint;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.GL;
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
    "in vec2 uv;\n" +
    "out vec2 v_uv;\n" +
    "uniform mat4 projectionMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 modelMatrix;\n" +

    "void main()\n" +
    "{\n" +
    "  v_uv = uv;\n" +
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(position, 1);\n" +
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
  private final Matrix4d _innerBoxModelMatrix = new Matrix4d();
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
  private WebGLTexture _renderTargetTexture;
  private WebGLTexture _texture;
  private WebGLFramebuffer _framebuffer;
  private WebGLRenderbuffer _renderbuffer;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final AppState appState = AppState.create( CanvasUtil.getWebGL2RenderingContext( canvas ) );

    _projectionMatrix.setPerspective( MathUtil.degreesToRadians( 40 ), CanvasUtil.getAspect( canvas ), 1, 100 );

    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();
      final Geometry geometry =
        CuboidGeometryFactory.create( gl,
                                      WebGL2RenderingContext.TRIANGLES,
                                      5,
                                      5,
                                      5,
                                      1,
                                      1,
                                      1,
                                      CuboidGeometryFactory.UVS );
      GL.loadTexture( gl, "img/StoreLogo.png" ).thenAccept( texture -> _texture = texture );

      _mesh = new Mesh( geometry, new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE ) );
      _mesh.sendToGpu( gl );

      final WebGLFramebuffer framebuffer = gl.createFramebuffer();
      assert null != framebuffer;
      _framebuffer = framebuffer;
      gl.bindFramebuffer( WebGL2RenderingContext.DRAW_FRAMEBUFFER, _framebuffer );

      final WebGLRenderbuffer renderbuffer = gl.createRenderbuffer();
      assert null != renderbuffer;
      _renderbuffer = renderbuffer;
      gl.bindRenderbuffer( WebGL2RenderingContext.RENDERBUFFER, _renderbuffer );
      gl.renderbufferStorage( WebGL2RenderingContext.RENDERBUFFER, WebGL2RenderingContext.DEPTH_COMPONENT16, 512, 512 );

      _renderTargetTexture = Objects.requireNonNull( gl.createTexture() );
      gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _renderTargetTexture );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MAG_FILTER,
                        WebGL2RenderingContext.LINEAR );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MIN_FILTER,
                        WebGL2RenderingContext.LINEAR );
      gl.texImage2D( WebGL2RenderingContext.TEXTURE_2D,
                     0,
                     WebGL2RenderingContext.RGBA,
                     512,
                     512,
                     0,
                     WebGL2RenderingContext.RGBA,
                     WebGL2RenderingContext.UNSIGNED_BYTE,
                     (ArrayBufferView) null );

      // Bind the framebuffer to the the texture
      gl.framebufferTexture2D( WebGL2RenderingContext.DRAW_FRAMEBUFFER,
                               WebGL2RenderingContext.COLOR_ATTACHMENT0,
                               WebGL2RenderingContext.TEXTURE_2D,
                               _renderTargetTexture,
                               0 );

      // Bind the renderbuffer to the framebuffer
      gl.framebufferRenderbuffer( WebGL2RenderingContext.DRAW_FRAMEBUFFER,
                                  WebGL2RenderingContext.DEPTH_ATTACHMENT,
                                  WebGL2RenderingContext.RENDERBUFFER,
                                  _renderbuffer );

      // Make sure everything is unbound to stop accidents happening...
      gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, null );
      gl.bindRenderbuffer( WebGL2RenderingContext.RENDERBUFFER, null );
      gl.bindFramebuffer( WebGL2RenderingContext.DRAW_FRAMEBUFFER, null );
    } );

    WindowGlobal.requestAnimationFrame( t -> renderFrame( canvas, appState ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final AppState appState )
  {
    WindowGlobal.requestAnimationFrame( t -> renderFrame( canvas, appState ) );
    if ( null == _texture )
    {
      return;
    }
    appState.in( () -> {

      // Simulation part
      simulation();

      final WebGL2RenderingContext gl = appState.gl();

      renderToTexture( gl );

      CanvasUtil.resize( gl, canvas );
      // Force the viewport as when we were rendering to the framebuffer we reset it
      gl.viewport( 0, 0, gl.drawingBufferWidth(), gl.drawingBufferHeight() );

      final Vector3f clearColor = _scene.getClearColor();
      gl.clearColor( clearColor.x, clearColor.y, clearColor.z, 1 );
      gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
      gl.enable( WebGL2RenderingContext.DEPTH_TEST );

      _mesh.render( _modelMatrix, _viewMatrix, _projectionMatrix, _renderTargetTexture );
      gl.flush();
    } );
  }

  // Run the application logic/ non-rendering logic
  private void simulation()
  {
    _innerBoxModelMatrix.setTranslation( 0, 1, -20 );
    _innerBoxModelMatrix.rotateZ( _angle );
    _innerBoxModelMatrix.rotateY( _angle * 2 );
    _innerBoxModelMatrix.rotateX( 0.15 );

    _modelMatrix.setTranslation( 0, 1, -20 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );
    _angle += 0.005;

    _viewMatrix.setIdentity();
  }

  private void renderToTexture( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.bindFramebuffer( WebGL2RenderingContext.DRAW_FRAMEBUFFER, _framebuffer );
    // Match the dimensions of the texture we are rendering to
    gl.viewport( 0, 0, 512, 512 );

    gl.clearColor( 0.2F, 0.2F, 0.2F, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    _mesh.render( _innerBoxModelMatrix, _viewMatrix, _projectionMatrix, _texture );

    gl.flush();
    gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, null );
    gl.bindFramebuffer( WebGL2RenderingContext.DRAW_FRAMEBUFFER, null );
  }
}
