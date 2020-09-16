package org.realityforge.webgl.cube;

import elemental2.core.Float32Array;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;

final class MathUtil
{
  private MathUtil()
  {
  }

  @Nonnull
  static Float32Array toFloat32Array( @Nonnull final Matrix4d matrix )
  {
    return new Float32Array( matrix.get( new double[ 16 ] ) );
  }
}
