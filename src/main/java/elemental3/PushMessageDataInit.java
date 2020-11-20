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
public interface PushMessageDataInit {
  @JsOverlay
  @Nonnull
  static PushMessageDataInit of(@Nonnull final BufferSource value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static PushMessageDataInit of(@Nonnull final ArrayBufferView value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static PushMessageDataInit of(@Nonnull final ArrayBuffer value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static PushMessageDataInit of(@Nonnull final String value) {
    return Js.cast( value );
  }
}
