package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The PositionOptions dictionary describes an object containing option properties to pass as a parameter of Geolocation.getCurrentPosition() and Geolocation.watchPosition().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions">PositionOptions - MDN</a>
 * @see <a href="https://w3c.github.io/geolocation-api/#position_options_interface">The definition of 'PositionOptions' in the 'Geolocation API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface PositionOptions {
  @JsOverlay
  @Nonnull
  static PositionOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The PositionOptions.enableHighAccuracy property is a Boolean that indicates the application would like to receive the best possible results. If true and if the device is able to provide a more accurate position, it will do so. Note that this can result in slower response times or increased power consumption (with a GPS chip on a mobile device for example). On the other hand, if false (the default value), the device can take the liberty to save resources by responding more quickly and/or using less power.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions/enableHighAccuracy">PositionOptions.enableHighAccuracy - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-positionoptions-enablehighaccuracy">The definition of 'PositionOptions.enableHighAccuracy' in the 'Geolocation API' specification.</a>
   */
  @JsProperty(
      name = "enableHighAccuracy"
  )
  boolean enableHighAccuracy();

  /**
   * The PositionOptions.enableHighAccuracy property is a Boolean that indicates the application would like to receive the best possible results. If true and if the device is able to provide a more accurate position, it will do so. Note that this can result in slower response times or increased power consumption (with a GPS chip on a mobile device for example). On the other hand, if false (the default value), the device can take the liberty to save resources by responding more quickly and/or using less power.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions/enableHighAccuracy">PositionOptions.enableHighAccuracy - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-positionoptions-enablehighaccuracy">The definition of 'PositionOptions.enableHighAccuracy' in the 'Geolocation API' specification.</a>
   */
  @JsProperty
  void setEnableHighAccuracy(boolean enableHighAccuracy);

  /**
   * The PositionOptions.enableHighAccuracy property is a Boolean that indicates the application would like to receive the best possible results. If true and if the device is able to provide a more accurate position, it will do so. Note that this can result in slower response times or increased power consumption (with a GPS chip on a mobile device for example). On the other hand, if false (the default value), the device can take the liberty to save resources by responding more quickly and/or using less power.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions/enableHighAccuracy">PositionOptions.enableHighAccuracy - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-positionoptions-enablehighaccuracy">The definition of 'PositionOptions.enableHighAccuracy' in the 'Geolocation API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PositionOptions enableHighAccuracy(final boolean enableHighAccuracy) {
    setEnableHighAccuracy( enableHighAccuracy );
    return this;
  }

  /**
   * The PositionOptions.maximumAge property is a positive long value indicating the maximum age in milliseconds of a possible cached position that is acceptable to return. If set to 0, it means that the device cannot use a cached position and must attempt to retrieve the real current position. If set to Infinity the device must return a cached position regardless of its age.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions/maximumAge">PositionOptions.maximumAge - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-positionoptions-maximumage">The definition of 'PositionOptions.maximumAge' in the 'Geolocation API' specification.</a>
   */
  @JsProperty(
      name = "maximumAge"
  )
  int maximumAge();

  /**
   * The PositionOptions.maximumAge property is a positive long value indicating the maximum age in milliseconds of a possible cached position that is acceptable to return. If set to 0, it means that the device cannot use a cached position and must attempt to retrieve the real current position. If set to Infinity the device must return a cached position regardless of its age.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions/maximumAge">PositionOptions.maximumAge - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-positionoptions-maximumage">The definition of 'PositionOptions.maximumAge' in the 'Geolocation API' specification.</a>
   */
  @JsProperty
  void setMaximumAge(int maximumAge);

  /**
   * The PositionOptions.maximumAge property is a positive long value indicating the maximum age in milliseconds of a possible cached position that is acceptable to return. If set to 0, it means that the device cannot use a cached position and must attempt to retrieve the real current position. If set to Infinity the device must return a cached position regardless of its age.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions/maximumAge">PositionOptions.maximumAge - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-positionoptions-maximumage">The definition of 'PositionOptions.maximumAge' in the 'Geolocation API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PositionOptions maximumAge(final int maximumAge) {
    setMaximumAge( maximumAge );
    return this;
  }

  /**
   * The PositionOptions.timeout property is a positive long value representing the maximum length of time (in milliseconds) the device is allowed to take in order to return a position. The default value is Infinity, meaning that getCurrentPosition() won't return until the position is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions/timeout">PositionOptions.timeout - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-positionoptions-timeout">The definition of 'PositionOptions.timeout' in the 'Geolocation API' specification.</a>
   */
  @JsProperty(
      name = "timeout"
  )
  int timeout();

  /**
   * The PositionOptions.timeout property is a positive long value representing the maximum length of time (in milliseconds) the device is allowed to take in order to return a position. The default value is Infinity, meaning that getCurrentPosition() won't return until the position is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions/timeout">PositionOptions.timeout - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-positionoptions-timeout">The definition of 'PositionOptions.timeout' in the 'Geolocation API' specification.</a>
   */
  @JsProperty
  void setTimeout(int timeout);

  /**
   * The PositionOptions.timeout property is a positive long value representing the maximum length of time (in milliseconds) the device is allowed to take in order to return a position. The default value is Infinity, meaning that getCurrentPosition() won't return until the position is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions/timeout">PositionOptions.timeout - MDN</a>
   * @see <a href="https://w3c.github.io/geolocation-api/#dom-positionoptions-timeout">The definition of 'PositionOptions.timeout' in the 'Geolocation API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default PositionOptions timeout(final int timeout) {
    setTimeout( timeout );
    return this;
  }
}
