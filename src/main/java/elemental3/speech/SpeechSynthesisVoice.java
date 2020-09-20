package elemental3.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SpeechSynthesisVoice interface of the Web Speech API represents a voice that the system supports. Every SpeechSynthesisVoice has its own relative speech service including information about language, name and URI.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisVoice">SpeechSynthesisVoice - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechSynthesisVoice {
  protected SpeechSynthesisVoice() {
  }

  /**
   * The default read-only property of the SpeechSynthesisVoice interface returns a Boolean indicating whether the voice is the default voice for the current app (true), or not (false.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisVoice/default">SpeechSynthesisVoice.default - MDN</a>
   */
  @JsProperty(
      name = "default"
  )
  public native boolean default_();

  /**
   * The lang read-only property of the SpeechSynthesisVoice interface returns a BCP 47 language tag indicating the language of the voice.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisVoice/lang">SpeechSynthesisVoice.lang - MDN</a>
   */
  @JsProperty(
      name = "lang"
  )
  @Nonnull
  public native String lang();

  /**
   * The localService read-only property of the SpeechSynthesisVoice interface returns a Boolean indicating whether the voice is supplied by a local speech synthesizer service (true), or a remote speech synthesizer service (false.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisVoice/localService">SpeechSynthesisVoice.localService - MDN</a>
   */
  @JsProperty(
      name = "localService"
  )
  public native boolean localService();

  /**
   * The name read-only property of the SpeechSynthesisVoice interface returns a human-readable name that represents the voice.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisVoice/name">SpeechSynthesisVoice.name - MDN</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The voiceURI read-only property of the SpeechSynthesisVoice interface returns the type of URI and location of the speech synthesis service for this voice.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisVoice/voiceURI">SpeechSynthesisVoice.voiceURI - MDN</a>
   */
  @JsProperty(
      name = "voiceURI"
  )
  @Nonnull
  public native String voiceURI();
}
