package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLQuoteElement interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating quoting elements, like &lt;blockquote&gt; and &lt;q&gt;, but not the &lt;cite&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLQuoteElement">HTMLQuoteElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlquoteelement">HTMLQuoteElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/grouping-content.html#the-blockquote-element">HTMLQuoteElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-70319763">HTMLQuoteElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-70319763">HTMLQuoteElement - Document Object Model (DOM) Level 1 Specification</a>
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
