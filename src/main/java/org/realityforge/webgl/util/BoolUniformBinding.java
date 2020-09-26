package org.realityforge.webgl.util;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import javax.annotation.Nonnull;

public final class BoolUniformBinding
  extends UniformBinding
{
  private boolean _value;

  public BoolUniformBinding( @Nonnull final WebGL2RenderingContext gl,
                             @Nonnull final WebGLProgram program,
                             @Nonnull final String name,
                             final boolean value )
  {
    super( gl, program, name );
    _value = value;
  }

  public void setValue( final boolean value )
  {
    _value = value;
  }

  public void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.uniform1f( getLocation(), _value ? 1 : 0 );
  }
}
