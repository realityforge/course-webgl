package elemental3.audio;

import elemental3.media.MediaStream;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Inherits properties from its parent, AudioNode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioDestinationNode">MediaStreamAudioDestinationNode - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStreamAudioDestinationNode"
)
public class MediaStreamAudioDestinationNode extends AudioNode {
  /**
   * The MediaStreamAudioDestinationNode() constructor of the Web Audio API creates a new MediaStreamAudioDestinationNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioDestinationNode/MediaStreamAudioDestinationNode">MediaStreamAudioDestinationNode.MediaStreamAudioDestinationNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#mediastreamaudiodestinationnode">The definition of 'MediaStreamAudioDestinationNode' in the 'Web Audio API' specification.</a>
   */
  public MediaStreamAudioDestinationNode(@Nonnull final AudioContext context,
      @Nonnull final AudioNodeOptions options) {
  }

  /**
   * The MediaStreamAudioDestinationNode() constructor of the Web Audio API creates a new MediaStreamAudioDestinationNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioDestinationNode/MediaStreamAudioDestinationNode">MediaStreamAudioDestinationNode.MediaStreamAudioDestinationNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#mediastreamaudiodestinationnode">The definition of 'MediaStreamAudioDestinationNode' in the 'Web Audio API' specification.</a>
   */
  public MediaStreamAudioDestinationNode(@Nonnull final AudioContext context) {
  }

  /**
   * A MediaStream containing a single audio track. The audio track is a MediaStreamTrack whose kind is audio.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioDestinationNode/stream">MediaStreamAudioDestinationNode.stream - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediastreamaudiodestinationnode-stream">The definition of 'stream' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "stream"
  )
  @Nonnull
  public native MediaStream stream();
}
