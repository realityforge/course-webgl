package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLBaseElement interface contains the base URI for a document. This object inherits all of the properties and methods as described in the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBaseElement">HTMLBaseElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlbaseelement">HTMLBaseElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/document-metadata.html#the-base-element">HTMLBaseElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/document-metadata.html#the-base-element">HTMLBaseElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-73629039">HTMLBaseElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-73629039">HTMLBaseElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLBaseElement"
)
public class HTMLBaseElement extends HTMLElement {
  @Nonnull
  public String href;

  @Nonnull
  public String target;

  protected HTMLBaseElement() {
  }
}
