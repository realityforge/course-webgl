package akasha;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A DeviceMotionEventAcceleration object provides information about the amount of acceleration the device is experiencing along all three axes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEventAcceleration">DeviceMotionEventAcceleration - MDN</a>
 * @see <a href="https://w3c.github.io/deviceorientation/#devicemotioneventacceleration">DeviceMotionEventAcceleration - DeviceOrientation Event Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DeviceMotionEventAcceleration"
)
public class DeviceMotionEventAcceleration {
  protected DeviceMotionEventAcceleration() {
  }

  /**
   * This read-only property indicates the amount of acceleration that occurred along the X axis in a DeviceMotionEventAcceleration object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEventAcceleration/x">DeviceMotionEventAcceleration.x - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/#dom-devicemotioneventacceleration-x">DeviceMotionEventAcceleration: x - DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "x"
  )
  @Nullable
  public native Double x();

  /**
   * This read-only property indicates the amount of acceleration that occurred along the Y axis in a DeviceMotionEventAcceleration object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEventAcceleration/y">DeviceMotionEventAcceleration.y - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/#dom-devicemotioneventacceleration-y">DeviceMotionEventAcceleration: y - DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "y"
  )
  @Nullable
  public native Double y();

  /**
   * This read-only property indicates the amount of acceleration that occurred along the Z axis in a DeviceMotionEventAcceleration object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEventAcceleration/z">DeviceMotionEventAcceleration.z - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/#dom-devicemotioneventacceleration-z">DeviceMotionEventAcceleration: z - DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "z"
  )
  @Nullable
  public native Double z();
}
