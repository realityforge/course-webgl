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
 * The CryptoKeyPair dictionary of the Web Crypto API represents a key pair for an asymmetric cryptography algorithm, also known as a public-key algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CryptoKeyPair">CryptoKeyPair - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-CryptoKeyPair">CryptoKeyPair - Web Cryptography API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface CryptoKeyPair {
  @JsOverlay
  @Nonnull
  static CryptoKeyPair create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "privateKey"
  )
  CryptoKey privateKey();

  @JsProperty
  void setPrivateKey(@Nonnull CryptoKey privateKey);

  @JsOverlay
  @Nonnull
  default CryptoKeyPair privateKey(@Nonnull final CryptoKey privateKey) {
    setPrivateKey( privateKey );
    return this;
  }

  @JsProperty(
      name = "publicKey"
  )
  CryptoKey publicKey();

  @JsProperty
  void setPublicKey(@Nonnull CryptoKey publicKey);

  @JsOverlay
  @Nonnull
  default CryptoKeyPair publicKey(@Nonnull final CryptoKey publicKey) {
    setPublicKey( publicKey );
    return this;
  }
}
