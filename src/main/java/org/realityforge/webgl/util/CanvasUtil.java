package org.realityforge.webgl.util;

import elemental3.Document;
import elemental3.Element;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.HTMLElement;
import elemental3.RenderContextType;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;

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
