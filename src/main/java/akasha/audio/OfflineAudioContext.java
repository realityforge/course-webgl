package akasha.audio;

import akasha.AddEventListenerOptions;
import akasha.EventListenerOptions;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The OfflineAudioContext interface is an AudioContext interface representing an audio-processing graph built from linked together AudioNodes. In contrast with a standard AudioContext, an OfflineAudioContext doesn't render the audio to the device hardware; instead, it generates it, as fast as it can, and outputs the result to an AudioBuffer.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioContext">OfflineAudioContext - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#OfflineAudioContext">OfflineAudioContext - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class OfflineAudioContext extends BaseAudioContext {
  /**
   * When processing is complete, you might want to use the oncomplete handler the prompt the user that the audio can now be played, and enable the play button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioContext/oncomplete">OfflineAudioContext.oncomplete - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-offlineaudiocontext-oncomplete">oncomplete - Web Audio API</a>
   */
  @Nullable
  public OfflineAudioCompletionEventHandler oncomplete;

  /**
   * The OfflineAudioContext() constructor&mdash;part of the Web Audio API&mdash;creates and returns a new OfflineAudioContext object instance, which can then be used to render audio to an AudioBuffer rather than to an audio output device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioContext/OfflineAudioContext">OfflineAudioContext.OfflineAudioContext - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-offlineaudiocontext-offlineaudiocontext">OfflineAudioContext() - Web Audio API</a>
   */
  public OfflineAudioContext(@Nonnull final OfflineAudioContextOptions contextOptions) {
  }

  /**
   * The OfflineAudioContext() constructor&mdash;part of the Web Audio API&mdash;creates and returns a new OfflineAudioContext object instance, which can then be used to render audio to an AudioBuffer rather than to an audio output device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioContext/OfflineAudioContext">OfflineAudioContext.OfflineAudioContext - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-offlineaudiocontext-offlineaudiocontext">OfflineAudioContext() - Web Audio API</a>
   */
  public OfflineAudioContext(final int numberOfChannels, final int length, final float sampleRate) {
  }

  /**
   * The length property of the OfflineAudioContext interface returns an integer representing the size of the buffer in sample-frames.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioContext/length">OfflineAudioContext.length - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-offlineaudiocontext-length">length - Web Audio API</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The resume() method of the OfflineAudioContext interface resumes the progression of time in an audio context that has been suspended. The promise resolves immediately because the OfflineAudioContext does not require the audio hardware. If the context is not currently suspended or the rendering has not started, the promise is rejected with InvalidStateError.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioContext/resume">OfflineAudioContext.resume - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-offlineaudiocontext-resume">resume() - Web Audio API</a>
   */
  @Nonnull
  public native Promise<Void> resume();

  /**
   * The startRendering() method of the OfflineAudioContext Interface starts rendering the audio graph, taking into account the current connections and the current scheduled changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioContext/startRendering">OfflineAudioContext.startRendering - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-offlineaudiocontext-startrendering">startRendering() - Web Audio API</a>
   */
  @Nonnull
  public native Promise<AudioBuffer> startRendering();

  /**
   * The suspend() method of the OfflineAudioContext interface schedules a suspension of the time progression in the audio context at the specified time and returns a promise. This is generally useful at the time of manipulating the audio graph synchronously on OfflineAudioContext.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OfflineAudioContext/suspend">OfflineAudioContext.suspend - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-offlineaudiocontext-suspend">suspend() - Web Audio API</a>
   */
  @Nonnull
  public native Promise<Void> suspend(double suspendTime);

  @JsOverlay
  public final void addCompleteListener(@Nonnull final OfflineAudioCompletionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "complete", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCompleteListener(@Nonnull final OfflineAudioCompletionEventListener callback,
      final boolean useCapture) {
    addEventListener( "complete", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCompleteListener(
      @Nonnull final OfflineAudioCompletionEventListener callback) {
    addEventListener( "complete", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCompleteListener(
      @Nonnull final OfflineAudioCompletionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "complete", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCompleteListener(
      @Nonnull final OfflineAudioCompletionEventListener callback, final boolean useCapture) {
    removeEventListener( "complete", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCompleteListener(
      @Nonnull final OfflineAudioCompletionEventListener callback) {
    removeEventListener( "complete", Js.cast( callback ) );
  }
}
