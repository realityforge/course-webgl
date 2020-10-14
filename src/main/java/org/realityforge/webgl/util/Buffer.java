package org.realityforge.webgl.util;

import elemental2.core.TypedArray;
import elemental3.ArrayBufferView;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import javax.annotation.Nonnull;
import jsinterop.base.Js;
import org.realityforge.webgl.annotations.DataType;
import elemental3.gl.BufferTargetType;
import elemental3.gl.UsageType;

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
  private final int _stride;
  private final int _offset;
  @Nonnull
  private final WebGLBuffer _buffer;

  protected Buffer( @Nonnull final WebGL2RenderingContext gl,
                    @Nonnull final T data,
                    @BufferTargetType final int target,
                    @UsageType final int usage,
                    final int dimension,
                    @DataType final int type,
                    final int stride,
                    final int offset )
  {
    assert dimension > 0 && dimension <= 4;
    assert stride >= 0 && stride <= 255;
    _data = data;
    _target = target;
    _usage = usage;
    _dimension = dimension;
    _type = type;
    _stride = stride;
    _offset = offset;
    _buffer = GL.prepareBuffer( gl, target, usage, Js.<ArrayBufferView>uncheckedCast( data ) );
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

  public int getStride()
  {
    return _stride;
  }

  public int getOffset()
  {
    return _offset;
  }

  @Nonnull
  public WebGLBuffer getBuffer()
  {
    return _buffer;
  }
}
