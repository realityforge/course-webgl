package org.realityforge.webgl.glslfs.box_sphere;

import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.BufferAttributeBinding;

final class Geometry
{
  @Nonnull
  private final BufferAttributeBinding _positionAttribute;
  @Nonnull
  private final BufferAttributeBinding _colorAttribute;

  Geometry( @Nonnull final BufferAttributeBinding positionAttribute,
            @Nonnull final BufferAttributeBinding colorAttribute )
  {
    _positionAttribute = Objects.requireNonNull( positionAttribute );
    _colorAttribute = Objects.requireNonNull( colorAttribute );
  }

  @Nonnull
  BufferAttributeBinding getPositionAttribute()
  {
    return _positionAttribute;
  }

  @Nonnull
  BufferAttributeBinding getColorAttribute()
  {
    return _colorAttribute;
  }
}
