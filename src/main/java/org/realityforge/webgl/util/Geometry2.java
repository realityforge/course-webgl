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
  // 0 implies that the geometry is not setup to be instances, >1 indicates the maximum number of instances possible
  private final int _maxInstances;
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
    this( gl, mode, offset, count, 0, indexBuffer, attributes );
  }

  public Geometry2( @Nonnull final WebGL2RenderingContext gl,
                    @DrawPrimitiveType final int mode,
                    final int offset,
                    final int count,
                    final int maxInstances,
                    @Nullable final IndexBuffer indexBuffer,
                    @Nonnull final Attribute... attributes )
  {
    super( gl, true );
    DrawPrimitiveType.Validator.assertValid( mode );
    assert offset >= 0 : "Offset must not be negative";
    assert count > 0 : "Count must be greater than 0";
    assert maxInstances >= 0 : "Max instance count must not be negative";
    assert attributes.length > 0 : "At least one attribute must be supplied";
    _mode = mode;
    _offset = offset;
    _count = count;
    _maxInstances = maxInstances;
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

  public boolean isInstanced()
  {
    return 0 != _maxInstances;
  }

  public void draw()
  {
    assert isAllocated();
    assert !isInstanced();
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

  public void drawInstanced( final int instanceCount )
  {
    assert isAllocated();
    assert isInstanced();
    assert instanceCount <= _maxInstances : "Instance count must be below or equal to maxInstanceCount";
    bind();

    final WebGL2RenderingContext gl = gl();
    if ( null == _indexBuffer )
    {
      gl.drawArraysInstanced( _mode, _offset, _count, instanceCount );
    }
    else
    {
      gl.drawElementsInstanced( _mode, _count, _indexBuffer.getType(), _offset, instanceCount );
    }
    unbind();
  }
}
