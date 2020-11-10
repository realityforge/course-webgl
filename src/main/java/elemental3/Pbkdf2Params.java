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

/**
 * The Pbkdf2Params dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.deriveKey(), when using the PBKDF2 algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Pbkdf2Params">Pbkdf2Params - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-Pbkdf2Params">The definition of 'SubtleCrypto.Pbkdf2Params' in the 'Web Cryptography API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface Pbkdf2Params extends Algorithm {
  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final BufferSource salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final BufferSource salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final BufferSource salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final ArrayBufferView salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final ArrayBufferView salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final ArrayBufferView salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final Int8Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final Int8Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final Int8Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final Int16Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final Int16Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final Int16Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final Int32Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final Int32Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final Int32Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final Uint8Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final Uint8Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final Uint8Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final Uint16Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final Uint16Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final Uint16Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final Uint32Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final Uint32Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final Uint32Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final Uint8ClampedArray salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final Uint8ClampedArray salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final Uint8ClampedArray salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final Float32Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final Float32Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final Float32Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final Float64Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final Float64Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final Float64Array salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final DataView salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final DataView salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final DataView salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      final int iterations, @Nonnull final ArrayBuffer salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final Object hash,
      final int iterations, @Nonnull final ArrayBuffer salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static Pbkdf2Params create(@Nonnull final String name, @Nonnull final String hash,
      final int iterations, @Nonnull final ArrayBuffer salt) {
    return Js.<Pbkdf2Params>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).iterations( iterations ).salt( salt );
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
  default Pbkdf2Params hash(@Nonnull final AlgorithmIdentifier hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  default void setHash(@Nonnull final Object hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params hash(@Nonnull final Object hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  default void setHash(@Nonnull final String hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params hash(@Nonnull final String hash) {
    setHash( hash );
    return this;
  }

  @JsProperty(
      name = "iterations"
  )
  int iterations();

  @JsProperty
  void setIterations(int iterations);

  @JsOverlay
  @Nonnull
  default Pbkdf2Params iterations(final int iterations) {
    setIterations( iterations );
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
  default Pbkdf2Params salt(@Nonnull final BufferSource salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final ArrayBufferView salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final ArrayBufferView salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Int8Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final Int8Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Int16Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final Int16Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Int32Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final Int32Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Uint8Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final Uint8Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Uint16Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final Uint16Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Uint32Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final Uint32Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Uint8ClampedArray salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final Uint8ClampedArray salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Float32Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final Float32Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Float64Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final Float64Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final DataView salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final DataView salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final ArrayBuffer salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default Pbkdf2Params salt(@Nonnull final ArrayBuffer salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default Pbkdf2Params name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
