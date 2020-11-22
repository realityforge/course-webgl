package elemental3.media;

import elemental3.AddEventListenerOptions;
import elemental3.EventListenerOptions;
import elemental3.EventTarget;
import elemental3.core.JsArray;
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
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediastream">The definition of 'MediaStream' in the 'Media Capture and Streams' specification.</a>
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
   * @see <a href="https://w3c.github.io/mediacapture-main/#event-mediastream-addtrack">The definition of 'MediaStream.onaddtrack' in the 'Media Capture and Streams' specification.</a>
   */
  @Nullable
  public MediaStreamTrackEventHandler onaddtrack;

  /**
   * The MediaStream.onremovetrack property is an EventHandler which specifies a function to be called when the removetrack event occurs on a MediaStream instance. This happens when a track of any kind is removed from the media stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/onremovetrack">MediaStream.onremovetrack - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediastream-onremovetrack">The definition of 'MediaStream.onremovetrack' in the 'Media Capture and Streams' specification.</a>
   */
  @Nullable
  public MediaStreamTrackEventHandler onremovetrack;

  /**
   * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks, each represented by a MediaStreamTrack object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/MediaStream">MediaStream.MediaStream - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#mediastream">The definition of 'MediaStream' in the 'Media Capture and Streams' specification.</a>
   */
  public MediaStream() {
  }

  /**
   * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks, each represented by a MediaStreamTrack object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/MediaStream">MediaStream.MediaStream - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#mediastream">The definition of 'MediaStream' in the 'Media Capture and Streams' specification.</a>
   */
  public MediaStream(@Nonnull final MediaStream stream) {
  }

  /**
   * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks, each represented by a MediaStreamTrack object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/MediaStream">MediaStream.MediaStream - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#mediastream">The definition of 'MediaStream' in the 'Media Capture and Streams' specification.</a>
   */
  public MediaStream(@Nonnull final JsArray<MediaStreamTrack> tracks) {
  }

  /**
   * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks, each represented by a MediaStreamTrack object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/MediaStream">MediaStream.MediaStream - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#mediastream">The definition of 'MediaStream' in the 'Media Capture and Streams' specification.</a>
   */
  public MediaStream(@Nonnull final MediaStreamTrack[] tracks) {
  }

  /**
   * The active read-only property of the MediaStream interface returns a Boolean value which is true if the stream is currently active; otherwise, it returns false. A stream is considered active if at least one of its MediaStreamTracks is not in the MediaStreamTrack.ended state. Once every track has ended, the stream's active property becomes false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/active">MediaStream.active - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediastream-active">The definition of 'active' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "active"
  )
  public native boolean active();

  /**
   * The MediaStream.id() read-only property is a DOMString containing 36 characters denoting a unique identifier (GUID) for the object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/id">MediaStream.id - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediastream-id">The definition of 'MediaStream.id' in the 'Media Capture and Streams' specification.</a>
   */
  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  /**
   * The MediaStream.addTrack() method adds a new track to the stream. The track is specified as a parameter of type MediaStreamTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/addTrack">MediaStream.addTrack - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediastream-addtrack">The definition of 'addTrack()' in the 'Media Capture and Streams' specification.</a>
   */
  public native void addTrack(@Nonnull MediaStreamTrack track);

  /**
   * The clone() method of the MediaStream interface creates a duplicate of the MediaStream. This new MediaStream object has a new unique id and contains clones of every MediaStreamTrack contained by the MediaStream on which clone() was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/clone">MediaStream.clone - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediastream-clone">The definition of 'MediaStream.clone()' in the 'Media Capture and Streams' specification.</a>
   */
  @JsMethod(
      name = "clone"
  )
  @Nonnull
  public native MediaStream clone_();

  /**
   * The getAudioTracks() method of the MediaStream interface returns a sequence that represents all the MediaStreamTrack objects in this stream's track set where MediaStreamTrack.kind is audio.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/getAudioTracks">MediaStream.getAudioTracks - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediastream-getaudiotracks">The definition of 'getAudioTracks()' in the 'Media Capture and Streams' specification.</a>
   */
  @Nonnull
  public native JsArray<MediaStreamTrack> getAudioTracks();

  /**
   * The MediaStream.getTrackById() method returns a MediaStreamTrack object representing the track with the specified ID string. If there is no track with the specified ID, this method returns null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/getTrackById">MediaStream.getTrackById - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediastream-gettrackbyid">The definition of 'getTrackById()' in the 'Media Capture and Streams' specification.</a>
   */
  @Nullable
  public native MediaStreamTrack getTrackById(@Nonnull String trackId);

  /**
   * The getTracks() method of the MediaStream interface returns a sequence that represents all the MediaStreamTrack objects in this stream's track set, regardless of MediaStreamTrack.kind.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/getTracks">MediaStream.getTracks - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediastream-gettracks">The definition of 'getTracks()' in the 'Media Capture and Streams' specification.</a>
   */
  @Nonnull
  public native JsArray<MediaStreamTrack> getTracks();

  /**
   * The getVideoTracks() method of the MediaStream interface returns a sequence of MediaStreamTrack objects representing the video tracks in this stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/getVideoTracks">MediaStream.getVideoTracks - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediastream-getvideotracks">The definition of 'getVideoTracks()' in the 'Media Capture and Streams' specification.</a>
   */
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
      final boolean useCapture) {
    addEventListener( "addtrack", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "addtrack", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    addEventListener( "removetrack", Js.cast( callback ), useCapture );
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
      final boolean useCapture) {
    removeEventListener( "removetrack", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeRemovetrackListener(
      @Nonnull final MediaStreamTrackEventListener callback) {
    removeEventListener( "removetrack", Js.cast( callback ) );
  }
}
