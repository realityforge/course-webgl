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
public interface MessageEventSource {
  @JsOverlay
  @Nonnull
  static MessageEventSource of(@Nonnull final Window value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static MessageEventSource of(@Nonnull final MessagePort value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static MessageEventSource of(@Nonnull final ServiceWorker value) {
    return Js.cast( value );
  }
}
