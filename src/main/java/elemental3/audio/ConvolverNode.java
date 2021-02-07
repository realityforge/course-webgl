package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The ConvolverNode interface is an AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to achieve a reverb effect. A ConvolverNode always has exactly one input and one output.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConvolverNode">ConvolverNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#ConvolverNode">ConvolverNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ConvolverNode"
)
public class ConvolverNode extends AudioNode {
  /**
   * An AudioBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConvolverNode/buffer">ConvolverNode.buffer - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-convolvernode-buffer">buffer - Web Audio API</a>
   */
  @Nullable
  public AudioBuffer buffer;

  /**
   * The normalize property of the ConvolverNode interface is a boolean that controls whether the impulse response from the buffer will be scaled by an equal-power normalization when the buffer attribute is set, or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConvolverNode/normalize">ConvolverNode.normalize - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-convolvernode-normalize">normalize - Web Audio API</a>
   */
  public boolean normalize;

  /**
   * The ConvolverNode() constructor of the Web Audio API creates a new ConvolverNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConvolverNode/ConvolverNode">ConvolverNode.ConvolverNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-convolvernode-convolvernode">ConvolverNode() - Web Audio API</a>
   */
  public ConvolverNode(@Nonnull final BaseAudioContext context,
      @Nonnull final ConvolverOptions options) {
  }

  /**
   * The ConvolverNode() constructor of the Web Audio API creates a new ConvolverNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConvolverNode/ConvolverNode">ConvolverNode.ConvolverNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-convolvernode-convolvernode">ConvolverNode() - Web Audio API</a>
   */
  public ConvolverNode(@Nonnull final BaseAudioContext context) {
  }
}
