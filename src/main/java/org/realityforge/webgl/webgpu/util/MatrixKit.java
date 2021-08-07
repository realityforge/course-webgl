package org.realityforge.webgl.webgpu.util;

import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;

public final class MatrixKit
{
  private MatrixKit()
  {
  }

  public static void multiply( @Nonnull final Matrix4d target, @Nonnull final Matrix4d a, @Nonnull Matrix4d b )
  {
    final double a00 = a.m00;
    final double a01 = a.m01;
    final double a02 = a.m02;
    final double a03 = a.m03;
    final double a10 = a.m10;
    final double a11 = a.m11;
    final double a12 = a.m12;
    final double a13 = a.m13;
    final double a20 = a.m20;
    final double a21 = a.m21;
    final double a22 = a.m22;
    final double a23 = a.m23;
    final double a30 = a.m30;
    final double a31 = a.m31;
    final double a32 = a.m32;
    final double a33 = a.m33;

    final double b00 = b.m00;
    final double b01 = b.m01;
    final double b02 = b.m02;
    final double b03 = b.m03;
    final double b10 = b.m10;
    final double b11 = b.m11;
    final double b12 = b.m12;
    final double b13 = b.m13;
    final double b20 = b.m20;
    final double b21 = b.m21;
    final double b22 = b.m22;
    final double b23 = b.m23;
    final double b30 = b.m30;
    final double b31 = b.m31;
    final double b32 = b.m32;
    final double b33 = b.m33;

    target.m00 = a00 * b00 + a01 * b10 + a02 * b20 + a03 * b30;
    target.m01 = a00 * b01 + a01 * b11 + a02 * b21 + a03 * b31;
    target.m02 = a00 * b02 + a01 * b12 + a02 * b22 + a03 * b32;
    target.m03 = a00 * b03 + a01 * b13 + a02 * b23 + a03 * b33;

    target.m10 = a10 * b00 + a11 * b10 + a12 * b20 + a13 * b30;
    target.m11 = a10 * b01 + a11 * b11 + a12 * b21 + a13 * b31;
    target.m12 = a10 * b02 + a11 * b12 + a12 * b22 + a13 * b32;
    target.m13 = a10 * b03 + a11 * b13 + a12 * b23 + a13 * b33;

    target.m20 = a20 * b00 + a21 * b10 + a22 * b20 + a23 * b30;
    target.m21 = a20 * b01 + a21 * b11 + a22 * b21 + a23 * b31;
    target.m22 = a20 * b02 + a21 * b12 + a22 * b22 + a23 * b32;
    target.m23 = a20 * b03 + a21 * b13 + a22 * b23 + a23 * b33;

    target.m30 = a30 * b00 + a31 * b10 + a32 * b20 + a33 * b30;
    target.m31 = a30 * b01 + a31 * b11 + a32 * b21 + a33 * b31;
    target.m32 = a30 * b02 + a31 * b12 + a32 * b22 + a33 * b32;
    target.m33 = a30 * b03 + a31 * b13 + a32 * b23 + a33 * b33;
  }
}
