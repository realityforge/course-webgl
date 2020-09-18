package org.realityforge.webgl.util;

import elemental3.Document;
import elemental3.Element;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.HTMLElement;
import elemental3.RenderContextType;
import elemental3.WebGL2RenderingContext;
import elemental3.Window;
import javax.annotation.Nonnull;

public final class CanvasUtil
{
  private CanvasUtil()
  {
  }

  @Nonnull
  public static HTMLCanvasElement createCanvas()
  {
    final Window window = Global.globalThis();
    final Document document = window.document();
    final HTMLCanvasElement canvas = (HTMLCanvasElement) document.createElement( "canvas" );
    resizeCanvasToViewport( canvas );
    final HTMLElement body = document.body;
    assert null != body;
    body.appendChild( canvas );
    window.onresize = e -> resizeCanvasToViewport( canvas );
    return canvas;
  }

  private static void resizeCanvasToViewport( @Nonnull final HTMLCanvasElement canvas )
  {
    final Window window = Global.globalThis();
    final Element element = window.document().documentElement();
    assert null != element;
    canvas.width = element.clientWidth();
    canvas.height = element.clientHeight();
    resize( canvas );
  }

  public static void resize( @Nonnull final HTMLCanvasElement canvas )
  {
    // Lookup the size the browser is displaying the canvas.
    final int displayWidth = canvas.clientWidth();
    final int displayHeight = canvas.clientHeight();

    // Check if the canvas is not the same size.
    if ( 0 != displayWidth && 0 != displayHeight && ( canvas.width != displayWidth || canvas.height != displayHeight ) )
    {
      // Make the canvas the same size
      canvas.width = displayWidth;
      canvas.height = displayHeight;
    }
  }

  @Nonnull
  public static WebGL2RenderingContext getWebGL2RenderingContext( @Nonnull final HTMLCanvasElement canvas )
  {
    final WebGL2RenderingContext gl = (WebGL2RenderingContext) canvas.getContext( RenderContextType.webgl2 );
    assert null != gl;
    return gl;
  }
}
