package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableCaptionElement interface special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating table caption elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableCaptionElement">HTMLTableCaptionElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/tabular-data.html#htmltablecaptionelement">The definition of 'HTMLTableCaptionElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/tabular-data.html#the-caption-element">The definition of 'HTMLTableCaptionElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-12035137">The definition of 'HTMLTableCaptionElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-12035137">The definition of 'HTMLTableCaptionElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableCaptionElement"
)
public class HTMLTableCaptionElement extends HTMLElement {
  @Nonnull
  public String align;

  protected HTMLTableCaptionElement() {
  }
}
