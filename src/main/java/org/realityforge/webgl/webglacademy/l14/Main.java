package org.realityforge.webgl.webglacademy.l14;

import com.google.gwt.core.client.EntryPoint;
import elemental2.core.Float32Array;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.HTMLElement;
import elemental3.HTMLVideoElement;
import elemental3.Window;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLTexture;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry;

public final class Main
  implements EntryPoint
{
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER_SOURCE =
    "#version 300 es\n" +
    "in vec2 position;\n" +
    "in vec2 uv;\n" +
    "out vec2 v_uv;\n" +

    "void main()\n" +
    "{\n" +
    "  v_uv = uv;\n" +
    "  gl_Position = vec4(position, 1, 1);\n" +
    "}\n";
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    "#version 300 es\n" +
    "precision mediump float;\n" +
    "in vec2 v_uv;\n" +
    "out vec4 o_color;\n" +
    "uniform sampler2D u_textureData;\n" +
    "uniform sampler2D u_palette;\n" +

    "void main()\n" +
    "{\n" +
    "  vec4 color = texture(u_textureData, v_uv);\n" +

    // We avoid rounding errors
    "  color = floor(256.0 * color - vec4(0.01 / 256.0, 0.0, 0.0, 0.0)) / 256.0;\n" +
    "  color = clamp(color, vec4(0.0, 0.0, 0.0, 0.0), vec4(1.0, 1.0, 1.0, 1.0));\n" +

    // Get the index of the sub-square of the palette
    "  float blueBlock = floor(color.b * 256.0);\n" +

    // x and y index of the sub-square of the palette
    "  float yBlue = floor(blueBlock / 16.0) / 16.0;\n" +
    "  float xBlue = floor( (blueBlock - yBlue * 256.0) / 16.0) / 16.0;\n" +

    // uv coordinate of the color "color" on the palette
    "  vec2 paletteUv = vec2(color.r / 16.0 + yBlue, 1.0 - color.g / 16.0 - xBlue);\n" +

    // Lookup color in palette
    "  o_color = texture(u_palette, paletteUv);\n" +
    "}\n";
  private Mesh _mesh;
  private WebGLTexture _texture;
  private HTMLVideoElement _video;
  private double _lastFrameTime;
  private WebGLTexture _palette;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final AppState appState = AppState.create( CanvasUtil.getWebGL2RenderingContext( canvas ) );

    final Document document = Global.document();
    _video = (HTMLVideoElement) document.createElement( "video" );
    _video.src = "assets/video.ogv";
    _video.loop = true;
    _video.muted = true;
    _video.style().setProperty( "display", "none" );
    final HTMLElement body = document.body;
    assert null != body;

    body.appendChild( _video );
    _video.play();

    final double[] positionData =
      {
        -1, 1, -1, -1, 1, -1,
        1, 1, -1, 1, 1, -1
      };
    final double[] uvData =
      {
        0, 1, 0, 0, 1, 0,
        1, 1, 0, 1, 1, 0
      };
    final Geometry geometry =
      new Geometry( 6,
                    new Attribute( new Float32Buffer( new Float32Array( positionData ), 2 ) ),
                    new Attribute( new Float32Buffer( new Float32Array( uvData ), 2 ) ) );
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();
      GL.loadImage( "assets/palette_modified.jpg" )
        .thenAccept( image -> _palette = GL.prepareTexture( gl,
                                                            image,
                                                            false,
                                                            WebGL2RenderingContext.NEAREST,
                                                            WebGL2RenderingContext.NEAREST,
                                                            WebGL2RenderingContext.CLAMP_TO_EDGE,
                                                            WebGL2RenderingContext.CLAMP_TO_EDGE ) );
      final WebGLTexture texture = gl.createTexture();
      assert null != texture;
      gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, texture );

      gl.pixelStorei( WebGL2RenderingContext.UNPACK_FLIP_Y_WEBGL, 1 );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MAG_FILTER,
                        WebGL2RenderingContext.LINEAR );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_MIN_FILTER,
                        WebGL2RenderingContext.LINEAR );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_WRAP_S,
                        WebGL2RenderingContext.CLAMP_TO_EDGE );
      gl.texParameteri( WebGL2RenderingContext.TEXTURE_2D,
                        WebGL2RenderingContext.TEXTURE_WRAP_T,
                        WebGL2RenderingContext.CLAMP_TO_EDGE );
      _texture = texture;

      _mesh = new Mesh( geometry, new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE ) );
      _mesh.sendToGpu( gl );
    } );

    Global.requestAnimationFrame( t -> renderFrame( canvas, appState ) );
  }

  public void pushVideoFrameToTexture( @Nonnull final WebGL2RenderingContext gl )
  {
    final double time = _video.currentTime;
    // Only upload a frame if the video has a frame this render
    if ( _lastFrameTime != time )
    {
      gl.bindTexture( WebGL2RenderingContext.TEXTURE_2D, _texture );
      gl.texImage2D( WebGL2RenderingContext.TEXTURE_2D,
                     0,
                     WebGL2RenderingContext.RGB,
                     WebGL2RenderingContext.RGB,
                     WebGL2RenderingContext.UNSIGNED_BYTE,
                     _video );
      _lastFrameTime = time;
    }
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final AppState appState )
  {
    Global.requestAnimationFrame( t -> renderFrame( canvas, appState ) );
    if ( null == _texture )
    {
      return;
    }
    else if ( 0 == _video.currentTime )
    {
      return;
    }
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();

      pushVideoFrameToTexture( gl );

      CanvasUtil.resize( gl, canvas );
      gl.viewport( 0, 0, gl.drawingBufferWidth(), gl.drawingBufferHeight() );

      gl.clearColor( 1, 0, 0, 1 );
      gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
      gl.enable( WebGL2RenderingContext.DEPTH_TEST );
      gl.depthFunc( WebGL2RenderingContext.LEQUAL );

      _mesh.render( _texture, _palette );
      gl.flush();
    } );
  }
}
