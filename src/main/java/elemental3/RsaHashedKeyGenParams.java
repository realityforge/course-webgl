package elemental3;

import elemental3.core.Uint8Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RsaHashedKeyGenParams dictionary of the Web Crypto API represents the object that should be passed as the algorithm parameter into SubtleCrypto.generateKey(), when generating any RSA-based key pair: that is, when the algorithm is identified as any of RSASSA-PKCS1-v1_5, RSA-PSS, or RSA-OAEP.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RsaHashedKeyGenParams">RsaHashedKeyGenParams - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-RsaHashedKeyGenParams">SubtleCrypto.RsaHashedKeyGenParams - Web Cryptography API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RsaHashedKeyGenParams extends RsaKeyGenParams {
  @JsOverlay
  @Nonnull
  static RsaHashedKeyGenParams create(@Nonnull final String name, final int modulusLength,
      @Nonnull final Uint8Array publicExponent, @Nonnull final AlgorithmIdentifier hash) {
    return Js.<RsaHashedKeyGenParams>uncheckedCast( JsPropertyMap.of() ).name( name ).modulusLength( modulusLength ).publicExponent( publicExponent ).hash( hash );
  }

  @JsOverlay
  @Nonnull
  static RsaHashedKeyGenParams create(@Nonnull final String name, final int modulusLength,
      @Nonnull final Uint8Array publicExponent, @Nonnull final Object hash) {
    return Js.<RsaHashedKeyGenParams>uncheckedCast( JsPropertyMap.of() ).name( name ).modulusLength( modulusLength ).publicExponent( publicExponent ).hash( hash );
  }

  @JsOverlay
  @Nonnull
  static RsaHashedKeyGenParams create(@Nonnull final String name, final int modulusLength,
      @Nonnull final Uint8Array publicExponent, @Nonnull final String hash) {
    return Js.<RsaHashedKeyGenParams>uncheckedCast( JsPropertyMap.of() ).name( name ).modulusLength( modulusLength ).publicExponent( publicExponent ).hash( hash );
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
  default RsaHashedKeyGenParams hash(@Nonnull final AlgorithmIdentifier hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  default void setHash(@Nonnull final Object hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  @Nonnull
  default RsaHashedKeyGenParams hash(@Nonnull final Object hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  default void setHash(@Nonnull final String hash) {
    setHash( AlgorithmIdentifier.of( hash ) );
  }

  @JsOverlay
  @Nonnull
  default RsaHashedKeyGenParams hash(@Nonnull final String hash) {
    setHash( hash );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RsaHashedKeyGenParams modulusLength(final int modulusLength) {
    setModulusLength( modulusLength );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RsaHashedKeyGenParams publicExponent(@Nonnull final Uint8Array publicExponent) {
    setPublicExponent( publicExponent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RsaHashedKeyGenParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
