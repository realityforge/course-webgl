package elemental3;

import elemental3.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaKeyMessageEvent interface of the EncryptedMediaExtensions API contains the content and related data when the content decryption module generates a message for the session.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyMessageEvent">MediaKeyMessageEvent - MDN</a>
 * @see <a href="https://w3c.github.io/encrypted-media/#mediakeymessageevent">The definition of 'MediaKeyMessageEvent' in the 'Encrypted Media Extensions' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaKeyMessageEvent"
)
public class MediaKeyMessageEvent extends Event {
  /**
   * The MediaKeyMessageEvent constructor creates a new MediaKeyMessageEvent object which creates a new instance of MediaKeyMessageEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyMessageEvent/MediaKeyMessageEvent">MediaKeyMessageEvent.MediaKeyMessageEvent - MDN</a>
   */
  public MediaKeyMessageEvent(@Nonnull final String type,
      @Nonnull final MediaKeyMessageEventInit eventInitDict) {
    super( null );
  }

  /**
   * The MediaKeyMessageEvent.message read-only property returns an ArrayBuffer with a message from the content decryption module. Messages vary by key system.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyMessageEvent/message">MediaKeyMessageEvent.message - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeymessageevent-message">The definition of 'message' in the 'Encrypted Media Extensions' specification.</a>
   */
  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native ArrayBuffer message();

  /**
   * The MediaKeyMessageEvent.messageType read-only property indicates the type of message. It may be one of license-request, license-renewal, license-release, or individualization-request.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyMessageEvent/messageType">MediaKeyMessageEvent.messageType - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeymessageevent-messagetype">The definition of 'messageType' in the 'Encrypted Media Extensions' specification.</a>
   */
  @JsProperty(
      name = "messageType"
  )
  @Nonnull
  @MediaKeyMessageType
  public native String messageType();
}
