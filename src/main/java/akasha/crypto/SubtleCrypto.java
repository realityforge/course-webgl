package akasha.crypto;

import akasha.core.ArrayBuffer;
import akasha.core.BufferSource;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The SubtleCrypto interface of the Web Crypto API provides a number of low-level cryptographic functions. Access to the features of SubtleCrypto is obtained through the subtle property of the Crypto object you get from Window.crypto.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto">SubtleCrypto - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#subtlecrypto-interface">SubtleCrypto - Web Cryptography API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SubtleCrypto"
)
public class SubtleCrypto {
  protected SubtleCrypto() {
  }

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">SubtleCrypto.decrypt() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">SubtleCrypto.decrypt() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">SubtleCrypto.decrypt() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The deriveBits() method of the SubtleCrypto interface can be used to derive an array of bits from a base key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveBits">SubtleCrypto.deriveBits - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveBits">SubtleCrypto.deriveBits() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<ArrayBuffer> deriveBits(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, int length);

  /**
   * The deriveBits() method of the SubtleCrypto interface can be used to derive an array of bits from a base key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveBits">SubtleCrypto.deriveBits - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveBits">SubtleCrypto.deriveBits() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<ArrayBuffer> deriveBits(@Nonnull Object algorithm,
      @Nonnull CryptoKey baseKey, int length);

  /**
   * The deriveBits() method of the SubtleCrypto interface can be used to derive an array of bits from a base key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveBits">SubtleCrypto.deriveBits - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveBits">SubtleCrypto.deriveBits() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<ArrayBuffer> deriveBits(@Nonnull String algorithm,
      @Nonnull CryptoKey baseKey, int length);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull Object derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull String derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull Object derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull String derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">SubtleCrypto.deriveKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">SubtleCrypto.digest() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull BufferSource data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">SubtleCrypto.digest() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull BufferSource data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">SubtleCrypto.digest() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull BufferSource data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">SubtleCrypto.encrypt() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">SubtleCrypto.encrypt() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">SubtleCrypto.encrypt() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The exportKey() method of the SubtleCrypto interface exports a key: that is, it takes as input a CryptoKey object and gives you the key in an external, portable format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/exportKey">SubtleCrypto.exportKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-exportKey">SubtleCrypto.exportKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> exportKey(@KeyFormat @Nonnull String format, @Nonnull CryptoKey key);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">SubtleCrypto.generateKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull AlgorithmIdentifier algorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">SubtleCrypto.generateKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">SubtleCrypto.generateKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">SubtleCrypto.generateKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull AlgorithmIdentifier algorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">SubtleCrypto.generateKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">SubtleCrypto.generateKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">SubtleCrypto.importKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">SubtleCrypto.sign() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">SubtleCrypto.sign() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">SubtleCrypto.sign() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">SubtleCrypto.unwrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">SubtleCrypto.verify() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">SubtleCrypto.verify() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">SubtleCrypto.verify() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull BufferSource data);

  /**
   * The wrapKey() method of the SubtleCrypto interface &quot;wraps&quot; a key. This means that it exports the key in an external, portable format, then encrypts the exported key. Wrapping a key helps protect it in untrusted environments, such as inside an otherwise unprotected data store or in transmission over an unprotected network.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/wrapKey">SubtleCrypto.wrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-wrapKey">SubtleCrypto.wrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> wrapKey(@KeyFormat @Nonnull String format, @Nonnull CryptoKey key,
      @Nonnull CryptoKey wrappingKey, @Nonnull AlgorithmIdentifier wrapAlgorithm);

  /**
   * The wrapKey() method of the SubtleCrypto interface &quot;wraps&quot; a key. This means that it exports the key in an external, portable format, then encrypts the exported key. Wrapping a key helps protect it in untrusted environments, such as inside an otherwise unprotected data store or in transmission over an unprotected network.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/wrapKey">SubtleCrypto.wrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-wrapKey">SubtleCrypto.wrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> wrapKey(@KeyFormat @Nonnull String format, @Nonnull CryptoKey key,
      @Nonnull CryptoKey wrappingKey, @Nonnull Object wrapAlgorithm);

  /**
   * The wrapKey() method of the SubtleCrypto interface &quot;wraps&quot; a key. This means that it exports the key in an external, portable format, then encrypts the exported key. Wrapping a key helps protect it in untrusted environments, such as inside an otherwise unprotected data store or in transmission over an unprotected network.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/wrapKey">SubtleCrypto.wrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-wrapKey">SubtleCrypto.wrapKey() - Web Cryptography API</a>
   */
  @Nonnull
  public native Promise<Any> wrapKey(@KeyFormat @Nonnull String format, @Nonnull CryptoKey key,
      @Nonnull CryptoKey wrappingKey, @Nonnull String wrapAlgorithm);
}
