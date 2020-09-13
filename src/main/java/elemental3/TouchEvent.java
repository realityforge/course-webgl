package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TouchEvent interface represents an UIEvent which is sent when the state of contacts with a touch-sensitive surface changes. This surface can be a touch screen or trackpad, for example. The event can describe one or more points of contact with the screen and includes support for detecting movement, addition and removal of contact points, and so forth.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent">TouchEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TouchEvent"
)
public class TouchEvent extends UIEvent {
  /**
   * The TouchEvent() constructor creates a new TouchEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/TouchEvent">TouchEvent.TouchEvent - MDN</a>
   */
  public TouchEvent(@Nonnull final String type, @Nonnull final TouchEventInit eventInitDict) {
    super( null );
  }

  /**
   * The TouchEvent() constructor creates a new TouchEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/TouchEvent">TouchEvent.TouchEvent - MDN</a>
   */
  public TouchEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * A Boolean value indicating whether or not the alt (Alternate) key is enabled when the touch event is created. If the alt key is enabled, the attribute's value is true. Otherwise, it is false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/altKey">TouchEvent.altKey - MDN</a>
   */
  @JsProperty(
      name = "altKey"
  )
  public native boolean altKey();

  /**
   * The changedTouches read-only property is a TouchList whose touch points (Touch objects) varies depending on the event type, as follows:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/changedTouches">TouchEvent.changedTouches - MDN</a>
   */
  @JsProperty(
      name = "changedTouches"
  )
  @Nonnull
  public native TouchList changedTouches();

  /**
   * A Boolean value indicating whether the control (Control) key is enabled when the touch event is created. If this key is enabled, the attribute's value is true. Otherwise, it is false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/ctrlKey">TouchEvent.ctrlKey - MDN</a>
   */
  @JsProperty(
      name = "ctrlKey"
  )
  public native boolean ctrlKey();

  /**
   * A Boolean value indicating whether or not the Meta key is enabled when the touch event is created. If this key is enabled, the attribute's value is true. Otherwise, it is false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/metaKey">TouchEvent.metaKey - MDN</a>
   */
  @JsProperty(
      name = "metaKey"
  )
  public native boolean metaKey();

  /**
   * A Boolean value indicating whether or not the shift key is enabled when the touch event is created. If this key is enabled, the attribute's value is true. Otherwise, it is false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/shiftKey">TouchEvent.shiftKey - MDN</a>
   */
  @JsProperty(
      name = "shiftKey"
  )
  public native boolean shiftKey();

  /**
   * The targetTouches read-only property is a TouchList listing all the Touch objects for touch points that are still in contact with the touch surface and whose touchstart event occurred inside the same target element as the current target element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/targetTouches">TouchEvent.targetTouches - MDN</a>
   */
  @JsProperty(
      name = "targetTouches"
  )
  @Nonnull
  public native TouchList targetTouches();

  /**
   * touches is a read-only TouchList listing all the Touch objects for touch points that are currently in contact with the touch surface, regardless of whether or not they've changed or what their target element was at touchstart time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent/touches">TouchEvent.touches - MDN</a>
   */
  @JsProperty(
      name = "touches"
  )
  @Nonnull
  public native TouchList touches();
}
