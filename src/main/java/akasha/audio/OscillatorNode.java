package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created&mdash;in effect, a constant tone.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OscillatorNode">OscillatorNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#oscillatornode">OscillatorNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "OscillatorNode"
)
public class OscillatorNode extends AudioScheduledSourceNode {
  /**
   * A DOMString specifying the shape of oscillator wave. The different available values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OscillatorNode/type">OscillatorNode.type - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-oscillatornode-type">type - Web Audio API</a>
   */
  @Nonnull
  @OscillatorType
  public String type;

  /**
   * The OscillatorNode() constructor of the Web Audio API creates a new OscillatorNode object which is an AudioNode that represents a periodic waveform, like a sine wave, optionally setting the node's properties' values to match values in a specified object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OscillatorNode/OscillatorNode">OscillatorNode.OscillatorNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-oscillatornode-oscillatornode">OscillatorNode() - Web Audio API</a>
   */
  public OscillatorNode(@Nonnull final BaseAudioContext context,
      @Nonnull final OscillatorOptions options) {
  }

  /**
   * The OscillatorNode() constructor of the Web Audio API creates a new OscillatorNode object which is an AudioNode that represents a periodic waveform, like a sine wave, optionally setting the node's properties' values to match values in a specified object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OscillatorNode/OscillatorNode">OscillatorNode.OscillatorNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-oscillatornode-oscillatornode">OscillatorNode() - Web Audio API</a>
   */
  public OscillatorNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An a-rate AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OscillatorNode/detune">OscillatorNode.detune - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-oscillatornode-detune">detune - Web Audio API</a>
   */
  @JsProperty(
      name = "detune"
  )
  @Nonnull
  public native AudioParam detune();

  /**
   * An a-rate AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OscillatorNode/frequency">OscillatorNode.frequency - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-oscillatornode-frequency">frequency - Web Audio API</a>
   */
  @JsProperty(
      name = "frequency"
  )
  @Nonnull
  public native AudioParam frequency();

  /**
   * The setPeriodicWave() method of the OscillatorNode interface is used to point to a PeriodicWave defining a periodic waveform that can be used to shape the oscillator's output, when type is custom.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OscillatorNode/setPeriodicWave">OscillatorNode.setPeriodicWave - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-oscillatornode-setperiodicwave">setPeriodicWave - Web Audio API</a>
   */
  public native void setPeriodicWave(@Nonnull PeriodicWave periodicWave);
}
