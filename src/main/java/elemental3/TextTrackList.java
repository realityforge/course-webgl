package elemental3;

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
 * The TextTrackList interface is used to represent a list of the text tracks defined by the &lt;track&gt; element, with each track represented by a separate textTrack object in the list.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList">TextTrackList - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#texttracklist">TexTrackList - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextTrackList"
)
public class TextTrackList extends EventTarget {
  /**
   * The TextTrackList property onaddtrack is an event handler which is called when the addtrack event occurs, indicating that a new text track has been added to the media element whose text tracks the TextTrackList represents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/onaddtrack">TextTrackList.onaddtrack - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-tracklist-onaddtrack">TextTrackList: onaddtrack - HTML Living Standard</a>
   */
  @Nullable
  public TrackEventHandler onaddtrack;

  /**
   * The TextTrackList property onchange is an event handler which is called when the change event occurs, indicating that a change has occurred on a TextTrack in the VideoTrackList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/onchange">TextTrackList.onchange - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-tracklist-onchange">TextTrackList: onchange - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onchange;

  /**
   * The TextTrackList onremovetrack event handler is called when the removetrack event occurs, indicating that a text track has been removed from the media element, and therefore also from the TextTrackList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/onremovetrack">TextTrackList.onremovetrack - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#handler-tracklist-onremovetrack">TextTrackList: onremovetrack - HTML Living Standard</a>
   */
  @Nullable
  public EventHandler onremovetrack;

  protected TextTrackList() {
  }

  /**
   * The read-only TextTrackList property length returns the number of entries in the TextTrackList, each of which is a TextTrack representing one track in the media element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/length">TextTrackList.length - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-texttracklist-length">TextTrackList: length - HTML Living Standard</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The TextTrackList method getTrackById() returns the first TextTrack object from the track list whose id matches the specified string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/getTrackById">TextTrackList.getTrackById - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-texttracklist-gettrackbyid">TextTrackList.getTrackById() - HTML Living Standard</a>
   */
  @Nullable
  public native TextTrack getTrackById(@Nonnull String id);

  @JsOverlay
  @Nonnull
  public final TextTrack getAt(final int index) {
    return Js.<JsArrayLike<TextTrack>>cast( this ).getAt( index );
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
