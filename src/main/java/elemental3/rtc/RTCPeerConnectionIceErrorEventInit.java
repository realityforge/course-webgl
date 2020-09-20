package elemental3.rtc;

import elemental3.EventInit;
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
    name = "?"
)
public interface RTCPeerConnectionIceErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static RTCPeerConnectionIceErrorEventInit create(final int errorCode) {
    return Js.<RTCPeerConnectionIceErrorEventInit>uncheckedCast( JsPropertyMap.of() ).errorCode( errorCode );
  }

  @JsProperty(
      name = "address"
  )
  @Nullable
  String address();

  @JsProperty
  void setAddress(@Nullable String address);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionIceErrorEventInit address(@Nullable final String address) {
    setAddress( address );
    return this;
  }

  @JsProperty(
      name = "errorCode"
  )
  int errorCode();

  @JsProperty
  void setErrorCode(int errorCode);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionIceErrorEventInit errorCode(final int errorCode) {
    setErrorCode( errorCode );
    return this;
  }

  @JsProperty(
      name = "port"
  )
  @Nullable
  Double port();

  @JsProperty
  void setPort(@Nullable Double port);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionIceErrorEventInit port(@Nullable final Double port) {
    setPort( port );
    return this;
  }

  @JsProperty(
      name = "statusText"
  )
  String statusText();

  @JsProperty
  void setStatusText(@Nonnull String statusText);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionIceErrorEventInit statusText(@Nonnull final String statusText) {
    setStatusText( statusText );
    return this;
  }

  @JsProperty(
      name = "url"
  )
  String url();

  @JsProperty
  void setUrl(@Nonnull String url);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionIceErrorEventInit url(@Nonnull final String url) {
    setUrl( url );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCPeerConnectionIceErrorEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCPeerConnectionIceErrorEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCPeerConnectionIceErrorEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
