package elemental3;

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
  public MediaStreamAudioDestinationNode(@Nonnull final AudioContext context,
      @Nonnull final AudioNodeOptions options) {
  }

  public MediaStreamAudioDestinationNode(@Nonnull final AudioContext context) {
  }

  /**
   * A MediaStream containing a single audio track. The audio track is a MediaStreamTrack whose kind is audio.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamAudioDestinationNode/stream">MediaStreamAudioDestinationNode.stream - MDN</a>
   */
  @JsProperty(
      name = "stream"
  )
  @Nonnull
  public native MediaStream stream();
}
