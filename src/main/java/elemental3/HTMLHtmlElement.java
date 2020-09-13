package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLHtmlElement interface serves as the root node for a given HTML document. This object inherits the properties and methods described in the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHtmlElement">HTMLHtmlElement - MDN</a>
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

  public HTMLHtmlElement() {
  }
}
