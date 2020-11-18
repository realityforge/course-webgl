package elemental3;

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
 * The AesGcmParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the AES-GCM algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AesGcmParams">AesGcmParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-AesGcmParams">The definition of 'SubtleCrypto.AesGcmParams' in the 'Web Cryptography API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface AesGcmParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final BufferSource iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final ArrayBufferView iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final Int8Array iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final Int16Array iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final Int32Array iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final Uint8Array iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final Uint16Array iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final Uint32Array iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final Uint8ClampedArray iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final Float32Array iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final Float64Array iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final DataView iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsOverlay
  @Nonnull
  static AesGcmParams create(@Nonnull final String name, @Nonnull final ArrayBuffer iv) {
    return Js.<AesGcmParams>uncheckedCast( JsPropertyMap.of() ).name( name ).iv( iv );
  }

  @JsProperty(
      name = "additionalData"
  )
  BufferSource additionalData();

  @JsProperty
  void setAdditionalData(@Nonnull BufferSource additionalData);

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final BufferSource additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final ArrayBufferView additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final ArrayBufferView additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final Int8Array additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final Int8Array additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final Int16Array additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final Int16Array additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final Int32Array additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final Int32Array additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final Uint8Array additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final Uint8Array additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final Uint16Array additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final Uint16Array additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final Uint32Array additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final Uint32Array additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final Uint8ClampedArray additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final Uint8ClampedArray additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final Float32Array additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final Float32Array additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final Float64Array additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final Float64Array additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final DataView additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final DataView additionalData) {
    setAdditionalData( additionalData );
    return this;
  }

  @JsOverlay
  default void setAdditionalData(@Nonnull final ArrayBuffer additionalData) {
    setAdditionalData( BufferSource.of( additionalData ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams additionalData(@Nonnull final ArrayBuffer additionalData) {
    setAdditionalData( additionalData );
    return this;
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
  default AesGcmParams iv(@Nonnull final BufferSource iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final ArrayBufferView iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final ArrayBufferView iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Int8Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final Int8Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Int16Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final Int16Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Int32Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final Int32Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Uint8Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final Uint8Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Uint16Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final Uint16Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Uint32Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final Uint32Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Uint8ClampedArray iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final Uint8ClampedArray iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Float32Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final Float32Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final Float64Array iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final Float64Array iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final DataView iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final DataView iv) {
    setIv( iv );
    return this;
  }

  @JsOverlay
  default void setIv(@Nonnull final ArrayBuffer iv) {
    setIv( BufferSource.of( iv ) );
  }

  @JsOverlay
  @Nonnull
  default AesGcmParams iv(@Nonnull final ArrayBuffer iv) {
    setIv( iv );
    return this;
  }

  @JsProperty(
      name = "tagLength"
  )
  short tagLength();

  @JsProperty
  void setTagLength(short tagLength);

  @JsOverlay
  @Nonnull
  default AesGcmParams tagLength(final short tagLength) {
    setTagLength( tagLength );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AesGcmParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
