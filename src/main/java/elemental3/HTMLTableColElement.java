package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableColElement interface provides special properties (beyond the HTMLElement interface it also has available to it inheritance) for manipulating single or grouped table column elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableColElement">HTMLTableColElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableColElement"
)
public class HTMLTableColElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String ch;

  @Nonnull
  public String chOff;

  public int span;

  @Nonnull
  public String vAlign;

  @Nonnull
  public String width;

  protected HTMLTableColElement() {
  }
}
