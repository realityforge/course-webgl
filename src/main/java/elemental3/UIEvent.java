package elemental3;

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
   */
  public UIEvent(@Nonnull final String type, @Nonnull final UIEventInit eventInitDict) {
    super( null );
  }

  /**
   * The UIEvent() constructor creates a new UIEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/UIEvent/UIEvent">UIEvent.UIEvent - MDN</a>
   */
  public UIEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The UIEvent.detail read-only property, when non-zero, provides the current (or next, depending on the event) click count.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/UIEvent/detail">UIEvent.detail - MDN</a>
   */
  @JsProperty(
      name = "detail"
  )
  public native int detail();

  /**
   * The UIEvent.view read-only property returns the WindowProxy object from which the event was generated. In browsers, this is the Window object the event happened in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/UIEvent/view">UIEvent.view - MDN</a>
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
