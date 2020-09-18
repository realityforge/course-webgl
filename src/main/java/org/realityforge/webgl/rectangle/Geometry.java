package org.realityforge.webgl.rectangle;

import elemental2.core.Float32Array;
import elemental2.core.Uint16Array;
import elemental3.WebGL2RenderingContext;
import elemental3.WebGLBuffer;
import elemental3.WebGLVertexArrayObject;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.GL;

final class Geometry
{
  @Nonnull
  private final WebGLVertexArrayObject _vertexArrayObject;
  @Nonnull
  private final WebGLBuffer _positionBuffer;
  @Nonnull
  private final WebGLBuffer _colorBuffer;

  Geometry( @Nonnull final WebGL2RenderingContext gl,
            @Nonnull final Uint16Array indexData,
            @Nonnull final Float32Array positionData,
            @Nonnull final Float32Array colorData )
  {
    final WebGLVertexArrayObject vertexArrayObject = gl.createVertexArray();
    assert null != vertexArrayObject;
    // A bound vertexArrayObject will record the subsequent binds
    gl.bindVertexArray( vertexArrayObject );

    _vertexArrayObject = vertexArrayObject;

    // The ELEMENT_ARRAY_BUFFER is accessed later "magically" via drawElements call
    GL.prepareBuffer( gl,
                      WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER,
                      WebGL2RenderingContext.STATIC_DRAW,
                      indexData );
    _positionBuffer = GL.prepareBuffer( gl,
                                        WebGL2RenderingContext.ARRAY_BUFFER,
                                        WebGL2RenderingContext.STATIC_DRAW,
                                        positionData );
    _colorBuffer = GL.prepareBuffer( gl,
                                     WebGL2RenderingContext.ARRAY_BUFFER,
                                     WebGL2RenderingContext.STATIC_DRAW,
                                     colorData );
  }

  @Nonnull
  WebGLVertexArrayObject getVertexArrayObject()
  {
    return _vertexArrayObject;
  }

  @Nonnull
  WebGLBuffer getPositionBuffer()
  {
    return _positionBuffer;
  }

  @Nonnull
  WebGLBuffer getColorBuffer()
  {
    return _colorBuffer;
  }
}
