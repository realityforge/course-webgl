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
  private final Buffer<?> _attribute;
  private final int _location;

  public BufferAttributeBinding( @Nonnull final WebGL2RenderingContext gl,
                                 @Nonnull final WebGLProgram program,
                                 @Nonnull final String name,
                                 @Nonnull final Buffer<?> attribute )
  {
    _name = Objects.requireNonNull( name );
    _attribute = Objects.requireNonNull( attribute );
    _location = gl.getAttribLocation( program, name );
    //TODO: We should improve the handling of this error
    assert WebGL2RenderingContext.INVALID_INDEX != _location;
  }

  @Nonnull
  public String getName()
  {
    return _name;
  }

  @Nonnull
  public Buffer<?> getAttribute()
  {
    return _attribute;
  }

  public int getLocation()
  {
    return _location;
  }

  public void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.enableVertexAttribArray( _location );
    gl.bindBuffer( _attribute.getTarget(), _attribute.getBuffer() );
    gl.vertexAttribPointer( _location,
                            _attribute.getDimension(),
                            _attribute.getType(),
                            false,
                            _attribute.getStride(),
                            _attribute.getOffset() );
  }
}
