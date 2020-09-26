package org.realityforge.webgl.util;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import javax.annotation.Nonnull;

public final class FloatUniformBinding
  extends UniformBinding
{
  private float _x;

  public FloatUniformBinding( @Nonnull final WebGL2RenderingContext gl,
                              @Nonnull final WebGLProgram program,
                              @Nonnull final String name,
                              final float x )
  {
    super( gl, program, name );
    _x = x;
  }

  public void setX( final float x )
  {
    _x = x;
  }

  public void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.uniform1f( getLocation(), _x );
  }
}
