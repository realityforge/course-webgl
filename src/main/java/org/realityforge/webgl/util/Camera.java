package org.realityforge.webgl.util;

import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;

public final class Camera
{
  @Nonnull
  private final Matrix4d _viewMatrix = new Matrix4d();
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
  public Vector3f getPosition()
  {
    return _position;
  }

  @Nonnull
  public Vector3f getDirection()
  {
    return _direction;
  }

  @Nonnull
  public Vector3f getUp()
  {
    return _up;
  }

  @Nonnull
  public Matrix4d getViewMatrix()
  {
    return _viewMatrix;
  }

  public void updateViewMatrix()
  {
    _viewMatrix.identity();
    _viewMatrix.lookAt( _position.x,
                        _position.y,
                        _position.z,
                        _position.dup().add( _direction ).x,
                        _position.dup().add( _direction ).y,
                        _position.dup().add( _direction ).z,
                        _up.x,
                        _up.y,
                        _up.z );
  }

  public double getPitch()
  {
    return _pitch;
  }

  public void setPitch( final double pitch )
  {
    _pitch = pitch;
  }

  public double getYaw()
  {
    return _yaw;
  }

  public void setYaw( final double yaw )
  {
    _yaw = yaw;
  }

  public void computeDirection()
  {
    _direction.x = (float) ( Math.cos( _pitch ) * Math.cos( _yaw ) );
    _direction.y = (float) Math.sin( _pitch );
    _direction.z = (float) ( Math.cos( _pitch ) * Math.sin( _yaw ) );
  }
}
