package akasha.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The SpeechGrammar interface of the Web Speech API represents a set of words or patterns of words that we want the recognition service to recognize.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammar">SpeechGrammar - MDN</a>
 * @see <a href="https://wicg.github.io/speech-api/#speechreco-speechgrammar">SpeechGrammar - Web Speech API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechGrammar {
  /**
   * The src property of the SpeechGrammar interface sets and returns a string containing the grammar from within in the SpeechGrammar object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammar/src">SpeechGrammar.src - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechgrammar-src">src - Web Speech API</a>
   */
  @Nonnull
  public String src;

  /**
   * The optional weight property of the SpeechGrammar interface sets and returns the weight of the SpeechGrammar object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammar/weight">SpeechGrammar.weight - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechgrammar-weight">weight - Web Speech API</a>
   */
  public float weight;

  protected SpeechGrammar() {
  }
}
