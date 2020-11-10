package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CryptoKey interface of the Web Crypto API represents a cryptographic key obtained from one of the SubtleCrypto methods generateKey(), deriveKey(), importKey(), or unwrapKey().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CryptoKey">CryptoKey - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-CryptoKey">The definition of 'CryptoKey' in the 'Web Cryptography API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CryptoKey"
)
public class CryptoKey {
  protected CryptoKey() {
  }

  @JsProperty(
      name = "algorithm"
  )
  @Nonnull
  public native Object algorithm();

  @JsProperty(
      name = "extractable"
  )
  public native boolean extractable();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  @KeyType
  public native String type();

  @JsProperty(
      name = "usages"
  )
  @Nonnull
  public native Object usages();
}
