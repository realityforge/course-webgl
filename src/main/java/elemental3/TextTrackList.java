package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The TextTrackList interface is used to represent a list of the text tracks defined by the track element, with each track represented by a separate textTrack object in the list.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList">TextTrackList - MDN</a>
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
   */
  @Nullable
  public TrackEventHandler onaddtrack;

  /**
   * The TextTrackList property onchange is an event handler which is called when the change event occurs, indicating that a change has occurred on a TextTrack in the VideoTrackList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/onchange">TextTrackList.onchange - MDN</a>
   */
  @Nullable
  public EventHandler onchange;

  /**
   * The TextTrackList onremovetrack event handler is called when the removetrack event occurs, indicating that a text track has been removed from the media element, and therefore also from the TextTrackList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/onremovetrack">TextTrackList.onremovetrack - MDN</a>
   */
  @Nullable
  public EventHandler onremovetrack;

  TextTrackList() {
  }

  /**
   * The read-only TextTrackList property length returns the number of entries in the TextTrackList, each of which is a TextTrack representing one track in the media element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/length">TextTrackList.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The TextTrackList method getTrackById() returns the first TextTrack object from the track list whose id matches the specified string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackList/getTrackById">TextTrackList.getTrackById - MDN</a>
   */
  @Nullable
  public native TextTrack getTrackById(@Nonnull String id);

  @JsOverlay
  public final void addAddtrackListener(@Nonnull final TrackEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "addtrack", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAddtrackListener(@Nonnull final TrackEventListener callback,
      final boolean options) {
    addEventListener( "addtrack", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "addtrack", Js.cast( callback ), options );
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
      final boolean options) {
    addEventListener( "change", Js.cast( callback ), options );
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
      final boolean options) {
    removeEventListener( "change", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeChangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "change", Js.cast( callback ) );
  }
}
