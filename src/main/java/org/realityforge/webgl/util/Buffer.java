package org.realityforge.webgl.util;

import akasha.core.ArrayBufferView;
import akasha.gl.BufferTargetType;
import akasha.gl.UsageType;
import akasha.gl.WebGL2RenderingContext;
import akasha.gl.WebGLBuffer;
import java.util.Objects;
import javax.annotation.Nonnull;

public abstract class Buffer
  extends Resource<WebGLBuffer>
{
  @Nonnull
  private final ArrayBufferView _data;
  @UsageType
  private final int _usage;
  @BufferTargetType
  private final int _bufferTarget;

  protected Buffer( @Nonnull final WebGL2RenderingContext gl,
                    @Nonnull final ArrayBufferView data,
                    @BufferTargetType final int bufferTarget )
  {
    this( gl, data, WebGL2RenderingContext.STATIC_DRAW, bufferTarget );
  }

  protected Buffer( @Nonnull final WebGL2RenderingContext gl,
                    @Nonnull final ArrayBufferView data,
                    @UsageType final int usage,
                    @BufferTargetType final int bufferTarget )
  {
    super( gl, true );
    _data = Objects.requireNonNull( data );
    _usage = UsageType.Util.requireValid( usage );
    _bufferTarget = BufferTargetType.Util.requireValid( bufferTarget );
  }

  @Nonnull
  public final ArrayBufferView getData()
  {
    return _data;
  }

  @UsageType
  public final int getUsage()
  {
    return _usage;
  }

  @Override
  public final void bind()
  {
    gl().bindBuffer( getBufferTarget(), getHandle() );
  }

  @BufferTargetType
  public final int getBufferTarget()
  {
    return _bufferTarget;
  }

  @Override
  public final void unbind()
  {
    gl().bindBuffer( getBufferTarget(), null );
  }

  @Nonnull
  @Override
  protected final WebGLBuffer allocateResource()
  {
    final WebGL2RenderingContext gl = gl();
    final WebGLBuffer buffer = gl.createBuffer();
    assert null != buffer;
    gl.bindBuffer( getBufferTarget(), buffer );
    gl.bufferData( getBufferTarget(), _data, _usage );
    return buffer;
  }

  @Override
  protected final void releaseResource( @Nonnull final WebGLBuffer handle )
  {
    gl().deleteBuffer( handle );
  }
}
