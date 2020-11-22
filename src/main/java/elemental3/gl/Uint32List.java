package elemental3.gl;

import elemental3.core.JsArray;
import elemental3.core.Uint32Array;
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
public interface Uint32List {
  @JsOverlay
  @Nonnull
  static Uint32List of(@Nonnull final Uint32Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static Uint32List of(@Nonnull final JsArray<Double> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static Uint32List of(@Nonnull final double[] value) {
    return Js.cast( value );
  }
}
