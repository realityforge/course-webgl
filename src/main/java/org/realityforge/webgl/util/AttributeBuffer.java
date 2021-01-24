package org.realityforge.webgl.util;

import elemental3.core.ArrayBufferView;
import elemental3.gl.UsageType;
import elemental3.gl.WebGL2RenderingContext;
import java.util.Objects;
import javax.annotation.Nonnull;

public final class AttributeBuffer
  extends Buffer
{
  @Nonnull
  private final Accessor _accessor;

  public AttributeBuffer( @Nonnull final WebGL2RenderingContext gl,
                          @Nonnull final ArrayBufferView data,
                          @Nonnull final Accessor accessor )
  {
    this( gl, data, WebGL2RenderingContext.STATIC_DRAW, accessor );
  }

  public AttributeBuffer( @Nonnull final WebGL2RenderingContext gl,
                          @Nonnull final ArrayBufferView data,
                          @UsageType final int usage,
                          @Nonnull final Accessor accessor )
  {
    super( gl, data, usage, WebGL2RenderingContext.ARRAY_BUFFER );
    _accessor = Objects.requireNonNull( accessor );
  }

  @Nonnull
  public Accessor getAccessor()
  {
    return _accessor;
  }
}
