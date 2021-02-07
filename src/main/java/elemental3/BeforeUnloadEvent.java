package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The beforeunload event is fired when the window, the document and its resources are about to be unloaded.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BeforeUnloadEvent">BeforeUnloadEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/browsing-the-web.html#the-beforeunloadevent-interface">BeforeUnloadEvent - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BeforeUnloadEvent"
)
public class BeforeUnloadEvent extends Event {
  @Nonnull
  public String returnValue;

  protected BeforeUnloadEvent() {
    super( null );
  }
}
