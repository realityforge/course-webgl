package org.realityforge.webgl.util;

import elemental3.gl.DrawPrimitiveType;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLVertexArrayObject;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class Geometry2
  extends Resource<WebGLVertexArrayObject>
{
  @DrawPrimitiveType
  private final int _mode;
  private final int _offset;
  private final int _count;
  @Nonnull
  private final Attribute[] _attributes;
  @Nullable
  private final IndexBuffer _indexBuffer;

  public Geometry2( @Nonnull final WebGL2RenderingContext gl, final int count, @Nonnull final Attribute... attributes )
  {
    this( gl, WebGL2RenderingContext.TRIANGLES, 0, count, null, attributes );
  }

  public Geometry2( @Nonnull final WebGL2RenderingContext gl,
                    @DrawPrimitiveType final int mode,
                    final int offset,
                    final int count,
                    @Nullable final IndexBuffer indexBuffer,
                    @Nonnull final Attribute... attributes )
  {
    super( gl, true );
    _mode = mode;
    _offset = offset;
    _count = count;
    _indexBuffer = indexBuffer;
    _attributes = Objects.requireNonNull( attributes );
  }

  @Override
  public void bind()
  {
    gl().bindVertexArray( getHandle() );
  }

  @Override
  public void unbind()
  {
    gl().bindVertexArray( null );
  }

  @Nonnull
  @Override
  protected WebGLVertexArrayObject allocateResource()
  {
    // Upload the buffers ... outside the scope of the VAO
    if ( null != _indexBuffer )
    {
      _indexBuffer.allocateIfNecessary();
    }
    for ( final Attribute attribute : _attributes )
    {
      attribute.getBuffer().allocateIfNecessary();
    }

    final WebGL2RenderingContext gl = gl();
    final WebGLVertexArrayObject vertexArrayObject = gl.createVertexArray();
    assert null != vertexArrayObject;
    gl.bindVertexArray( vertexArrayObject );
    if ( null != _indexBuffer )
    {
      _indexBuffer.bind();
    }
    for ( final Attribute attribute : _attributes )
    {
      attribute.sendToGpu();
    }
    gl.bindVertexArray( null );

    // No need to call disableVertexAttribArray as that state is bound to VAO and
    // effectively disabled when the VAO is unbound

    return vertexArrayObject;
  }

  @Override
  protected void releaseResource( @Nonnull final WebGLVertexArrayObject handle )
  {
    gl().deleteVertexArray( handle );
  }

  @Nonnull
  public Attribute getAttribute( final int index )
  {
    return _attributes[ index ];
  }

  public void draw()
  {
    assert isAllocated();
    bind();

    final WebGL2RenderingContext gl = gl();
    if ( null == _indexBuffer )
    {
      gl.drawArrays( _mode, _offset, _count );
    }
    else
    {
      gl.drawElements( _mode, _count, _indexBuffer.getType(), _offset );
    }
    unbind();
  }
}
