package elemental3;

import elemental3.core.BufferSource;
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
