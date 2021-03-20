package akasha;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DeviceMotionEvent provides web developers with information about the speed of changes for the device's position and orientation.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEvent">DeviceMotionEvent - MDN</a>
 * @see <a href="https://w3c.github.io/deviceorientation/#devicemotionevent">DeviceMotionEvent - DeviceOrientation Event Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DeviceMotionEvent"
)
public class DeviceMotionEvent extends Event {
  /**
   * The DeviceMotionEvent constructor creates a new DeviceMotionEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEvent/DeviceMotionEvent">DeviceMotionEvent.DeviceMotionEvent - MDN</a>
   */
  public DeviceMotionEvent(@Nonnull final String type,
      @Nonnull final DeviceMotionEventInit eventInitDict) {
    super( null );
  }

  /**
   * The DeviceMotionEvent constructor creates a new DeviceMotionEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEvent/DeviceMotionEvent">DeviceMotionEvent.DeviceMotionEvent - MDN</a>
   */
  public DeviceMotionEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The acceleration property returns the amount of acceleration recorded by the device, in meters per second squared (m/s2).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEvent/acceleration">DeviceMotionEvent.acceleration - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "acceleration"
  )
  @Nullable
  public native DeviceMotionEventAcceleration acceleration();

  /**
   * The accelerationIncludingGravity property returns the amount of acceleration recorded by the device, in meters per second squared (m/s2). Unlike DeviceMotionEvent.acceleration which compensates for the influence of gravity, its value is the sum of the acceleration of the device as induced by the user and the acceleration caused by gravity.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEvent/accelerationIncludingGravity">DeviceMotionEvent.accelerationIncludingGravity - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "accelerationIncludingGravity"
  )
  @Nullable
  public native DeviceMotionEventAcceleration accelerationIncludingGravity();

  /**
   * Returns the interval, in milliseconds, at which data is obtained from the underlaying hardware. You can use this to determine the granularity of motion events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEvent/interval">DeviceMotionEvent.interval - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "interval"
  )
  public native double interval();

  /**
   * Returns the rate at which the device is rotating around each of its axes in degrees per second.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceMotionEvent/rotationRate">DeviceMotionEvent.rotationRate - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "rotationRate"
  )
  @Nullable
  public native DeviceMotionEventRotationRate rotationRate();

  @Nonnull
  public static native Promise<String> requestPermission();
}
