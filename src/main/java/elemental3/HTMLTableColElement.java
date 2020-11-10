package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableColElement interface provides special properties (beyond the HTMLElement interface it also has available to it inheritance) for manipulating single or grouped table column elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableColElement">HTMLTableColElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/tabular-data.html#htmltablecolelement">The definition of 'HTMLTableColElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/tabular-data.html#htmltablecolelement">The definition of 'HTMLTableColElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-84150186">The definition of 'HTMLTableColElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-84150186">The definition of 'HTMLTableColElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableColElement"
)
public class HTMLTableColElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String ch;

  @Nonnull
  public String chOff;

  public int span;

  @Nonnull
  public String vAlign;

  @Nonnull
  public String width;

  protected HTMLTableColElement() {
  }
}
