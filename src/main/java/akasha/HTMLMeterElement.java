package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTML &lt;meter&gt; elements expose the HTMLMeterElement interface, which provides special properties and methods (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of &lt;meter&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMeterElement">HTMLMeterElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlmeterelement">HTMLMeterElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/forms.html#the-meter-element">HTMLMeterElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-meter-element">HTMLMeterElement - HTML5</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-lfe-labels">labels - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-lfe-labels">labels - HTML5</a>
   */
  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();
}
