package akasha.rtc;

import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
    name = "Object"
)
public interface RTCPeerConnectionIceEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static RTCPeerConnectionIceEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "candidate"
  )
  @Nullable
  RTCIceCandidate candidate();

  @JsProperty
  void setCandidate(@Nullable RTCIceCandidate candidate);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionIceEventInit candidate(@Nullable final RTCIceCandidate candidate) {
    setCandidate( candidate );
    return this;
  }

  @JsProperty(
      name = "url"
  )
  @Nullable
  String url();

  @JsProperty
  void setUrl(@Nullable String url);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionIceEventInit url(@Nullable final String url) {
    setUrl( url );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCPeerConnectionIceEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCPeerConnectionIceEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCPeerConnectionIceEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
