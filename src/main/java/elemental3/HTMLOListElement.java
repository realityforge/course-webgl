package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLOListElement interface provides special properties (beyond those defined on the regular HTMLElement interface it also has available to it by inheritance) for manipulating ordered list elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOListElement">HTMLOListElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlolistelement">HTMLOListElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/grouping-content.html#the-ol-element">HTMLOListElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-58056027">HTMLOListElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-58056027">HTMLOListElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLOListElement"
)
public class HTMLOListElement extends HTMLElement {
  public boolean compact;

  public boolean reversed;

  public int start;

  @Nonnull
  public String type;

  protected HTMLOListElement() {
  }
}
