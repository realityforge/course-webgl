package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PageTransitionEvent event object is available inside handler functions for the pageshow and pagehide events, fired when a document is being loaded or unloaded.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PageTransitionEvent">PageTransitionEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#the-pagetransitionevent-interface">PageTransitionEvent - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PageTransitionEvent"
)
public class PageTransitionEvent extends Event {
  public PageTransitionEvent(@Nonnull final String type,
      @Nonnull final PageTransitionEventInit eventInitDict) {
    super( null );
  }

  public PageTransitionEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The persisted read-only property indicates if a webpage is loading from a cache.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PageTransitionEvent/persisted">PageTransitionEvent.persisted - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-pagetransitionevent-persisted">PageTransitionEvent: persisted - HTML Living Standard</a>
   */
  @JsProperty(
      name = "persisted"
  )
  public native boolean persisted();
}
