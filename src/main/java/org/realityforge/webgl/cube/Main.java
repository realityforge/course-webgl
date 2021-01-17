package org.realityforge.webgl.cube;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.MathUtil;

public final class Main
  implements EntryPoint
{
  // Cube rotation angle
  private static double c_angle;
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _viewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();
  private Mesh _mesh;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _projectionMatrix.setPerspective( MathUtil.degreesToRadians( 45 ), CanvasUtil.getAspect( canvas ), 0.1, 10.0 );

    _mesh = CubeTemplate.create( gl );
    _mesh.sendToGpu( gl );

    Global.requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final WebGL2RenderingContext gl )
  {
    CanvasUtil.resize( gl, canvas );

    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    _modelMatrix.setTranslation(  0, 0, -7 );
    _modelMatrix.rotateY( c_angle / 4.0 );
    _modelMatrix.rotateX( 0.25 );

    _viewMatrix.setIdentity();

    gl.useProgram( _mesh.getMaterial().getProgram() );
    _mesh.setUniforms( gl, _modelMatrix, _viewMatrix, _projectionMatrix );

    c_angle += 0.1;

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );

    Global.requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }
}
