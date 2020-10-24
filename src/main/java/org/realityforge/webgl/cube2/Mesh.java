package org.realityforge.webgl.cube2;

import elemental2.core.Float32Array;
import elemental3.gl.WebGL2RenderingContext;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.vecmath.Vector4d;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.MathUtil;

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
  Material getMaterial()
  {
    return _material;
  }

  void setUniforms( @Nonnull final WebGL2RenderingContext gl,
                    @Nonnull final Matrix4d modelMatrix,
                    @Nonnull final Matrix4d viewMatrix,
                    @Nonnull final Matrix4d projectionMatrix,
                    @Nonnull final Vector4d[] colors,
                    @Nonnull final Vector3f offsets )
  {
    gl.uniformMatrix4fv( _material.getModelMatrixLocation(), false, MathUtil.toFloat32Array( modelMatrix ) );
    gl.uniformMatrix4fv( _material.getViewMatrixLocation(), false, MathUtil.toFloat32Array( viewMatrix ) );
    gl.uniformMatrix4fv( _material.getProjectionMatrixLocation(), false, MathUtil.toFloat32Array( projectionMatrix ) );
    gl.uniform4fv( _material.getColorsLocation1(), new Float32Array( colors[ 0 ].toArray() ) );
    gl.uniform4fv( _material.getColorsLocation2(), new Float32Array( colors[ 1 ].toArray() ) );
    gl.uniform4fv( _material.getColorsLocation3(), new Float32Array( colors[ 2 ].toArray() ) );
    gl.uniform3fv( _material.getOffsetsLocation(), new Float32Array( offsets.toArray() ) );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    // Tell GPU to load position data into program from out buffer
    GL.sendToGpu( gl,
                  _geometry.getPositionBuffer(),
                  _material.getPositionIndex(),
                  WebGL2RenderingContext.ARRAY_BUFFER,
                  3,
                  WebGL2RenderingContext.FLOAT,
                  0,
                  0 );
  }
}
