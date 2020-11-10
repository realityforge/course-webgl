package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLHtmlElement interface serves as the root node for a given HTML document. This object inherits the properties and methods described in the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHtmlElement">HTMLHtmlElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlhtmlelement">The definition of 'HTMLHtmlElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/semantics.html#the-html-element">The definition of 'HTMLHtmlElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/semantics.html#the-html-element">The definition of 'HTMLHtmlElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-33759296">The definition of 'HTMLHtmlElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-33759296">The definition of 'HTMLHtmlElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
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
