package akasha.media;

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
public interface ConstrainBoolean {
  @JsOverlay
  @Nonnull
  static ConstrainBoolean of(final boolean value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ConstrainBoolean of(@Nonnull final ConstrainBooleanParameters value) {
    return Js.cast( value );
  }
}
