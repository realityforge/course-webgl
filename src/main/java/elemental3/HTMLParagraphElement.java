package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLParagraphElement interface provides special properties (beyond those of the regular HTMLElement object interface it inherits) for manipulating p elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLParagraphElement">HTMLParagraphElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLParagraphElement"
)
public class HTMLParagraphElement extends HTMLElement {
  @Nonnull
  public String align;

  public HTMLParagraphElement() {
  }
}
