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
 * The AesCbcParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-CBC algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesCbcParams">AesCbcParams - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AesCbcParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final BufferSource iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final ArrayBufferView iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final Int8Array iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final Int16Array iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final Int32Array iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final Uint8Array iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final Uint16Array iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final Uint32Array iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final Uint8ClampedArray iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final Float32Array iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final Float64Array iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final DataView iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesCbcParams create(@Nonnull final String name, @Nonnull final ArrayBuffer iv) {
    return Js.<AesCbcParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsProperty(
      name = "iv"
  )
  @Nonnull
  BufferSource iv();

  @JsProperty
  void setIv(@Nonnull BufferSource iv);

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final BufferSource iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final ArrayBufferView iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final ArrayBufferView iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Int8Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final Int8Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Int16Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final Int16Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Int32Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final Int32Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Uint8Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final Uint8Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Uint16Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final Uint16Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Uint32Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final Uint32Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Uint8ClampedArray iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final Uint8ClampedArray iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Float32Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final Float32Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Float64Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final Float64Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final DataView iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final DataView iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final ArrayBuffer iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesCbcParams iv(@Nonnull final ArrayBuffer iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AesCbcParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
