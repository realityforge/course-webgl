package elemental3;

import elemental3.media.MediaSource;
import elemental3.media.MediaStream;
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
public interface MediaProvider {
  @JsOverlay
  @Nonnull
  static MediaProvider of(@Nonnull final MediaStream value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static MediaProvider of(@Nonnull final MediaSource value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static MediaProvider of(@Nonnull final Blob value) {
    return Js.cast( value );
  }
}
