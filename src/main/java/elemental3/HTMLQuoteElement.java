package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLQuoteElement interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating quoting elements, like blockquote and q, but not the cite element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLQuoteElement">HTMLQuoteElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLQuoteElement"
)
public class HTMLQuoteElement extends HTMLElement {
  @Nonnull
  public String cite;

  protected HTMLQuoteElement() {
  }
}
