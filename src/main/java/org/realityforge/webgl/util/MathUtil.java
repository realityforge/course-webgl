package org.realityforge.webgl.util;

import elemental2.core.Float32Array;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.vecmath.Vector4d;

public final class MathUtil
{
  private MathUtil()
  {
  }

  @Nonnull
  public static Float32Array toFloat32Array( @Nonnull final Vector4d input )
  {
    return new Float32Array( input.toArray() );
  }

  @Nonnull
  public static Float32Array toFloat32Array( @Nonnull final Vector3f input )
  {
    return new Float32Array( input.toArray() );
  }

  @Nonnull
  public static Float32Array toFloat32Array( @Nonnull final Matrix4d input )
  {
    return new Float32Array( input.get( new double[ 16 ] ) );
  }
}
