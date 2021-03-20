package akasha.audio;

import akasha.media.MediaStream;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaStreamAudioDestinationNode interface represents an audio destination consisting of a WebRTC MediaStream with a single AudioMediaStreamTrack, which can be used in a similar way to a MediaStream obtained from Navigator.getUserMedia().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioDestinationNode">MediaStreamAudioDestinationNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#mediastreamaudiodestinationnode">MediaStreamAudioDestinationNode - Web Audio API</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#mediastreamaudiodestinationnode">MediaStreamAudioDestinationNode - Web Audio API</a>
   */
  public MediaStreamAudioDestinationNode(@Nonnull final AudioContext context,
      @Nonnull final AudioNodeOptions options) {
  }

  /**
   * The MediaStreamAudioDestinationNode() constructor of the Web Audio API creates a new MediaStreamAudioDestinationNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioDestinationNode/MediaStreamAudioDestinationNode">MediaStreamAudioDestinationNode.MediaStreamAudioDestinationNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#mediastreamaudiodestinationnode">MediaStreamAudioDestinationNode - Web Audio API</a>
   */
  public MediaStreamAudioDestinationNode(@Nonnull final AudioContext context) {
  }

  /**
   * A MediaStream containing a single audio track. The audio track is a MediaStreamTrack whose kind is audio.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioDestinationNode/stream">MediaStreamAudioDestinationNode.stream - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediastreamaudiodestinationnode-stream">stream - Web Audio API</a>
   */
  @JsProperty(
      name = "stream"
  )
  @Nonnull
  public native MediaStream stream();
}
