package akasha;

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
public interface ReadableStreamReader {
  @JsOverlay
  @Nonnull
  static ReadableStreamReader of(@Nonnull final ReadableStreamDefaultReader value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ReadableStreamReader of(@Nonnull final ReadableStreamBYOBReader value) {
    return Js.cast( value );
  }
}
