package akasha;

import akasha.svg.SVGImageElement;
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
public interface CanvasImageSource {
  @JsOverlay
  @Nonnull
  static CanvasImageSource of(@Nonnull final HTMLOrSVGImageElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static CanvasImageSource of(@Nonnull final HTMLImageElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static CanvasImageSource of(@Nonnull final SVGImageElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static CanvasImageSource of(@Nonnull final HTMLVideoElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static CanvasImageSource of(@Nonnull final HTMLCanvasElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static CanvasImageSource of(@Nonnull final ImageBitmap value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static CanvasImageSource of(@Nonnull final OffscreenCanvas value) {
    return Js.cast( value );
  }
}
