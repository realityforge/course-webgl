package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaKeySystemAccess interface of the EncryptedMediaExtensions API provides access to a Key System for decryption and/or a content protection provider. You can request an instance of this object using the Navigator.requestMediaKeySystemAccess() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemAccess">MediaKeySystemAccess - MDN</a>
 * @see <a href="https://w3c.github.io/encrypted-media/#mediakeysystemaccess-interface">The definition of 'MediaKeySystemAccess' in the 'Encrypted Media Extensions' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaKeySystemAccess"
)
public class MediaKeySystemAccess {
  protected MediaKeySystemAccess() {
  }

  /**
   * The MediaKeySystemAccess.keySystem read-only property returns a DOMString identifying the key system being used.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemAccess/keySystem">MediaKeySystemAccess.keySystem - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysystemaccess-keysystem">The definition of 'keySystem' in the 'Encrypted Media Extensions' specification.</a>
   */
  @JsProperty(
      name = "keySystem"
  )
  @Nonnull
  public native String keySystem();

  /**
   * The MediaKeySystemAccess.createMediaKeys() method returns a Promise that resolves to a new MediaKeys object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemAccess/createMediaKeys">MediaKeySystemAccess.createMediaKeys - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysystemaccess-createmediakeys">The definition of 'createMediaKeys()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native Promise<MediaKeys> createMediaKeys();

  /**
   * The MediaKeySystemAccess.getConfiguration() method returns a MediaKeySystemConfiguration object with the supported combination of configuration options.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySystemAccess/getConfiguration">MediaKeySystemAccess.getConfiguration - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysystemaccess-getconfiguration">The definition of 'getConfiguration()' in the 'Encrypted Media Extensions' specification.</a>
   */
  @Nonnull
  public native MediaKeySystemConfiguration getConfiguration();
}
