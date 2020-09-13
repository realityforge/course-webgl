package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ShadowRootInit {
  @JsOverlay
  @Nonnull
  static ShadowRootInit create(
      @MagicConstant(valuesFromClass = ShadowRootMode.class) @Nonnull final String mode) {
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
  @MagicConstant(
      valuesFromClass = ShadowRootMode.class
  )
  @Nonnull
  String mode();

  @JsProperty
  void setMode(@MagicConstant(valuesFromClass = ShadowRootMode.class) @Nonnull String mode);

  @JsOverlay
  @Nonnull
  default ShadowRootInit mode(
      @MagicConstant(valuesFromClass = ShadowRootMode.class) @Nonnull final String mode) {
    setMode( mode );
    return this;
  }
}
