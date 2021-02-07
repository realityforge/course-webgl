package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLTitleElement interface contains the title for a document. This element inherits all of the properties and methods of the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTitleElement">HTMLTitleElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmltitleelement">HTMLTitleElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/document-metadata.html#the-title-element">HTMLTitleElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/document-metadata.html#the-title-element">HTMLTitleElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-79243169">HTMLTitleElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-79243169">HTMLTitleElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTitleElement"
)
public class HTMLTitleElement extends HTMLElement {
  @Nonnull
  public String text;

  protected HTMLTitleElement() {
  }
}
