package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLBaseElement interface contains the base URI for a document. This object inherits all of the properties and methods as described in the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBaseElement">HTMLBaseElement - MDN</a>
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

  public HTMLBaseElement() {
  }
}
