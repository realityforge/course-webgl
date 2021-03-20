package org.realityforge.webgl.util;

import akasha.gl.WebGL2RenderingContext;
import java.util.Objects;
import javax.annotation.Nonnull;

public final class Attribute
{
  /**
   * The data and layout of data.
   */
  @Nonnull
  private final AttributeBuffer _buffer;
  /**
   * The location/index of attribute in the program. This can either be specified in
   * the shader definition or looked up at runtime. Specifying the value in the shader source
   * is more efficient but more complex when authoring shaders.
   */
  private int _location;

  public Attribute( @Nonnull final AttributeBuffer buffer )
  {
    this( buffer, WebGL2RenderingContext.INVALID_INDEX );
  }

  public Attribute( @Nonnull final AttributeBuffer buffer, final int location )
  {
    _buffer = Objects.requireNonNull( buffer );
    _location = location;
  }

  @Nonnull
  public AttributeBuffer getBuffer()
  {
    return _buffer;
  }

  public boolean isLocationValid()
  {
    return WebGL2RenderingContext.INVALID_INDEX != _location;
  }

  public int getLocation()
  {
    return _location;
  }

  public void setLocation( final int location )
  {
    // Location should only be set once
    assert WebGL2RenderingContext.INVALID_INDEX == _location;
    _location = location;
  }

  public void sendToGpu()
  {
    assert isLocationValid();
    final WebGL2RenderingContext gl = _buffer.gl();
    gl.enableVertexAttribArray( _location );
    _buffer.bind();
    final Accessor accessor = _buffer.getAccessor();
    gl.vertexAttribPointer( _location,
                            accessor.getComponentCount(),
                            accessor.getComponentType(),
                            accessor.shouldNormalize(),
                            accessor.getStride(),
                            accessor.getOffset() );
  }
}
