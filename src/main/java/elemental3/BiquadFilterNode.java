package elemental3;

import elemental2.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

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
  @Nonnull
  @MagicConstant(
      valuesFromClass = BiquadFilterType.class
  )
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

  @JsProperty(
      name = "Q"
  )
  @Nonnull
  public native AudioParam Q();

  @JsProperty(
      name = "detune"
  )
  @Nonnull
  public native AudioParam detune();

  @JsProperty(
      name = "frequency"
  )
  @Nonnull
  public native AudioParam frequency();

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
