package elemental3.gl;

import elemental3.HTMLCanvasElement;
import elemental3.HTMLImageElement;
import elemental3.HTMLVideoElement;
import elemental3.ImageBitmap;
import elemental3.ImageData;
import elemental3.OffscreenCanvas;
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
public interface TexImageSource {
  @JsOverlay
  @Nonnull
  static TexImageSource of(@Nonnull final ImageBitmap value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static TexImageSource of(@Nonnull final ImageData value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static TexImageSource of(@Nonnull final HTMLImageElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static TexImageSource of(@Nonnull final HTMLCanvasElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static TexImageSource of(@Nonnull final HTMLVideoElement value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static TexImageSource of(@Nonnull final OffscreenCanvas value) {
    return Js.cast( value );
  }
}
