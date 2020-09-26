package org.realityforge.webgl.util;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import javax.annotation.Nonnull;

public final class Vec2fUniformBinding
  extends UniformBinding
{
  private float _x;
  private float _y;

  public Vec2fUniformBinding( @Nonnull final WebGL2RenderingContext gl,
                              @Nonnull final WebGLProgram program,
                              @Nonnull final String name,
                              final float x,
                              final float y )
  {
    super( gl, program, name );
    _x = x;
    _y = y;
  }

  public void setX( final float x )
  {
    _x = x;
  }

  public void setY( final float y )
  {
    _y = y;
  }

  public void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.uniform2f( getLocation(), _x, _y );
  }
}
