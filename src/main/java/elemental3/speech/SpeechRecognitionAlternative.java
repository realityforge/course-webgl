package elemental3.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechRecognitionAlternative interface of the Web Speech API represents a single word that has been recognised by the speech recognition service.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionAlternative">SpeechRecognitionAlternative - MDN</a>
 * @see <a href="https://wicg.github.io/speech-api/#speechreco-alternative">The definition of 'SpeechRecognitionAlternative' in the 'Web Speech API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechRecognitionAlternative {
  protected SpeechRecognitionAlternative() {
  }

  /**
   * The confidence read-only property of the SpeechRecognitionResult interface returns a numeric estimate of how confident the speech recognition system is that the recognition is correct.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionAlternative/confidence">SpeechRecognitionAlternative.confidence - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognitionalternative-confidence">The definition of 'confidence' in the 'Web Speech API' specification.</a>
   */
  @JsProperty(
      name = "confidence"
  )
  public native float confidence();

  /**
   * The transcript read-only property of the SpeechRecognitionResult interface returns a string containing the transcript of the recognised word(s).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionAlternative/transcript">SpeechRecognitionAlternative.transcript - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognitionalternative-transcript">The definition of 'transcript' in the 'Web Speech API' specification.</a>
   */
  @JsProperty(
      name = "transcript"
  )
  @Nonnull
  public native String transcript();
}
