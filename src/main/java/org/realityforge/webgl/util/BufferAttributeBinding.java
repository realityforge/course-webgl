package org.realityforge.webgl.util;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import java.util.Objects;
import javax.annotation.Nonnull;

public final class BufferAttributeBinding
{
  /**
   * The name of the shader variable.
   */
  @Nonnull
  private final String _name;
  @Nonnull
  private final BufferAttribute<?> _attribute;
  private final int _location;

  public BufferAttributeBinding( @Nonnull final WebGL2RenderingContext gl,
                                 @Nonnull final WebGLProgram program,
                                 @Nonnull final String name,
                                 @Nonnull final BufferAttribute<?> attribute )
  {
    _name = Objects.requireNonNull( name );
    _attribute = Objects.requireNonNull( attribute );
    _location = gl.getAttribLocation( program, name );
    //TODO: We should improve the handling of this error
    assert -1 != _location;
  }

  @Nonnull
  public String getName()
  {
    return _name;
  }

  @Nonnull
  public BufferAttribute<?> getAttribute()
  {
    return _attribute;
  }

  public int getLocation()
  {
    return _location;
  }
}
