package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLProgressElement interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of progress elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLProgressElement">HTMLProgressElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLProgressElement"
)
public class HTMLProgressElement extends HTMLElement {
  public double max;

  public double value;

  public HTMLProgressElement() {
  }

  /**
   * The HTMLProgressElement.labels read-only property returns a NodeList of the label elements associated with the progress element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLProgressElement/labels">HTMLProgressElement.labels - MDN</a>
   */
  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();

  @JsProperty(
      name = "position"
  )
  public native double position();
}
