package elemental3.audio;

import elemental3.media.MediaStream;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaStreamAudioSourceNode interface is a type of AudioNode which operates as an audio source whose media is received from a MediaStream obtained using the WebRTC or Media Capture and Streams APIs.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioSourceNode">MediaStreamAudioSourceNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#mediastreamaudiosourcenode">MediaStreamAudioSourceNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStreamAudioSourceNode"
)
public class MediaStreamAudioSourceNode extends AudioNode {
  /**
   * The Web Audio API's MediaStreamAudioSourceNode() constructor creates and returns a new MediaStreamAudioSourceNode object which uses the first audio track of a given MediaStream as its source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioSourceNode/MediaStreamAudioSourceNode">MediaStreamAudioSourceNode.MediaStreamAudioSourceNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediastreamaudiosourcenode-mediastreamaudiosourcenode">MediaStreamAudioSourceNode() - Web Audio API</a>
   */
  public MediaStreamAudioSourceNode(@Nonnull final AudioContext context,
      @Nonnull final MediaStreamAudioSourceOptions options) {
  }

  /**
   * The MediaStreamAudioSourceNode interface's read-only mediaStream property indicates the MediaStream that contains the audio track from which the node is receiving audio.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioSourceNode/mediaStream">MediaStreamAudioSourceNode.mediaStream - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediastreamaudiosourcenode-mediastream">MediaStreamAudioSourceNode.mediaStream - Web Audio API</a>
   */
  @JsProperty(
      name = "mediaStream"
  )
  @Nonnull
  public native MediaStream mediaStream();
}
