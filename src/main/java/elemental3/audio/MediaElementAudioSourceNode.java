package elemental3.audio;

import elemental3.HTMLMediaElement;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaElementAudioSourceNode interface represents an audio source consisting of an HTML5 &lt;audio&gt; or &lt;video&gt; element. It is an AudioNode that acts as an audio source.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaElementAudioSourceNode">MediaElementAudioSourceNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#mediaelementaudiosourcenode">MediaElementAudioSourceNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaElementAudioSourceNode"
)
public class MediaElementAudioSourceNode extends AudioNode {
  /**
   * The MediaElementAudioSourceNode() constructor creates a new MediaElementAudioSourceNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaElementAudioSourceNode/MediaElementAudioSourceNode">MediaElementAudioSourceNode.MediaElementAudioSourceNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#mediaelementaudiosourcenode">MediaElementAudioSourceNode - Web Audio API</a>
   */
  public MediaElementAudioSourceNode(@Nonnull final AudioContext context,
      @Nonnull final MediaElementAudioSourceOptions options) {
  }

  /**
   * The MediaElementAudioSourceNode interface's read-only mediaElement property indicates the HTMLMediaElement that contains the audio track from which the node is receiving audio.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaElementAudioSourceNode/mediaElement">MediaElementAudioSourceNode.mediaElement - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediaelementaudiosourcenode-mediaelement">MediaElementAudioSourceNode.mediaElement - Web Audio API</a>
   */
  @JsProperty(
      name = "mediaElement"
  )
  @Nonnull
  public native HTMLMediaElement mediaElement();
}
