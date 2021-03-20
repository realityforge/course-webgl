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
public interface ImageBitmapSource {
  @JsOverlay
  @Nonnull
  static ImageBitmapSource of(@Nonnull final CanvasImageSource value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ImageBitmapSource of(@Nonnull final HTMLOrSVGImageElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ImageBitmapSource of(@Nonnull final HTMLImageElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ImageBitmapSource of(@Nonnull final SVGImageElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ImageBitmapSource of(@Nonnull final HTMLVideoElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ImageBitmapSource of(@Nonnull final HTMLCanvasElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ImageBitmapSource of(@Nonnull final ImageBitmap value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ImageBitmapSource of(@Nonnull final OffscreenCanvas value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ImageBitmapSource of(@Nonnull final Blob value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ImageBitmapSource of(@Nonnull final ImageData value) {
    return Js.cast( value );
  }
}
