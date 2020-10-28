package org.realityforge.webgl.textures;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
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
  private Mesh _mesh;
  private double _angle;
  private boolean _sentToGpu;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _projectionMatrix.perspective( MathUtil.degreesToRadians( 45 ), CanvasUtil.getAspect( canvas ), 0.1, 10.0 );

    _mesh = CubeTemplate.create( gl );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final WebGL2RenderingContext gl )
  {
    CanvasUtil.resize( gl, canvas );
    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, gl ) );
    if ( !_mesh.areTexturesLoaded() )
    {
      return;
    }
    else if ( !_sentToGpu )
    {
      // Have to send to GPU here as otherwise texture data has not loaded
      _mesh.sendToGpu( gl );
      _sentToGpu = true;
    }

    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    _modelMatrix.translation( 0, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    _viewMatrix.identity();

    _mesh.render( gl, _modelMatrix, _viewMatrix, _projectionMatrix );

    _angle += 0.01;
  }
}
