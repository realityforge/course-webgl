package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ElementInternals"
)
public class ElementInternals {
  @Nonnull
  public String ariaAtomic;

  @Nonnull
  public String ariaAutoComplete;

  @Nonnull
  public String ariaBusy;

  @Nonnull
  public String ariaChecked;

  @Nonnull
  public String ariaColCount;

  @Nonnull
  public String ariaColIndex;

  @Nonnull
  public String ariaColIndexText;

  @Nonnull
  public String ariaColSpan;

  @Nonnull
  public String ariaCurrent;

  @Nonnull
  public String ariaDescription;

  @Nonnull
  public String ariaDisabled;

  @Nonnull
  public String ariaExpanded;

  @Nonnull
  public String ariaHasPopup;

  @Nonnull
  public String ariaHidden;

  @Nonnull
  public String ariaInvalid;

  @Nonnull
  public String ariaKeyShortcuts;

  @Nonnull
  public String ariaLabel;

  @Nonnull
  public String ariaLevel;

  @Nonnull
  public String ariaLive;

  @Nonnull
  public String ariaModal;

  @Nonnull
  public String ariaMultiLine;

  @Nonnull
  public String ariaMultiSelectable;

  @Nonnull
  public String ariaOrientation;

  @Nonnull
  public String ariaPlaceholder;

  @Nonnull
  public String ariaPosInSet;

  @Nonnull
  public String ariaPressed;

  @Nonnull
  public String ariaReadOnly;

  @Nonnull
  public String ariaRequired;

  @Nonnull
  public String ariaRoleDescription;

  @Nonnull
  public String ariaRowCount;

  @Nonnull
  public String ariaRowIndex;

  @Nonnull
  public String ariaRowIndexText;

  @Nonnull
  public String ariaRowSpan;

  @Nonnull
  public String ariaSelected;

  @Nonnull
  public String ariaSetSize;

  @Nonnull
  public String ariaSort;

  @Nonnull
  public String ariaValueMax;

  @Nonnull
  public String ariaValueMin;

  @Nonnull
  public String ariaValueNow;

  @Nonnull
  public String ariaValueText;

  @Nullable
  public String role;

  protected ElementInternals() {
  }

  @JsProperty(
      name = "form"
  )
  @Nullable
  public native HTMLFormElement form();

  @JsProperty(
      name = "labels"
  )
  @Nonnull
  public native NodeList labels();

  @JsProperty(
      name = "shadowRoot"
  )
  @Nullable
  public native ShadowRoot shadowRoot();

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

  public native void setFormValue(@Nonnull File value, @Nonnull File state);

  public native void setFormValue(@Nonnull String value, @Nonnull File state);

  public native void setFormValue(@Nonnull FormData value, @Nonnull File state);

  public native void setFormValue(@Nonnull File value, @Nonnull String state);

  public native void setFormValue(@Nonnull String value, @Nonnull String state);

  public native void setFormValue(@Nonnull FormData value, @Nonnull String state);

  public native void setFormValue(@Nonnull File value, @Nonnull FormData state);

  public native void setFormValue(@Nonnull String value, @Nonnull FormData state);

  public native void setFormValue(@Nonnull FormData value, @Nonnull FormData state);

  public native void setFormValue(@Nonnull File value);

  public native void setFormValue(@Nonnull String value);

  public native void setFormValue(@Nonnull FormData value);

  public native void setValidity(@Nonnull ValidityStateFlags flags, @Nonnull String message,
      @Nonnull HTMLElement anchor);

  public native void setValidity(@Nonnull ValidityStateFlags flags, @Nonnull String message);

  public native void setValidity(@Nonnull ValidityStateFlags flags);

  public native void setValidity();
}
