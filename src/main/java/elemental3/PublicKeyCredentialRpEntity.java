package elemental3;

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
public interface PublicKeyCredentialRpEntity extends PublicKeyCredentialEntity {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRpEntity create(@Nonnull final String name) {
    return Js.<PublicKeyCredentialRpEntity>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "id"
  )
  String id();

  @JsProperty
  void setId(@Nonnull String id);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRpEntity id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PublicKeyCredentialRpEntity icon(@Nonnull final String icon) {
    setIcon( icon );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PublicKeyCredentialRpEntity name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
