package elemental3.media;

import elemental3.AudioTrackList;
import elemental3.EventHandler;
import elemental3.EventTarget;
import elemental3.TextTrackList;
import elemental3.TimeRanges;
import elemental3.VideoTrackList;
import elemental3.core.BufferSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SourceBuffer interface represents a chunk of media to be passed into an HTMLMediaElement and played, via a MediaSource object. This can be made up of one or several media segments.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer">SourceBuffer - MDN</a>
 * @see <a href="https://w3c.github.io/media-source/#sourcebuffer">SourceBuffer - Media Source Extensions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SourceBuffer"
)
public class SourceBuffer extends EventTarget {
  /**
   * The appendWindowEnd property of the SourceBuffer interface controls the timestamp for the end of the append window, a timestamp range that can be used to filter what media data is appended to the SourceBuffer. Coded media frames with timestamps wthin this range will be appended, whereas those outside the range will be filtered out.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendWindowEnd">SourceBuffer.appendWindowEnd - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-appendwindowend">appendWindowEnd - Media Source Extensions</a>
   */
  public double appendWindowEnd;

  /**
   * The appendWindowStart property of the SourceBuffer interface controls the timestamp for the start of the append window, a timestamp range that can be used to filter what media data is appended to the SourceBuffer. Coded media frames with timestamps wthin this range will be appended, whereas those outside the range will be filtered out.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendWindowStart">SourceBuffer.appendWindowStart - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-appendwindowstart">appendWindowStart - Media Source Extensions</a>
   */
  public double appendWindowStart;

  /**
   * The mode property of the SourceBuffer interface controls whether media segments can be appended to the SourceBuffer in any order, or in a strict sequence.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/mode">SourceBuffer.mode - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-mode">mode - Media Source Extensions</a>
   */
  @Nonnull
  @AppendMode
  public String mode;

  @Nullable
  public EventHandler onabort;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onupdate;

  @Nullable
  public EventHandler onupdateend;

  @Nullable
  public EventHandler onupdatestart;

  /**
   * The timestampOffset property of the SourceBuffer interface controls the offset applied to timestamps inside media segments that are appended to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/timestampOffset">SourceBuffer.timestampOffset - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-timestampoffset">timestampOffset - Media Source Extensions</a>
   */
  public double timestampOffset;

  protected SourceBuffer() {
  }

  /**
   * The audioTracks read-only property of the SourceBuffer interface returns a list of the audio tracks currently contained inside the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/audioTracks">SourceBuffer.audioTracks - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-audiotracks">audioTracks - Media Source Extensions</a>
   */
  @JsProperty(
      name = "audioTracks"
  )
  @Nonnull
  public native AudioTrackList audioTracks();

  /**
   * The buffered read-only property of the SourceBuffer interface returns the time ranges that are currently buffered in the SourceBuffer as a normalized TimeRanges object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/buffered">SourceBuffer.buffered - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-buffered">buffered - Media Source Extensions</a>
   */
  @JsProperty(
      name = "buffered"
  )
  @Nonnull
  public native TimeRanges buffered();

  /**
   * The textTracks read-only property of the SourceBuffer interface returns a list of the text tracks currently contained inside the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/textTracks">SourceBuffer.textTracks - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-texttracks">textTracks - Media Source Extensions</a>
   */
  @JsProperty(
      name = "textTracks"
  )
  @Nonnull
  public native TextTrackList textTracks();

  /**
   * The updating read-only property of the SourceBuffer interface indicates whether the SourceBuffer is currently being updated &mdash; i.e. whether an SourceBuffer.appendBuffer(),  SourceBuffer.appendStream(), or SourceBuffer.remove() operation is currently in progress.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/updating">SourceBuffer.updating - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-updating">updating - Media Source Extensions</a>
   */
  @JsProperty(
      name = "updating"
  )
  public native boolean updating();

  /**
   * The videoTracks read-only property of the SourceBuffer interface returns a list of the video tracks currently contained inside the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/videoTracks">SourceBuffer.videoTracks - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-videotracks">videoTracks - Media Source Extensions</a>
   */
  @JsProperty(
      name = "videoTracks"
  )
  @Nonnull
  public native VideoTrackList videoTracks();

  /**
   * The abort() method of the SourceBuffer interface aborts the current segment and resets the segment parser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/abort">SourceBuffer.abort - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-sourcebuffer-abort">abort() - Media Source Extensions</a>
   */
  public native void abort();

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-sourcebuffer-appendbuffer">appendBuffer() - Media Source Extensions</a>
   */
  public native void appendBuffer(@Nonnull BufferSource data);

  /**
   * The remove() method of the SourceBuffer interface removes media segments within a specific time range from the SourceBuffer. This method can only be called when SourceBuffer.updating equals false. If SourceBuffer.updating is not equal to false, call SourceBuffer.abort().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/remove">SourceBuffer.remove - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-sourcebuffer-remove">remove() - Media Source Extensions</a>
   */
  public native void remove(double start, double end);
}
