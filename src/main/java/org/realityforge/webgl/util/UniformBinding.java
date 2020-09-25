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
    final WebGLUniformLocation location = gl.getUniformLocation( program, name );
    //TODO: We should improve the handling of this error
    assert null != location;
    _location = location;
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
