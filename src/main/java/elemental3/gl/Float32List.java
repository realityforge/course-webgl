package elemental3.gl;

import elemental3.core.Float32Array;
import elemental3.core.JsArray;
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
public interface Float32List {
  @JsOverlay
  @Nonnull
  static Float32List of(@Nonnull final Float32Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static Float32List of(@Nonnull final JsArray<Double> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static Float32List of(@Nonnull final double[] value) {
    return Js.cast( value );
  }
}
