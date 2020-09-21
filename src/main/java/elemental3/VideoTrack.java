package elemental3;

import elemental3.media.SourceBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The VideoTrack interface represents a single video track from a video element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrack">VideoTrack - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoTrack"
)
public class VideoTrack {
  /**
   * The VideoTrack property selected controls whether or not a particular video track is active.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrack/selected">VideoTrack.selected - MDN</a>
   */
  public boolean selected;

  protected VideoTrack() {
  }

  /**
   * The id property contains a string which uniquely identifies the track represented by the VideoTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrack/id">VideoTrack.id - MDN</a>
   */
  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  /**
   * The kind property contains a string indicating the category of video contained in the VideoTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrack/kind">VideoTrack.kind - MDN</a>
   */
  @JsProperty(
      name = "kind"
  )
  @Nonnull
  public native String kind();

  /**
   * The read-only VideoTrack property label returns a string specifying the video track's human-readable label, if one is available; otherwise, it returns an empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrack/label">VideoTrack.label - MDN</a>
   */
  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  /**
   * The read-only VideoTrack property language returns a string identifying the language used in the video track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrack/language">VideoTrack.language - MDN</a>
   */
  @JsProperty(
      name = "language"
  )
  @Nonnull
  public native String language();

  /**
   * The read-only VideoTrack property sourceBuffer returns the SourceBuffer that created the track, or null if the track was not created by a SourceBuffer or the SourceBuffer has been removed from the MediaSource.sourceBuffers attribute of its parent media source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoTrack/sourceBuffer">VideoTrack.sourceBuffer - MDN</a>
   */
  @JsProperty(
      name = "sourceBuffer"
  )
  @Nullable
  public native SourceBuffer sourceBuffer();
}
