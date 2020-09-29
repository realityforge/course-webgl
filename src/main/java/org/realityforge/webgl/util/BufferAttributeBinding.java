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
  private final Buffer<?> _buffer;
  /**
   * The location/index of attribute in the program. This can either be specified in
   * the shader definition or looked up at runtime. Specifying the value in the shader source
   * is more efficient but more complex when authoring shaders.
   */
  private final int _location;

  public BufferAttributeBinding( @Nonnull final WebGL2RenderingContext gl,
                                 @Nonnull final WebGLProgram program,
                                 @Nonnull final String name,
                                 @Nonnull final Buffer<?> buffer )
  {
    _name = Objects.requireNonNull( name );
    _buffer = Objects.requireNonNull( buffer );
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
  public Buffer<?> getBuffer()
  {
    return _buffer;
  }

  public int getLocation()
  {
    return _location;
  }

  public void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    gl.enableVertexAttribArray( _location );
    gl.bindBuffer( _buffer.getTarget(), _buffer.getBuffer() );
    gl.vertexAttribPointer( _location,
                            _buffer.getDimension(),
                            _buffer.getType(),
                            false,
                            _buffer.getStride(),
                            _buffer.getOffset() );
  }
}
