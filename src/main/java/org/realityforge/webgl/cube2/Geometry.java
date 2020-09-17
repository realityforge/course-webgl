package org.realityforge.webgl.cube2;

import elemental2.core.Float32Array;
import elemental3.WebGL2RenderingContext;
import elemental3.WebGLBuffer;
import javax.annotation.Nonnull;

final class Geometry
{
  @Nonnull
  private final WebGLBuffer _positionBuffer;
  @Nonnull
  private final WebGLBuffer _colorBuffer;

  Geometry( @Nonnull final WebGL2RenderingContext gl,
            @Nonnull final Float32Array positionData,
            @Nonnull final Float32Array colorData )
  {
    // Create a GPU buffer for position data and send data via ARRAY_BUFFER gate with a hint that
    // the data is static and the CPU will not update it often which means that the GPU can store it
    // close to where it is used without worrying about latency to update
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
