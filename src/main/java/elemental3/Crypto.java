package elemental3;

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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Crypto interface represents basic cryptography features available in the current context. It allows access to a cryptographically strong random number generator and to cryptographic primitives.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto">Crypto - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Crypto"
)
public class Crypto {
  Crypto() {
  }

  /**
   * The Crypto.subtle read-only property returns a SubtleCrypto which can then be used to perform low-level cryptographic operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/subtle">Crypto.subtle - MDN</a>
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

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Int8Array array);

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Int16Array array);

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Int32Array array);

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Uint8Array array);

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Uint16Array array);

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Uint32Array array);

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Uint8ClampedArray array);

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Float32Array array);

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull Float64Array array);

  /**
   * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the parameter is filled with random numbers (random in its cryptographic meaning).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Crypto/getRandomValues">Crypto.getRandomValues - MDN</a>
   */
  @Nonnull
  public native ArrayBufferView getRandomValues(@Nonnull DataView array);
}
