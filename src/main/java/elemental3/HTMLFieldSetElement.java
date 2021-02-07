package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLFieldSetElement interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of &lt;fieldset&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFieldSetElement">HTMLFieldSetElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlfieldsetelement">HTMLFieldSetElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html51/forms.html#the-fieldset-element">HTMLFieldSetElement - HTML 5.1</a>
 * @see <a href="https://www.w3.org/TR/html52/forms.html#the-fieldset-element">HTMLFieldSetElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-7365882">HTMLFieldSetElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-7365882">HTMLFieldSetElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLFieldSetElement"
)
public class HTMLFieldSetElement extends HTMLElement {
  public boolean disabled;

  @Nonnull
  public String name;

  protected HTMLFieldSetElement() {
  }

  @JsProperty(
      name = "elements"
  )
  @Nonnull
  public native HTMLCollection elements();

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

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
