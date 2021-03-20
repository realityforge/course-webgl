package akasha.crypto;

import akasha.core.BufferSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RsaOaepParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.encrypt(), SubtleCrypto.decrypt(), SubtleCrypto.wrapKey(), or SubtleCrypto.unwrapKey(), when using the RSA_OAEP algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RsaOaepParams">RsaOaepParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-RsaOaepParams">SubtleCrypto.RsaOaepParams - Web Cryptography API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface RsaOaepParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static RsaOaepParams create(@Nonnull final String name) {
    return Js.<RsaOaepParams>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "label"
  )
  BufferSource label();

  @JsProperty
  void setLabel(@Nonnull BufferSource label);

  @JsOverlay
  @Nonnull
  default RsaOaepParams label(@Nonnull final BufferSource label) {
    setLabel( label );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RsaOaepParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
