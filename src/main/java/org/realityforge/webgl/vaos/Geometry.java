package org.realityforge.webgl.vaos;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLVertexArrayObject;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.Attribute;

final class Geometry
{
  @Nonnull
  private final WebGLVertexArrayObject _vao;

  Geometry( @Nonnull final WebGL2RenderingContext gl,
            @Nonnull final Attribute... attributes )
  {
    final WebGLVertexArrayObject vao = gl.createVertexArray();
    assert null != vao;
    _vao = vao;
    gl.bindVertexArray( _vao );

    for ( final Attribute attribute : attributes )
    {
      attribute.sendToGpu( gl );
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
