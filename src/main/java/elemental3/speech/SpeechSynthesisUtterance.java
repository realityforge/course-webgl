package elemental3.speech;

import elemental3.AddEventListenerOptions;
import elemental3.EventListenerOptions;
import elemental3.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The SpeechSynthesisUtterance interface of the Web Speech API represents a speech request. It contains the content the speech service should read and information about how to read it (e.g. language, pitch and volume.)
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance">SpeechSynthesisUtterance - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SpeechSynthesisUtterance"
)
public class SpeechSynthesisUtterance extends EventTarget {
  /**
   * The lang property of the SpeechSynthesisUtterance interface gets and sets the language of the utterance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/lang">SpeechSynthesisUtterance.lang - MDN</a>
   */
  @Nonnull
  public String lang;

  /**
   * The onboundary property of the SpeechSynthesisUtterance interface represents an event handler that will run when the spoken utterance reaches a word or sentence boundary (when the boundary event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/onboundary">SpeechSynthesisUtterance.onboundary - MDN</a>
   */
  @Nullable
  public SpeechSynthesisEventHandler onboundary;

  /**
   * The onend property of the SpeechSynthesisUtterance interface represents an event handler that will run when the utterance has finished being spoken (when the end event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/onend">SpeechSynthesisUtterance.onend - MDN</a>
   */
  @Nullable
  public SpeechSynthesisEventHandler onend;

  /**
   * The onerror property of the SpeechSynthesisUtterance interface represents an event handler that will run when an error occurs that prevents the utterance from being succesfully spoken (when the error event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/onerror">SpeechSynthesisUtterance.onerror - MDN</a>
   */
  @Nullable
  public SpeechSynthesisErrorEventHandler onerror;

  /**
   * The onmark property of the SpeechSynthesisUtterance interface represents an event handler that will run when the spoken utterance reaches a named SSML mark tag (when the mark event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/onmark">SpeechSynthesisUtterance.onmark - MDN</a>
   */
  @Nullable
  public SpeechSynthesisEventHandler onmark;

  /**
   * The onpause property of the SpeechSynthesisUtterance interface represents an event handler that will run when the utterance is paused part way through (when the pause event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/onpause">SpeechSynthesisUtterance.onpause - MDN</a>
   */
  @Nullable
  public SpeechSynthesisEventHandler onpause;

  /**
   * The onresume property of the SpeechSynthesisUtterance interface represents an event handler that will run when a paused utterance is resumed (when the resume event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/onresume">SpeechSynthesisUtterance.onresume - MDN</a>
   */
  @Nullable
  public SpeechSynthesisEventHandler onresume;

  /**
   * The onstart property of the SpeechSynthesisUtterance interface represents an event handler that will run when the utterance has begun to be spoken (when the start event fires.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/onstart">SpeechSynthesisUtterance.onstart - MDN</a>
   */
  @Nullable
  public SpeechSynthesisEventHandler onstart;

  /**
   * The pitch property of the SpeechSynthesisUtterance interface gets and sets the pitch at which the utterance will be spoken at.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/pitch">SpeechSynthesisUtterance.pitch - MDN</a>
   */
  public float pitch;

  /**
   * The rate property of the SpeechSynthesisUtterance interface gets and sets the speed at which the utterance will be spoken at.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/rate">SpeechSynthesisUtterance.rate - MDN</a>
   */
  public float rate;

  /**
   * The text property of the SpeechSynthesisUtterance interface gets and sets the text that will be synthesised when the utterance is spoken.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/text">SpeechSynthesisUtterance.text - MDN</a>
   */
  @Nonnull
  public String text;

  /**
   * The voice property of the SpeechSynthesisUtterance interface gets and sets the voice that will be used to speak the utterance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/voice">SpeechSynthesisUtterance.voice - MDN</a>
   */
  @Nullable
  public SpeechSynthesisVoice voice;

  /**
   * The volume property of the SpeechSynthesisUtterance interface gets and sets the volume that the utterance will be spoken at.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/volume">SpeechSynthesisUtterance.volume - MDN</a>
   */
  public float volume;

  /**
   * The SpeechSynthesisUtterance() constructor of the SpeechSynthesisUtterance interface returns a new SpeechSynthesisUtterance object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/SpeechSynthesisUtterance">SpeechSynthesisUtterance.SpeechSynthesisUtterance - MDN</a>
   */
  public SpeechSynthesisUtterance(@Nonnull final String text) {
  }

  /**
   * The SpeechSynthesisUtterance() constructor of the SpeechSynthesisUtterance interface returns a new SpeechSynthesisUtterance object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesisUtterance/SpeechSynthesisUtterance">SpeechSynthesisUtterance.SpeechSynthesisUtterance - MDN</a>
   */
  public SpeechSynthesisUtterance() {
  }

  @JsOverlay
  public final void addBoundaryListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "boundary", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBoundaryListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    addEventListener( "boundary", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBoundaryListener(@Nonnull final SpeechSynthesisEventListener callback) {
    addEventListener( "boundary", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBoundaryListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "boundary", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBoundaryListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    removeEventListener( "boundary", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBoundaryListener(@Nonnull final SpeechSynthesisEventListener callback) {
    removeEventListener( "boundary", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addEndListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "end", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addEndListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    addEventListener( "end", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addEndListener(@Nonnull final SpeechSynthesisEventListener callback) {
    addEventListener( "end", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeEndListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "end", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeEndListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    removeEventListener( "end", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeEndListener(@Nonnull final SpeechSynthesisEventListener callback) {
    removeEventListener( "end", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final SpeechSynthesisErrorEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final SpeechSynthesisErrorEventListener callback,
      final boolean options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final SpeechSynthesisErrorEventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final SpeechSynthesisErrorEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final SpeechSynthesisErrorEventListener callback,
      final boolean options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final SpeechSynthesisErrorEventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMarkListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "mark", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMarkListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    addEventListener( "mark", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMarkListener(@Nonnull final SpeechSynthesisEventListener callback) {
    addEventListener( "mark", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMarkListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "mark", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMarkListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    removeEventListener( "mark", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMarkListener(@Nonnull final SpeechSynthesisEventListener callback) {
    removeEventListener( "mark", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPauseListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pause", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPauseListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    addEventListener( "pause", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPauseListener(@Nonnull final SpeechSynthesisEventListener callback) {
    addEventListener( "pause", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePauseListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pause", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePauseListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    removeEventListener( "pause", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePauseListener(@Nonnull final SpeechSynthesisEventListener callback) {
    removeEventListener( "pause", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addResumeListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "resume", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addResumeListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    addEventListener( "resume", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addResumeListener(@Nonnull final SpeechSynthesisEventListener callback) {
    addEventListener( "resume", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeResumeListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "resume", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeResumeListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    removeEventListener( "resume", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeResumeListener(@Nonnull final SpeechSynthesisEventListener callback) {
    removeEventListener( "resume", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addStartListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "start", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStartListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    addEventListener( "start", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStartListener(@Nonnull final SpeechSynthesisEventListener callback) {
    addEventListener( "start", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeStartListener(@Nonnull final SpeechSynthesisEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "start", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStartListener(@Nonnull final SpeechSynthesisEventListener callback,
      final boolean options) {
    removeEventListener( "start", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStartListener(@Nonnull final SpeechSynthesisEventListener callback) {
    removeEventListener( "start", Js.cast( callback ) );
  }
}
