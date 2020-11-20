package org.realityforge.webgl.util;

import elemental3.Uint16Array;
import elemental3.gl.UsageType;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class Uint16IndexBuffer
  extends IndexBuffer<Uint16Array>
{
  public Uint16IndexBuffer( @Nonnull final Uint16Array data )
  {
    this( data, WebGL2RenderingContext.STATIC_DRAW );
  }

  public Uint16IndexBuffer( @Nonnull final Uint16Array data, @UsageType final int usage )
  {
    this( data, usage, null );
  }

  public Uint16IndexBuffer( @Nonnull final Uint16Array data,
                            @UsageType final int usage,
                            @Nullable final WebGLBuffer buffer )
  {
    super( data, usage, WebGL2RenderingContext.UNSIGNED_SHORT, buffer );
  }
}
