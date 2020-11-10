package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GeolocationPosition interface represents the position of the concerned device at a given time. The position, represented by a GeolocationCoordinates object, comprehends the 2D position of the device, on a spheroid representing the Earth, but also its altitude and its speed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Position">Position - MDN</a>
 * @see <a href="https://w3c.github.io/geolocation-api/#position_interface">The definition of 'GeolocationPosition' in the 'Geolocation API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class Position {
  protected Position() {
  }

  /**
   * The GeolocationPosition.coords read-only property returns a GeolocationCoordinates object representing a geographic position. It contains the location, that is longitude and latitude on the Earth, the altitude, and the speed of the object concerned, regrouped inside the returned value. It also contains accuracy information about these values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Position/coords">Position.coords - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-geolocationposition-coords">The definition of 'GeolocationPosition.coords' in the 'Geolocation API' specification.</a>
   */
  @JsProperty(
      name = "coords"
  )
  @Nonnull
  public native Coordinates coords();

  /**
   * The GeolocationPosition.timestamp read-only property returns a DOMTimeStamp object, represents the date and the time of the creation of the GeolocationPosition object it belongs to. The precision is to the millisecond.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Position/timestamp">Position.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-geolocationposition-timestamp">The definition of 'GeolocationPosition.timestamp' in the 'Geolocation API' specification.</a>
   */
  @JsProperty(
      name = "timestamp"
  )
  public native int timestamp();
}
