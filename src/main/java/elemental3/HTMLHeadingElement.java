package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLHeadingElement interface represents the different heading elements, &lt;h1&gt; through &lt;h6&gt;. It inherits methods and properties from the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadingElement">HTMLHeadingElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlheadingelement">HTMLHeadingElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">HTMLHeadingElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-43345119">HTMLHeadingElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-43345119">HTMLHeadingElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLHeadingElement"
)
public class HTMLHeadingElement extends HTMLElement {
  @Nonnull
  public String align;

  protected HTMLHeadingElement() {
  }
}
