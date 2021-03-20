package akasha.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechGrammarList interface of the Web Speech API represents a list of SpeechGrammar objects containing words or patterns of words that we want the recognition service to recognize.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammarList">SpeechGrammarList - MDN</a>
 * @see <a href="https://wicg.github.io/speech-api/#dom-speechgrammarlist-speechgrammarlist">SpeechGrammarList() - Web Speech API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechGrammarList {
  /**
   * The SpeechGrammarList() constructor creates a new SpeechGrammarList object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammarList/SpeechGrammarList">SpeechGrammarList.SpeechGrammarList - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#speechreco-speechgrammarlist">SpeechGrammarList - Web Speech API</a>
   */
  public SpeechGrammarList() {
  }

  /**
   * The length read-only property of the SpeechGrammarList interface returns the number of SpeechGrammar objects contained in the SpeechGrammarList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammarList/length">SpeechGrammarList.length - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechgrammarlist-length">length - Web Speech API</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The addFromString() method of the SpeechGrammarList interface takes a grammar present in a specific DOMString within the code base (e.g. stored in a variable) and adds it to the SpeechGrammarList as a new SpeechGrammar object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammarList/addFromString">SpeechGrammarList.addFromString - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechgrammarlist-addfromstring">addFromString() - Web Speech API</a>
   */
  public native void addFromString(@Nonnull String string, float weight);

  /**
   * The addFromString() method of the SpeechGrammarList interface takes a grammar present in a specific DOMString within the code base (e.g. stored in a variable) and adds it to the SpeechGrammarList as a new SpeechGrammar object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammarList/addFromString">SpeechGrammarList.addFromString - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechgrammarlist-addfromstring">addFromString() - Web Speech API</a>
   */
  public native void addFromString(@Nonnull String string);

  /**
   * The addFromURI() method of the SpeechGrammarList interface takes a grammar present at a specific URI and adds it to the SpeechGrammarList as a new SpeechGrammar object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammarList/addFromURI">SpeechGrammarList.addFromURI - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechgrammarlist-addfromuri">addFromURI() - Web Speech API</a>
   */
  public native void addFromURI(@Nonnull String src, float weight);

  /**
   * The addFromURI() method of the SpeechGrammarList interface takes a grammar present at a specific URI and adds it to the SpeechGrammarList as a new SpeechGrammar object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammarList/addFromURI">SpeechGrammarList.addFromURI - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechgrammarlist-addfromuri">addFromURI() - Web Speech API</a>
   */
  public native void addFromURI(@Nonnull String src);

  /**
   * The item getter of the SpeechGrammarList interface is a standard getter &mdash; it allows individual SpeechGrammar objects to be retrieved from the SpeechGrammarList using array syntax.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechGrammarList/item">SpeechGrammarList.item - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechgrammarlist-item">item() - Web Speech API</a>
   */
  @Nonnull
  public native SpeechGrammar item(int index);
}
