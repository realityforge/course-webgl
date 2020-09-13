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
  public UIEvent(@Nonnull final String type, @Nonnull final UIEventInit eventInitDict) {
    super( null );
  }

  public UIEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "detail"
  )
  public native int detail();

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
