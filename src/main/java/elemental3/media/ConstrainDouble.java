package elemental3.media;

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
public interface ConstrainDouble {
  @JsOverlay
  @Nonnull
  static ConstrainDouble of(final double value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainDouble of(@Nonnull final ConstrainDoubleRange value) {
    return Js.cast( value );
  }
}
