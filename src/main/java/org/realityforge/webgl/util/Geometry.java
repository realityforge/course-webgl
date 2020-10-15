package org.realityforge.webgl.util;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLVertexArrayObject;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class Geometry
{
  @Nonnull
  private final Attribute[] _attributes;
  @Nullable
  private final IndexBuffer<?> _indexBuffer;
  @Nullable
  private WebGLVertexArrayObject _vao;

  public Geometry( @Nonnull final Attribute... attributes )
  {
    this( null, attributes );
  }

  public Geometry( @Nullable final IndexBuffer<?> indexBuffer,
                   @Nonnull final Attribute... attributes )
  {
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
    final WebGLVertexArrayObject vao = gl.createVertexArray();
    assert null != vao;
    gl.bindVertexArray( vao );

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
    _vao = vao;
  }

  private void uploadBuffers( @Nonnull final WebGL2RenderingContext gl )
  {
    if( null != _indexBuffer )
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

  @Nonnull
  public WebGLVertexArrayObject getVao()
  {
    assert null != _vao;
    return _vao;
  }
}
