package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLDivElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating div elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDivElement">HTMLDivElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLDivElement"
)
public class HTMLDivElement extends HTMLElement {
  @Nonnull
  public String align;

  public HTMLDivElement() {
  }
}
