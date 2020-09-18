package org.realityforge.webgl.rectangle;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.webgl.util.CanvasUtil;

public final class Rectangle
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
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    c_projectionMatrix.perspective( 45 * Math.PI / 180.0, canvas.width / ( (double) canvas.height ), 0.1, 10.0 );

    _mesh = RectangleTemplate.create( gl );
    _mesh.sendToGpu( gl );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final WebGL2RenderingContext gl )
  {
    CanvasUtil.resize( gl, canvas );

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

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }
}
