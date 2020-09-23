package elemental3.media;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental3.ArrayBufferView;
import elemental3.AudioTrackList;
import elemental3.BufferSource;
import elemental3.EventHandler;
import elemental3.EventTarget;
import elemental3.TextTrackList;
import elemental3.TimeRanges;
import elemental3.VideoTrackList;
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
   */
  public double appendWindowEnd;

  /**
   * The appendWindowStart property of the SourceBuffer interface controls the timestamp for the start of the append window, a timestamp range that can be used to filter what media data is appended to the SourceBuffer. Coded media frames with timestamps wthin this range will be appended, whereas those outside the range will be filtered out.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendWindowStart">SourceBuffer.appendWindowStart - MDN</a>
   */
  public double appendWindowStart;

  /**
   * The mode property of the SourceBuffer interface controls whether media segments can be appended to the SourceBuffer in any order, or in a strict sequence.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/mode">SourceBuffer.mode - MDN</a>
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
   */
  public double timestampOffset;

  protected SourceBuffer() {
  }

  /**
   * The audioTracks read-only property of the SourceBuffer interface returns a list of the audio tracks currently contained inside the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/audioTracks">SourceBuffer.audioTracks - MDN</a>
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
   */
  @JsProperty(
      name = "updating"
  )
  public native boolean updating();

  /**
   * The videoTracks read-only property of the SourceBuffer interface returns a list of the video tracks currently contained inside the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/videoTracks">SourceBuffer.videoTracks - MDN</a>
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
   */
  public native void abort();

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull BufferSource data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull ArrayBufferView data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull Int8Array data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull Int16Array data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull Int32Array data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull Uint8Array data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull Uint16Array data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull Uint32Array data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull Uint8ClampedArray data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull Float32Array data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull Float64Array data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull DataView data);

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   */
  public native void appendBuffer(@Nonnull ArrayBuffer data);

  /**
   * The remove() method of the SourceBuffer interface removes media segments within a specific time range from the SourceBuffer. This method can only be called when SourceBuffer.updating equals false. If SourceBuffer.updating is not equal to false, call SourceBuffer.abort().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/remove">SourceBuffer.remove - MDN</a>
   */
  public native void remove(double start, double end);
}