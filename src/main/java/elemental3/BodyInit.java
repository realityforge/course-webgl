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
public interface BodyInit {
  @JsOverlay
  @Nonnull
  static BodyInit of(@Nonnull final ReadableStream value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BodyInit of(@Nonnull final XMLHttpRequestBodyInit value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BodyInit of(@Nonnull final Blob value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BodyInit of(@Nonnull final BufferSource value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BodyInit of(@Nonnull final FormData value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BodyInit of(@Nonnull final URLSearchParams value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static BodyInit of(@Nonnull final String value) {
    return Js.cast( value );
  }
}
