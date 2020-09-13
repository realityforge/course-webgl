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
 * The AesCtrParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-CTR algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesCtrParams">AesCtrParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AesCtrParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final BufferSource counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final ArrayBufferView counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final Int8Array counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final Int16Array counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final Int32Array counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final Uint8Array counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final Uint16Array counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final Uint32Array counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final Uint8ClampedArray counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final Float32Array counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final Float64Array counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final DataView counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsOverlay
  @Nonnull
  static AesCtrParams create(@Nonnull final String name, @Nonnull final ArrayBuffer counter,
      final short length) {
    return Js.<AesCtrParams>uncheckedCast( JsPropertyMap.of() ).name( name ).counter( counter ).length( length );
  }

  @JsProperty(
      name = "counter"
  )
  @Nonnull
  BufferSource counter();

  @JsProperty
  void setCounter(@Nonnull BufferSource counter);

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final BufferSource counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final ArrayBufferView counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final ArrayBufferView counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final Int8Array counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final Int8Array counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final Int16Array counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final Int16Array counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final Int32Array counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final Int32Array counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final Uint8Array counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final Uint8Array counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final Uint16Array counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final Uint16Array counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final Uint32Array counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final Uint32Array counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final Uint8ClampedArray counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final Uint8ClampedArray counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final Float32Array counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final Float32Array counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final Float64Array counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final Float64Array counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final DataView counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final DataView counter) {
    setCounter( counter );
    return this;
  }

  @JsOverlay
  default void setCounter(@Nonnull final ArrayBuffer counter) {
    setCounter( BufferSource.of( counter ) );
  }

  @JsOverlay
  @Nonnull
  default AesCtrParams counter(@Nonnull final ArrayBuffer counter) {
    setCounter( counter );
    return this;
  }

  @JsProperty(
      name = "length"
  )
  short length();

  @JsProperty
  void setLength(short length);

  @JsOverlay
  @Nonnull
  default AesCtrParams length(final short length) {
    setLength( length );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AesCtrParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
