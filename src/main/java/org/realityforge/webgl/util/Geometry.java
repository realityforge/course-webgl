package org.realityforge.webgl.util;

import elemental3.gl.DrawPrimitiveType;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLVertexArrayObject;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class Geometry
{
  @DrawPrimitiveType
  private final int _mode;
  private final int _offset;
  private final int _count;
  @Nonnull
  private final Attribute[] _attributes;
  @Nullable
  private final IndexBuffer<?> _indexBuffer;
  @Nullable
  private WebGLVertexArrayObject _vertexArrayObject;

  public Geometry( final int count, @Nonnull final Attribute... attributes )
  {
    this( WebGL2RenderingContext.TRIANGLES, 0, count, null, attributes );
  }

  public Geometry( @DrawPrimitiveType final int mode,
                   final int offset,
                   final int count,
                   @Nullable final IndexBuffer<?> indexBuffer,
                   @Nonnull final Attribute... attributes )
  {
    _mode = mode;
    _offset = offset;
    _count = count;
    _indexBuffer = indexBuffer;
    _attributes = Objects.requireNonNull( attributes );
  }

  public void uploadToCpu( @Nonnull final WebGL2RenderingContext gl )
  {
    uploadBuffers( gl );
    buildVertexArrayObject( gl );
  }

  private void buildVertexArrayObject( @Nonnull final WebGL2RenderingContext gl )
  {
    final WebGLVertexArrayObject vertexArrayObject = gl.createVertexArray();
    assert null != vertexArrayObject;
    gl.bindVertexArray( vertexArrayObject );

    if ( null != _indexBuffer )
    {
      _indexBuffer.bind( gl );
    }

    for ( final Attribute attribute : _attributes )
    {
      attribute.sendToGpu( gl );
    }

    // If we could guarantee that another bind happens immediately
    // after this we could skip this bind operation
    gl.bindVertexArray( null );
    _vertexArrayObject = vertexArrayObject;
  }

  private void uploadBuffers( @Nonnull final WebGL2RenderingContext gl )
  {
    if ( null != _indexBuffer )
    {
      _indexBuffer.uploadToGpu( gl );
    }
    for ( final Attribute attribute : _attributes )
    {
      attribute.getBuffer().uploadToGpu( gl );
    }
  }

  @Nonnull
  public Attribute getAttribute( final int index )
  {
    return _attributes[ index ];
  }

  public void draw( @Nonnull final WebGL2RenderingContext gl )
  {
    assert null != _vertexArrayObject;

    // TODO: Should not need to change vao all the time if it is current vao.
    //       We probably need to maintain global state and only change if required
    gl.bindVertexArray( _vertexArrayObject );

    if ( null == _indexBuffer )
    {
      gl.drawArrays( _mode, _offset, _count );
    }
    else
    {
      gl.drawElements( _mode, _count, _indexBuffer.getType(), _offset );
    }
    // TODO: Should not null out if we will re-use this or we will immediately change to another vao
    //       We probably should gate this on either compile-time setting or runtime setting or both
    gl.bindVertexArray( null );
  }
}
