package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLTimeElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating time elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTimeElement">HTMLTimeElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmltimeelement">The definition of 'HTMLTimeElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/text-level-semantics.html#the-time-element">The definition of 'HTMLTimeElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/text-level-semantics.html#the-time-element">The definition of 'HTMLTimeElement' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#dom-time-datetime">The definition of 'HTMLTimeElement' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html51/text-level-semantics.html#dom-time-datetime">The definition of 'HTMLTimeElement' in the 'HTML 5.1' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/text-level-semantics.html#dom-time-datetime">The definition of 'HTMLTimeElement' in the 'HTML5' specification.</a>
   */
  @Nonnull
  public String dateTime;

  protected HTMLTimeElement() {
  }
}
