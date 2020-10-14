package org.realityforge.webgl.util;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLUniformLocation;
import java.util.Objects;
import javax.annotation.Nonnull;

public class UniformBinding
{
  /**
   * The name of the shader variable.
   */
  @Nonnull
  private final String _name;
  @Nonnull
  private final WebGLUniformLocation _location;

  public UniformBinding( @Nonnull final WebGL2RenderingContext gl,
                         @Nonnull final WebGLProgram program,
                         @Nonnull final String name )
  {
    _name = Objects.requireNonNull( name );
    _location = GL.getUniformLocation( gl, program, name );
  }

  @Nonnull
  public final String getName()
  {
    return _name;
  }

  @Nonnull
  public final WebGLUniformLocation getLocation()
  {
    return _location;
  }
}
