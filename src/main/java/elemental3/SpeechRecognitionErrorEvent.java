package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechRecognitionErrorEvent interface of the Web Speech API represents error messages from the recognition service.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionErrorEvent">SpeechRecognitionErrorEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SpeechRecognitionErrorEvent"
)
public class SpeechRecognitionErrorEvent extends Event {
  public SpeechRecognitionErrorEvent(@Nonnull final String type,
      @Nonnull final SpeechRecognitionErrorEventInit eventInitDict) {
    super( null );
  }

  /**
   * The error read-only property of the SpeechRecognitionErrorEvent interface returns the type of error raised.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionErrorEvent/error">SpeechRecognitionErrorEvent.error - MDN</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nonnull
  public native String error();

  /**
   * The message read-only property of the SpeechRecognitionErrorEvent interface returns a message describing the error in more detail.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionErrorEvent/message">SpeechRecognitionErrorEvent.message - MDN</a>
   */
  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();
}
