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
public interface ConstrainULong {
  @JsOverlay
  @Nonnull
  static ConstrainULong of(final int value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainULong of(@Nonnull final ConstrainULongRange value) {
    return Js.cast( value );
  }
}
