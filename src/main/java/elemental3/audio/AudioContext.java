package elemental3.audio;

import elemental3.HTMLMediaElement;
import elemental3.media.MediaStream;
import elemental3.media.MediaStreamTrack;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioContext interface represents an audio-processing graph built from audio modules linked together, each represented by an AudioNode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext">AudioContext - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#AudioContext">The definition of 'AudioContext' in the 'Web Audio API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class AudioContext extends BaseAudioContext {
  /**
   * The AudioContext() constructor creates a new AudioContext object which represents an audio-processing graph, built from audio modules linked together, each represented by an AudioNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/AudioContext">AudioContext.AudioContext - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-audiocontext">The definition of 'AudioContext()' in the 'Web Audio API' specification.</a>
   */
  public AudioContext(@Nonnull final AudioContextOptions contextOptions) {
  }

  /**
   * The AudioContext() constructor creates a new AudioContext object which represents an audio-processing graph, built from audio modules linked together, each represented by an AudioNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/AudioContext">AudioContext.AudioContext - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-audiocontext">The definition of 'AudioContext()' in the 'Web Audio API' specification.</a>
   */
  public AudioContext() {
  }

  /**
   * The baseLatency read-only property of the AudioContext interface returns a double that represents the number of seconds of processing latency incurred by the AudioContext passing an audio buffer from the AudioDestinationNode &mdash; i.e. the end of the audio graph &mdash; into the host system's audio subsystem ready for playing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/baseLatency">AudioContext.baseLatency - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-baselatency">The definition of 'baseLatency' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "baseLatency"
  )
  public native double baseLatency();

  /**
   * The outputLatency read-only property of the AudioContext Interface provides an estimation of the output latency of the current audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/outputLatency">AudioContext.outputLatency - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-outputlatency">The definition of 'outputLatency' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "outputLatency"
  )
  public native double outputLatency();

  /**
   * The close() method of the AudioContext Interface closes the audio context, releasing any system audio resources that it uses.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/close">AudioContext.close - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-close">The definition of 'close()' in the 'Web Audio API' specification.</a>
   */
  @Nonnull
  public native Promise<Void> close();

  /**
   * For more details about media element audio source nodes, check out the MediaElementAudioSourceNode reference page.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/createMediaElementSource">AudioContext.createMediaElementSource - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-createmediaelementsource">The definition of 'createMediaElementSource()' in the 'Web Audio API' specification.</a>
   */
  @Nonnull
  public native MediaElementAudioSourceNode createMediaElementSource(
      @Nonnull HTMLMediaElement mediaElement);

  /**
   * The MediaStream is created when the node is created and is accessible via the MediaStreamAudioDestinationNode's stream attribute. This stream can be used in a similar way as a MediaStream obtained via navigator.getUserMedia &mdash; it can, for example, be sent to a remote peer using the RTCPeerConnection addStream() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/createMediaStreamDestination">AudioContext.createMediaStreamDestination - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-createmediastreamdestination">The definition of 'createMediaStreamDestination()' in the 'Web Audio API' specification.</a>
   */
  @Nonnull
  public native MediaStreamAudioDestinationNode createMediaStreamDestination();

  /**
   * For more details about media stream audio source nodes, check out the MediaStreamAudioSourceNode reference page.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/createMediaStreamSource">AudioContext.createMediaStreamSource - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-createmediastreamsource">The definition of 'AudioContext.createMediaStreamSource()' in the 'Web Audio API' specification.</a>
   */
  @Nonnull
  public native MediaStreamAudioSourceNode createMediaStreamSource(
      @Nonnull MediaStream mediaStream);

  /**
   * A MediaStreamTrackAudioSourceNode object which acts as a source for audio data found in the specified audio track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/createMediaStreamTrackSource">AudioContext.createMediaStreamTrackSource - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-createmediastreamtracksource">The definition of 'createMediaStreamTrackSource()' in the 'Web Audio API' specification.</a>
   */
  @Nonnull
  public native MediaStreamTrackAudioSourceNode createMediaStreamTrackSource(
      @Nonnull MediaStreamTrack mediaStreamTrack);

  /**
   * The getOutputTimestamp() property of the AudioContext interface returns a new AudioTimestamp object containing two audio timestamp values relating to the current audio context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/getOutputTimestamp">AudioContext.getOutputTimestamp - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-getoutputtimestamp">The definition of 'getOutputTimestamp()' in the 'Web Audio API' specification.</a>
   */
  @Nonnull
  public native AudioTimestamp getOutputTimestamp();

  /**
   * The resume() method of the AudioContext interface resumes the progression of time in an audio context that has previously been suspended.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/resume">AudioContext.resume - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-resume">The definition of 'resume()' in the 'Web Audio API' specification.</a>
   */
  @Nonnull
  public native Promise<Void> resume();

  /**
   * The suspend() method of the AudioContext Interface suspends the progression of time in the audio context, temporarily halting audio hardware access and reducing CPU/battery usage in the process &mdash; this is useful if you want an application to power down the audio hardware when it will not be using an audio context for a while.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/suspend">AudioContext.suspend - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiocontext-suspend">The definition of 'close()' in the 'Web Audio API' specification.</a>
   */
  @Nonnull
  public native Promise<Void> suspend();
}
