package elemental3;

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
  ElementInternals() {
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
