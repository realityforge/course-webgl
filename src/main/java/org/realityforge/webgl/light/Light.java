package org.realityforge.webgl.light;

import javax.annotation.Nonnull;
import org.joml.Vector3d;
import org.joml.Vector3f;

final class Light
{
  @Nonnull
  private final Vector3f _color = new Vector3f( 1.0F, 1.0F, 1.0F );
  @Nonnull
  private final Vector3d _position = new Vector3d( 8.0, 0.0, -7.0 );

  @Nonnull
  Vector3f getColor()
  {
    return _color;
  }

  @Nonnull
  Vector3d getPosition()
  {
    return _position;
  }
}
