package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface UnrestrictedDoubleOrStringUnion {
  @JsOverlay
  @Nonnull
  static UnrestrictedDoubleOrStringUnion of(final double value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static UnrestrictedDoubleOrStringUnion of(@Nonnull final String value) {
    return Js.cast( value );
  }
}
