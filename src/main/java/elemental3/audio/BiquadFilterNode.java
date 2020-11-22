package elemental3.audio;

import elemental3.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The BiquadFilterNode interface represents a simple low-order filter, and is created using the AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode">BiquadFilterNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#biquadfilternode">The definition of 'BiquadFilterNode' in the 'Web Audio API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BiquadFilterNode"
)
public class BiquadFilterNode extends AudioNode {
  /**
   * A string (enum) representing a BiquadFilterType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/type">BiquadFilterNode.type - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-type">The definition of 'type' in the 'Web Audio API' specification.</a>
   */
  @Nonnull
  @BiquadFilterType
  public String type;

  /**
   * The BiquadFilterNode() constructor of the Web Audio API creates a new BiquadFilterNode object, which represents a simple low-order filter, and is created using the AudioContext.createBiquadFilter() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/BiquadFilterNode">BiquadFilterNode.BiquadFilterNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-biquadfilternode">The definition of 'BiquadFilterNode()' in the 'Web Audio API' specification.</a>
   */
  public BiquadFilterNode(@Nonnull final BaseAudioContext context,
      @Nonnull final BiquadFilterOptions options) {
  }

  /**
   * The BiquadFilterNode() constructor of the Web Audio API creates a new BiquadFilterNode object, which represents a simple low-order filter, and is created using the AudioContext.createBiquadFilter() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/BiquadFilterNode">BiquadFilterNode.BiquadFilterNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-biquadfilternode">The definition of 'BiquadFilterNode()' in the 'Web Audio API' specification.</a>
   */
  public BiquadFilterNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/Q">BiquadFilterNode.Q - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-q">The definition of 'Q' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "Q"
  )
  @Nonnull
  public native AudioParam Q();

  /**
   * An a-rate AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/detune">BiquadFilterNode.detune - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-detune">The definition of 'detune' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "detune"
  )
  @Nonnull
  public native AudioParam detune();

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/frequency">BiquadFilterNode.frequency - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-frequency">The definition of 'frequency' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "frequency"
  )
  @Nonnull
  public native AudioParam frequency();

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/gain">BiquadFilterNode.gain - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-gain">The definition of 'gain' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "gain"
  )
  @Nonnull
  public native AudioParam gain();

  /**
   * undefined
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/getFrequencyResponse">BiquadFilterNode.getFrequencyResponse - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-getfrequencyresponse">The definition of 'getFrequencyResponse()' in the 'Web Audio API' specification.</a>
   */
  public native void getFrequencyResponse(@Nonnull Float32Array frequencyHz,
      @Nonnull Float32Array magResponse, @Nonnull Float32Array phaseResponse);
}
