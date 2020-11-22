package elemental3;

import elemental3.core.ArrayBufferView;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Crypto interface represents basic cryptography features available in the current context. It allows access to a cryptographically strong random number generator and to cryptographic primitives.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto">Crypto - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#crypto-interface">The definition of 'Crypto' in the 'Web Cryptography API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Crypto"
)
public class Crypto {
  protected Crypto() {
  }

  /**
   * The Crypto.subtle read-only property returns a SubtleCrypto which can then be used to perform low-level cryptographic operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/subtle">Crypto.subtle - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-Crypto">The definition of 'Crypto.subtle' in the 'Web Cryptography API' specification.</a>
   */
  @JsProperty(
      name = "subtle"
  )
  @Nonnull
  public native SubtleCrypto subtle();

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull ArrayBufferView array);
}
