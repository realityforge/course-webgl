package elemental3.audio;

import elemental3.AddEventListenerOptions;
import elemental3.EventListenerOptions;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The ScriptProcessorNode interface allows the generation, processing, or analyzing of audio using JavaScript.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScriptProcessorNode">ScriptProcessorNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#the-scriptprocessornode-interface---deprecated">The definition of 'ScriptProcessorNode' in the 'Web Audio API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ScriptProcessorNode"
)
public class ScriptProcessorNode extends AudioNode {
  /**
   * The following example shows basic usage of a ScriptProcessorNode to take a track loaded via AudioContext.decodeAudioData(), process it, adding a bit of white noise to each audio sample of the input track (buffer) and play it through the AudioDestinationNode. For each channel and each sample frame, the scriptNode.onaudioprocess function takes the associated audioProcessingEvent and uses it to loop through each channel of the input buffer, and each sample in each channel, and add a small amount of white noise, before setting that result to be the output sample in each case.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScriptProcessorNode/onaudioprocess">ScriptProcessorNode.onaudioprocess - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#widl-ScriptProcessorNode-onaudioprocess">The definition of 'onaudioprocess' in the 'Web Audio API' specification.</a>
   */
  @Nullable
  public AudioProcessingEventHandler onaudioprocess;

  protected ScriptProcessorNode() {
  }

  /**
   * The following example shows basic usage of a ScriptProcessorNode to take a track loaded via AudioContext.decodeAudioData(), process it, adding a bit of white noise to each audio sample of the input track (buffer) and play it through the AudioDestinationNode. For each channel and each sample frame, the scriptNode.onaudioprocess function takes the associated audioProcessingEvent and uses it to loop through each channel of the input buffer, and each sample in each channel, and add a small amount of white noise, before setting that result to be the output sample in each case.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScriptProcessorNode/bufferSize">ScriptProcessorNode.bufferSize - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#widl-ScriptProcessorNode-bufferSize">The definition of 'bufferSize' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "bufferSize"
  )
  public native int bufferSize();

  @JsOverlay
  public final void addAudioprocessListener(@Nonnull final AudioProcessingEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "audioprocess", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAudioprocessListener(@Nonnull final AudioProcessingEventListener callback,
      final boolean useCapture) {
    addEventListener( "audioprocess", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAudioprocessListener(@Nonnull final AudioProcessingEventListener callback) {
    addEventListener( "audioprocess", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAudioprocessListener(@Nonnull final AudioProcessingEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "audioprocess", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAudioprocessListener(@Nonnull final AudioProcessingEventListener callback,
      final boolean useCapture) {
    removeEventListener( "audioprocess", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAudioprocessListener(
      @Nonnull final AudioProcessingEventListener callback) {
    removeEventListener( "audioprocess", Js.cast( callback ) );
  }
}
