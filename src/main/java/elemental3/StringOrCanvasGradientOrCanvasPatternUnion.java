package elemental3;

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
public interface StringOrCanvasGradientOrCanvasPatternUnion {
  @JsOverlay
  @Nonnull
  static StringOrCanvasGradientOrCanvasPatternUnion of(@Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static StringOrCanvasGradientOrCanvasPatternUnion of(@Nonnull final CanvasGradient value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static StringOrCanvasGradientOrCanvasPatternUnion of(@Nonnull final CanvasPattern value) {
    return Js.cast( value );
  }
}
