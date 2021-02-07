package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * PopStateEvent is an event handler for the popstate event on the window.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PopStateEvent">PopStateEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/browsing-the-web.html#popstateevent">PopStateEvent - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PopStateEvent"
)
public class PopStateEvent extends Event {
  public PopStateEvent(@Nonnull final String type, @Nonnull final PopStateEventInit eventInitDict) {
    super( null );
  }

  public PopStateEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "state"
  )
  @Nullable
  public native Any state();
}
