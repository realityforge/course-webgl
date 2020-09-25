package org.realityforge.webgl.light;

import javax.annotation.Nonnull;
import org.joml.Vector3f;

final class Light
{
  @Nonnull
  private final Vector3f _color = new Vector3f( 1.0F, 1.0F, 1.0F );
  @Nonnull
  private final Vector3f _position = new Vector3f( 5.0F, 0.0F, -5.0F );

  @Nonnull
  Vector3f getColor()
  {
    return _color;
  }

  @Nonnull
  Vector3f getPosition()
  {
    return _position;
  }
}
