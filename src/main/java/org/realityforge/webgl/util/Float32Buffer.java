package org.realityforge.webgl.util;

import elemental3.core.Float32Array;
import elemental3.gl.BufferTargetType;
import elemental3.gl.UsageType;
import elemental3.gl.VertexDimensions;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

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
    this( data, WebGL2RenderingContext.ARRAY_BUFFER, dimension );
  }

  public Float32Buffer( @Nonnull final Float32Array data,
                        @BufferTargetType final int target,
                        @VertexDimensions final int dimension )
  {
    this( data, target, WebGL2RenderingContext.STATIC_DRAW, dimension, false, 0, 0, null );
  }

  public Float32Buffer( @Nonnull final Float32Array data,
                        @BufferTargetType final int target,
                        @UsageType final int usage,
                        @VertexDimensions final int dimension,
                        final boolean normalized,
                        final int stride,
                        final int offset )
  {
    this( data, target, usage, dimension, normalized, stride, offset, null );
  }

  public Float32Buffer( @Nonnull final Float32Array data,
                        @BufferTargetType final int target,
                        @UsageType final int usage,
                        @VertexDimensions final int dimension,
                        final boolean normalized,
                        final int stride,
                        final int offset,
                        @Nullable final WebGLBuffer buffer )
  {
    super( data, target, usage, dimension, WebGL2RenderingContext.FLOAT, normalized, stride, offset, buffer );
  }
}
