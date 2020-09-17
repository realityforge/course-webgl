package org.realityforge.webgl.util;

import elemental2.core.Float32Array;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;

public final class MathUtil
{
  private MathUtil()
  {
  }

  @Nonnull
  public static Float32Array toFloat32Array( @Nonnull final Matrix4d matrix )
  {
    return new Float32Array( matrix.get( new double[ 16 ] ) );
  }
}
