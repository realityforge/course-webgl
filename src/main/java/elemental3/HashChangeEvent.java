package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HashChangeEvent interface represents events that fire when the fragment identifier of the URL has changed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HashChangeEvent">HashChangeEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#the-hashchangeevent-interface">HashChangeEvent - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HashChangeEvent"
)
public class HashChangeEvent extends Event {
  public HashChangeEvent(@Nonnull final String type,
      @Nonnull final HashChangeEventInit eventInitDict) {
    super( null );
  }

  public HashChangeEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The newURL read-only property of the HashChangeEvent interface returns the new URL to which the window is navigating.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HashChangeEvent/newURL">HashChangeEvent.newURL - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hashchangeevent-newurl">HashChangeEvent: newURL - HTML Living Standard</a>
   */
  @JsProperty(
      name = "newURL"
  )
  @Nonnull
  public native String newURL();

  /**
   * The oldURL read-only property of the HashChangeEvent interface returns the previous URL from which the window was navigated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HashChangeEvent/oldURL">HashChangeEvent.oldURL - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hashchangeevent-oldurl">HashChangeEvent: oldURL - HTML Living Standard</a>
   */
  @JsProperty(
      name = "oldURL"
  )
  @Nonnull
  public native String oldURL();
}
