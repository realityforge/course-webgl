package org.realityforge.webgl.util;

import akasha.gl.WebGL2RenderingContext;
import akasha.gl.WebGLProgram;
import javax.annotation.Nonnull;

public final class FloatUniform
  extends Uniform
{
  private float _x;

  public FloatUniform( @Nonnull final WebGL2RenderingContext gl,
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
