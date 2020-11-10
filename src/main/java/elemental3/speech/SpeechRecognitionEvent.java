package elemental3.speech;

import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechRecognitionEvent interface of the Web Speech API represents the event object for the result and nomatch events, and contains all the data associated with an interim or final speech recognition result.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionEvent">SpeechRecognitionEvent - MDN</a>
 * @see <a href="https://wicg.github.io/speech-api/#speechreco-event">The definition of 'SpeechRecognitionEvent' in the 'Web Speech API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechRecognitionEvent extends Event {
  public SpeechRecognitionEvent(@Nonnull final String type,
      @Nonnull final SpeechRecognitionEventInit eventInitDict) {
    super( null );
  }

  /**
   * The resultIndex read-only property of the SpeechRecognitionEvent interface returns the lowest index value result in the SpeechRecognitionResultList &quot;array&quot; that has actually changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionEvent/resultIndex">SpeechRecognitionEvent.resultIndex - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognitionevent-resultindex">The definition of 'resultIndex' in the 'Web Speech API' specification.</a>
   */
  @JsProperty(
      name = "resultIndex"
  )
  public native int resultIndex();

  /**
   * The results read-only property of the SpeechRecognitionEvent interface returns a SpeechRecognitionResultList object representing all the speech recognition results for the current session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionEvent/results">SpeechRecognitionEvent.results - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognitionevent-results">The definition of 'results' in the 'Web Speech API' specification.</a>
   */
  @JsProperty(
      name = "results"
  )
  @Nonnull
  public native SpeechRecognitionResultList results();
}
