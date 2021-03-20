package akasha;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DeviceOrientationEvent provides web developers with information from the physical orientation of the device running the web page.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceOrientationEvent">DeviceOrientationEvent - MDN</a>
 * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DeviceOrientationEvent"
)
public class DeviceOrientationEvent extends Event {
  /**
   * The DeviceOrientationEvent constructor creates a new DeviceOrientationEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceOrientationEvent/DeviceOrientationEvent">DeviceOrientationEvent.DeviceOrientationEvent - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  public DeviceOrientationEvent(@Nonnull final String type,
      @Nonnull final DeviceOrientationEventInit eventInitDict) {
    super( null );
  }

  /**
   * The DeviceOrientationEvent constructor creates a new DeviceOrientationEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceOrientationEvent/DeviceOrientationEvent">DeviceOrientationEvent.DeviceOrientationEvent - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  public DeviceOrientationEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * Indicates whether or not the device is providing orientation data absolutely (that is, in reference to the Earth's coordinate frame) or using some arbitrary frame determined by the device. See Orientation and motion data explained for details.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceOrientationEvent/absolute">DeviceOrientationEvent.absolute - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "absolute"
  )
  public native boolean absolute();

  /**
   * Returns the rotation of the device around the Z axis; that is, the number of degrees by which the device is being twisted around the center of the screen. See Orientation and motion data explained for details.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceOrientationEvent/alpha">DeviceOrientationEvent.alpha - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "alpha"
  )
  @Nullable
  public native Double alpha();

  /**
   * Returns the rotation of the device around the X axis; that is, the number of degrees, ranged between -180 and 180,  by which the device is tipped forward or backward. See Orientation and motion data explained for details.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceOrientationEvent/beta">DeviceOrientationEvent.beta - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "beta"
  )
  @Nullable
  public native Double beta();

  /**
   * Returns the rotation of the device around the Y axis; that is, the number of degrees, ranged between -90 and 90, by which the device is tilted left or right. See Orientation and motion data explained for details.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DeviceOrientationEvent/gamma">DeviceOrientationEvent.gamma - MDN</a>
   * @see <a href="https://w3c.github.io/deviceorientation/">DeviceOrientation Event Specification</a>
   */
  @JsProperty(
      name = "gamma"
  )
  @Nullable
  public native Double gamma();

  @Nonnull
  public static native Promise<String> requestPermission();
}
