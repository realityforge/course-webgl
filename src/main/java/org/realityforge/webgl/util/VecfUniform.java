package org.realityforge.webgl.util;

import akasha.core.Float32Array;
import akasha.gl.WebGL2RenderingContext;
import akasha.gl.WebGLProgram;
import java.util.Objects;
import javax.annotation.Nonnull;

public final class VecfUniform
  extends Uniform
{
  private final Float32Array _values;

  public VecfUniform( @Nonnull final WebGL2RenderingContext gl,
                      @Nonnull final WebGLProgram program,
                      @Nonnull final String name,
                      @Nonnull final Float32Array values )
  {
    super( gl, program, name );
    _values = Objects.requireNonNull( values );
  }

  public void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.uniform1fv( getLocation(), _values );
  }
}
