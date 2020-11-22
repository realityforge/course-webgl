package elemental3.audio;

import elemental3.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * A WaveShaperNode always has exactly one input and one output.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WaveShaperNode">WaveShaperNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#waveshapernode">The definition of 'WaveShaperNode' in the 'Web Audio API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WaveShaperNode"
)
public class WaveShaperNode extends AudioNode {
  /**
   * The curve property of the WaveShaperNode interface is a Float32Array of numbers describing the distortion to apply.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WaveShaperNode/curve">WaveShaperNode.curve - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-waveshapernode-curve">The definition of 'curve' in the 'Web Audio API' specification.</a>
   */
  @Nullable
  public Float32Array curve;

  /**
   * The oversample property of the WaveShaperNode interface is an enumerated value indicating if oversampling must be used. Oversampling is a technique for creating more samples (up-sampling) before applying a distortion effect to the audio signal.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WaveShaperNode/oversample">WaveShaperNode.oversample - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-waveshapernode-oversample">The definition of 'oversample' in the 'Web Audio API' specification.</a>
   */
  @Nonnull
  @OverSampleType
  public String oversample;

  /**
   * The WaveShaperNode() constructor of the Web Audio API creates a new WaveShaperNode object which is an AudioNode that represents a non-linear distorter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WaveShaperNode/WaveShaperNode">WaveShaperNode.WaveShaperNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-waveshapernode-waveshapernode">The definition of 'WaveShaperNode()' in the 'Web Audio API' specification.</a>
   */
  public WaveShaperNode(@Nonnull final BaseAudioContext context,
      @Nonnull final WaveShaperOptions options) {
  }

  /**
   * The WaveShaperNode() constructor of the Web Audio API creates a new WaveShaperNode object which is an AudioNode that represents a non-linear distorter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WaveShaperNode/WaveShaperNode">WaveShaperNode.WaveShaperNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-waveshapernode-waveshapernode">The definition of 'WaveShaperNode()' in the 'Web Audio API' specification.</a>
   */
  public WaveShaperNode(@Nonnull final BaseAudioContext context) {
  }
}
