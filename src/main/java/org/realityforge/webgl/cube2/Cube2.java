package org.realityforge.webgl.cube2;

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
import org.joml.Vector3d;
import org.joml.Vector4d;

public final class Cube2
  implements EntryPoint
{
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _viewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();
  // Cube rotation angle
  private double _angle;
  private Mesh _mesh;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = createCanvas();
    final WebGL2RenderingContext gl = (WebGL2RenderingContext) canvas.getContext( RenderContextType.webgl2 );
    assert null != gl;

    _projectionMatrix.perspective( 45 * Math.PI / 180.0, canvas.width / ( (double) canvas.height ), 0.1, 10.0 );

    _mesh = CubeTemplate.create( gl );
    _mesh.sendToGpu( gl );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( gl ) );
  }

  private void renderFrame( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    _modelMatrix.identity();
    _modelMatrix.translate( 0, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    _viewMatrix.identity();

    gl.useProgram( _mesh.getMaterial().getProgram() );
    final Vector4d[] colors = { new Vector4d( 1, 0, 0, 1 ),
                                new Vector4d( 0, 1, 0, 1 ),
                                new Vector4d( 0, 0, 1, 1 ) };
    final Vector3d offsets = new Vector3d( -2, 0, 2 );
    _mesh.setUniforms( gl,
                       _modelMatrix,
                       _viewMatrix,
                       _projectionMatrix,
                       colors,
                       offsets );

    _angle += 0.1;

    // Draw 3 instances of the cube
    gl.drawArraysInstanced( WebGL2RenderingContext.TRIANGLES, 0, 36, 3 );

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
