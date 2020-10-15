package org.realityforge.webgl.util;

import elemental2.core.TypedArray;
import elemental3.ArrayBufferView;
import elemental3.gl.BufferTargetType;
import elemental3.gl.DataType;
import elemental3.gl.UsageType;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Js;

public abstract class Buffer<T extends TypedArray>
{
  @Nonnull
  private final T _data;
  @BufferTargetType
  private final int _target;
  @UsageType
  private final int _usage;
  private final int _dimension;
  @DataType
  private final int _type;
  private final boolean _normalized;
  private final int _stride;
  private final int _offset;
  @Nullable
  private WebGLBuffer _buffer;

  protected Buffer( @Nonnull final T data,
                    @BufferTargetType final int target,
                    @UsageType final int usage,
                    final int dimension,
                    @DataType final int type,
                    final boolean normalized,
                    final int stride,
                    final int offset,
                    @Nullable final WebGLBuffer buffer )
  {
    assert dimension > 0 && dimension <= 4;
    assert stride >= 0 && stride <= 255;
    _data = data;
    _target = target;
    _usage = usage;
    _dimension = dimension;
    _type = type;
    _normalized = normalized;
    _stride = stride;
    _offset = offset;
    _buffer = buffer;
  }

  @Nonnull
  public T getData()
  {
    return _data;
  }

  @BufferTargetType
  public int getTarget()
  {
    return _target;
  }

  @UsageType
  public int getUsage()
  {
    return _usage;
  }

  public int getDimension()
  {
    return _dimension;
  }

  @DataType
  public int getType()
  {
    return _type;
  }

  public boolean isNormalized()
  {
    return _normalized;
  }

  public int getStride()
  {
    return _stride;
  }

  public int getOffset()
  {
    return _offset;
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
    gl.bufferData( _target, Js.<ArrayBufferView>uncheckedCast( _data ), _usage );
  }

  public void bind( @Nonnull final WebGL2RenderingContext gl )
  {
    assert null != _buffer;
    gl.bindBuffer( _target, _buffer );
  }
}
