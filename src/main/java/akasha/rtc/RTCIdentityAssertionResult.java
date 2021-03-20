package akasha.rtc;

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
    name = "Object"
)
public interface RTCIdentityAssertionResult {
  @JsOverlay
  @Nonnull
  static RTCIdentityAssertionResult create(@Nonnull final String assertion,
      @Nonnull final RTCIdentityProviderDetails idp) {
    return Js.<RTCIdentityAssertionResult>uncheckedCast( JsPropertyMap.of() ).assertion( assertion ).idp( idp );
  }

  @JsProperty(
      name = "assertion"
  )
  @Nonnull
  String assertion();

  @JsProperty
  void setAssertion(@Nonnull String assertion);

  @JsOverlay
  @Nonnull
  default RTCIdentityAssertionResult assertion(@Nonnull final String assertion) {
    setAssertion( assertion );
    return this;
  }

  @JsProperty(
      name = "idp"
  )
  @Nonnull
  RTCIdentityProviderDetails idp();

  @JsProperty
  void setIdp(@Nonnull RTCIdentityProviderDetails idp);

  @JsOverlay
  @Nonnull
  default RTCIdentityAssertionResult idp(@Nonnull final RTCIdentityProviderDetails idp) {
    setIdp( idp );
    return this;
  }
}
