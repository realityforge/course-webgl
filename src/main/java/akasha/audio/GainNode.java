package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The GainNode interface represents a change in volume. It is an AudioNode audio-processing module that causes a given gain to be applied to the input data before its propagation to the output. A GainNode always has exactly one input and one output, both with the same number of channels.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GainNode">GainNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#gainnode">GainNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GainNode"
)
public class GainNode extends AudioNode {
  /**
   * The GainNode() constructor of the Web Audio API creates a new GainNode object which an AudioNode that represents a change in volume.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GainNode/GainNode">GainNode.GainNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-gainnode-gainnode">GainNode() - Web Audio API</a>
   */
  public GainNode(@Nonnull final BaseAudioContext context, @Nonnull final GainOptions options) {
  }

  /**
   * The GainNode() constructor of the Web Audio API creates a new GainNode object which an AudioNode that represents a change in volume.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GainNode/GainNode">GainNode.GainNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-gainnode-gainnode">GainNode() - Web Audio API</a>
   */
  public GainNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GainNode/gain">GainNode.gain - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-gainnode-gain">gain - Web Audio API</a>
   */
  @JsProperty(
      name = "gain"
  )
  @Nonnull
  public native AudioParam gain();
}
