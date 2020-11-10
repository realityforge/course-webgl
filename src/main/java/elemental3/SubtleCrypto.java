package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The SubtleCrypto interface of the Web Crypto API provides a number of low-level cryptographic functions. Access to the features of SubtleCrypto is obtained through the subtle property of the Crypto object you get from Window.crypto.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto">SubtleCrypto - MDN</a>
 * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#subtlecrypto-interface">The definition of 'SubtleCrypto' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  /**
   * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to decrypt with, some optional extra parameters, and the data to decrypt (also known as &quot;ciphertext&quot;). It returns a Promise which will be fulfilled with the decrypted data (also known as &quot;plaintext&quot;).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/decrypt">SubtleCrypto.decrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-decrypt">The definition of 'SubtleCrypto.decrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> decrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  /**
   * The deriveBits() method of the SubtleCrypto interface can be used to derive an array of bits from a base key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveBits">SubtleCrypto.deriveBits - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveBits">The definition of 'SubtleCrypto.deriveBits()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<ArrayBuffer> deriveBits(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, int length);

  /**
   * The deriveBits() method of the SubtleCrypto interface can be used to derive an array of bits from a base key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveBits">SubtleCrypto.deriveBits - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveBits">The definition of 'SubtleCrypto.deriveBits()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<ArrayBuffer> deriveBits(@Nonnull Object algorithm,
      @Nonnull CryptoKey baseKey, int length);

  /**
   * The deriveBits() method of the SubtleCrypto interface can be used to derive an array of bits from a base key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveBits">SubtleCrypto.deriveBits - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveBits">The definition of 'SubtleCrypto.deriveBits()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<ArrayBuffer> deriveBits(@Nonnull String algorithm,
      @Nonnull CryptoKey baseKey, int length);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull Object derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull String derivedKeyType, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull AlgorithmIdentifier derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull Object derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull Object derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull CryptoKey baseKey, @Nonnull String derivedKeyType, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull Object algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/deriveKey">SubtleCrypto.deriveKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-deriveKey">The definition of 'SubtleCrypto.deriveKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> deriveKey(@Nonnull String algorithm, @Nonnull CryptoKey baseKey,
      @Nonnull String derivedKeyType, boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull BufferSource data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull BufferSource data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull BufferSource data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull ArrayBufferView data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull ArrayBufferView data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull ArrayBufferView data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Int8Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Int8Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Int8Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Int16Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Int16Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Int16Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Int32Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Int32Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Int32Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Uint8Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Uint8Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Uint8Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Uint16Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Uint16Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Uint16Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Uint32Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Uint32Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Uint32Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Uint8ClampedArray data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Uint8ClampedArray data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Uint8ClampedArray data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Float32Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Float32Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Float32Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull Float64Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull Float64Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull Float64Array data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm, @Nonnull DataView data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull DataView data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull DataView data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull AlgorithmIdentifier algorithm,
      @Nonnull ArrayBuffer data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull Object algorithm, @Nonnull ArrayBuffer data);

  /**
   * The digest() method of the SubtleCrypto interface generates a digest of the given data. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the same digest value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest">SubtleCrypto.digest - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-digest">The definition of 'SubtleCrypto.digest()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> digest(@Nonnull String algorithm, @Nonnull ArrayBuffer data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  /**
   * The encrypt() method of the SubtleCrypto interface encrypts data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/encrypt">SubtleCrypto.encrypt - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-encrypt">The definition of 'SubtleCrypto.encrypt()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> encrypt(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  /**
   * The exportKey() method of the SubtleCrypto interface exports a key: that is, it takes as input a CryptoKey object and gives you the key in an external, portable format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/exportKey">SubtleCrypto.exportKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-exportKey">The definition of 'SubtleCrypto.exportKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> exportKey(@KeyFormat @Nonnull String format, @Nonnull CryptoKey key);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">The definition of 'SubtleCrypto.generateKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull AlgorithmIdentifier algorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">The definition of 'SubtleCrypto.generateKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">The definition of 'SubtleCrypto.generateKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">The definition of 'SubtleCrypto.generateKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull AlgorithmIdentifier algorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">The definition of 'SubtleCrypto.generateKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * Use the generateKey() method of the SubtleCrypto interface to generate a new key (for symmetric algorithms) or key pair (for public-key algorithms).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/generateKey">SubtleCrypto.generateKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-generateKey">The definition of 'SubtleCrypto.generateKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> generateKey(@Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull AlgorithmIdentifier algorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull AlgorithmIdentifier algorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull AlgorithmIdentifier algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull Object algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/importKey">SubtleCrypto.importKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-importKey">The definition of 'SubtleCrypto.importKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> importKey(@KeyFormat @Nonnull String format,
      @Nonnull JsonWebKey keyData, @Nonnull String algorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  /**
   * The sign() method of the SubtleCrypto interface generates a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/sign">SubtleCrypto.sign - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-sign">The definition of 'SubtleCrypto.sign()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> sign(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer data);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull JsArray<String> keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm,
      @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull AlgorithmIdentifier unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull Object unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull AlgorithmIdentifier unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm,
      boolean extractable, @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
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
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull Object unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull BufferSource wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBufferView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Int32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint16Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Uint8ClampedArray wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float32Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull Float64Array wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull DataView wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The unwrapKey() method of the SubtleCrypto interface &quot;unwraps&quot; a key. This means that it takes as its input a key that has been exported and then encrypted (also called &quot;wrapped&quot;). It decrypts the key and then imports it, returning a CryptoKey object that can be used in the Web Crypto API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/unwrapKey">SubtleCrypto.unwrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-unwrapKey">The definition of 'SubtleCrypto.unwrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<CryptoKey> unwrapKey(@KeyFormat @Nonnull String format,
      @Nonnull ArrayBuffer wrappedKey, @Nonnull CryptoKey unwrappingKey,
      @Nonnull String unwrapAlgorithm, @Nonnull String unwrappedKeyAlgorithm, boolean extractable,
      @Nonnull String[] keyUsages);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull BufferSource data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBufferView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Int32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint16Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Uint8ClampedArray data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float32Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull Float64Array data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull DataView data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull BufferSource signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBufferView signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int8Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int16Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Int32Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint16Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint32Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Uint8ClampedArray signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float32Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull Float64Array signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull DataView signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull AlgorithmIdentifier algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull Object algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBuffer data);

  /**
   * The verify() method of the SubtleCrypto interface verifies a digital signature.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/verify">SubtleCrypto.verify - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-verify">The definition of 'SubtleCrypto.verify()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> verify(@Nonnull String algorithm, @Nonnull CryptoKey key,
      @Nonnull ArrayBuffer signature, @Nonnull ArrayBuffer data);

  /**
   * The wrapKey() method of the SubtleCrypto interface &quot;wraps&quot; a key. This means that it exports the key in an external, portable format, then encrypts the exported key. Wrapping a key helps protect it in untrusted environments, such as inside an otherwise unprotected data store or in transmission over an unprotected network.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/wrapKey">SubtleCrypto.wrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-wrapKey">The definition of 'SubtleCrypto.wrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> wrapKey(@KeyFormat @Nonnull String format, @Nonnull CryptoKey key,
      @Nonnull CryptoKey wrappingKey, @Nonnull AlgorithmIdentifier wrapAlgorithm);

  /**
   * The wrapKey() method of the SubtleCrypto interface &quot;wraps&quot; a key. This means that it exports the key in an external, portable format, then encrypts the exported key. Wrapping a key helps protect it in untrusted environments, such as inside an otherwise unprotected data store or in transmission over an unprotected network.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/wrapKey">SubtleCrypto.wrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-wrapKey">The definition of 'SubtleCrypto.wrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> wrapKey(@KeyFormat @Nonnull String format, @Nonnull CryptoKey key,
      @Nonnull CryptoKey wrappingKey, @Nonnull Object wrapAlgorithm);

  /**
   * The wrapKey() method of the SubtleCrypto interface &quot;wraps&quot; a key. This means that it exports the key in an external, portable format, then encrypts the exported key. Wrapping a key helps protect it in untrusted environments, such as inside an otherwise unprotected data store or in transmission over an unprotected network.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/wrapKey">SubtleCrypto.wrapKey - MDN</a>
   * @see <a href="https://www.w3.org/TR/WebCryptoAPI/#dfn-SubtleCrypto-method-wrapKey">The definition of 'SubtleCrypto.wrapKey()' in the 'Web Cryptography API' specification.</a>
   */
  @Nonnull
  public native Promise<Any> wrapKey(@KeyFormat @Nonnull String format, @Nonnull CryptoKey key,
      @Nonnull CryptoKey wrappingKey, @Nonnull String wrapAlgorithm);
}
