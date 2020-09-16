package org.realityforge.webgl.cube;

import com.google.gwt.core.client.EntryPoint;
import elemental2.core.Float32Array;
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
  private Geometry _geometry;
  private Material _material;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = createCanvas();
    final WebGL2RenderingContext gl = (WebGL2RenderingContext) canvas.getContext( RenderContextType.webgl2 );
    assert null != gl;

    c_projectionMatrix.perspective( 45 * Math.PI / 180.0, canvas.width / ( (double) canvas.height ), 0.1, 10.0 );

    _geometry = CubeTemplate.createGeometry( gl );
    _material = CubeTemplate.createMaterial( gl );

    // Start using the program for all vertexes pass through gl until the program is changed
    gl.useProgram( _material.getProgram() );

    // Tell GPU to load position data into program from out buffer
    GL.linkBufferResource( gl,
                           _geometry.getPositionBuffer(),
                           _material.getPositionIndex(),
                           WebGL2RenderingContext.ARRAY_BUFFER,
                           3,
                           WebGL2RenderingContext.FLOAT,
                           0,
                           0 );

    // Tell GPU to load color data into program from out buffer
    GL.linkBufferResource( gl,
                           _geometry.getColorBuffer(),
                           _material.getColorIndex(),
                           WebGL2RenderingContext.ARRAY_BUFFER,
                           4,
                           WebGL2RenderingContext.FLOAT,
                           0,
                           0 );

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

    gl.uniformMatrix4fv( _material.getModelMatrixLocation(), false, toFloat32Array( c_modelMatrix ) );
    gl.uniformMatrix4fv( _material.getViewMatrixLocation(), false, toFloat32Array( c_viewMatrix ) );
    gl.uniformMatrix4fv( _material.getProjectionMatrixLocation(), false, toFloat32Array( c_projectionMatrix ) );

    c_angle += 0.1;

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( gl ) );
  }

  @Nonnull
  private Float32Array toFloat32Array( @Nonnull final Matrix4d matrix )
  {
    return new Float32Array( matrix.get( new double[ 16 ] ) );
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
