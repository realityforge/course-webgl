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
public interface HTMLCanvasElementOrOffscreenCanvasUnion {
  @JsOverlay
  @Nonnull
  static HTMLCanvasElementOrOffscreenCanvasUnion of(@Nonnull final HTMLCanvasElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static HTMLCanvasElementOrOffscreenCanvasUnion of(@Nonnull final OffscreenCanvas value) {
    return Js.cast( value );
  }
}
