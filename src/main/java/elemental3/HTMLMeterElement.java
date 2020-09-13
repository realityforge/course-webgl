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

  public HTMLMeterElement() {
  }

  /**
   * The HTMLMeterElement.labels read-only property returns a NodeList of the label elements associated with the meter element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMeterElement/labels">HTMLMeterElement.labels - MDN</a>
   */
  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();
}
