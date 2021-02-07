package elemental3;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The CustomEvent interface represents events initialized by an application for any purpose.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent">CustomEvent - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-customevent">CustomEvent - DOM</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CustomEvent"
)
public class CustomEvent extends Event {
  /**
   * The CustomEvent() constructor creates a new CustomEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent/CustomEvent">CustomEvent.CustomEvent - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-customevent-customevent">CustomEvent() - DOM</a>
   */
  public CustomEvent(@Nonnull final String type, @Nonnull final CustomEventInit eventInitDict) {
    super( null );
  }

  /**
   * The CustomEvent() constructor creates a new CustomEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent/CustomEvent">CustomEvent.CustomEvent - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-customevent-customevent">CustomEvent() - DOM</a>
   */
  public CustomEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The detail readonly property of the CustomEvent interface returns any data passed when initializing the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent/detail">CustomEvent.detail - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-customevent-detail">detail - DOM</a>
   */
  @JsProperty(
      name = "detail"
  )
  @Nullable
  public native Any detail();

  /**
   * The CustomEvent.initCustomEvent() method initializes a CustomEvent object. If the event has already been dispatched, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent/initCustomEvent">CustomEvent.initCustomEvent - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-customevent-initcustomevent">CustomEvent - DOM</a>
   */
  public native void initCustomEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @DoNotAutobox @Nullable Object detail);

  /**
   * The CustomEvent.initCustomEvent() method initializes a CustomEvent object. If the event has already been dispatched, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent/initCustomEvent">CustomEvent.initCustomEvent - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-customevent-initcustomevent">CustomEvent - DOM</a>
   */
  public native void initCustomEvent(@Nonnull String type, boolean bubbles, boolean cancelable);

  /**
   * The CustomEvent.initCustomEvent() method initializes a CustomEvent object. If the event has already been dispatched, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent/initCustomEvent">CustomEvent.initCustomEvent - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-customevent-initcustomevent">CustomEvent - DOM</a>
   */
  public native void initCustomEvent(@Nonnull String type, boolean bubbles);

  /**
   * The CustomEvent.initCustomEvent() method initializes a CustomEvent object. If the event has already been dispatched, this method does nothing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomEvent/initCustomEvent">CustomEvent.initCustomEvent - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-customevent-initcustomevent">CustomEvent - DOM</a>
   */
  public native void initCustomEvent(@Nonnull String type);
}
