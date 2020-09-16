package org.realityforge.webgl.cube;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.HTMLElement;
import elemental3.RenderContextType;
import elemental3.WebGL2RenderingContext;
import elemental3.Window;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;

public final class Cube
  implements EntryPoint
{
  // Cube rotation angle
  private static double c_angle;
  @Nonnull
  private final Matrix4d c_modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d c_viewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d c_projectionMatrix = new Matrix4d();
  private Mesh _mesh;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = createCanvas();
    final WebGL2RenderingContext gl = (WebGL2RenderingContext) canvas.getContext( RenderContextType.webgl2 );
    assert null != gl;

    c_projectionMatrix.perspective( 45 * Math.PI / 180.0, canvas.width / ( (double) canvas.height ), 0.1, 10.0 );

    _mesh = CubeTemplate.create( gl );
    _mesh.sendToGpu( gl );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( gl ) );
  }

  private void renderFrame( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    c_modelMatrix.identity();
    c_modelMatrix.translate( 0, 0, -7 );
    c_modelMatrix.rotateY( c_angle );
    c_modelMatrix.rotateX( 0.25 );

    c_viewMatrix.identity();

    gl.useProgram( _mesh.getMaterial().getProgram() );
    _mesh.setUniforms( gl, this.c_modelMatrix, this.c_viewMatrix, this.c_projectionMatrix );

    c_angle += 0.1;

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( gl ) );
  }

  @Nonnull
  private HTMLCanvasElement createCanvas()
  {
    final Window window = Global.globalThis();
    final Document document = window.document();
    final HTMLCanvasElement canvas = (HTMLCanvasElement) document.createElement( "canvas" );
    canvas.width = window.innerWidth();
    canvas.height = window.innerHeight();
    final HTMLElement body = document.body;
    assert null != body;
    body.appendChild( canvas );
    return canvas;
  }
}
