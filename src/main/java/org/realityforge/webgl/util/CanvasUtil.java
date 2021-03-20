package org.realityforge.webgl.util;

import akasha.Document;
import akasha.Element;
import akasha.Global;
import akasha.HTMLCanvasElement;
import akasha.HTMLElement;
import akasha.RenderContextType;
import akasha.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

public final class CanvasUtil
{
  private CanvasUtil()
  {
  }

  @Nonnull
  public static HTMLCanvasElement createCanvas()
  {
    final Document document = Global.document();
    final HTMLCanvasElement canvas = (HTMLCanvasElement) document.createElement( "canvas" );
    final HTMLElement body = document.body;
    assert null != body;
    body.appendChild( canvas );
    return canvas;
  }

  @JsFunction
  public interface RenderFunction
  {
    void renderFrame( @Nonnull WebGL2RenderingContext gl );
  }

  public static void renderLoop( @Nonnull final HTMLCanvasElement canvas,
                                 @Nonnull final WebGL2RenderingContext gl,
                                 @Nonnull final RenderFunction renderFunction )
  {
    Global.requestAnimationFrame( t -> renderFrame( canvas, gl, renderFunction ) );
    CanvasUtil.resize( gl, canvas );
    renderFunction.renderFrame( gl );
  }

  private static void renderFrame( @Nonnull final HTMLCanvasElement canvas,
                                   @Nonnull final WebGL2RenderingContext gl,
                                   @Nonnull final RenderFunction renderFunction )
  {
    Global.requestAnimationFrame( t -> renderFrame( canvas, gl, renderFunction ) );
    CanvasUtil.resize( gl, canvas );
    renderFunction.renderFrame( gl );
  }

  public static void resize( @Nonnull final WebGL2RenderingContext gl, @Nonnull final HTMLCanvasElement canvas )
  {
    final Element element = Global.document().documentElement();
    assert null != element;

    final int displayWidth = element.clientWidth();
    final int displayHeight = element.clientHeight();

    if ( canvas.width != displayWidth || canvas.height != displayHeight )
    {
      // Make the canvas the same size
      canvas.width = displayWidth;
      canvas.height = displayHeight;

      // When you need to set the viewport to match the size of the canvas's
      // drawingBuffer this will always be correct. See the reasoning at
      //   https://webgl2fundamentals.org/webgl/lessons/webgl-anti-patterns.html#drawingbuffer
      gl.viewport( 0, 0, gl.drawingBufferWidth(), gl.drawingBufferHeight() );
    }
  }

  @Nonnull
  public static WebGL2RenderingContext getWebGL2RenderingContext( @Nonnull final HTMLCanvasElement canvas )
  {
    final WebGL2RenderingContext gl = (WebGL2RenderingContext) canvas.getContext( RenderContextType.webgl2 );
    assert null != gl;
    return gl;
  }

  public static double getAspect( @Nonnull final HTMLCanvasElement canvas )
  {
    // Don't use canvas.width and canvas.height as the actual size may be controlled by css
    // See https://webgl2fundamentals.org/webgl/lessons/webgl-anti-patterns.html for more understanding
    return canvas.clientWidth() / ( (double) canvas.clientHeight() );
  }
}
