package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The UIEvent interface represents simple user interface events.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/UIEvent">UIEvent - MDN</a>
 * @see <a href="https://wicg.github.io/InputDeviceCapabilities/">InputDeviceCapabilities</a>
 * @see <a href="https://w3c.github.io/uievents/">UI Events</a>
 * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-UIEvent">UIEvent - Document Object Model (DOM) Level 3 Events Specification</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-UIEvent">UIEvent - Document Object Model (DOM) Level 2 Events Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "UIEvent"
)
public class UIEvent extends Event {
  /**
   * The UIEvent() constructor creates a new UIEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/UIEvent/UIEvent">UIEvent.UIEvent - MDN</a>
   * @see <a href="https://wicg.github.io/InputDeviceCapabilities/">InputDeviceCapabilities</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-UIEvent">UIEvent() - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  public UIEvent(@Nonnull final String type, @Nonnull final UIEventInit eventInitDict) {
    super( null );
  }

  /**
   * The UIEvent() constructor creates a new UIEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/UIEvent/UIEvent">UIEvent.UIEvent - MDN</a>
   * @see <a href="https://wicg.github.io/InputDeviceCapabilities/">InputDeviceCapabilities</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-UIEvent">UIEvent() - Document Object Model (DOM) Level 3 Events Specification</a>
   */
  public UIEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The UIEvent.detail read-only property, when non-zero, provides the current (or next, depending on the event) click count.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/UIEvent/detail">UIEvent.detail - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#widl-UIEvent-detail">UIEvent.detail - Document Object Model (DOM) Level 3 Events Specification</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-UIEvent-detail">UIEvent.detail - Document Object Model (DOM) Level 2 Events Specification</a>
   */
  @JsProperty(
      name = "detail"
  )
  public native int detail();

  /**
   * The UIEvent.view read-only property returns the WindowProxy object from which the event was generated. In browsers, this is the Window object the event happened in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/UIEvent/view">UIEvent.view - MDN</a>
   * @see <a href="https://www.w3.org/TR/2014/WD-DOM-Level-3-Events-20140925/#interface-UIEvent">UIEvent - Document Object Model (DOM) Level 3 Events Specification</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-UIEvent">UIEvent - Document Object Model (DOM) Level 2 Events Specification</a>
   */
  @JsProperty(
      name = "view"
  )
  @Nullable
  public native Window view();

  @JsProperty(
      name = "which"
  )
  public native int which();
}
