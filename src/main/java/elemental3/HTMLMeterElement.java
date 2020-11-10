package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTML meter elements expose the HTMLMeterElement interface, which provides special properties and methods (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of meter elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMeterElement">HTMLMeterElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlmeterelement">The definition of 'HTMLMeterElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/forms.html#the-meter-element">The definition of 'HTMLMeterElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-meter-element">The definition of 'HTMLMeterElement' in the 'HTML5' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLMeterElement"
)
public class HTMLMeterElement extends HTMLElement {
  public double high;

  public double low;

  public double max;

  public double min;

  public double optimum;

  public double value;

  protected HTMLMeterElement() {
  }

  /**
   * The HTMLMeterElement.labels read-only property returns a NodeList of the label elements associated with the meter element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMeterElement/labels">HTMLMeterElement.labels - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-lfe-labels">The definition of 'labels' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-lfe-labels">The definition of 'labels' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();
}
