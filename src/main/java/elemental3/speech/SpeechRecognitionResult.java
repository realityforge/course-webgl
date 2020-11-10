package elemental3.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechRecognitionResult interface of the Web Speech API represents a single recognition match, which may contain multiple SpeechRecognitionAlternative objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResult">SpeechRecognitionResult - MDN</a>
 * @see <a href="https://wicg.github.io/speech-api/#speechreco-result">The definition of 'SpeechRecognitionResult' in the 'Web Speech API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechRecognitionResult {
  protected SpeechRecognitionResult() {
  }

  /**
   * The isFinal read-only property of the SpeechRecognitionResult interface is a Boolean that states whether this result is final (true) or not (false) &mdash; if so, then this is the final time this result will be returned; if not, then this result is an interim result, and may be updated later on.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResult/isFinal">SpeechRecognitionResult.isFinal - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognitionresult-isfinal">The definition of 'isFinal' in the 'Web Speech API' specification.</a>
   */
  @JsProperty(
      name = "isFinal"
  )
  public native boolean isFinal();

  /**
   * The length read-only property of the SpeechRecognitionResult interface returns the length of the &quot;array&quot; &mdash; the number of SpeechRecognitionAlternative objects contained in the result (also referred to as &quot;n-best alternatives&quot;.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResult/length">SpeechRecognitionResult.length - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognitionresult-length">The definition of 'length' in the 'Web Speech API' specification.</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The item getter of the SpeechRecognitionResult interface is a standard getter that allows SpeechRecognitionAlternative objects within the result to be accessed via array syntax.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognitionResult/item">SpeechRecognitionResult.item - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognitionresult-item">The definition of 'item()' in the 'Web Speech API' specification.</a>
   */
  @Nonnull
  public native SpeechRecognitionAlternative item(int index);
}
