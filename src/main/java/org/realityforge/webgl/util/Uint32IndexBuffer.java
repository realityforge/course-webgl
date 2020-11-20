package org.realityforge.webgl.util;

import elemental3.Uint32Array;
import elemental3.gl.UsageType;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class Uint32IndexBuffer
  extends IndexBuffer
{
  public Uint32IndexBuffer( @Nonnull final Uint32Array data )
  {
    this( data, WebGL2RenderingContext.STATIC_DRAW );
  }

  public Uint32IndexBuffer( @Nonnull final Uint32Array data, @UsageType final int usage )
  {
    this( data, usage, null );
  }

  public Uint32IndexBuffer( @Nonnull final Uint32Array data,
                            @UsageType final int usage,
                            @Nullable final WebGLBuffer buffer )
  {
    super( data, usage, WebGL2RenderingContext.UNSIGNED_INT, buffer );
  }
}
