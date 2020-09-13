package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLOListElement interface provides special properties (beyond those defined on the regular HTMLElement interface it also has available to it by inheritance) for manipulating ordered list elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOListElement">HTMLOListElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLOListElement"
)
public class HTMLOListElement extends HTMLElement {
  public boolean reversed;

  public int start;

  @Nonnull
  public String type;

  public boolean compact;

  public HTMLOListElement() {
  }
}
