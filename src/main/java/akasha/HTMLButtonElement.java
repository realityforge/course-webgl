package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLButtonElement interface provides properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating &lt;button&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLButtonElement">HTMLButtonElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlbuttonelement">HTMLButtonElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/sec-forms.html#htmlbuttonelement">HTMLButtonElement - HTML 5.2</a>
 * @see <a href="https://www.w3.org/TR/html51/sec-forms.html#htmlbuttonelement-htmlbuttonelement">HTMLButtonElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-button-element">HTMLButtonElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-34812697">HTMLButtonElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-34812697">HTMLButtonElement - Document Object Model (DOM) Level 1 Specification</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/forms.html#dom-lfe-labels">labels - HTML Living Standard</a>
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
