package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLOutputElement interface provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of output elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOutputElement">HTMLOutputElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmloutputelement">The definition of 'HTMLOutputElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/forms.html#the-output-element">The definition of 'HTMLOutputElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-output-element">The definition of 'HTMLOutputElement' in the 'HTML5' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLOutputElement"
)
public class HTMLOutputElement extends HTMLElement {
  @Nonnull
  public String defaultValue;

  @Nonnull
  public String name;

  @Nonnull
  public String value;

  protected HTMLOutputElement() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  @JsProperty(
      name = "htmlFor"
  )
  @Nonnull
  public native DOMTokenList htmlFor();

  /**
   * The HTMLOutputElement.labels read-only property returns a NodeList of the label elements associated with the output element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOutputElement/labels">HTMLOutputElement.labels - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-lfe-labels">The definition of 'labels' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/forms.html#dom-lfe-labels">The definition of 'labels' in the 'HTML5' specification.</a>
   */
  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @JsProperty(
      name = "validationMessage"
  )
  @Nonnull
  public native String validationMessage();

  @JsProperty(
      name = "validity"
  )
  @Nonnull
  public native ValidityState validity();

  @JsProperty(
      name = "willValidate"
  )
  public native boolean willValidate();

  public native boolean checkValidity();

  public native boolean reportValidity();

  public native void setCustomValidity(@Nonnull String error);
}
