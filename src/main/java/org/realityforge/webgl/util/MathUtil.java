package org.realityforge.webgl.util;

import elemental2.core.Float32Array;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.joml.Vector3d;
import org.joml.Vector4d;

public final class MathUtil
{
  private MathUtil()
  {
  }

  @Nonnull
  public static Float32Array toFloat32Array( @Nonnull final Vector4d input )
  {
    return new Float32Array( new double[]{ input.x, input.y, input.z, input.w } );
  }
  @Nonnull
  public static Float32Array toFloat32Array( @Nonnull final Vector3d input )
  {
    return new Float32Array( new double[]{ input.x, input.y, input.z } );
  }

  @Nonnull
  public static Float32Array toFloat32Array( @Nonnull final Matrix4d input )
  {
    return new Float32Array( input.get( new double[ 16 ] ) );
  }
}
