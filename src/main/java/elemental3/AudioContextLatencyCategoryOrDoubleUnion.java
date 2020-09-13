package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AudioContextLatencyCategoryOrDoubleUnion {
  @JsOverlay
  @Nonnull
  static AudioContextLatencyCategoryOrDoubleUnion of(
      @MagicConstant(valuesFromClass = AudioContextLatencyCategory.class) @Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static AudioContextLatencyCategoryOrDoubleUnion of(final double value) {
    return Js.cast( value );
  }
}
