package akasha;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A DeviceMotionEventRotationRate object provides information about the rate at which the device is rotating around all three axes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEventRotationRate">DeviceMotionEventRotationRate - MDN</a>
 * @see <a href="https://w3c.github.io/deviceorientation/#devicemotioneventrotationrate">DeviceMotionEventRotationRate - DeviceOrientation Event Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DeviceMotionEventRotationRate"
)
public class DeviceMotionEventRotationRate {
  protected DeviceMotionEventRotationRate() {
  }

  /**
   * This property indicates the rate of rotation around the Z axis -- in degrees per second -- in a DeviceMotionEventRotationRate object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEventRotationRate/alpha">DeviceMotionEventRotationRate.alpha - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/#dom-devicemotioneventrotationrate-alpha">DeviceMotionEventRotationRate: alpha - DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "alpha"
  )
  @Nullable
  public native Double alpha();

  /**
   * This property indicates the rate of rotation around the X axis -- in degrees per second -- in a DeviceMotionEventRotationRate object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEventRotationRate/beta">DeviceMotionEventRotationRate.beta - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/#dom-devicemotioneventrotationrate-beta">DeviceMotionEventRotationRate: beta - DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "beta"
  )
  @Nullable
  public native Double beta();

  /**
   * This property indicates the rate of rotation around the Y axis -- in degrees per second -- in a DeviceMotionEventRotationRate object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEventRotationRate/gamma">DeviceMotionEventRotationRate.gamma - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/#dom-devicemotioneventrotationrate-gamma">DeviceMotionEventRotationRate: gamma - DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "gamma"
  )
  @Nullable
  public native Double gamma();
}
