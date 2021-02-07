package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TrackEvent interface, which is part of the HTML DOM specification, is used for events which represent changes to a set of available tracks on an HTML media element; these events are addtrack and removetrack.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TrackEvent">TrackEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/media.html#the-trackevent-interface">TrackEvent - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#trackevent">TrackEvent - HTML5</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TrackEvent"
)
public class TrackEvent extends Event {
  /**
   * The TrackEvent() constructor creates and returns a new TrackEvent object describing an event which occurred on a list of tracks (AudioTrackList, VideoTrackList, or TextTrackList).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TrackEvent/TrackEvent">TrackEvent.TrackEvent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/media.html#dom-trackevent-trackevent">TrackEvent() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/semantics-embedded-content.html#dom-trackevent-trackevent">TrackEvent() - HTML5</a>
   */
  public TrackEvent(@Nonnull final String type, @Nonnull final TrackEventInit eventInitDict) {
    super( null );
  }

  /**
   * The TrackEvent() constructor creates and returns a new TrackEvent object describing an event which occurred on a list of tracks (AudioTrackList, VideoTrackList, or TextTrackList).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TrackEvent/TrackEvent">TrackEvent.TrackEvent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/media.html#dom-trackevent-trackevent">TrackEvent() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/semantics-embedded-content.html#dom-trackevent-trackevent">TrackEvent() - HTML5</a>
   */
  public TrackEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The read-only track property of the TrackEvent interface specifies the media track object to which the event applies.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TrackEvent/track">TrackEvent.track - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/media.html#dom-trackevent-track">TrackEvent.track - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-trackevent-track">TrackEvent.track - HTML5</a>
   */
  @JsProperty(
      name = "track"
  )
  @Nullable
  public native VideoTrackOrAudioTrackOrTextTrackUnion track();
}
