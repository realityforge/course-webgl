package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChannelSplitterNode">ChannelSplitterNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#channelsplitternode">ChannelSplitterNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ChannelSplitterNode"
)
public class ChannelSplitterNode extends AudioNode {
  /**
   * The ChannelSplitterNode() constructor of the Web Audio API creates a new ChannelSplitterNode object instance, representing a node that splits the input into a separate output for each of the source node's audio channels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChannelSplitterNode/ChannelSplitterNode">ChannelSplitterNode.ChannelSplitterNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#channelsplitternode">ChannelSplitterNode - Web Audio API</a>
   */
  public ChannelSplitterNode(@Nonnull final BaseAudioContext context,
      @Nonnull final ChannelSplitterOptions options) {
  }

  /**
   * The ChannelSplitterNode() constructor of the Web Audio API creates a new ChannelSplitterNode object instance, representing a node that splits the input into a separate output for each of the source node's audio channels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChannelSplitterNode/ChannelSplitterNode">ChannelSplitterNode.ChannelSplitterNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#channelsplitternode">ChannelSplitterNode - Web Audio API</a>
   */
  public ChannelSplitterNode(@Nonnull final BaseAudioContext context) {
  }
}
