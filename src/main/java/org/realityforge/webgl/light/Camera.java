package org.realityforge.webgl.light;

import javax.annotation.Nonnull;
import org.realityforge.vecmath.Vector3f;

final class Camera
{
  // Position of the eye
  @Nonnull
  private final Vector3f _position = new Vector3f( 0, 0, 0 );
  // Position of the target we are looking at
  @Nonnull
  private final Vector3f _direction = new Vector3f( 0, 0, -1.0F );
  // The up vector
  @Nonnull
  private final Vector3f _up = new Vector3f( 0, 1, 0 );
  private double _pitch = 0.0;
  private double _yaw = -Math.PI / 2.0;

  @Nonnull
  Vector3f getPosition()
  {
    return _position;
  }

  @Nonnull
  Vector3f getDirection()
  {
    return _direction;
  }

  @Nonnull
  Vector3f getUp()
  {
    return _up;
  }

  double getPitch()
  {
    return _pitch;
  }

  void setPitch( final double pitch )
  {
    _pitch = pitch;
  }

  double getYaw()
  {
    return _yaw;
  }

  void setYaw( final double yaw )
  {
    _yaw = yaw;
  }

  void computeDirection()
  {
    _direction.x = (float) ( Math.cos( _pitch ) * Math.cos( _yaw ) );
    _direction.y = (float) Math.sin( _pitch );
    _direction.z = (float) ( Math.cos( _pitch ) * Math.sin( _yaw ) );
  }
}
