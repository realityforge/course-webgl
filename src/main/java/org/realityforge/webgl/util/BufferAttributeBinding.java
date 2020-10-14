package org.realityforge.webgl.util;

import elemental3.gl.WebGL2RenderingContext;
import java.util.Objects;
import javax.annotation.Nonnull;

public final class BufferAttributeBinding
{
  /**
   * The data and layout of data.
   */
  @Nonnull
  private final Buffer<?> _buffer;
  /**
   * The location/index of attribute in the program. This can either be specified in
   * the shader definition or looked up at runtime. Specifying the value in the shader source
   * is more efficient but more complex when authoring shaders.
   */
  private final int _location;

  public BufferAttributeBinding( @Nonnull final Buffer<?> buffer, final int location )
  {
    assert WebGL2RenderingContext.INVALID_INDEX != location;
    _buffer = Objects.requireNonNull( buffer );
    _location = location;
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
                            _buffer.isNormalized(),
                            _buffer.getStride(),
                            _buffer.getOffset() );
  }
}
