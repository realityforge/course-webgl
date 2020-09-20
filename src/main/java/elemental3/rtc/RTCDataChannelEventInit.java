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
public interface RTCDataChannelEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static RTCDataChannelEventInit create(@Nonnull final RTCDataChannel channel) {
    return Js.<RTCDataChannelEventInit>uncheckedCast( JsPropertyMap.of() ).channel( channel );
  }

  @JsProperty(
      name = "channel"
  )
  @Nonnull
  RTCDataChannel channel();

  @JsProperty
  void setChannel(@Nonnull RTCDataChannel channel);

  @JsOverlay
  @Nonnull
  default RTCDataChannelEventInit channel(@Nonnull final RTCDataChannel channel) {
    setChannel( channel );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCDataChannelEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCDataChannelEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCDataChannelEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
