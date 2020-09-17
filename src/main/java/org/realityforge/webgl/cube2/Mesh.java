package org.realityforge.webgl.cube2;

import elemental3.WebGL2RenderingContext;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;

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

  void setUniforms( @Nonnull final WebGL2RenderingContext gl,
                    @Nonnull final Matrix4d modelMatrix,
                    @Nonnull final Matrix4d viewMatrix,
                    @Nonnull final Matrix4d projectionMatrix )
  {
    gl.uniformMatrix4fv( _material.getModelMatrixLocation(), false, MathUtil.toFloat32Array( modelMatrix ) );
    gl.uniformMatrix4fv( _material.getViewMatrixLocation(), false, MathUtil.toFloat32Array( viewMatrix ) );
    gl.uniformMatrix4fv( _material.getProjectionMatrixLocation(), false, MathUtil.toFloat32Array( projectionMatrix ) );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
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
  }
}
