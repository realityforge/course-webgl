package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLTimeElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating &lt;time&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTimeElement">HTMLTimeElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmltimeelement">HTMLTimeElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/text-level-semantics.html#the-time-element">HTMLTimeElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/text-level-semantics.html#the-time-element">HTMLTimeElement - HTML5</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#dom-time-datetime">HTMLTimeElement - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html51/text-level-semantics.html#dom-time-datetime">HTMLTimeElement - HTML 5.1</a>
   * @see <a href="https://www.w3.org/TR/html52/text-level-semantics.html#dom-time-datetime">HTMLTimeElement - HTML5</a>
   */
  @Nonnull
  public String dateTime;

  protected HTMLTimeElement() {
  }
}
