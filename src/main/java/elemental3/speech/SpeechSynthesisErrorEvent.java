package elemental3.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechSynthesisErrorEvent interface of the Web Speech API contains information about any errors that occur while processing SpeechSynthesisUtterance objects in the speech service.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisErrorEvent">SpeechSynthesisErrorEvent - MDN</a>
 * @see <a href="https://wicg.github.io/speech-api/#speechsynthesiserrorevent">SpeechSynthesisErrorEvent - Web Speech API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SpeechSynthesisErrorEvent"
)
public class SpeechSynthesisErrorEvent extends SpeechSynthesisEvent {
  public SpeechSynthesisErrorEvent(@Nonnull final String type,
      @Nonnull final SpeechSynthesisErrorEventInit eventInitDict) {
    super( null, null );
  }

  /**
   * The error property of the SpeechSynthesisErrorEvent interface returns an error code indicating what has gone wrong with a speech synthesis attempt.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisErrorEvent/error">SpeechSynthesisErrorEvent.error - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechsynthesiserrorevent-error">error - Web Speech API</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nonnull
  @SpeechSynthesisErrorCode
  public native String error();
}
