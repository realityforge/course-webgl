package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLLIElement interface exposes specific properties and methods (beyond those defined by regular HTMLElement interface it also has available to it by inheritance) for manipulating list elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLIElement">HTMLLIElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmllielement">HTMLLIElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/grouping-content.html#the-li-element">HTMLLIElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-74680021">HTMLLIElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-74680021">HTMLLIElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLLIElement"
)
public class HTMLLIElement extends HTMLElement {
  @Nonnull
  public String type;

  public int value;

  protected HTMLLIElement() {
  }
}
