package elemental3.gl;

import elemental2.core.JsArray;
import elemental3.Int32Array;
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
public interface Int32List {
  @JsOverlay
  @Nonnull
  static Int32List of(@Nonnull final Int32Array value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static Int32List of(@Nonnull final JsArray<Double> value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static Int32List of(@Nonnull final double[] value) {
    return Js.cast( value );
  }
}
