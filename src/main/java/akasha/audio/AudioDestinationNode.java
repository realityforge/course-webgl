package akasha.audio;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioDestinationNode interface represents the end destination of an audio graph in a given context &mdash; usually the speakers of your device. It can also be the node that will &quot;record&quot; the audio data when used with an OfflineAudioContext.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioDestinationNode">AudioDestinationNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#AudioDestinationNode">AudioDestinationNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioDestinationNode"
)
public class AudioDestinationNode extends AudioNode {
  protected AudioDestinationNode() {
  }

  /**
   * An unsigned long.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioDestinationNode/maxChannelCount">AudioDestinationNode.maxChannelCount - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audiodestinationnode-maxchannelcount">maxChannelCount - Web Audio API</a>
   */
  @JsProperty(
      name = "maxChannelCount"
  )
  public native int maxChannelCount();
}
