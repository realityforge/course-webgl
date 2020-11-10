package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioBufferSourceNode interface is an AudioScheduledSourceNode which represents an audio source consisting of in-memory audio data, stored in an AudioBuffer. It's especially useful for playing back audio which has particularly stringent timing accuracy requirements, such as for sounds that must match a specific rhythm and can be kept in memory rather than being played from disk or the network.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode">AudioBufferSourceNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#AudioBufferSourceNode">The definition of 'AudioBufferSourceNode' in the 'Web Audio API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioBufferSourceNode"
)
public class AudioBufferSourceNode extends AudioScheduledSourceNode {
  /**
   * The buffer property of the AudioBufferSourceNode interface provides the ability to play back audio using an AudioBuffer as the source of the sound data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/buffer">AudioBufferSourceNode.buffer - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiobuffersourcenode-buffer">The definition of 'buffer' in the 'Web Audio API' specification.</a>
   */
  @Nullable
  public AudioBuffer buffer;

  /**
   * The loop property's default value is false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/loop">AudioBufferSourceNode.loop - MDN</a>
   */
  public boolean loop;

  /**
   * A floating-point number indicating the offset, in seconds, into the audio buffer at which each loop will loop return to the beginning of the loop (that is, the current play time gets reset to AudioBufferSourceNode.loopStart). This property is only used if the loop property is true.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/loopEnd">AudioBufferSourceNode.loopEnd - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiobuffersourcenode-loopend">The definition of 'loopEnd' in the 'Web Audio API' specification.</a>
   */
  public double loopEnd;

  /**
   * The loopStart property of the AudioBufferSourceNode interface is a floating-point value indicating, in seconds, where in the AudioBuffer the restart of the play must happen.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/loopStart">AudioBufferSourceNode.loopStart - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiobuffersourcenode-loopstart">The definition of 'loopStart' in the 'Web Audio API' specification.</a>
   */
  public double loopStart;

  /**
   * The AudioBufferSourceNode() constructor creates a new AudioBufferSourceNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/AudioBufferSourceNode">AudioBufferSourceNode.AudioBufferSourceNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#AudioBufferSourceNode">The definition of 'AudioBufferSourceNode()' in the 'Web Audio API' specification.</a>
   */
  public AudioBufferSourceNode(@Nonnull final BaseAudioContext context,
      @Nonnull final AudioBufferSourceOptions options) {
  }

  /**
   * The AudioBufferSourceNode() constructor creates a new AudioBufferSourceNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/AudioBufferSourceNode">AudioBufferSourceNode.AudioBufferSourceNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#AudioBufferSourceNode">The definition of 'AudioBufferSourceNode()' in the 'Web Audio API' specification.</a>
   */
  public AudioBufferSourceNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * The detune property of the AudioBufferSourceNode interface is a k-rate AudioParam representing detuning of oscillation in cents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/detune">AudioBufferSourceNode.detune - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiobuffersourcenode-detune">The definition of 'detune' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "detune"
  )
  @Nonnull
  public native AudioParam detune();

  /**
   * The playbackRate property of the AudioBufferSourceNode interface Is a k-rate AudioParam that defines the speed at which the audio asset will be played.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/playbackRate">AudioBufferSourceNode.playbackRate - MDN</a>
   */
  @JsProperty(
      name = "playbackRate"
  )
  @Nonnull
  public native AudioParam playbackRate();

  /**
   * undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/start">AudioBufferSourceNode.start - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiobuffersourcenode-start">The definition of 'start()' in the 'Web Audio API' specification.</a>
   */
  public native void start(double when, double offset, double duration);

  /**
   * undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/start">AudioBufferSourceNode.start - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiobuffersourcenode-start">The definition of 'start()' in the 'Web Audio API' specification.</a>
   */
  public native void start(double when, double offset);

  /**
   * undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/start">AudioBufferSourceNode.start - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiobuffersourcenode-start">The definition of 'start()' in the 'Web Audio API' specification.</a>
   */
  public native void start(double when);

  /**
   * undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBufferSourceNode/start">AudioBufferSourceNode.start - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiobuffersourcenode-start">The definition of 'start()' in the 'Web Audio API' specification.</a>
   */
  public native void start();
}
