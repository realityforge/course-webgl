package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The HTMLButtonElement interface provides properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating button elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLButtonElement">HTMLButtonElement - MDN</a>
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

  public boolean formNoValidate;

  @Nonnull
  public String formTarget;

  @Nonnull
  public String name;

  @Nonnull
  public String value;

  @Nonnull
  @MagicConstant(
      valuesFromClass = ButtonType.class
  )
  public String type;

  @Nonnull
  @MagicConstant(
      valuesFromClass = FormMethodType.class
  )
  public String formMethod;

  @Nonnull
  @MagicConstant(
      valuesFromClass = FormEncodingType.class
  )
  public String formEnctype;

  public HTMLButtonElement() {
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
