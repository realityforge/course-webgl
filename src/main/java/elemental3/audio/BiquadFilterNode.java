package elemental3.audio;

import elemental3.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The BiquadFilterNode interface represents a simple low-order filter, and is created using the BaseAudioContext/createBiquadFilter method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode">BiquadFilterNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#biquadfilternode">BiquadFilterNode - Web Audio API</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-type">type - Web Audio API</a>
   */
  @Nonnull
  @BiquadFilterType
  public String type;

  /**
   * The BiquadFilterNode() constructor of the Web Audio API creates a new BiquadFilterNode object, which represents a simple low-order filter, and is created using the AudioContext.createBiquadFilter() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/BiquadFilterNode">BiquadFilterNode.BiquadFilterNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-biquadfilternode">BiquadFilterNode() - Web Audio API</a>
   */
  public BiquadFilterNode(@Nonnull final BaseAudioContext context,
      @Nonnull final BiquadFilterOptions options) {
  }

  /**
   * The BiquadFilterNode() constructor of the Web Audio API creates a new BiquadFilterNode object, which represents a simple low-order filter, and is created using the AudioContext.createBiquadFilter() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/BiquadFilterNode">BiquadFilterNode.BiquadFilterNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-biquadfilternode">BiquadFilterNode() - Web Audio API</a>
   */
  public BiquadFilterNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/Q">BiquadFilterNode.Q - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-q">Q - Web Audio API</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-detune">detune - Web Audio API</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-frequency">frequency - Web Audio API</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-gain">gain - Web Audio API</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-biquadfilternode-getfrequencyresponse">getFrequencyResponse() - Web Audio API</a>
   */
  public native void getFrequencyResponse(@Nonnull Float32Array frequencyHz,
      @Nonnull Float32Array magResponse, @Nonnull Float32Array phaseResponse);
}
