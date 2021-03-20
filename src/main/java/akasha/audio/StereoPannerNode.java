package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The StereoPannerNode interface of the Web Audio API represents a simple stereo panner node that can be used to pan an audio stream left or right. It is an AudioNode audio-processing module that positions an incoming audio stream in a stereo image using a low-cost equal-power panning algorithm.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StereoPannerNode">StereoPannerNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#stereopannernode">StereoPannerNode - Web Audio API</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-stereopannernode-stereopannernode">StereoPannerNode() - Web Audio API</a>
   */
  public StereoPannerNode(@Nonnull final BaseAudioContext context,
      @Nonnull final StereoPannerOptions options) {
  }

  /**
   * The StereoPannerNode() constructor of the Web Audio API creates a new StereoPannerNode object which is an AudioNode that represents a simple stereo panner node that can be used to pan an audio stream left or right.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StereoPannerNode/StereoPannerNode">StereoPannerNode.StereoPannerNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-stereopannernode-stereopannernode">StereoPannerNode() - Web Audio API</a>
   */
  public StereoPannerNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An a-rate AudioParam containing the panning to apply.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StereoPannerNode/pan">StereoPannerNode.pan - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-stereopannernode-pan">pan - Web Audio API</a>
   */
  @JsProperty(
      name = "pan"
  )
  @Nonnull
  public native AudioParam pan();
}
