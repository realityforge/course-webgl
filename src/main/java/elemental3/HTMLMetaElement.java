package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLMetaElement interface contains descriptive metadata about a document. It inherits all of the properties and methods described in the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMetaElement">HTMLMetaElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlmetaelement">The definition of 'HTMLMetaElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/document-metadata.html#the-meta-element">The definition of 'HTMLMetaElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-37041454">The definition of 'HTMLMetaElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-37041454">The definition of 'HTMLMetaElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLMetaElement"
)
public class HTMLMetaElement extends HTMLElement {
  @Nonnull
  public String content;

  @Nonnull
  public String httpEquiv;

  @Nonnull
  public String name;

  @Nonnull
  public String scheme;

  protected HTMLMetaElement() {
  }
}
