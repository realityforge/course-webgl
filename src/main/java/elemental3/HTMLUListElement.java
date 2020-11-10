package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLUListElement interface provides special properties (beyond those defined on the regular HTMLElement interface it also has available to it by inheritance) for manipulating unordered list elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLUListElement">HTMLUListElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlulistelement">The definition of 'HTMLUListElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/grouping-content.html#the-ul-element">The definition of 'HTMLUListElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-86834457">The definition of 'HTMLUListElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-86834457">The definition of 'HTMLUListElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLUListElement"
)
public class HTMLUListElement extends HTMLElement {
  public boolean compact;

  @Nonnull
  public String type;

  protected HTMLUListElement() {
  }
}
