package elemental3.rtc;

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
public interface RTCIdentityProviderOptions {
  @JsOverlay
  @Nonnull
  static RTCIdentityProviderOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "peerIdentity"
  )
  String peerIdentity();

  @JsProperty
  void setPeerIdentity(@Nonnull String peerIdentity);

  @JsOverlay
  @Nonnull
  default RTCIdentityProviderOptions peerIdentity(@Nonnull final String peerIdentity) {
    setPeerIdentity( peerIdentity );
    return this;
  }

  @JsProperty(
      name = "protocol"
  )
  String protocol();

  @JsProperty
  void setProtocol(@Nonnull String protocol);

  @JsOverlay
  @Nonnull
  default RTCIdentityProviderOptions protocol(@Nonnull final String protocol) {
    setProtocol( protocol );
    return this;
  }

  @JsProperty(
      name = "usernameHint"
  )
  String usernameHint();

  @JsProperty
  void setUsernameHint(@Nonnull String usernameHint);

  @JsOverlay
  @Nonnull
  default RTCIdentityProviderOptions usernameHint(@Nonnull final String usernameHint) {
    setUsernameHint( usernameHint );
    return this;
  }
}
