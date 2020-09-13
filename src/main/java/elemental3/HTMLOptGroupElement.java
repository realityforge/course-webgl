package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLOptGroupElement interface provides special properties and methods (beyond the regular HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of optgroup elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOptGroupElement">HTMLOptGroupElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLOptGroupElement"
)
public class HTMLOptGroupElement extends HTMLElement {
  public boolean disabled;

  @Nonnull
  public String label;

  public HTMLOptGroupElement() {
  }
}
