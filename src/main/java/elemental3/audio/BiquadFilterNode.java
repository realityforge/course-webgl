package elemental3.audio;

import elemental2.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The BiquadFilterNode interface represents a simple low-order filter, and is created using the AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode">BiquadFilterNode - MDN</a>
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
   */
  @Nonnull
  @BiquadFilterType
  public String type;

  /**
   * The BiquadFilterNode() constructor of the Web Audio API creates a new BiquadFilterNode object, which represents a simple low-order filter, and is created using the AudioContext.createBiquadFilter() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/BiquadFilterNode">BiquadFilterNode.BiquadFilterNode - MDN</a>
   */
  public BiquadFilterNode(@Nonnull final BaseAudioContext context,
      @Nonnull final BiquadFilterOptions options) {
  }

  /**
   * The BiquadFilterNode() constructor of the Web Audio API creates a new BiquadFilterNode object, which represents a simple low-order filter, and is created using the AudioContext.createBiquadFilter() method.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/BiquadFilterNode">BiquadFilterNode.BiquadFilterNode - MDN</a>
   */
  public BiquadFilterNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BiquadFilterNode/Q">BiquadFilterNode.Q - MDN</a>
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
   */
  public native void getFrequencyResponse(@Nonnull Float32Array frequencyHz,
      @Nonnull Float32Array magResponse, @Nonnull Float32Array phaseResponse);
}
