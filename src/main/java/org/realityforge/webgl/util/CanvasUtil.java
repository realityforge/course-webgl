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
    final HTMLElement body = document.body;
    assert null != body;
    body.appendChild( canvas );
    return canvas;
  }

  public static void resize( @Nonnull final WebGL2RenderingContext gl, @Nonnull final HTMLCanvasElement canvas )
  {
    final Window window = Global.globalThis();
    final Element element = window.document().documentElement();
    assert null != element;

    final int displayWidth = element.clientWidth();
    final int displayHeight = element.clientHeight();

    if ( canvas.width != displayWidth || canvas.height != displayHeight )
    {
      // Make the canvas the same size
      canvas.width = displayWidth;
      canvas.height = displayHeight;

      gl.viewport( 0, 0, canvas.width, canvas.height );
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
