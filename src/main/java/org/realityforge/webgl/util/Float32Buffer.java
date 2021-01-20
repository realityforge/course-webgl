package org.realityforge.webgl.util;

import elemental3.core.Float32Array;
import elemental3.gl.UsageType;
import elemental3.gl.VertexDimensions;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.v2.Accessor;

public final class Float32Buffer
  extends Buffer
{
  public Float32Buffer( @Nonnull final Float32Array data, @VertexDimensions final int dimension )
  {
    this( data, WebGL2RenderingContext.STATIC_DRAW, new Accessor( dimension, WebGL2RenderingContext.FLOAT ) );
  }

  public Float32Buffer( @Nonnull final Float32Array data,
                        @UsageType final int usage,
                        @Nonnull final Accessor accessor )
  {
    super( data, usage, accessor, null );
  }
}
