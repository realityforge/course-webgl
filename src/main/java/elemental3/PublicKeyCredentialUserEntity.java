package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
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
      @Nonnull final String displayName, @Nonnull final Int8Array id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final Int16Array id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final Int32Array id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final Uint8Array id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final Uint16Array id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final Uint32Array id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final Uint8ClampedArray id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final Float32Array id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final Float64Array id) {
    return Js.<PublicKeyCredentialUserEntity>uncheckedCast( JsPropertyMap.of() ).name( name ).displayName( displayName ).id( id );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialUserEntity create(@Nonnull final String name,
      @Nonnull final String displayName, @Nonnull final DataView id) {
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
  default void setId(@Nonnull final Int8Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final Int8Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Int16Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final Int16Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Int32Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final Int32Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Uint8Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final Uint8Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Uint16Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final Uint16Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Uint32Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final Uint32Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Uint8ClampedArray id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final Uint8ClampedArray id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Float32Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final Float32Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final Float64Array id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final Float64Array id) {
    setId( id );
    return this;
  }

  @JsOverlay
  default void setId(@Nonnull final DataView id) {
    setId( BufferSource.of( id ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialUserEntity id(@Nonnull final DataView id) {
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
