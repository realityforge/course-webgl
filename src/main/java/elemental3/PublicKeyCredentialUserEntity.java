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
public interface PublicKeyCredentialUserEntity extends PublicKeyCredentialEntity {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final BufferSource id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final ArrayBufferView id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final ArrayBuffer id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsProperty(
      name = "displayName"
  )
  @Nonnull
  String displayName();

  @JsProperty
  void setDisplayName(@Nonnull String displayName);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity displayName(@Nonnull final String displayName) {
    setDisplayName( displayName );
    return this;
  }

  @JsProperty(
      name = "id"
  )
  @Nonnull
  BufferSource id();

  @JsProperty
  void setId(@Nonnull BufferSource id);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final BufferSource id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final ArrayBufferView id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final ArrayBufferView id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final ArrayBuffer id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final ArrayBuffer id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PublicKeyCredentialUserEntity icon(@Nonnull final String icon) {
    setIcon( icon );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PublicKeyCredentialUserEntity name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
