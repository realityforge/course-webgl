package org.realityforge.webgl.hello_triangle;

import com.google.gwt.core.client.EntryPoint;
import elemental2.core.Float32Array;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.HTMLElement;
import elemental3.WebGL2RenderingContext;
import elemental3.WebGLBuffer;
import javax.annotation.Nonnull;

public class HelloTriangle
  implements EntryPoint
{
  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = createCanvas();
    // TODO: This method should have typing tightened up
    final WebGL2RenderingContext gl = (WebGL2RenderingContext) canvas.getContext( "webgl2" );
    assert null != gl;

    // Vertex position data for triangle
    double[] positions = new double[]{
      // Vertex 1
      1.0, -1.0, 0.0,
      // Vertex 1
      1.0, 1.0, 0.0,
      // Vertex 1
      -1.0, -1.0, 0.0
    };

    // Vertex color data for triangle in RGBA form
    double[] colors = new double[]{
      // Red
      1.0, 0.0, 0.0, 1.0,
      // Green
      0.0, 1.0, 0.0, 1.0,
      // Blue
      0.0, 0.0, 1.0, 1.0
    };

    // Create a GPU resource for position data
    final WebGLBuffer positionBuffer = gl.createBuffer();
    // Bind a gate between CPU and GPU
    gl.bindBuffer( WebGL2RenderingContext.ARRAY_BUFFER, positionBuffer );

    // Send data via ARRAY_BUFFER gate and whatever it is bound to which is a buffer in this case
    // The last parameter is a hint indicating that this data is static and the CPU will not update it often
    // which means that the GPU can store it close to where it is used without worrying about latency to update
    gl.bufferData( WebGL2RenderingContext.ARRAY_BUFFER,
                   new Float32Array( positions ),
                   WebGL2RenderingContext.STATIC_DRAW );

    final WebGLBuffer colorBuffer = gl.createBuffer();
    gl.bindBuffer( WebGL2RenderingContext.ARRAY_BUFFER, colorBuffer );
    gl.bufferData( WebGL2RenderingContext.ARRAY_BUFFER,
                   new Float32Array( colors ),
                   WebGL2RenderingContext.STATIC_DRAW );
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
