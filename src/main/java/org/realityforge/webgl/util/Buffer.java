package org.realityforge.webgl.util;

import elemental3.core.ArrayBufferView;
import elemental3.gl.UsageType;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.realityforge.webgl.util.v2.Accessor;

public abstract class Buffer
{
  @Nonnull
  private final ArrayBufferView _data;
  @UsageType
  private final int _usage;
  @Nonnull
  private final Accessor _accessor;
  @Nullable
  private WebGLBuffer _buffer;

  protected Buffer( @Nonnull final ArrayBufferView data, @UsageType final int usage, @Nonnull final Accessor accessor )
  {
    _data = Objects.requireNonNull( data );
    _usage = usage;
    _accessor = Objects.requireNonNull( accessor );
  }

  @Nonnull
  public ArrayBufferView getData()
  {
    return _data;
  }

  @UsageType
  public int getUsage()
  {
    return _usage;
  }

  @Nonnull
  public Accessor getAccessor()
  {
    return _accessor;
  }

  public boolean isBufferOnGpu()
  {
    return null != _buffer;
  }

  public void uploadToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    _buffer = gl.createBuffer();
    assert null != _buffer;
    bind( gl );
    gl.bufferData( WebGL2RenderingContext.ARRAY_BUFFER, _data, _usage );
  }

  public void bind( @Nonnull final WebGL2RenderingContext gl )
  {
    assert null != _buffer;
    gl.bindBuffer( WebGL2RenderingContext.ARRAY_BUFFER, _buffer );
  }
}
