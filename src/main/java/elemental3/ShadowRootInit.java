package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ShadowRootInit {
  @JsOverlay
  @Nonnull
  static ShadowRootInit create(@ShadowRootMode @Nonnull final String mode) {
    return Js.<ShadowRootInit>uncheckedCast( JsPropertyMap.of() ).mode( mode );
  }

  @JsProperty(
      name = "delegatesFocus"
  )
  boolean delegatesFocus();

  @JsProperty
  void setDelegatesFocus(boolean delegatesFocus);

  @JsOverlay
  @Nonnull
  default ShadowRootInit delegatesFocus(final boolean delegatesFocus) {
    setDelegatesFocus( delegatesFocus );
    return this;
  }

  @JsProperty(
      name = "mode"
  )
  @ShadowRootMode
  @Nonnull
  String mode();

  @JsProperty
  void setMode(@ShadowRootMode @Nonnull String mode);

  @JsOverlay
  @Nonnull
  default ShadowRootInit mode(@ShadowRootMode @Nonnull final String mode) {
    setMode( mode );
    return this;
  }
}
