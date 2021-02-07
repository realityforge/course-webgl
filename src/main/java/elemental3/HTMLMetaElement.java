package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLMetaElement interface contains descriptive metadata about a document. It inherits all of the properties and methods described in the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMetaElement">HTMLMetaElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlmetaelement">HTMLMetaElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/document-metadata.html#the-meta-element">HTMLMetaElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-37041454">HTMLMetaElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-37041454">HTMLMetaElement - Document Object Model (DOM) Level 1 Specification</a>
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
