package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLQuoteElement interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating quoting elements, like blockquote and q, but not the cite element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLQuoteElement">HTMLQuoteElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlquoteelement">The definition of 'HTMLQuoteElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/grouping-content.html#the-blockquote-element">The definition of 'HTMLQuoteElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-70319763">The definition of 'HTMLQuoteElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-70319763">The definition of 'HTMLQuoteElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
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
