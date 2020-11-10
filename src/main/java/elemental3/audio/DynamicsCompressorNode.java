package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Inherits properties from its parent, AudioNode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode">DynamicsCompressorNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#dynamicscompressornode">The definition of 'DynamicsCompressorNode' in the 'Web Audio API' specification.</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dynamicscompressornode">The definition of 'DynamicsCompressorNode()' in the 'Web Audio API' specification.</a>
   */
  public DynamicsCompressorNode(@Nonnull final BaseAudioContext context,
      @Nonnull final DynamicsCompressorOptions options) {
  }

  /**
   * The DynamicsCompressorNode() constructor creates a new DynamicsCompressorNode object which provides a compression effect, which lowers the volume of the loudest parts of the signal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/DynamicsCompressorNode">DynamicsCompressorNode.DynamicsCompressorNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dynamicscompressornode">The definition of 'DynamicsCompressorNode()' in the 'Web Audio API' specification.</a>
   */
  public DynamicsCompressorNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/attack">DynamicsCompressorNode.attack - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-attack">The definition of 'attack' in the 'Web Audio API' specification.</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-knee">The definition of 'knee' in the 'Web Audio API' specification.</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-ratio">The definition of 'ratio' in the 'Web Audio API' specification.</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-reduction">The definition of 'reduction' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "reduction"
  )
  public native float reduction();

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DynamicsCompressorNode/release">DynamicsCompressorNode.release - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-release">The definition of 'release' in the 'Web Audio API' specification.</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-dynamicscompressornode-threshold">The definition of 'threshold' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "threshold"
  )
  @Nonnull
  public native AudioParam threshold();
}
