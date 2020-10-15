package org.realityforge.webgl.tjs;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLVertexArrayObject;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.realityforge.webgl.util.BufferAttribute;

final class Geometry
{
  @Nonnull
  private final BufferAttribute[] _bindings;
  @Nullable
  private WebGLVertexArrayObject _vao;

  Geometry( @Nonnull final BufferAttribute... bindings )
  {
    _bindings = Objects.requireNonNull( bindings );
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

    for ( final BufferAttribute binding : _bindings )
    {
      binding.sendToGpu( gl );
    }

    // If we could guarantee that another bind happens immediately
    // after this we could skip this bind operation
    gl.bindVertexArray( null );
    _vao = vao;
  }

  private void uploadBuffers( @Nonnull final WebGL2RenderingContext gl )
  {
    for ( final BufferAttribute binding : _bindings )
    {
      binding.getBuffer().uploadToGpu( gl );
    }
  }

  @Nonnull
  BufferAttribute[] getBindings()
  {
    return _bindings;
  }

  @Nonnull
  WebGLVertexArrayObject getVao()
  {
    assert null != _vao;
    return _vao;
  }
}
