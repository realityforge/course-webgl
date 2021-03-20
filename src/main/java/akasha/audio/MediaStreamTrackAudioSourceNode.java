package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The MediaStreamTrackAudioSourceNode interface is a type of AudioNode which represents a source of audio data taken from a specific MediaStreamTrack obtained through the WebRTC or Media Capture and Streams APIs.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrackAudioSourceNode">MediaStreamTrackAudioSourceNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#mediastreamtrackaudiosourcenode">MediaStreamTrackAudioSourceNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStreamTrackAudioSourceNode"
)
public class MediaStreamTrackAudioSourceNode extends AudioNode {
  public MediaStreamTrackAudioSourceNode(@Nonnull final AudioContext context,
      @Nonnull final MediaStreamTrackAudioSourceOptions options) {
  }
}
