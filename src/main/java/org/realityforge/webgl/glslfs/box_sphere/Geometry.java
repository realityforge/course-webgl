package org.realityforge.webgl.glslfs.box_sphere;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLVertexArrayObject;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.realityforge.webgl.util.BufferAttribute;

final class Geometry
{
  @Nonnull
  private final BufferAttribute[] _attributes;
  @Nullable
  private WebGLVertexArrayObject _vao;

  Geometry( @Nonnull final BufferAttribute... attributes )
  {
    _attributes = Objects.requireNonNull( attributes );
  }

  void uploadToCpu( @Nonnull final WebGL2RenderingContext gl )
  {
    uploadBuffers( gl );
    buildVertexArrayObject( gl );
  }

  private void buildVertexArrayObject( @Nonnull final WebGL2RenderingContext gl )
  {
    final WebGLVertexArrayObject vao = gl.createVertexArray();
    assert null != vao;
    gl.bindVertexArray( vao );

    for ( final BufferAttribute attribute : _attributes )
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
    for ( final BufferAttribute attribute : _attributes )
    {
      attribute.getBuffer().uploadToGpu( gl );
    }
  }

  @Nonnull
  BufferAttribute[] getAttributes()
  {
    return _attributes;
  }

  @Nonnull
  WebGLVertexArrayObject getVao()
  {
    assert null != _vao;
    return _vao;
  }
}
