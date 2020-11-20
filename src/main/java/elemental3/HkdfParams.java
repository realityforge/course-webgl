package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * See the examples for SubtleCrypto.deriveKey().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HkdfParams">HkdfParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-HkdfParams">The definition of 'SubtleCrypto.HkdfParams' in the 'Web Cryptography API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface HkdfParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsProperty(
      name = "hash"
  )
  @Nonnull
  AlgorithmIdentifier hash();

  @JsProperty
  void setHash(@Nonnull AlgorithmIdentifier hash);

  @JsOverlay
  @Nonnull
  default HkdfParams hash(@Nonnull final AlgorithmIdentifier hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  default void setHash(@Nonnull final Object hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams hash(@Nonnull final Object hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  default void setHash(@Nonnull final String hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams hash(@Nonnull final String hash) {
    setHash( hash );
    return this;
  }

  @JsProperty(
      name = "info"
  )
  @Nonnull
  BufferSource info();

  @JsProperty
  void setInfo(@Nonnull BufferSource info);

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final BufferSource info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final ArrayBufferView info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final ArrayBufferView info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final ArrayBuffer info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final ArrayBuffer info) {
    setInfo( info );
    return this;
  }

  @JsProperty(
      name = "salt"
  )
  @Nonnull
  BufferSource salt();

  @JsProperty
  void setSalt(@Nonnull BufferSource salt);

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final BufferSource salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final ArrayBufferView salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final ArrayBufferView salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final ArrayBuffer salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final ArrayBuffer salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default HkdfParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
