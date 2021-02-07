package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ConstantSourceNode interface&mdash;part of the Web Audio API&mdash;represents an audio source (based upon AudioScheduledSourceNode) whose output is single unchanging value. This makes it useful for cases in which you need a constant value coming in from an audio source. In addition, it can be used like a constructible AudioParam by automating the value of its offset or by connecting another node to it; see Controlling multiple parameters with ConstantSourceNode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstantSourceNode">ConstantSourceNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#ConstantSourceNode">ConstantSourceNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ConstantSourceNode"
)
public class ConstantSourceNode extends AudioScheduledSourceNode {
  /**
   * The ConstantSourceNode() constructor creates a new ConstantSourceNode object instance, representing an audio source which constantly outputs samples whose values are always the same.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstantSourceNode/ConstantSourceNode">ConstantSourceNode.ConstantSourceNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-constantsourcenode-constantsourcenode">ConstantSourceNode: ConstantSourceNode - Web Audio API</a>
   */
  public ConstantSourceNode(@Nonnull final BaseAudioContext context,
      @Nonnull final ConstantSourceOptions options) {
  }

  /**
   * The ConstantSourceNode() constructor creates a new ConstantSourceNode object instance, representing an audio source which constantly outputs samples whose values are always the same.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstantSourceNode/ConstantSourceNode">ConstantSourceNode.ConstantSourceNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-constantsourcenode-constantsourcenode">ConstantSourceNode: ConstantSourceNode - Web Audio API</a>
   */
  public ConstantSourceNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * The read-only offset property of the ConstantSourceNode interface returns a AudioParam object indicating the numeric a-rate value which is always returned by the source when asked for the next sample.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstantSourceNode/offset">ConstantSourceNode.offset - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-constantsourcenode-offset">offset - Web Audio API</a>
   */
  @JsProperty(
      name = "offset"
  )
  @Nonnull
  public native AudioParam offset();
}
