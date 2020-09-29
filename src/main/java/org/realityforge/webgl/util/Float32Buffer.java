package org.realityforge.webgl.util;

import elemental2.core.Float32Array;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.webgl.annotations.TargetType;
import org.realityforge.webgl.annotations.Usage;

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
                        @TargetType final int target,
                        final int dimension )
  {
    this( gl, data, target, WebGL2RenderingContext.STATIC_DRAW, dimension, 0, 0 );
  }

  public Float32Buffer( @Nonnull final WebGL2RenderingContext gl,
                        @Nonnull final Float32Array data,
                        @TargetType final int target,
                        @Usage final int usage,
                        final int dimension,
                        final int stride,
                        final int offset )
  {
    super( gl, data, target, usage, dimension, WebGL2RenderingContext.FLOAT, stride, offset );
  }
}
