package org.realityforge.webgl.camera;

import javax.annotation.Nonnull;
import org.joml.Vector3d;

final class Camera
{
  // Position of the eye
  @Nonnull
  private final Vector3d _position = new Vector3d( 0.0, 0.0, 0.0 );
  // Position of the target we are looking at
  @Nonnull
  private final Vector3d _target = new Vector3d( 0.2, 0, -1.0 );
  // The up vector
  @Nonnull
  private final Vector3d _up = new Vector3d( 0.0, 1.0, 0.0 );

  @Nonnull
  Vector3d getPosition()
  {
    return _position;
  }

  @Nonnull
  Vector3d getTarget()
  {
    return _target;
  }

  @Nonnull
  Vector3d getUp()
  {
    return _up;
  }
}
