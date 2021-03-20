package akasha;

import akasha.core.BufferSource;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The MediaKeys interface of EncryptedMediaExtensions API represents a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys">MediaKeys - MDN</a>
 * @see <a href="https://w3c.github.io/encrypted-media/#mediakeys-interface">MediaKeys - Encrypted Media Extensions</a>
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
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-createsession">createSession() - Encrypted Media Extensions</a>
   */
  @Nonnull
  public native MediaKeySession createSession(@MediaKeySessionType @Nonnull String sessionType);

  /**
   * The MediaKeys.createSession() method returns a new MediaKeySession object, which represents a context for message exchange with a content decryption module (CDM).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/createSession">MediaKeys.createSession - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-createsession">createSession() - Encrypted Media Extensions</a>
   */
  @Nonnull
  public native MediaKeySession createSession();

  /**
   * The MediaKeys.setServerCertificate() method provides a server certificate to be used to encrypt messages to the license server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeys/setServerCertificate">MediaKeys.setServerCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeys-setservercertificate">setServerCertificate() - Encrypted Media Extensions</a>
   */
  @Nonnull
  public native Promise<Boolean> setServerCertificate(@Nonnull BufferSource serverCertificate);
}
