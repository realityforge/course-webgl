package org.realityforge.webgl.util;

import elemental2.core.Float32Array;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import elemental3.gl.BufferTargetType;
import elemental3.gl.UsageType;

public final class Float32Buffer
  extends Buffer<Float32Array>
{
  public Float32Buffer( @Nonnull final WebGL2RenderingContext gl,
                        @Nonnull final Float32Array data,
                        final int dimension )
  {
    this( gl, data, WebGL2RenderingContext.ARRAY_BUFFER, dimension );
  }

  public Float32Buffer( @Nonnull final WebGL2RenderingContext gl,
                        @Nonnull final Float32Array data,
                        @BufferTargetType final int target,
                        final int dimension )
  {
    this( gl, data, target, WebGL2RenderingContext.STATIC_DRAW, dimension, 0, 0 );
  }

  public Float32Buffer( @Nonnull final WebGL2RenderingContext gl,
                        @Nonnull final Float32Array data,
                        @BufferTargetType final int target,
                        @UsageType final int usage,
                        final int dimension,
                        final int stride,
                        final int offset )
  {
    super( gl, data, target, usage, dimension, WebGL2RenderingContext.FLOAT, stride, offset );
  }
}
