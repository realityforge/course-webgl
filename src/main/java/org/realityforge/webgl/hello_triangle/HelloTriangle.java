package org.realityforge.webgl.hello_triangle;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.WebGL2RenderingContext;

public class HelloTriangle
  implements EntryPoint
{
  @Override
  public void onModuleLoad()
  {
    // TODO: Rather than retrieve this from page maybe create and attach to body?
    final HTMLCanvasElement renderCanvas =
      (HTMLCanvasElement) Global.globalThis().document().getElementById( "renderCanvas" );
    assert null != renderCanvas;
    // TODO: This method should have typing tightened up
    final WebGL2RenderingContext context = (WebGL2RenderingContext) renderCanvas.getContext( "webgl2" );
  }
}
