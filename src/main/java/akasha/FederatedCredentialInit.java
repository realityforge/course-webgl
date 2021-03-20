package akasha;

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
public interface FederatedCredentialInit extends CredentialData {
  @JsOverlay
  @Nonnull
  static FederatedCredentialInit create(@Nonnull final String id, @Nonnull final String origin,
      @Nonnull final String provider) {
    return Js.<FederatedCredentialInit>uncheckedCast( JsPropertyMap.of() ).id( id ).origin( origin ).provider( provider );
  }

  @JsProperty(
      name = "iconURL"
  )
  String iconURL();

  @JsProperty
  void setIconURL(@Nonnull String iconURL);

  @JsOverlay
  @Nonnull
  default FederatedCredentialInit iconURL(@Nonnull final String iconURL) {
    setIconURL( iconURL );
    return this;
  }

  @JsProperty(
      name = "name"
  )
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default FederatedCredentialInit name(@Nonnull final String name) {
    setName( name );
    return this;
  }

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  String origin();

  @JsProperty
  void setOrigin(@Nonnull String origin);

  @JsOverlay
  @Nonnull
  default FederatedCredentialInit origin(@Nonnull final String origin) {
    setOrigin( origin );
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
  default FederatedCredentialInit protocol(@Nonnull final String protocol) {
    setProtocol( protocol );
    return this;
  }

  @JsProperty(
      name = "provider"
  )
  @Nonnull
  String provider();

  @JsProperty
  void setProvider(@Nonnull String provider);

  @JsOverlay
  @Nonnull
  default FederatedCredentialInit provider(@Nonnull final String provider) {
    setProvider( provider );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FederatedCredentialInit id(@Nonnull final String id) {
    setId( id );
    return this;
  }
}
