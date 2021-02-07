package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLHtmlElement interface serves as the root node for a given HTML document. This object inherits the properties and methods described in the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHtmlElement">HTMLHtmlElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlhtmlelement">HTMLHtmlElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/semantics.html#the-html-element">HTMLHtmlElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/semantics.html#the-html-element">HTMLHtmlElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-33759296">HTMLHtmlElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-33759296">HTMLHtmlElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLHtmlElement"
)
public class HTMLHtmlElement extends HTMLElement {
  /**
   * Returns version information about the document type definition (DTD) of a document. While this property is recognized by Mozilla, the return value for this property is always an empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHtmlElement/version">HTMLHtmlElement.version - MDN</a>
   */
  @Nonnull
  public String version;

  protected HTMLHtmlElement() {
  }
}
