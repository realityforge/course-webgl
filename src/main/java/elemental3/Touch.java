package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Touch interface represents a single contact point on a touch-sensitive device. The contact point is commonly a finger or stylus and the device may be a touchscreen or trackpad.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch">Touch - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Touch"
)
public class Touch {
  /**
   * The Touch() constructor creates a new Touch object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/Touch">Touch.Touch - MDN</a>
   */
  public Touch(@Nonnull final TouchInit touchInitDict) {
  }

  @JsProperty(
      name = "altitudeAngle"
  )
  public native float altitudeAngle();

  @JsProperty(
      name = "azimuthAngle"
  )
  public native float azimuthAngle();

  @JsProperty(
      name = "clientX"
  )
  public native double clientX();

  @JsProperty(
      name = "clientY"
  )
  public native double clientY();

  @JsProperty(
      name = "force"
  )
  public native float force();

  @JsProperty(
      name = "identifier"
  )
  public native int identifier();

  @JsProperty(
      name = "pageX"
  )
  public native double pageX();

  @JsProperty(
      name = "pageY"
  )
  public native double pageY();

  @JsProperty(
      name = "radiusX"
  )
  public native float radiusX();

  @JsProperty(
      name = "radiusY"
  )
  public native float radiusY();

  @JsProperty(
      name = "rotationAngle"
  )
  public native float rotationAngle();

  @JsProperty(
      name = "screenX"
  )
  public native double screenX();

  @JsProperty(
      name = "screenY"
  )
  public native double screenY();

  @JsProperty(
      name = "target"
  )
  @Nonnull
  public native EventTarget target();

  @JsProperty(
      name = "touchType"
  )
  @Nonnull
  public native String touchType();
}
