package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLBRElement interface represents a HTML line break element (br). It inherits from HTMLElement.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBRElement">HTMLBRElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlbrelement">The definition of 'HTMLBRElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/textlevel-semantics.html#the-br-element">The definition of 'HTMLBRElement' in the 'HTML5' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLBRElement"
)
public class HTMLBRElement extends HTMLElement {
  @Nonnull
  public String clear;

  protected HTMLBRElement() {
  }
}
