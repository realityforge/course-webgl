package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GeolocationPositionError interface represents the reason of an error occurring when using the geolocating device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionError">PositionError - MDN</a>
 * @see <a href="https://w3c.github.io/geolocation-api/#position_error_interface">The definition of 'GeolocationPositionError' in the 'Geolocation API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class PositionError {
  @JsOverlay
  public static final int PERMISSION_DENIED = 1;

  @JsOverlay
  public static final int POSITION_UNAVAILABLE = 2;

  @JsOverlay
  public static final int TIMEOUT = 3;

  protected PositionError() {
  }

  /**
   * The GeolocationPositionError.code read-only property is an unsigned short representing the error code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionError/code">PositionError.code - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-geolocationpositionerror-code">The definition of 'PositionError.code' in the 'Geolocation API' specification.</a>
   */
  @JsProperty(
      name = "code"
  )
  @PositionErrorCode
  public native int code();

  /**
   * The GeolocationPositionError.message read-only property returns a human-readable DOMString describing the details of the error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionError/message">PositionError.message - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-geolocationpositionerror-message">The definition of 'GeolocationPositionError.message' in the 'Geolocation API' specification.</a>
   */
  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();
}
