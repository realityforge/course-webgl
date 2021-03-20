package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DynamicsCompressorNode interface provides a compression effect, which lowers the volume of the loudest parts of the signal in order to help prevent clipping and distortion that can occur when multiple sounds are played and multiplexed together at once. This is often used in musical production and game audio. DynamicsCompressorNode is an AudioNode that has exactly one input and one output; it is created using the BaseAudioContext.createDynamicsCompressor method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode">DynamicsCompressorNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#dynamicscompressornode">DynamicsCompressorNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DynamicsCompressorNode"
)
public class DynamicsCompressorNode extends AudioNode {
  /**
   * The DynamicsCompressorNode() constructor creates a new DynamicsCompressorNode object which provides a compression effect, which lowers the volume of the loudest parts of the signal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/DynamicsCompressorNode">DynamicsCompressorNode.DynamicsCompressorNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dynamicscompressornode">DynamicsCompressorNode() - Web Audio API</a>
   */
  public DynamicsCompressorNode(@Nonnull final BaseAudioContext context,
      @Nonnull final DynamicsCompressorOptions options) {
  }

  /**
   * The DynamicsCompressorNode() constructor creates a new DynamicsCompressorNode object which provides a compression effect, which lowers the volume of the loudest parts of the signal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/DynamicsCompressorNode">DynamicsCompressorNode.DynamicsCompressorNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dynamicscompressornode">DynamicsCompressorNode() - Web Audio API</a>
   */
  public DynamicsCompressorNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/attack">DynamicsCompressorNode.attack - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-attack">attack - Web Audio API</a>
   */
  @JsProperty(
      name = "attack"
  )
  @Nonnull
  public native AudioParam attack();

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/knee">DynamicsCompressorNode.knee - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-knee">knee - Web Audio API</a>
   */
  @JsProperty(
      name = "knee"
  )
  @Nonnull
  public native AudioParam knee();

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/ratio">DynamicsCompressorNode.ratio - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-ratio">ratio - Web Audio API</a>
   */
  @JsProperty(
      name = "ratio"
  )
  @Nonnull
  public native AudioParam ratio();

  /**
   * The reduction read-only property of the DynamicsCompressorNode interface is a float representing the amount of gain reduction currently applied by the compressor to the signal.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/reduction">DynamicsCompressorNode.reduction - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-reduction">reduction - Web Audio API</a>
   */
  @JsProperty(
      name = "reduction"
  )
  public native float reduction();

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/release">DynamicsCompressorNode.release - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-release">release - Web Audio API</a>
   */
  @JsProperty(
      name = "release"
  )
  @Nonnull
  public native AudioParam release();

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/threshold">DynamicsCompressorNode.threshold - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-threshold">threshold - Web Audio API</a>
   */
  @JsProperty(
      name = "threshold"
  )
  @Nonnull
  public native AudioParam threshold();
}
