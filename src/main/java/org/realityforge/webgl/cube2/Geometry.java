package org.realityforge.webgl.cube2;

import elemental3.Float32Array;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLBuffer;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.GL;

final class Geometry
{
  @Nonnull
  private final WebGLBuffer _positionBuffer;

  Geometry( @Nonnull final WebGL2RenderingContext gl, @Nonnull final Float32Array positionData )
  {
    _positionBuffer = GL.prepareBuffer( gl,
                                        WebGL2RenderingContext.ARRAY_BUFFER,
                                        WebGL2RenderingContext.STATIC_DRAW,
                                        positionData );
  }

  @Nonnull
  WebGLBuffer getPositionBuffer()
  {
    return _positionBuffer;
  }
}
