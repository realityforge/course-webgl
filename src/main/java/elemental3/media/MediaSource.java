package elemental3.media;

import elemental3.EventHandler;
import elemental3.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaSource interface of the Media Source Extensions API represents a source of media data for an HTMLMediaElement object. A MediaSource object can be attached to a HTMLMediaElement to be played in the user agent.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource">MediaSource - MDN</a>
 * @see <a href="https://w3c.github.io/media-source/#mediasource">MediaSource - Media Source Extensions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaSource"
)
public class MediaSource extends EventTarget {
  /**
   * The duration property of the MediaSource interface gets and sets the duration of the current media being presented.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/duration">MediaSource.duration - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-mediasource-duration">duration - Media Source Extensions</a>
   */
  public double duration;

  @Nullable
  public EventHandler onsourceclose;

  @Nullable
  public EventHandler onsourceended;

  @Nullable
  public EventHandler onsourceopen;

  protected MediaSource() {
  }

  /**
   * The activeSourceBuffers read-only property of the MediaSource interface returns a SourceBufferList object containing a subset of the SourceBuffer objects contained within sourceBuffers &mdash; the list of objects providing the selected video track, enabled audio tracks, and shown/hidden text tracks.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/activeSourceBuffers">MediaSource.activeSourceBuffers - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-mediasource-activesourcebuffers">activeSourceBuffers - Media Source Extensions</a>
   */
  @JsProperty(
      name = "activeSourceBuffers"
  )
  @Nonnull
  public native SourceBufferList activeSourceBuffers();

  /**
   * The readyState read-only property of the MediaSource interface returns an enum representing the state of the current MediaSource. The three possible values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/readyState">MediaSource.readyState - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-mediasource-readystate">readyState - Media Source Extensions</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  @ReadyState
  public native String readyState();

  /**
   * The sourceBuffers read-only property of the MediaSource interface returns a SourceBufferList object containing the list of SourceBuffer objects associated with this MediaSource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/sourceBuffers">MediaSource.sourceBuffers - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-mediasource-sourcebuffers">sourceBuffers - Media Source Extensions</a>
   */
  @JsProperty(
      name = "sourceBuffers"
  )
  @Nonnull
  public native SourceBufferList sourceBuffers();

  /**
   * The MediaSource.isTypeSupported() static method returns a Boolean value which is true if the given MIME type is likely to be supported by the current user agent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/isTypeSupported">MediaSource.isTypeSupported - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-mediasource-istypesupported">isTypeSupported() - Media Source Extensions</a>
   */
  public static native boolean isTypeSupported(@Nonnull String type);

  /**
   * The addSourceBuffer() method of the MediaSource interface creates a new SourceBuffer of the given MIME type and adds it to the MediaSource's sourceBuffers list. The new SourceBuffer is also returned.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/addSourceBuffer">MediaSource.addSourceBuffer - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-mediasource-addsourcebuffer">addSourceBuffer() - Media Source Extensions</a>
   */
  @Nonnull
  public native SourceBuffer addSourceBuffer(@Nonnull String type);

  /**
   * The clearLiveSeekableRange() method of the MediaSource interface clears a seekable range previously set with a call to setLiveSeekableRange().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/clearLiveSeekableRange">MediaSource.clearLiveSeekableRange - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-mediasource-clearliveseekablerange">clearLiveSeekableRange() - Media Source Extensions</a>
   */
  public native void clearLiveSeekableRange();

  /**
   * The endOfStream() method of the MediaSource interface signals the end of the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/endOfStream">MediaSource.endOfStream - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-mediasource-endofstream">endOfStream() - Media Source Extensions</a>
   */
  public native void endOfStream(@EndOfStreamError @Nonnull String error);

  /**
   * The endOfStream() method of the MediaSource interface signals the end of the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/endOfStream">MediaSource.endOfStream - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-mediasource-endofstream">endOfStream() - Media Source Extensions</a>
   */
  public native void endOfStream();

  /**
   * The removeSourceBuffer() method of the MediaSource interface removes the given SourceBuffer from the SourceBuffers list associated with this MediaSource object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/removeSourceBuffer">MediaSource.removeSourceBuffer - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-mediasource-removesourcebuffer">removeSourceBuffer() - Media Source Extensions</a>
   */
  public native void removeSourceBuffer(@Nonnull SourceBuffer sourceBuffer);

  /**
   * The setLiveSeekableRange() method of the MediaSource interface sets the range that the user can seek to in the media element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/setLiveSeekableRange">MediaSource.setLiveSeekableRange - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-mediasource-setliveseekablerange">setLiveSeekableRange() - Media Source Extensions</a>
   */
  public native void setLiveSeekableRange(double start, double end);
}
