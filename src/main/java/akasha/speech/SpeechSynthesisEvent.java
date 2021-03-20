package akasha.speech;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechSynthesisEvent interface of the Web Speech API contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisEvent">SpeechSynthesisEvent - MDN</a>
 * @see <a href="https://wicg.github.io/speech-api/#speechsynthesisevent">SpeechSynthesisEvent - Web Speech API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SpeechSynthesisEvent"
)
public class SpeechSynthesisEvent extends Event {
  public SpeechSynthesisEvent(@Nonnull final String type,
      @Nonnull final SpeechSynthesisEventInit eventInitDict) {
    super( null );
  }

  /**
   * The charIndex read-only property of the SpeechSynthesisUtterance interface returns the index position of the character in the SpeechSynthesisUtterance.text that was being spoken when the event was triggered.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisEvent/charIndex">SpeechSynthesisEvent.charIndex - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechsynthesisevent-charindex">charIndex - Web Speech API</a>
   */
  @JsProperty(
      name = "charIndex"
  )
  public native int charIndex();

  @JsProperty(
      name = "charLength"
  )
  public native int charLength();

  /**
   * The elapsedTime read-only property of the SpeechSynthesisUtterance interface returns the elapsed time in seconds after the SpeechSynthesisUtterance.text started being spoken that the event was triggered at.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisEvent/elapsedTime">SpeechSynthesisEvent.elapsedTime - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechsynthesisevent-elapsedtime">elapsedTime - Web Speech API</a>
   */
  @JsProperty(
      name = "elapsedTime"
  )
  public native float elapsedTime();

  /**
   * The name read-only property of the SpeechSynthesisUtterance interface returns the name associated with certain types of events occuring as the SpeechSynthesisUtterance.text is being spoken: the name of the SSML marker reached in the case of a mark event, or the type of boundary reached in the case of a boundary event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisEvent/name">SpeechSynthesisEvent.name - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechsynthesisevent-name">name - Web Speech API</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The utterance read-only property of the SpeechSynthesisUtterance interface returns the SpeechSynthesisUtterance instance that the event was triggered on.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisEvent/utterance">SpeechSynthesisEvent.utterance - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechsynthesisevent-utterance">utterance - Web Speech API</a>
   */
  @JsProperty(
      name = "utterance"
  )
  @Nonnull
  public native SpeechSynthesisUtterance utterance();
}
