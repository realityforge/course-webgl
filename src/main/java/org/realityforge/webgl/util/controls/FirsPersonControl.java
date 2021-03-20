package org.realityforge.webgl.util.controls;

import akasha.EventTarget;
import akasha.KeyboardEvent;
import akasha.KeyboardEventListener;
import java.util.Objects;
import javax.annotation.Nonnull;
import jsinterop.base.Js;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.webgl.util.Camera;

public final class FirsPersonControl
{
  public static final int KEY_UP = 38;
  public static final int KEY_DOWN = 40;
  public static final int KEY_LEFT = 37;
  public static final int KEY_RIGHT = 39;
  @Nonnull
  private final KeyboardEventListener _onKeyDown = this::onKeyDown;
  @Nonnull
  private final KeyboardEventListener _onKeyUp = this::onKeyUp;
  @Nonnull
  private final Camera _camera;
  @Nonnull
  private final EventTarget _target;
  private boolean _forwardPressed;
  private boolean _backwardPressed;
  private boolean _leftPressed;
  private boolean _rightPressed;
  private boolean _pitchUpPressed;
  private boolean _pitchDownPressed;
  private boolean _yawLeftPressed;
  private boolean _yawRightPressed;

  public FirsPersonControl( @Nonnull final Camera camera, @Nonnull final EventTarget target )
  {
    _camera = Objects.requireNonNull( camera );
    _target = Objects.requireNonNull( target );
    _target.addEventListener( "keydown", Js.cast( _onKeyDown ) );
    _target.addEventListener( "keyup", Js.cast( _onKeyUp ) );
  }

  public void dispose()
  {
    _target.removeEventListener( "keydown", Js.cast( _onKeyDown ) );
    _target.removeEventListener( "keyup", Js.cast( _onKeyUp ) );
  }

  private void onKeyDown( @Nonnull final KeyboardEvent event )
  {
    final String key = event.key();
    final int keyCode = event.keyCode();
    if ( "w".equals( key ) || KEY_UP == keyCode )
    {
      _forwardPressed = true;
    }
    else if ( "s".equals( key ) || KEY_DOWN == keyCode )
    {
      _backwardPressed = true;
    }
    else if ( "a".equals( key ) || KEY_LEFT == keyCode )
    {
      _leftPressed = true;
    }
    else if ( "d".equals( key ) || KEY_RIGHT == keyCode )
    {
      _rightPressed = true;
    }
    else if ( "y".equals( key ) )
    {
      _pitchUpPressed = true;
    }
    else if ( "h".equals( key ) )
    {
      _pitchDownPressed = true;
    }
    else if ( "g".equals( key ) )
    {
      _yawLeftPressed = true;
    }
    else if ( "j".equals( key ) )
    {
      _yawRightPressed = true;
    }
  }

  private void onKeyUp( @Nonnull final KeyboardEvent event )
  {
    final String key = event.key();
    final int keyCode = event.keyCode();
    if ( "w".equals( key ) || KEY_UP == keyCode )
    {
      _forwardPressed = false;
    }
    else if ( "s".equals( key ) || KEY_DOWN == keyCode )
    {
      _backwardPressed = false;
    }
    else if ( "a".equals( key ) || KEY_LEFT == keyCode )
    {
      _leftPressed = false;
    }
    else if ( "d".equals( key ) || KEY_RIGHT == keyCode )
    {
      _rightPressed = false;
    }
    else if ( "y".equals( key ) )
    {
      _pitchUpPressed = false;
    }
    else if ( "h".equals( key ) )
    {
      _pitchDownPressed = false;
    }
    else if ( "g".equals( key ) )
    {
      _yawLeftPressed = false;
    }
    else if ( "j".equals( key ) )
    {
      _yawRightPressed = false;
    }
  }

  public void updateCamera()
  {
    _camera.computeDirection();
    final Vector3d direction = _camera.getDirection();
    final Vector3d position = _camera.getPosition();
    if ( _forwardPressed )
    {
      position.add( direction.dup().mul( 0.1F ) );
    }
    if ( _backwardPressed )
    {
      position.add( direction.dup().mul( -0.1F ) );
    }
    if ( _leftPressed )
    {
      // Calculate the "right" vector (We assume our view has no roll and thus can just use yaw) and
      // after right vector is calculated then use direction to calculate movement
      position.add( new Vector3d( -1 * (float) Math.sin( _camera.getYaw() ),
                                  0,
                                  (float) Math.cos( _camera.getYaw() ) ).mul( -0.1F ) );
    }
    if ( _rightPressed )
    {
      position.add( new Vector3d( -1 * (float) Math.sin( _camera.getYaw() ),
                                  0,
                                  (float) Math.cos( _camera.getYaw() ) ).mul( 0.1F ) );
    }
    if ( _pitchUpPressed )
    {
      _camera.setPitch( _camera.getPitch() + 0.02 );
    }
    if ( _pitchDownPressed )
    {
      _camera.setPitch( _camera.getPitch() - 0.02 );
    }
    if ( _yawLeftPressed )
    {
      _camera.setYaw( _camera.getYaw() - 0.02 );
    }
    if ( _yawRightPressed )
    {
      _camera.setYaw( _camera.getYaw() + 0.02 );
    }
    _camera.updateViewMatrix();
  }
}
