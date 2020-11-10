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
      @Nonnull final Int8Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final BufferSource salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final BufferSource salt) {
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
      @Nonnull final Int8Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final ArrayBufferView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final ArrayBufferView salt) {
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
      @Nonnull final BufferSource info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int8Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Int8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int8Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Int16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int8Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Int32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int8Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint8Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int8Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint16Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int8Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int8Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Uint8ClampedArray salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int8Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Float32Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int8Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final Float64Array salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final BufferSource info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final BufferSource info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final BufferSource info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBufferView info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBufferView info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBufferView info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int8Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final ArrayBuffer info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final ArrayBuffer info, @Nonnull final DataView salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final ArrayBuffer info, @Nonnull final DataView salt) {
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
      @Nonnull final Int8Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int8Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int8Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int16Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int16Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int16Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Int32Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Int32Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Int32Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint16Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint16Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint16Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint32Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint32Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint32Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Uint8ClampedArray info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float32Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float32Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float32Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final Float64Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final Float64Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final Float64Array info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final AlgorithmIdentifier hash,
      @Nonnull final DataView info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final Object hash,
      @Nonnull final DataView info, @Nonnull final ArrayBuffer salt) {
    return Js.<HkdfParams>uncheckedCast( JsPropertyMap.of() ).name( name ).hash( hash ).info( info ).salt( salt );
  }

  @JsOverlay
  @Nonnull
  static HkdfParams create(@Nonnull final String name, @Nonnull final String hash,
      @Nonnull final DataView info, @Nonnull final ArrayBuffer salt) {
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
  default void setInfo(@Nonnull final Int8Array info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final Int8Array info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final Int16Array info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final Int16Array info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final Int32Array info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final Int32Array info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final Uint8Array info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final Uint8Array info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final Uint16Array info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final Uint16Array info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final Uint32Array info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final Uint32Array info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final Uint8ClampedArray info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final Uint8ClampedArray info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final Float32Array info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final Float32Array info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final Float64Array info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final Float64Array info) {
    setInfo( info );
    return this;
  }

  @JsOverlay
  default void setInfo(@Nonnull final DataView info) {
    setInfo( BufferSource.of( info ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams info(@Nonnull final DataView info) {
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
  default void setSalt(@Nonnull final Int8Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final Int8Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Int16Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final Int16Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Int32Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final Int32Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Uint8Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final Uint8Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Uint16Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final Uint16Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Uint32Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final Uint32Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Uint8ClampedArray salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final Uint8ClampedArray salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Float32Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final Float32Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final Float64Array salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final Float64Array salt) {
    setSalt( salt );
    return this;
  }

  @JsOverlay
  default void setSalt(@Nonnull final DataView salt) {
    setSalt( BufferSource.of( salt ) );
  }

  @JsOverlay
  @Nonnull
  default HkdfParams salt(@Nonnull final DataView salt) {
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
