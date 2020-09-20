package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLMetaElement interface contains descriptive metadata about a document. It inherits all of the properties and methods described in the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMetaElement">HTMLMetaElement - MDN</a>
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
