package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLTimeElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating time elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTimeElement">HTMLTimeElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTimeElement"
)
public class HTMLTimeElement extends HTMLElement {
  /**
   * The HTMLTimeElement.dateTime property is a DOMString that reflects the datetime HTML attribute, containing a machine-readable form of the element's date and time value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTimeElement/dateTime">HTMLTimeElement.dateTime - MDN</a>
   */
  @Nonnull
  public String dateTime;

  protected HTMLTimeElement() {
  }
}
