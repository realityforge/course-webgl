package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The AudioTrackList interface is used to represent a list of the audio tracks contained within a given HTML media element, with each track represented by a separate AudioTrack object in the list.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrackList">AudioTrackList - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/media.html#audiotracklist">AudioTrackList - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#audiotracklist">AudioTrackList - HTML5</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioTrackList"
)
public class AudioTrackList extends EventTarget {
  /**
   * The AudioTrackList property onaddtrack is an event handler which is called when the addtrack event occurs, indicating that a new audio track has been added to the media element whose audio tracks the AudioTrackList represents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrackList/onaddtrack">AudioTrackList.onaddtrack - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-tracklist-onaddtrack">AudioTrackList.onaddtrack - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-audiotracklist-onaddtrack">AudioTrackList.onaddtrack - HTML5</a>
   */
  @Nullable
  public TrackEventHandler onaddtrack;

  /**
   * The AudioTrackList property onchange is an event handler which is called when the change event occurs, indicating that one or more of the AudioTracks in the AudioTrackList have been enabled or disabled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrackList/onchange">AudioTrackList.onchange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-tracklist-onchange">AudioTrackList.onchange - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-audiotracklist-onchange">AudioTrackList.onchange - HTML5</a>
   */
  @Nullable
  public EventHandler onchange;

  /**
   * The AudioTrackList onremovetrack event handler is called when the removetrack event occurs, indicating that an audio track has been removed from the media element, and therefore also from the AudioTrackList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrackList/onremovetrack">AudioTrackList.onremovetrack - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-tracklist-onremovetrack">AudioTrackList.onremovetrack - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-audiotracklist-onremovetrack">AudioTrackList.onremovetrack - HTML5</a>
   */
  @Nullable
  public TrackEventHandler onremovetrack;

  protected AudioTrackList() {
  }

  /**
   * The read-only AudioTrackList property length returns the number of entries in the AudioTrackList, each of which is an AudioTrack representing one audio track in the media element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrackList/length">AudioTrackList.length - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/media.html#dom-audiotracklist-length">AudioTrackList.length - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-audiotracklist-length">AudioTrackList.length - HTML5</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The AudioTrackList method getTrackById() returns the first AudioTrack object from the track list whose id matches the specified string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioTrackList/getTrackById">AudioTrackList.getTrackById - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-audiotracklist-gettrackbyid">AudioTrackList.getTrackById() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-audiotracklist-getTrackById">AudioTrackList.getTrackById() - HTML5</a>
   */
  @Nullable
  public native AudioTrack getTrackById(@Nonnull String id);

  @JsOverlay
  @Nonnull
  public final AudioTrack getAt(final int index) {
    return Js.<JsArrayLike<AudioTrack>>cast( this ).getAt( index );
  }

  @JsOverlay
  public final void addAddtrackListener(@Nonnull final TrackEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "addtrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAddtrackListener(@Nonnull final TrackEventListener callback,
      final boolean useCapture) {
    addEventListener( "addtrack", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAddtrackListener(@Nonnull final TrackEventListener callback) {
    addEventListener( "addtrack", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAddtrackListener(@Nonnull final TrackEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "addtrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAddtrackListener(@Nonnull final TrackEventListener callback,
      final boolean useCapture) {
    removeEventListener( "addtrack", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAddtrackListener(@Nonnull final TrackEventListener callback) {
    removeEventListener( "addtrack", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addRemovetrackListener(@Nonnull final TrackEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "removetrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addRemovetrackListener(@Nonnull final TrackEventListener callback,
      final boolean useCapture) {
    addEventListener( "removetrack", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addRemovetrackListener(@Nonnull final TrackEventListener callback) {
    addEventListener( "removetrack", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeRemovetrackListener(@Nonnull final TrackEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "removetrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeRemovetrackListener(@Nonnull final TrackEventListener callback,
      final boolean useCapture) {
    removeEventListener( "removetrack", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeRemovetrackListener(@Nonnull final TrackEventListener callback) {
    removeEventListener( "removetrack", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addChangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "change", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addChangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "change", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addChangeListener(@Nonnull final EventListener callback) {
    addEventListener( "change", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeChangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "change", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeChangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "change", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeChangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "change", Js.cast( callback ) );
  }
}
