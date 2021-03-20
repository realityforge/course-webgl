package akasha.audio;

import akasha.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioBuffer interface represents a short audio asset residing in memory, created from an audio file using the AudioContext.decodeAudioData() method, or from raw data using AudioContext.createBuffer(). Once put into an AudioBuffer, the audio can then be played by being passed into an AudioBufferSourceNode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer">AudioBuffer - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#audiobuffer">AudioBuffer - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioBuffer"
)
public class AudioBuffer {
  /**
   * The AudioBuffer constructor of the Web Audio API creates a new AudioBuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer/AudioBuffer">AudioBuffer.AudioBuffer - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#AudioBuffer">AudioBuffer - Web Audio API</a>
   */
  public AudioBuffer(@Nonnull final AudioBufferOptions options) {
  }

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer/duration">AudioBuffer.duration - MDN</a>
   */
  @JsProperty(
      name = "duration"
  )
  public native double duration();

  /**
   * The length property of the AudioBuffer interface returns an integer representing the length, in sample-frames, of the PCM data stored in the buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer/length">AudioBuffer.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * An integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer/numberOfChannels">AudioBuffer.numberOfChannels - MDN</a>
   */
  @JsProperty(
      name = "numberOfChannels"
  )
  public native int numberOfChannels();

  /**
   * A floating-point value indicating the current sample rate of the buffers data, in samples per second.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer/sampleRate">AudioBuffer.sampleRate - MDN</a>
   */
  @JsProperty(
      name = "sampleRate"
  )
  public native float sampleRate();

  /**
   * The copyFromChannel() method of the AudioBuffer interface copies the audio sample data from the specified channel of the AudioBuffer to a specified Float32Array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer/copyFromChannel">AudioBuffer.copyFromChannel - MDN</a>
   */
  public native void copyFromChannel(@Nonnull Float32Array destination, int channelNumber,
      int bufferOffset);

  /**
   * The copyFromChannel() method of the AudioBuffer interface copies the audio sample data from the specified channel of the AudioBuffer to a specified Float32Array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer/copyFromChannel">AudioBuffer.copyFromChannel - MDN</a>
   */
  public native void copyFromChannel(@Nonnull Float32Array destination, int channelNumber);

  /**
   * The copyToChannel() method of the AudioBuffer interface copies the samples to the specified channel of the AudioBuffer, from the source array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer/copyToChannel">AudioBuffer.copyToChannel - MDN</a>
   */
  public native void copyToChannel(@Nonnull Float32Array source, int channelNumber,
      int bufferOffset);

  /**
   * The copyToChannel() method of the AudioBuffer interface copies the samples to the specified channel of the AudioBuffer, from the source array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer/copyToChannel">AudioBuffer.copyToChannel - MDN</a>
   */
  public native void copyToChannel(@Nonnull Float32Array source, int channelNumber);

  /**
   * The getChannelData() method of the AudioBuffer Interface returns a Float32Array containing the PCM data associated with the channel, defined by the channel parameter (with 0 representing the first channel).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer/getChannelData">AudioBuffer.getChannelData - MDN</a>
   */
  @Nonnull
  public native Float32Array getChannelData(int channel);
}
