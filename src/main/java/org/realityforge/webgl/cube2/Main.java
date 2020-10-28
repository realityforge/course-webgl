package org.realityforge.webgl.cube2;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.vecmath.Vector4d;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.MathUtil;

public final class Main
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
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _projectionMatrix.perspective( MathUtil.degreesToRadians( 45 ), CanvasUtil.getAspect( canvas ), 0.1, 10.0 );

    _mesh = CubeTemplate.create( gl );
    _mesh.sendToGpu( gl );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final WebGL2RenderingContext gl )
  {
    CanvasUtil.resize( gl, canvas );

    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    _modelMatrix.translation( 0, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    _viewMatrix.identity();

    gl.useProgram( _mesh.getMaterial().getProgram() );
    final Vector4d[] colors = { new Vector4d( 1, 0, 0, 1 ),
                                new Vector4d( 0, 1, 0, 1 ),
                                new Vector4d( 0, 0, 1, 1 ) };
    final Vector3f offsets = new Vector3f( -2, 0, 2 );
    _mesh.setUniforms( gl, _modelMatrix, _viewMatrix, _projectionMatrix, colors, offsets );

    _angle += 0.1;

    // Draw 3 instances of the cube
    gl.drawArraysInstanced( WebGL2RenderingContext.TRIANGLES, 0, 36, 3 );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }
}
