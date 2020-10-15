package org.realityforge.webgl.vaos;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLVertexArrayObject;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.BufferAttribute;

final class Geometry
{
  @Nonnull
  private final WebGLVertexArrayObject _vao;

  Geometry( @Nonnull final WebGL2RenderingContext gl,
            @Nonnull final BufferAttribute... bindings )
  {
    final WebGLVertexArrayObject vao = gl.createVertexArray();
    assert null != vao;
    _vao = vao;
    gl.bindVertexArray( _vao );

    for ( final BufferAttribute binding : bindings )
    {
      binding.sendToGpu( gl );
    }

    // If we could guarantee that another bind happens immediately
    // after this we could skip this bind operation
    gl.bindVertexArray( null );
  }

  @Nonnull
  WebGLVertexArrayObject getVao()
  {
    return _vao;
  }
}
