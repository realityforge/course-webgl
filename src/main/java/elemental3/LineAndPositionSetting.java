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
public interface LineAndPositionSetting {
  @JsOverlay
  @Nonnull
  static LineAndPositionSetting of(final double value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static LineAndPositionSetting of(@AutoKeyword @Nonnull final String value) {
    return Js.cast( value );
  }
}
