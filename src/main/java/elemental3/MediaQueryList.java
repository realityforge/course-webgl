package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A MediaQueryList object stores information on a media query applied to a document, with support for both immediate and event-driven matching against the state of the document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryList">MediaQueryList - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#the-mediaquerylist-interface">MediaQueryList - CSS Object Model (CSSOM) View Module</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaQueryList"
)
public class MediaQueryList extends EventTarget {
  /**
   * The onchange property of the MediaQueryList interface is an event handler property representing a function that is invoked when the change event fires, i.e when the status of media query support changes. The event object is a MediaQueryListEvent instance, which is recognised as a MediaListQuery instance in older browsers, for backwards compatibility purposes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryList/onchange">MediaQueryList.onchange - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mediaquerylist-onchange">onchange - CSS Object Model (CSSOM) View Module</a>
   */
  @Nullable
  public EventHandler onchange;

  protected MediaQueryList() {
  }

  /**
   * The matches read-only property of the MediaQueryList interface is a Boolean that returns true if the document currently matches the media query list, or false if not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryList/matches">MediaQueryList.matches - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mediaquerylist-matches">matches - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "matches"
  )
  public native boolean matches();

  /**
   * The media read-only property of the MediaQueryList interface is a DOMString representing a serialized media query.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryList/media">MediaQueryList.media - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mediaquerylist-media">media - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "media"
  )
  @Nonnull
  public native String media();

  /**
   * The addListener() method of the MediaQueryList interface adds a listener to the MediaQueryListener that will run a custom callback function in response to the media query status changing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryList/addListener">MediaQueryList.addListener - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mediaquerylist-addlistener">addListener - CSS Object Model (CSSOM) View Module</a>
   */
  public native void addListener(@Nullable EventListener callback);

  /**
   * The removeListener() method of the MediaQueryList interface removes a listener from the MediaQueryListener.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaQueryList/removeListener">MediaQueryList.removeListener - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-mediaquerylist-removelistener">removeListener - CSS Object Model (CSSOM) View Module</a>
   */
  public native void removeListener(@Nullable EventListener callback);
}
