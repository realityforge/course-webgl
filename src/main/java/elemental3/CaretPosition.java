package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CaretPosition interface represents the caret position, an indicator for the text insertion point. You can get a CaretPosition using the document.caretPositionFromPoint method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CaretPosition">CaretPosition - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CaretPosition"
)
public class CaretPosition {
  protected CaretPosition() {
  }

  @JsProperty(
      name = "offset"
  )
  public native int offset();

  @JsProperty(
      name = "offsetNode"
  )
  @Nonnull
  public native Node offsetNode();

  @Nullable
  public native DOMRect getClientRect();
}
