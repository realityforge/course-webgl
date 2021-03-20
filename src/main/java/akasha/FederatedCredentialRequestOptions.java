package akasha;

import akasha.lang.JsArray;
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
public interface FederatedCredentialRequestOptions {
  @JsOverlay
  @Nonnull
  static FederatedCredentialRequestOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "protocols"
  )
  JsArray<String> protocols();

  @JsProperty
  void setProtocols(@Nonnull JsArray<String> protocols);

  @JsOverlay
  @Nonnull
  default FederatedCredentialRequestOptions protocols(@Nonnull final JsArray<String> protocols) {
    setProtocols( protocols );
    return this;
  }

  @JsOverlay
  default void setProtocols(@Nonnull final String... protocols) {
    setProtocols( Js.<JsArray<String>>uncheckedCast( protocols ) );
  }

  @JsOverlay
  @Nonnull
  default FederatedCredentialRequestOptions protocols(@Nonnull final String... protocols) {
    setProtocols( protocols );
    return this;
  }

  @JsProperty(
      name = "providers"
  )
  JsArray<String> providers();

  @JsProperty
  void setProviders(@Nonnull JsArray<String> providers);

  @JsOverlay
  @Nonnull
  default FederatedCredentialRequestOptions providers(@Nonnull final JsArray<String> providers) {
    setProviders( providers );
    return this;
  }

  @JsOverlay
  default void setProviders(@Nonnull final String... providers) {
    setProviders( Js.<JsArray<String>>uncheckedCast( providers ) );
  }

  @JsOverlay
  @Nonnull
  default FederatedCredentialRequestOptions providers(@Nonnull final String... providers) {
    setProviders( providers );
    return this;
  }
}
