package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLLIElement interface exposes specific properties and methods (beyond those defined by regular HTMLElement interface it also has available to it by inheritance) for manipulating list elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLLIElement">HTMLLIElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLLIElement"
)
public class HTMLLIElement extends HTMLElement {
  @Nonnull
  public String type;

  public int value;

  protected HTMLLIElement() {
  }
}
