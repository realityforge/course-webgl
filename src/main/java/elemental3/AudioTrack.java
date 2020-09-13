package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AudioTrack interface represents a single audio track from one of the HTML media elements, audio or video.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrack">AudioTrack - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioTrack"
)
public class AudioTrack {
  /**
   * The AudioTrack property enabled specifies whether or not the described audio track is currently enabled for use. If the track is disabled by setting enabled to false, the track is muted and does not produce audio.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrack/enabled">AudioTrack.enabled - MDN</a>
   */
  public boolean enabled;

  AudioTrack() {
  }

  /**
   * The id property contains a string which uniquely identifies the track represented by the AudioTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrack/id">AudioTrack.id - MDN</a>
   */
  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  /**
   * The kind property contains a string indicating the category of audio contained in the AudioTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrack/kind">AudioTrack.kind - MDN</a>
   */
  @JsProperty(
      name = "kind"
  )
  @Nonnull
  public native String kind();

  /**
   * The read-only AudioTrack property label returns a string specifying the audio track's human-readable label, if one is available; otherwise, it returns an empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrack/label">AudioTrack.label - MDN</a>
   */
  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  /**
   * The read-only AudioTrack property language returns a string identifying the language used in the audio track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrack/language">AudioTrack.language - MDN</a>
   */
  @JsProperty(
      name = "language"
  )
  @Nonnull
  public native String language();

  /**
   * The read-only AudioTrack property sourceBuffer returns the SourceBuffer that created the track, or null if the track was not created by a SourceBuffer or the SourceBuffer has been removed from the MediaSource.sourceBuffers attribute of its parent media source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrack/sourceBuffer">AudioTrack.sourceBuffer - MDN</a>
   */
  @JsProperty(
      name = "sourceBuffer"
  )
  @Nullable
  public native SourceBuffer sourceBuffer();
}
