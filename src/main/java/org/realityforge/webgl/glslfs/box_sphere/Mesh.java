package org.realityforge.webgl.glslfs.box_sphere;

import elemental3.core.Float32Array;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry;

final class Mesh
{
  @Nonnull
  private final Geometry _geometry;
  @Nonnull
  private final Material _material;

  Mesh( @Nonnull final Geometry geometry, @Nonnull final Material material )
  {
    _geometry = Objects.requireNonNull( geometry );
    _material = Objects.requireNonNull( material );
  }

  @Nonnull
  Geometry getGeometry()
  {
    return _geometry;
  }

  @Nonnull
  Material getMaterial()
  {
    return _material;
  }

  void render( @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix,
               final float time )
  {
    final AppState appState = AppState.get();
    appState.useProgram( _material.getProgram() );

    final WebGL2RenderingContext gl = appState.gl();
    gl.uniformMatrix4fv( _material.getModelMatrixLocation(), false, new Float32Array( modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getViewMatrixLocation(), false, new Float32Array( viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getProjectionMatrixLocation(), false,
                         new Float32Array( projectionMatrix.toArray() ) );
    gl.uniform1f( _material.getTimeLocation(), time );
    _geometry.draw();
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    final WebGLProgram program = _material.getProgram();
    _geometry.getAttribute( 0 ).setLocation( GL.getAttribLocation( gl, program, "position" ) );
    _geometry.uploadToCpu();
  }
}
