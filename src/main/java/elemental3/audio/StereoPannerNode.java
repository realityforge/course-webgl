package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The pan property takes a unitless value between -1 (full left pan) and 1 (full right pan). This interface was introduced as a much simpler way to apply a simple panning effect than having to use a full PannerNode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StereoPannerNode">StereoPannerNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#stereopannernode">The definition of 'StereoPannerNode' in the 'Web Audio API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StereoPannerNode"
)
public class StereoPannerNode extends AudioNode {
  /**
   * The StereoPannerNode() constructor of the Web Audio API creates a new StereoPannerNode object which is an AudioNode that represents a simple stereo panner node that can be used to pan an audio stream left or right.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StereoPannerNode/StereoPannerNode">StereoPannerNode.StereoPannerNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-stereopannernode-stereopannernode">The definition of 'StereoPannerNode()' in the 'Web Audio API' specification.</a>
   */
  public StereoPannerNode(@Nonnull final BaseAudioContext context,
      @Nonnull final StereoPannerOptions options) {
  }

  /**
   * The StereoPannerNode() constructor of the Web Audio API creates a new StereoPannerNode object which is an AudioNode that represents a simple stereo panner node that can be used to pan an audio stream left or right.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StereoPannerNode/StereoPannerNode">StereoPannerNode.StereoPannerNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-stereopannernode-stereopannernode">The definition of 'StereoPannerNode()' in the 'Web Audio API' specification.</a>
   */
  public StereoPannerNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An a-rate AudioParam containing the panning to apply.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StereoPannerNode/pan">StereoPannerNode.pan - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-stereopannernode-pan">The definition of 'pan' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "pan"
  )
  @Nonnull
  public native AudioParam pan();
}
