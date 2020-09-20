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
public interface RTCIdentityProviderDetails {
  @JsOverlay
  @Nonnull
  static RTCIdentityProviderDetails create(@Nonnull final String domain) {
    return Js.<RTCIdentityProviderDetails>uncheckedCast( JsPropertyMap.of() ).domain( domain );
  }

  @JsProperty(
      name = "domain"
  )
  @Nonnull
  String domain();

  @JsProperty
  void setDomain(@Nonnull String domain);

  @JsOverlay
  @Nonnull
  default RTCIdentityProviderDetails domain(@Nonnull final String domain) {
    setDomain( domain );
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
  default RTCIdentityProviderDetails protocol(@Nonnull final String protocol) {
    setProtocol( protocol );
    return this;
  }
}
