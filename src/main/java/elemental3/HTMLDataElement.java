package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLDataElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating data elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDataElement">HTMLDataElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmldataelement">The definition of 'HTMLDataElement' in HTML Living Standard.</a>
 * @see <a href="https://www.w3.org/TR/html52/text-level-semantics.html#the-data-element">The definition of 'HTMLDataElement' in HTML5.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLDataElement"
)
public class HTMLDataElement extends HTMLElement {
  /**
   * The value property of the HTMLDataElement interface returns a DOMString reflecting the value HTML attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDataElement/value">HTMLDataElement.value - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-data-value">The definition of 'HTMLDataElement.value' in HTML Living Standard.</a>
   * @see <a href="https://www.w3.org/TR/html52/text-level-semantics.html#dom-data-value">The definition of 'value' in HTML5.</a>
   */
  @Nonnull
  public String value;

  protected HTMLDataElement() {
  }
}
