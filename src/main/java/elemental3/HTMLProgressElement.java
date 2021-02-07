package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLProgressElement interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of &lt;progress&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLProgressElement">HTMLProgressElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlprogresselement">HTMLProgressElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/forms.html#the-progress-element">HTMLProgressElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-progress-element">HTMLProgressElement - HTML5</a>
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

  protected HTMLProgressElement() {
  }

  /**
   * The HTMLProgressElement.labels read-only property returns a NodeList of the label elements associated with the progress element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLProgressElement/labels">HTMLProgressElement.labels - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-lfe-labels">labels - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-lfe-labels">labels - HTML5</a>
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
