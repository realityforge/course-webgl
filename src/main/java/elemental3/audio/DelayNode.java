package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DelayNode interface represents a delay-line; an AudioNode audio-processing module that causes a delay between the arrival of an input data and its propagation to the output.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DelayNode">DelayNode - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DelayNode"
)
public class DelayNode extends AudioNode {
  /**
   * The DelayNode() constructor of the Web Audio API creates a new DelayNode object with a delay-line; an AudioNode audio-processing module that causes a delay between the arrival of an input data, and its propagation to the output.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DelayNode/DelayNode">DelayNode.DelayNode - MDN</a>
   */
  public DelayNode(@Nonnull final BaseAudioContext context, @Nonnull final DelayOptions options) {
  }

  /**
   * The DelayNode() constructor of the Web Audio API creates a new DelayNode object with a delay-line; an AudioNode audio-processing module that causes a delay between the arrival of an input data, and its propagation to the output.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DelayNode/DelayNode">DelayNode.DelayNode - MDN</a>
   */
  public DelayNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DelayNode/delayTime">DelayNode.delayTime - MDN</a>
   */
  @JsProperty(
      name = "delayTime"
  )
  @Nonnull
  public native AudioParam delayTime();
}
