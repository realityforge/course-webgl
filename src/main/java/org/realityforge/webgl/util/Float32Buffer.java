package org.realityforge.webgl.util;

import elemental3.core.Float32Array;
import elemental3.gl.UsageType;
import elemental3.gl.VertexDimensions;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;

public final class Float32Buffer
  extends Buffer
{
  public Float32Buffer( @Nonnull final WebGL2RenderingContext gl,
                        @Nonnull final Float32Array data,
                        @VertexDimensions final int dimension )
  {
    this( data, dimension );
    uploadToGpu( gl );
  }

  public Float32Buffer( @Nonnull final Float32Array data, @VertexDimensions final int dimension )
  {
    this( data, WebGL2RenderingContext.STATIC_DRAW, dimension, false, 0, 0 );
  }

  public Float32Buffer( @Nonnull final Float32Array data,
                        @UsageType final int usage,
                        @VertexDimensions final int dimension,
                        final boolean normalized,
                        final int stride,
                        final int offset )
  {
    super( data, usage, dimension, WebGL2RenderingContext.FLOAT, normalized, stride, offset, null );
  }
}
