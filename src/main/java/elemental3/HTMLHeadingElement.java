package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLHeadingElement interface represents the different heading elements, h1 through h6. It inherits methods and properties from the HTMLElement interface.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHeadingElement">HTMLHeadingElement - MDN</a>
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
