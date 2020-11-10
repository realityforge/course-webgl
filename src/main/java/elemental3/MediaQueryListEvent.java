package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaQueryListEvent object stores information on the changes that have happened to a MediaQueryList object &mdash; instances are available as the event object on a function referenced by a MediaQueryList.onchange property or MediaQueryList.addListener() call.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryListEvent">MediaQueryListEvent - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#mediaquerylistevent">The definition of 'MediaQueryListEvent' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaQueryListEvent"
)
public class MediaQueryListEvent extends Event {
  /**
   * The MediaQueryListEvent constructor creates a new MediaQueryListEvent instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryListEvent/MediaQueryListEvent">MediaQueryListEvent.MediaQueryListEvent - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mediaquerylistevent-mediaquerylistevent">The definition of 'MediaQueryListEvent()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public MediaQueryListEvent(@Nonnull final String type,
      @Nonnull final MediaQueryListEventInit eventInitDict) {
    super( null );
  }

  /**
   * The MediaQueryListEvent constructor creates a new MediaQueryListEvent instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryListEvent/MediaQueryListEvent">MediaQueryListEvent.MediaQueryListEvent - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mediaquerylistevent-mediaquerylistevent">The definition of 'MediaQueryListEvent()' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  public MediaQueryListEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The matches read-only property of the MediaQueryListEvent interface is a Boolean that returns true if the document currently matches the media query list, or false if not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryListEvent/matches">MediaQueryListEvent.matches - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mediaquerylistevent-matches">The definition of 'matches' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "matches"
  )
  public native boolean matches();

  /**
   * The media read-only property of the MediaQueryListEvent interface is a DOMString representing a serialized media query.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryListEvent/media">MediaQueryListEvent.media - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mediaquerylistevent-media">The definition of 'media' in the 'CSS Object Model (CSSOM) View Module' specification.</a>
   */
  @JsProperty(
      name = "media"
  )
  @Nonnull
  public native String media();
}
