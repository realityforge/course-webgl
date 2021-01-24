package org.realityforge.webgl.util;

import elemental3.core.ArrayBufferView;
import elemental3.gl.UsageType;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.v2.Accessor;

public final class AttributeBuffer
  extends Resource<WebGLBuffer>
{
  @Nonnull
  private final ArrayBufferView _data;
  @UsageType
  private final int _usage;
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
    super( gl, true );
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

  @Override
  public void bind()
  {
    gl().bindBuffer( WebGL2RenderingContext.ARRAY_BUFFER, getHandle() );
  }

  @Override
  public void unbind()
  {
    gl().bindBuffer( WebGL2RenderingContext.ARRAY_BUFFER, null );
  }

  @Nonnull
  @Override
  protected WebGLBuffer allocateResource()
  {
    final WebGL2RenderingContext gl = gl();
    final WebGLBuffer buffer = gl.createBuffer();
    assert null != buffer;
    gl.bindBuffer( WebGL2RenderingContext.ARRAY_BUFFER, buffer );
    gl.bufferData( WebGL2RenderingContext.ARRAY_BUFFER, _data, _usage );
    return buffer;
  }

  @Override
  protected void releaseResource( @Nonnull final WebGLBuffer handle )
  {
    gl().deleteBuffer( handle );
  }
}
