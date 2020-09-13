package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The MediaStream interface represents a stream of media content. A stream consists of several tracks such as video or audio tracks. Each track is specified as an instance of MediaStreamTrack.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream">MediaStream - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStream"
)
public class MediaStream extends EventTarget {
  /**
   * The MediaStream.onaddtrack property is an EventHandler which specifies a function to be called when the addtrack event occurs on a MediaStream instance. This happens when a new track of any kind is added to the media stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/onaddtrack">MediaStream.onaddtrack - MDN</a>
   */
  @Nullable
  public MediaStreamTrackEventHandler onaddtrack;

  /**
   * The MediaStream.onremovetrack property is an EventHandler which specifies a function to be called when the removetrack event occurs on a MediaStream instance. This happens when a track of any kind is removed from the media stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/onremovetrack">MediaStream.onremovetrack - MDN</a>
   */
  @Nullable
  public MediaStreamTrackEventHandler onremovetrack;

  /**
   * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks, each represented by a MediaStreamTrack object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/MediaStream">MediaStream.MediaStream - MDN</a>
   */
  public MediaStream() {
  }

  /**
   * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks, each represented by a MediaStreamTrack object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/MediaStream">MediaStream.MediaStream - MDN</a>
   */
  public MediaStream(@Nonnull final MediaStream stream) {
  }

  /**
   * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks, each represented by a MediaStreamTrack object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/MediaStream">MediaStream.MediaStream - MDN</a>
   */
  public MediaStream(@Nonnull final JsArray<MediaStreamTrack> tracks) {
  }

  /**
   * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks, each represented by a MediaStreamTrack object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/MediaStream">MediaStream.MediaStream - MDN</a>
   */
  public MediaStream(@Nonnull final MediaStreamTrack[] tracks) {
  }

  /**
   * The active read-only property of the MediaStream interface returns a Boolean value which is true if the stream is currently active; otherwise, it returns false. A stream is considered active if at least one of its MediaStreamTracks is not in the MediaStreamTrack.ended state. Once every track has ended, the stream's active property becomes false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/active">MediaStream.active - MDN</a>
   */
  @JsProperty(
      name = "active"
  )
  public native boolean active();

  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  /**
   * The MediaStream.addTrack() method adds a new track to the stream. The track is specified as a parameter of type MediaStreamTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/addTrack">MediaStream.addTrack - MDN</a>
   */
  public native void addTrack(@Nonnull MediaStreamTrack track);

  @JsMethod(
      name = "clone"
  )
  @Nonnull
  public native MediaStream clone_();

  @Nonnull
  public native JsArray<MediaStreamTrack> getAudioTracks();

  @Nullable
  public native MediaStreamTrack getTrackById(@Nonnull String trackId);

  @Nonnull
  public native JsArray<MediaStreamTrack> getTracks();

  @Nonnull
  public native JsArray<MediaStreamTrack> getVideoTracks();

  public native void removeTrack(@Nonnull MediaStreamTrack track);

  @JsOverlay
  public final void addAddtrackListener(@Nonnull final MediaStreamTrackEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "addtrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAddtrackListener(@Nonnull final MediaStreamTrackEventListener callback,
      final boolean options) {
    addEventListener( "addtrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAddtrackListener(@Nonnull final MediaStreamTrackEventListener callback) {
    addEventListener( "addtrack", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAddtrackListener(@Nonnull final MediaStreamTrackEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "addtrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAddtrackListener(@Nonnull final MediaStreamTrackEventListener callback,
      final boolean options) {
    removeEventListener( "addtrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAddtrackListener(@Nonnull final MediaStreamTrackEventListener callback) {
    removeEventListener( "addtrack", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addRemovetrackListener(@Nonnull final MediaStreamTrackEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "removetrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addRemovetrackListener(@Nonnull final MediaStreamTrackEventListener callback,
      final boolean options) {
    addEventListener( "removetrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addRemovetrackListener(@Nonnull final MediaStreamTrackEventListener callback) {
    addEventListener( "removetrack", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeRemovetrackListener(@Nonnull final MediaStreamTrackEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "removetrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeRemovetrackListener(@Nonnull final MediaStreamTrackEventListener callback,
      final boolean options) {
    removeEventListener( "removetrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeRemovetrackListener(
      @Nonnull final MediaStreamTrackEventListener callback) {
    removeEventListener( "removetrack", Js.cast( callback ) );
  }
}
