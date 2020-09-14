package org.realityforge.webgl.hello_triangle;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.HTMLElement;
import elemental3.WebGL2RenderingContext;
import javax.annotation.Nonnull;

public class HelloTriangle
  implements EntryPoint
{
  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = createCanvas();
    // TODO: This method should have typing tightened up
    final WebGL2RenderingContext context = (WebGL2RenderingContext) canvas.getContext( "webgl2" );
  }

  @Nonnull
  private HTMLCanvasElement createCanvas()
  {
    final Document document = Global.globalThis().document();
    final HTMLCanvasElement canvas = (HTMLCanvasElement) document.createElement( "canvas" );
    canvas.width = 1024;
    canvas.height = 786;
    final HTMLElement body = document.body;
    assert null != body;
    body.appendChild( canvas );
    return canvas;
  }
}
