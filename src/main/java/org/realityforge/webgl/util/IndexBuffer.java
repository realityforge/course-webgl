package org.realityforge.webgl.util;

import elemental3.core.ArrayBufferView;
import elemental3.gl.DrawElementDataType;
import elemental3.gl.UsageType;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class IndexBuffer
{
  @Nonnull
  private final ArrayBufferView _data;
  @UsageType
  private final int _usage;
  @DrawElementDataType
  private final int _type;
  @Nullable
  private WebGLBuffer _buffer;

  protected IndexBuffer( @Nonnull final ArrayBufferView data,
                         @UsageType final int usage,
                         @DrawElementDataType final int type,
                         @Nullable final WebGLBuffer buffer )
  {
    _data = data;
    _usage = usage;
    _type = type;
    _buffer = buffer;
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

  @DrawElementDataType
  public int getType()
  {
    return _type;
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
    gl.bufferData( WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, _data, _usage );
  }

  public void bind( @Nonnull final WebGL2RenderingContext gl )
  {
    assert null != _buffer;
    gl.bindBuffer( WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, _buffer );
  }
}
