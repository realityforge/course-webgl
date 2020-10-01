package org.realityforge.webgl.tjs;

import javax.annotation.Nonnull;
import org.joml.Vector3d;

final class Camera
{
  // Position of the eye
  @Nonnull
  private final Vector3d _position = new Vector3d( 0.0, 0.0, 0.0 );
  // Position of the target we are looking at
  @Nonnull
  private final Vector3d _direction = new Vector3d( 0.0, 0, -1.0 );
  // The up vector
  @Nonnull
  private final Vector3d _up = new Vector3d( 0.0, 1.0, 0.0 );
  private double _pitch = 0.0;
  private double _yaw = -Math.PI / 2.0;

  @Nonnull
  Vector3d getPosition()
  {
    return _position;
  }

  @Nonnull
  Vector3d getDirection()
  {
    return _direction;
  }

  @Nonnull
  Vector3d getUp()
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
    _direction.x = Math.cos( _pitch ) * Math.cos( _yaw );
    _direction.y = Math.sin( _pitch );
    _direction.z = Math.cos( _pitch ) * Math.sin( _yaw );
  }
}
