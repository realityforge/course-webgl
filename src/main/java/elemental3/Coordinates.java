package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GeolocationCoordinates interface represents the position and altitude of the device on Earth, as well as the accuracy with which these properties are calculated.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Coordinates">Coordinates - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class Coordinates {
  Coordinates() {
  }

  /**
   * The GeolocationCoordinates.accuracy read-only property is a strictly positive double representing the accuracy, with a 95% confidence level, of the GeolocationCoordinates.latitude and GeolocationCoordinates.longitude properties expressed in meters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Coordinates/accuracy">Coordinates.accuracy - MDN</a>
   */
  @JsProperty(
      name = "accuracy"
  )
  public native double accuracy();

  /**
   * The GeolocationCoordinates.altitude read-only property is a double representing the altitude of the position in meters, relative to sea level. This value is null if the implementation cannot provide this data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Coordinates/altitude">Coordinates.altitude - MDN</a>
   */
  @JsProperty(
      name = "altitude"
  )
  @Nullable
  public native Double altitude();

  /**
   * The GeolocationCoordinates.altitudeAccuracy read-only property is a strictly positive double representing the accuracy, with a 95% confidence level, of the altitude expressed in meters. This value is null if the implementation doesn't support measuring altitude.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Coordinates/altitudeAccuracy">Coordinates.altitudeAccuracy - MDN</a>
   */
  @JsProperty(
      name = "altitudeAccuracy"
  )
  @Nullable
  public native Double altitudeAccuracy();

  /**
   * The GeolocationCoordinates.heading read-only property is a double representing the direction in which the device is traveling. This value, specified in degrees, indicates how far off from heading due north the device is.
   * Zero
   * degrees represents true true north, and the direction is determined clockwise (which means that east is 90 degrees and west is 270 degrees). If GeolocationCoordinates.speed is 0, heading is NaN. If the device is not able to provide heading information, this value is null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Coordinates/heading">Coordinates.heading - MDN</a>
   */
  @JsProperty(
      name = "heading"
  )
  @Nullable
  public native Double heading();

  /**
   * The GeolocationCoordinates.latitude read-only property is a double representing the latitude of the position in decimal degrees.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Coordinates/latitude">Coordinates.latitude - MDN</a>
   */
  @JsProperty(
      name = "latitude"
  )
  public native double latitude();

  /**
   * The GeolocationCoordinates interface's read-only longitude property is a double-precision floating point value which represents the longitude of a geographical position, specified in decimal degrees. Together with a DOMTimeStamp indicating a time of measurement, the GeolocationCoordinates object is part of the GeolocationPosition interface, which is the object type returned by Geolocation API functions that obtain and return a geographical position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Coordinates/longitude">Coordinates.longitude - MDN</a>
   */
  @JsProperty(
      name = "longitude"
  )
  public native double longitude();

  /**
   * The GeolocationCoordinates.speed read-only property is a double representing the velocity of the device in meters per second. This value is null if the implementation is not able to measure it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Coordinates/speed">Coordinates.speed - MDN</a>
   */
  @JsProperty(
      name = "speed"
  )
  @Nullable
  public native Double speed();
}
