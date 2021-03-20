package akasha.speech;

import akasha.AddEventListenerOptions;
import akasha.EventHandler;
import akasha.EventListener;
import akasha.EventListenerOptions;
import akasha.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The SpeechRecognition interface of the Web Speech API is the controller interface for the recognition service; this also handles the SpeechRecognitionEvent sent from the recognition service.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition">SpeechRecognition - MDN</a>
 * @see <a href="https://wicg.github.io/speech-api/#speechreco-section">SpeechRecognition - Web Speech API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class SpeechRecognition extends EventTarget {
  /**
   * The continuous property of the SpeechRecognition interface controls whether continuous results are returned for each recognition, or only a single result.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/continuous">SpeechRecognition.continuous - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-continuous">continuous - Web Speech API</a>
   */
  public boolean continuous;

  /**
   * The grammars property of the SpeechRecognition interface returns and sets a collection of SpeechGrammar objects that represent the grammars that will be understood by the current SpeechRecognition.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/grammars">SpeechRecognition.grammars - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-grammars">grammars - Web Speech API</a>
   */
  @Nonnull
  public SpeechGrammarList grammars;

  /**
   * The interimResults property of the SpeechRecognition interface controls whether interim results should be returned (true) or not (false.) Interim results are results that are not yet final (e.g. the SpeechRecognitionResult.isFinal property is false.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/interimResults">SpeechRecognition.interimResults - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-interimresults">interimResults - Web Speech API</a>
   */
  public boolean interimResults;

  /**
   * The lang property of the SpeechRecognition interface returns and sets the language of the current SpeechRecognition. If not specified, this defaults to the HTML lang attribute value, or the user agent's language setting if that isn't set either.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/lang">SpeechRecognition.lang - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-lang">lang - Web Speech API</a>
   */
  @Nonnull
  public String lang;

  /**
   * The maxAlternatives property of the SpeechRecognition interface sets the maximum number of SpeechRecognitionAlternatives provided per SpeechRecognitionResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/maxAlternatives">SpeechRecognition.maxAlternatives - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-maxalternatives">maxAlternatives - Web Speech API</a>
   */
  public int maxAlternatives;

  /**
   * The onaudioend property of the SpeechRecognition interface represents an event handler that will run when the user agent has finished capturing audio (when the audioend event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onaudioend">SpeechRecognition.onaudioend - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onaudioend">onaudioend - Web Speech API</a>
   */
  @Nullable
  public EventHandler onaudioend;

  /**
   * The onaudiostart property of the SpeechRecognition interface represents an event handler that will run when the user agent has started to capture audio (when the audiostart event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onaudiostart">SpeechRecognition.onaudiostart - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onaudiostart">onaudiostart - Web Speech API</a>
   */
  @Nullable
  public EventHandler onaudiostart;

  /**
   * The onend property of the SpeechRecognition interface represents an event handler that will run when the speech recognition service has disconnected (when the end event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onend">SpeechRecognition.onend - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onend">onend - Web Speech API</a>
   */
  @Nullable
  public EventHandler onend;

  /**
   * The onerror property of the SpeechRecognition interface represents an event handler that will run when a speech recognition error occurs (when the error event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onerror">SpeechRecognition.onerror - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onerror">onerror - Web Speech API</a>
   */
  @Nullable
  public SpeechRecognitionErrorEventHandler onerror;

  /**
   * The onnomatch property of the SpeechRecognition interface represents an event handler that will run when the speech recognition service returns a final result with no significant recognition (when the nomatch event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onnomatch">SpeechRecognition.onnomatch - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onnomatch">onnomatch - Web Speech API</a>
   */
  @Nullable
  public SpeechRecognitionEventHandler onnomatch;

  /**
   * The onresult property of the SpeechRecognition interface represents an event handler that will run when the speech recognition service returns a result &mdash; a word or phrase has been positively recognized and this has been communicated back to the app (when the result event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onresult">SpeechRecognition.onresult - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onresult">onresult - Web Speech API</a>
   */
  @Nullable
  public SpeechRecognitionEventHandler onresult;

  /**
   * The onsoundend property of the SpeechRecognition interface represents an event handler that will run when any sound &mdash; recognisable speech or not &mdash; has stopped being detected (when the soundend event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onsoundend">SpeechRecognition.onsoundend - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onsoundend">onsoundend - Web Speech API</a>
   */
  @Nullable
  public EventHandler onsoundend;

  /**
   * The onsoundstart property of the SpeechRecognition interface represents an event handler that will run when any sound &mdash; recognisable speech or not &mdash; has been detected (when the soundstart event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onsoundstart">SpeechRecognition.onsoundstart - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onsoundstart">onsoundstart - Web Speech API</a>
   */
  @Nullable
  public EventHandler onsoundstart;

  /**
   * The onspeechend property of the SpeechRecognition interface represents an event handler that will run when speech recognised by the speech recognition service has stopped being detected (when the speechend event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onspeechend">SpeechRecognition.onspeechend - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onspeechend">onspeechend - Web Speech API</a>
   */
  @Nullable
  public EventHandler onspeechend;

  /**
   * The onspeechstart property of the SpeechRecognition interface represents an event handler that will run when sound recognised by the speech recognition service as speech has been detected (when the speechstart event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onspeechstart">SpeechRecognition.onspeechstart - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onspeechstart">onspeechstart - Web Speech API</a>
   */
  @Nullable
  public EventHandler onspeechstart;

  /**
   * The onstart property of the SpeechRecognition interface represents an event handler that will run when the speech recognition service has begun listening to incoming audio with intent to recognize grammars associated with the current SpeechRecognition (when the start event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/onstart">SpeechRecognition.onstart - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-onstart">onstart - Web Speech API</a>
   */
  @Nullable
  public EventHandler onstart;

  /**
   * The SpeechRecognition() constructor creates a new SpeechRecognition object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/SpeechRecognition">SpeechRecognition.SpeechRecognition - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-speechrecognition">SpeechRecognition() - Web Speech API</a>
   */
  public SpeechRecognition() {
  }

  /**
   * The abort() method of the Web Speech API stops the speech recognition service from listening to incoming audio, and doesn't attempt to return a SpeechRecognitionResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/abort">SpeechRecognition.abort - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-abort">abort() - Web Speech API</a>
   */
  public native void abort();

  /**
   * The start() method of the Web Speech API starts the speech recognition service listening to incoming audio with intent to recognize grammars associated with the current SpeechRecognition.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/start">SpeechRecognition.start - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-start">start() - Web Speech API</a>
   */
  public native void start();

  /**
   * The stop() method of the Web Speech API stops the speech recognition service from listening to incoming audio, and attempts to return a SpeechRecognitionResult using the audio captured so far.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechRecognition/stop">SpeechRecognition.stop - MDN</a>
   * @see <a href="https://wicg.github.io/speech-api/#dom-speechrecognition-stop">stop() - Web Speech API</a>
   */
  public native void stop();

  @JsOverlay
  public final void addErrorListener(@Nonnull final SpeechRecognitionErrorEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final SpeechRecognitionErrorEventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final SpeechRecognitionErrorEventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final SpeechRecognitionErrorEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final SpeechRecognitionErrorEventListener callback,
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeErrorListener(
      @Nonnull final SpeechRecognitionErrorEventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addNomatchListener(@Nonnull final SpeechRecognitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "nomatch", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addNomatchListener(@Nonnull final SpeechRecognitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "nomatch", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addNomatchListener(@Nonnull final SpeechRecognitionEventListener callback) {
    addEventListener( "nomatch", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeNomatchListener(@Nonnull final SpeechRecognitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "nomatch", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeNomatchListener(@Nonnull final SpeechRecognitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "nomatch", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeNomatchListener(@Nonnull final SpeechRecognitionEventListener callback) {
    removeEventListener( "nomatch", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addResultListener(@Nonnull final SpeechRecognitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "result", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addResultListener(@Nonnull final SpeechRecognitionEventListener callback,
      final boolean useCapture) {
    addEventListener( "result", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addResultListener(@Nonnull final SpeechRecognitionEventListener callback) {
    addEventListener( "result", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeResultListener(@Nonnull final SpeechRecognitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "result", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeResultListener(@Nonnull final SpeechRecognitionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "result", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeResultListener(@Nonnull final SpeechRecognitionEventListener callback) {
    removeEventListener( "result", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAudioendListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "audioend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAudioendListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "audioend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAudioendListener(@Nonnull final EventListener callback) {
    addEventListener( "audioend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAudioendListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "audioend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAudioendListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "audioend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAudioendListener(@Nonnull final EventListener callback) {
    removeEventListener( "audioend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAudiostartListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "audiostart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAudiostartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "audiostart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAudiostartListener(@Nonnull final EventListener callback) {
    addEventListener( "audiostart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAudiostartListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "audiostart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAudiostartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "audiostart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAudiostartListener(@Nonnull final EventListener callback) {
    removeEventListener( "audiostart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addEndListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "end", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addEndListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "end", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addEndListener(@Nonnull final EventListener callback) {
    addEventListener( "end", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeEndListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "end", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeEndListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "end", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeEndListener(@Nonnull final EventListener callback) {
    removeEventListener( "end", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSoundendListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "soundend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSoundendListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "soundend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSoundendListener(@Nonnull final EventListener callback) {
    addEventListener( "soundend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSoundendListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "soundend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSoundendListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "soundend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSoundendListener(@Nonnull final EventListener callback) {
    removeEventListener( "soundend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSoundstartListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "soundstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSoundstartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "soundstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSoundstartListener(@Nonnull final EventListener callback) {
    addEventListener( "soundstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSoundstartListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "soundstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSoundstartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "soundstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSoundstartListener(@Nonnull final EventListener callback) {
    removeEventListener( "soundstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSpeechendListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "speechend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSpeechendListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "speechend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSpeechendListener(@Nonnull final EventListener callback) {
    addEventListener( "speechend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSpeechendListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "speechend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSpeechendListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "speechend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSpeechendListener(@Nonnull final EventListener callback) {
    removeEventListener( "speechend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSpeechstartListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "speechstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSpeechstartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "speechstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSpeechstartListener(@Nonnull final EventListener callback) {
    addEventListener( "speechstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSpeechstartListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "speechstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSpeechstartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "speechstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSpeechstartListener(@Nonnull final EventListener callback) {
    removeEventListener( "speechstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addStartListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "start", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "start", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addStartListener(@Nonnull final EventListener callback) {
    addEventListener( "start", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeStartListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "start", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "start", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeStartListener(@Nonnull final EventListener callback) {
    removeEventListener( "start", Js.cast( callback ) );
  }
}
