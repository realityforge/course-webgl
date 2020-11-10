package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLButtonElement interface provides properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating button elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLButtonElement">HTMLButtonElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlbuttonelement">The definition of 'HTMLButtonElement' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/sec-forms.html#htmlbuttonelement">The definition of 'HTMLButtonElement' in the 'HTML 5.2' specification.</a>
 * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#htmlbuttonelement-htmlbuttonelement">The definition of 'HTMLButtonElement' in the 'HTML 5.1' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-button-element">The definition of 'HTMLButtonElement' in the 'HTML5' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-34812697">The definition of 'HTMLButtonElement' in the 'Document Object Model (DOM) Level 2 HTML Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-34812697">The definition of 'HTMLButtonElement' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLButtonElement"
)
public class HTMLButtonElement extends HTMLElement {
  /**
   * Is a Boolean indicating whether or not the control is disabled, meaning that it does not accept any clicks.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLButtonElement/disabled">HTMLButtonElement.disabled - MDN</a>
   */
  public boolean disabled;

  @Nonnull
  public String formAction;

  @Nonnull
  @FormEncodingType
  public String formEnctype;

  @Nonnull
  @FormMethodType
  public String formMethod;

  public boolean formNoValidate;

  @Nonnull
  public String formTarget;

  @Nonnull
  public String name;

  @Nonnull
  @ButtonType
  public String type;

  @Nonnull
  public String value;

  protected HTMLButtonElement() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  /**
   * The HTMLButtonElement.labels read-only property returns a NodeList of the label elements associated with the button element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLButtonElement/labels">HTMLButtonElement.labels - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-lfe-labels">The definition of 'labels' in the 'HTML Living Standard' specification.</a>
   */
  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();

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
