package org.realityforge.webgl.util;

import elemental3.core.ArrayBufferView;
import elemental3.gl.DrawElementDataType;
import elemental3.gl.UsageType;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import javax.annotation.Nonnull;

public final class IndexBuffer
  extends Resource<WebGLBuffer>
{
  @Nonnull
  private final ArrayBufferView _data;
  @UsageType
  private final int _usage;
  @DrawElementDataType
  private final int _type;

  public IndexBuffer( @Nonnull final WebGL2RenderingContext gl,
                      @Nonnull final ArrayBufferView data,
                      @DrawElementDataType final int type )
  {
    this( gl, data, WebGL2RenderingContext.STATIC_DRAW, type );
  }

  public IndexBuffer( @Nonnull final WebGL2RenderingContext gl,
                      @Nonnull final ArrayBufferView data,
                      @UsageType final int usage,
                      @DrawElementDataType final int type )
  {
    super( gl, true );
    _data = data;
    _usage = usage;
    _type = type;
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

  @Override
  public void bind()
  {
    gl().bindBuffer( WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, getHandle() );
  }

  @Override
  public void unbind()
  {
    gl().bindBuffer( WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, null );
  }

  @Nonnull
  @Override
  protected WebGLBuffer allocateResource()
  {
    final WebGL2RenderingContext gl = gl();
    final WebGLBuffer buffer = gl.createBuffer();
    assert null != buffer;
    gl.bindBuffer( WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, getHandle() );
    gl.bufferData( WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, _data, _usage );
    return buffer;
  }

  @Override
  protected void releaseResource( @Nonnull final WebGLBuffer handle )
  {
    gl().deleteBuffer( handle );
  }
}
