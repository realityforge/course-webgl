package elemental3;

import elemental2.core.ArrayBuffer;
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
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The MediaKeys interface of EncryptedMediaExtensions API represents a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys">MediaKeys - MDN</a>
 * @see <a href="https://w3c.github.io/encrypted-media/#mediakeys-interface">The definition of 'MediaKeys' in the 'Encrypted Media Extensions' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaKeys"
)
public class MediaKeys {
  protected MediaKeys() {
  }

  /**
   * The MediaKeys.createSession() method returns a new MediaKeySession object, which represents a context for message exchange with a content decryption module (CDM).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/createSession">MediaKeys.createSession - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-createsession">The definition of 'createSession()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native MediaKeySession createSession(@MediaKeySessionType @Nonnull String sessionType);

  /**
   * The MediaKeys.createSession() method returns a new MediaKeySession object, which represents a context for message exchange with a content decryption module (CDM).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/createSession">MediaKeys.createSession - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-createsession">The definition of 'createSession()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native MediaKeySession createSession();

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull BufferSource serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull ArrayBufferView serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Int8Array serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Int16Array serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Int32Array serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Uint8Array serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Uint16Array serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Uint32Array serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Uint8ClampedArray serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Float32Array serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull Float64Array serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull DataView serverCertificate);

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">The definition of 'setServerCertificate()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull ArrayBuffer serverCertificate);
}
