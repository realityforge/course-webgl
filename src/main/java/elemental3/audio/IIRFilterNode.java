package elemental3.audio;

import elemental3.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The IIRFilterNode interface of the Web Audio API is a AudioNode processor which implements a general infinite impulse response (IIR) filter; this type of filter can be used to implement tone control devices and graphic equalizers as well. It lets the parameters of the filter response be specified, so that it can be tuned as needed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IIRFilterNode">IIRFilterNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#iirfilternode">IIRFilterNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IIRFilterNode"
)
public class IIRFilterNode extends AudioNode {
  /**
   * The IIRFilterNode() constructor of the Web Audio API creates a new IIRFilterNode object which an AudioNode processor which implements a general infinite impulse response filter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IIRFilterNode/IIRFilterNode">IIRFilterNode.IIRFilterNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-iirfilternode-iirfilternode">IIRFilterNode() - Web Audio API</a>
   */
  public IIRFilterNode(@Nonnull final BaseAudioContext context,
      @Nonnull final IIRFilterOptions options) {
  }

  /**
   * undefined
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IIRFilterNode/getFrequencyResponse">IIRFilterNode.getFrequencyResponse - MDN</a>
   */
  public native void getFrequencyResponse(@Nonnull Float32Array frequencyHz,
      @Nonnull Float32Array magResponse, @Nonnull Float32Array phaseResponse);
}
