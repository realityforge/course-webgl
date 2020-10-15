package org.realityforge.webgl.util;

import elemental2.core.TypedArray;
import elemental3.ArrayBufferView;
import elemental3.gl.DrawElementDataType;
import elemental3.gl.UsageType;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Js;

public abstract class IndexBuffer<T extends TypedArray>
{
  @Nonnull
  private final T _data;
  @UsageType
  private final int _usage;
  @DrawElementDataType
  private final int _type;
  @Nullable
  private WebGLBuffer _buffer;

  protected IndexBuffer( @Nonnull final T data,
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
  public T getData()
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
    //TODO: Rework webtack to remove this unchecked cast
    gl.bufferData( WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, Js.<ArrayBufferView>uncheckedCast( _data ), _usage );
  }

  public void bind( @Nonnull final WebGL2RenderingContext gl )
  {
    assert null != _buffer;
    gl.bindBuffer( WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, _buffer );
  }
}
