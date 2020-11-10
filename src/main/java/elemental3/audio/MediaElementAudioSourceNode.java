package elemental3.audio;

import elemental3.HTMLMediaElement;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A MediaElementSourceNode has no inputs and exactly one output, and is created using the AudioContext.createMediaElementSource() method. The amount of channels in the output equals the number of channels of the audio referenced by the HTMLMediaElement used in the creation of the node, or is 1 if the HTMLMediaElement has no audio.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaElementAudioSourceNode">MediaElementAudioSourceNode - MDN</a>
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
   * @see <a href="https://webaudio.github.io/web-audio-api/#mediaelementaudiosourcenode">The definition of 'MediaElementAudioSourceNode' in the 'Web Audio API' specification.</a>
   */
  public MediaElementAudioSourceNode(@Nonnull final AudioContext context,
      @Nonnull final MediaElementAudioSourceOptions options) {
  }

  /**
   * The MediaElementAudioSourceNode interface's read-only mediaElement property indicates the HTMLMediaElement that contains the audio track from which the node is receiving audio.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaElementAudioSourceNode/mediaElement">MediaElementAudioSourceNode.mediaElement - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-mediaelementaudiosourcenode-mediaelement">The definition of 'MediaElementAudioSourceNode.mediaElement' in the 'Web Audio API' specification.</a>
   */
  @JsProperty(
      name = "mediaElement"
  )
  @Nonnull
  public native HTMLMediaElement mediaElement();
}
