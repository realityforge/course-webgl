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
public interface PasswordCredentialData extends CredentialData {
  @JsOverlay
  @Nonnull
  static PasswordCredentialData create(@Nonnull final String id, @Nonnull final String origin,
      @Nonnull final String password) {
    return Js.<PasswordCredentialData>uncheckedCast( JsPropertyMap.of() ).id( id ).origin( origin ).password( password );
  }

  @JsProperty(
      name = "iconURL"
  )
  String iconURL();

  @JsProperty
  void setIconURL(@Nonnull String iconURL);

  @JsOverlay
  @Nonnull
  default PasswordCredentialData iconURL(@Nonnull final String iconURL) {
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
  default PasswordCredentialData name(@Nonnull final String name) {
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
  default PasswordCredentialData origin(@Nonnull final String origin) {
    setOrigin( origin );
    return this;
  }

  @JsProperty(
      name = "password"
  )
  @Nonnull
  String password();

  @JsProperty
  void setPassword(@Nonnull String password);

  @JsOverlay
  @Nonnull
  default PasswordCredentialData password(@Nonnull final String password) {
    setPassword( password );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PasswordCredentialData id(@Nonnull final String id) {
    setId( id );
    return this;
  }
}
