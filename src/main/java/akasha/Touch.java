package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Touch interface represents a single contact point on a touch-sensitive device. The contact point is commonly a finger or stylus and the device may be a touchscreen or trackpad.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch">Touch - MDN</a>
 * @see <a href="https://w3c.github.io/touch-events/#touch-interface">Touch - Touch Events &ndash; Level 2</a>
 * @see <a href="https://www.w3.org/TR/touch-events/#touch-interface">Touch - Touch Events</a>
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

  /**
   * The Touch.clientX read-only property returns the X coordinate of the touch point relative to the viewport, not including any scroll offset.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/clientX">Touch.clientX - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-clientx">Touch Events – Level 2</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-Touch-clientX">Touch Events</a>
   */
  @JsProperty(
      name = "clientX"
  )
  public native double clientX();

  /**
   * The Touch.clientY read-only property returns the Y coordinate of the touch point relative to the browser's viewport, not including any scroll offset.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/clientY">Touch.clientY - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-clienty">Touch Events – Level 2</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-Touch-clientY">Touch Events</a>
   */
  @JsProperty(
      name = "clientY"
  )
  public native double clientY();

  /**
   * The Touch.force read-only property returns the amount of pressure the user is applying to the touch surface for a Touch point.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/force">Touch.force - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-force">Touch Events – Level 2</a>
   */
  @JsProperty(
      name = "force"
  )
  public native float force();

  /**
   * The Touch.identifier returns a value uniquely identifying this point of contact with the touch surface. This value remains consistent for every event involving this finger's (or stylus's) movement on the surface until it is lifted off the surface.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/identifier">Touch.identifier - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-identifier">Touch Events – Level 2</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-Touch-identifier">Touch Events</a>
   */
  @JsProperty(
      name = "identifier"
  )
  public native int identifier();

  /**
   * The Touch.pageX read-only property returns the X coordinate of the touch point relative to the viewport, including any scroll offset.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/pageX">Touch.pageX - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-pagex">Touch Events – Level 2</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-Touch-pageX">Touch Events</a>
   */
  @JsProperty(
      name = "pageX"
  )
  public native double pageX();

  /**
   * The Touch.pageY read-only property returns the Y coordinate of the touch point relative to the viewport, including any scroll offset.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/pageY">Touch.pageY - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-pagey">Touch Events – Level 2</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-Touch-pageY">Touch Events</a>
   */
  @JsProperty(
      name = "pageY"
  )
  public native double pageY();

  /**
   * Returns the X radius of the ellipse that most closely circumscribes the area of contact with the touch surface. The value is in CSS pixels of the same scale as Touch.screenX.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/radiusX">Touch.radiusX - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-radiusx">Touch Events – Level 2</a>
   */
  @JsProperty(
      name = "radiusX"
  )
  public native float radiusX();

  /**
   * Returns the Y radius of the ellipse that most closely circumscribes the area of contact with the touch surface. The value is in CSS pixels of the same scale as Touch.screenX.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/radiusY">Touch.radiusY - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-radiusy">Touch Events – Level 2</a>
   */
  @JsProperty(
      name = "radiusY"
  )
  public native float radiusY();

  /**
   * Returns the rotation angle, in degrees, of the contact area ellipse defined by Touch.radiusX and Touch.radiusY. The value may be between 0 and 90. Together, these three values describe an ellipse that approximates the size and shape of the area of contact between the user and the screen. This may be a relatively large ellipse representing the contact between a fingertip and the screen or a small area representing the tip of a stylus, for example.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/rotationAngle">Touch.rotationAngle - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-rotationangle">Touch Events – Level 2</a>
   */
  @JsProperty(
      name = "rotationAngle"
  )
  public native float rotationAngle();

  /**
   * Returns the X coordinate of the touch point relative to the screen, not including any scroll offset.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/screenX">Touch.screenX - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-screenx">Touch Events – Level 2</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-Touch-screenX">Touch Events</a>
   */
  @JsProperty(
      name = "screenX"
  )
  public native double screenX();

  /**
   * Returns the Y coordinate of the touch point relative to the screen, not including any scroll offset.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/screenY">Touch.screenY - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-screeny">Touch Events – Level 2</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-Touch-screenY">Touch Events</a>
   */
  @JsProperty(
      name = "screenY"
  )
  public native double screenY();

  /**
   * Returns the Element (EventTarget) on which the touch contact started when it was first placed on the surface, even if the touch point has since moved outside the interactive area of that element or even been removed from the document. Note that if the target element is removed from the document, events will still be targeted at it, and hence won't necessarily bubble up to the window or document anymore. If there is any risk of an element being removed while it is being touched, the best practice is to attach the touch listeners directly to the target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Touch/target">Touch.target - MDN</a>
   * @see <a href="https://w3c.github.io/touch-events/#dom-touch-target">Touch Events – Level 2</a>
   * @see <a href="https://www.w3.org/TR/touch-events/#widl-Touch-target">Touch Events</a>
   */
  @JsProperty(
      name = "target"
  )
  @Nonnull
  public native EventTarget target();

  @JsProperty(
      name = "touchType"
  )
  @Nonnull
  @TouchType
  public native String touchType();
}
