package elemental3.audio;

import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Web Audio API AudioProcessingEvent represents events that occur when a ScriptProcessorNode input buffer is ready to be processed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioProcessingEvent">AudioProcessingEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioProcessingEvent"
)
public class AudioProcessingEvent extends Event {
  public AudioProcessingEvent(@Nonnull final String type,
      @Nonnull final AudioProcessingEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "inputBuffer"
  )
  @Nonnull
  public native AudioBuffer inputBuffer();

  @JsProperty(
      name = "outputBuffer"
  )
  @Nonnull
  public native AudioBuffer outputBuffer();

  @JsProperty(
      name = "playbackTime"
  )
  public native double playbackTime();
}
