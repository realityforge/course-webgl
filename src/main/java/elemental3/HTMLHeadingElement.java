package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLHeadingElement interface represents the different heading elements, h1 through h6. It inherits methods and properties from the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadingElement">HTMLHeadingElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlheadingelement">The definition of 'HTMLHeadingElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">The definition of 'HTMLHeadingElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-43345119">The definition of 'HTMLHeadingElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-43345119">The definition of 'HTMLHeadingElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
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
