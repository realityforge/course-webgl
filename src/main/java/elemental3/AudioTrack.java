package elemental3;

import elemental3.media.SourceBuffer;
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
 * @see <a href="https://html.spec.whatwg.org/multipage/media.html#audiotrack">The definition of 'AudioTrack' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#audiotrack">The definition of 'AudioTrack' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/media.html#dom-audiotrack-enabled">The definition of 'AudioTrack.enabled' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-audiotrack-enabled">The definition of 'AudioTrack.enabled' in the 'HTML5' specification.</a>
   */
  public boolean enabled;

  protected AudioTrack() {
  }

  /**
   * The id property contains a string which uniquely identifies the track represented by the AudioTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrack/id">AudioTrack.id - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/media.html#dom-audiotrack-id">The definition of 'AudioTrack.id' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-audiotrack-id">The definition of 'AudioTrack.id' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/media.html#dom-audiotrack-kind">The definition of 'AudioTrack: kind' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-audiotrack-kind">The definition of 'AudioTrack.kind' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/media.html#dom-audiotrack-label">The definition of 'AudioTrack.label' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-audiotrack-label">The definition of 'AudioTrack.label' in the 'HTML5' specification.</a>
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
   * @see <a href="https://html.spec.whatwg.org/multipage/media.html#dom-audiotrack-language">The definition of 'AudioTrack.language' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-audiotrack-language">The definition of 'AudioTrack.language' in the 'HTML5' specification.</a>
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
   * @see <a href="https://w3c.github.io/media-source/#dom-audiotrack-sourcebuffer">The definition of 'AudioTrack: sourceBuffer' in the 'Media Source Extensions' specification.</a>
   */
  @JsProperty(
      name = "sourceBuffer"
  )
  @Nullable
  public native SourceBuffer sourceBuffer();
}
