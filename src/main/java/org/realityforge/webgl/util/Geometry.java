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
    AppState.get().bindVertexArrayObject( vertexArrayObject );

    if ( null != _indexBuffer )
    {
      _indexBuffer.bind( gl );
    }

    for ( final Attribute attribute : _attributes )
    {
      // TODO: Maybe we should assume attribute is valid by here
      if ( attribute.isLocationValid() )
      {
        attribute.sendToGpu( gl );
      }
    }
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
      // TODO: Maybe we should assume attribute is valid by here
      if ( attribute.isLocationValid() )
      {
        attribute.getBuffer().uploadToGpu( gl );
      }
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
    AppState.get().bindVertexArrayObject( _vertexArrayObject );

    if ( null == _indexBuffer )
    {
      gl.drawArrays( _mode, _offset, _count );
    }
    else
    {
      gl.drawElements( _mode, _count, _indexBuffer.getType(), _offset );
    }
  }
}
