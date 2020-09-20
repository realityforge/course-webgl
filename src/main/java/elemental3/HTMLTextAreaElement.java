package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLTextAreaElement interface provides special properties and methods for manipulating the layout and presentation of textarea elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTextAreaElement">HTMLTextAreaElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTextAreaElement"
)
public class HTMLTextAreaElement extends HTMLElement {
  @Nonnull
  @AutocompleteType
  public String autocomplete;

  public int cols;

  @Nonnull
  public String defaultValue;

  @Nonnull
  public String dirName;

  public boolean disabled;

  public int maxLength;

  public int minLength;

  @Nonnull
  public String name;

  @Nonnull
  public String placeholder;

  public boolean readOnly;

  public boolean required;

  public int rows;

  @Nonnull
  public String selectionDirection;

  public int selectionEnd;

  public int selectionStart;

  @Nonnull
  public String value;

  @Nonnull
  public String wrap;

  protected HTMLTextAreaElement() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  /**
   * The HTMLTextAreaElement.labels read-only property returns a NodeList of the label elements associated with the textarea element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTextAreaElement/labels">HTMLTextAreaElement.labels - MDN</a>
   */
  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();

  @JsProperty(
      name = "textLength"
  )
  public native int textLength();

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

  public native void select();

  public native void setCustomValidity(@Nonnull String error);

  public native void setRangeText(@Nonnull String replacement);

  public native void setRangeText(@Nonnull String replacement, int start, int end,
      @SelectionMode @Nonnull String selectionMode);

  public native void setRangeText(@Nonnull String replacement, int start, int end);

  public native void setSelectionRange(int start, int end, @Nonnull String direction);

  public native void setSelectionRange(int start, int end);
}
