package elemental3.rtc;

import elemental3.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static RTCErrorEventInit create(@Nonnull final RTCError error) {
    return Js.<RTCErrorEventInit>uncheckedCast( JsPropertyMap.of() ).error( error );
  }

  @JsProperty(
      name = "error"
  )
  @Nonnull
  RTCError error();

  @JsProperty
  void setError(@Nonnull RTCError error);

  @JsOverlay
  @Nonnull
  default RTCErrorEventInit error(@Nonnull final RTCError error) {
    setError( error );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCErrorEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCErrorEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCErrorEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
