package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Geolocation interface represents an object able to programmatically obtain the position of the device. It gives Web content access to the location of the device. This allows a Web site or app to offer customized results based on the user's location.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Geolocation">Geolocation - MDN</a>
 * @see <a href="https://w3c.github.io/geolocation-api/#geolocation_interface">Geolocation API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class Geolocation {
  protected Geolocation() {
  }

  /**
   * The Geolocation.clearWatch() method is used to unregister location/error monitoring handlers previously installed using Geolocation.watchPosition().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Geolocation/clearWatch">Geolocation.clearWatch - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/">Geolocation API</a>
   */
  public native void clearWatch(int watchId);

  /**
   * The Geolocation.getCurrentPosition() method is used to get the current position of the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Geolocation/getCurrentPosition">Geolocation.getCurrentPosition - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/">Geolocation API</a>
   */
  public native void getCurrentPosition(@Nonnull PositionCallback successCallback,
      @Nonnull PositionErrorCallback errorCallback, @Nonnull PositionOptions options);

  /**
   * The Geolocation.getCurrentPosition() method is used to get the current position of the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Geolocation/getCurrentPosition">Geolocation.getCurrentPosition - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/">Geolocation API</a>
   */
  public native void getCurrentPosition(@Nonnull PositionCallback successCallback,
      @Nonnull PositionErrorCallback errorCallback);

  /**
   * The Geolocation.getCurrentPosition() method is used to get the current position of the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Geolocation/getCurrentPosition">Geolocation.getCurrentPosition - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/">Geolocation API</a>
   */
  public native void getCurrentPosition(@Nonnull PositionCallback successCallback);

  /**
   * The Geolocation method watchPosition() method is used to register a handler function that will be called automatically each time the position of the device changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Geolocation/watchPosition">Geolocation.watchPosition - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-geolocation-watchposition">watchPosition() - Geolocation API</a>
   */
  public native int watchPosition(@Nonnull PositionCallback successCallback,
      @Nonnull PositionErrorCallback errorCallback, @Nonnull PositionOptions options);

  /**
   * The Geolocation method watchPosition() method is used to register a handler function that will be called automatically each time the position of the device changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Geolocation/watchPosition">Geolocation.watchPosition - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-geolocation-watchposition">watchPosition() - Geolocation API</a>
   */
  public native int watchPosition(@Nonnull PositionCallback successCallback,
      @Nonnull PositionErrorCallback errorCallback);

  /**
   * The Geolocation method watchPosition() method is used to register a handler function that will be called automatically each time the position of the device changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Geolocation/watchPosition">Geolocation.watchPosition - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-geolocation-watchposition">watchPosition() - Geolocation API</a>
   */
  public native int watchPosition(@Nonnull PositionCallback successCallback);
}
