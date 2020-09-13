package elemental3;

import elemental2.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GamepadPose interface of the Gamepad API represents the pose of a WebVR controller at a given timestamp (which includes orientation, position, velocity, and acceleration information.)
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadPose">GamepadPose - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GamepadPose"
)
public class GamepadPose {
  GamepadPose() {
  }

  /**
   * The angularAcceleration read-only property of the GamepadPose interface returns an array representing the angular acceleration vector of the Gamepad, in meters per second per second.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadPose/angularAcceleration">GamepadPose.angularAcceleration - MDN</a>
   */
  @JsProperty(
      name = "angularAcceleration"
  )
  @Nullable
  public native Float32Array angularAcceleration();

  /**
   * The angularVelocity read-only property of the GamepadPose interface returns an array representing the angular velocity vector of the Gamepad, in radians per second.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadPose/angularVelocity">GamepadPose.angularVelocity - MDN</a>
   */
  @JsProperty(
      name = "angularVelocity"
  )
  @Nullable
  public native Float32Array angularVelocity();

  /**
   * The hasOrientation read-only property of the GamepadPose interface returns a Boolean stating whether the Gamepad can track and return orientation information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadPose/hasOrientation">GamepadPose.hasOrientation - MDN</a>
   */
  @JsProperty(
      name = "hasOrientation"
  )
  public native boolean hasOrientation();

  /**
   * The hasPosition read-only property of the GamepadPose interface returns a Boolean stating whether the Gamepad can track and return position information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadPose/hasPosition">GamepadPose.hasPosition - MDN</a>
   */
  @JsProperty(
      name = "hasPosition"
  )
  public native boolean hasPosition();

  /**
   * The linearAcceleration read-only property of the GamepadPose interface returns an array representing the linear acceleration vector of the Gamepad, in meters per second per second.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadPose/linearAcceleration">GamepadPose.linearAcceleration - MDN</a>
   */
  @JsProperty(
      name = "linearAcceleration"
  )
  @Nullable
  public native Float32Array linearAcceleration();

  /**
   * The linearVelocity read-only property of the GamepadPose interface returns an array representing the linear velocity vector of the Gamepad, in meters per second.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadPose/linearVelocity">GamepadPose.linearVelocity - MDN</a>
   */
  @JsProperty(
      name = "linearVelocity"
  )
  @Nullable
  public native Float32Array linearVelocity();

  /**
   * The orientation read-only property of the GamepadPose interface returns the orientation of the Gamepad, as a quarternion value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadPose/orientation">GamepadPose.orientation - MDN</a>
   */
  @JsProperty(
      name = "orientation"
  )
  @Nullable
  public native Float32Array orientation();

  /**
   * The position read-only property of the GamepadPose interface returns the position of the Gamepad as a 3D vector.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GamepadPose/position">GamepadPose.position - MDN</a>
   */
  @JsProperty(
      name = "position"
  )
  @Nullable
  public native Float32Array position();
}
