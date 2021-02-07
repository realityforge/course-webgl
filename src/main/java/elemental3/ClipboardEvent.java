package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ClipboardEvent interface represents events providing information related to modification of the clipboard, that is cut, copy, and paste events.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ClipboardEvent">ClipboardEvent - MDN</a>
 * @see <a href="https://w3c.github.io/clipboard-apis/#clipboard-event-interfaces">ClipboardEvent - Clipboard API and events</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ClipboardEvent"
)
public class ClipboardEvent extends Event {
  /**
   * The ClipboardEvent() constructor returns a newly created ClipboardEvent, representing an event providing information related to modification of the clipboard, that is cut, copy, and paste events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ClipboardEvent/ClipboardEvent">ClipboardEvent.ClipboardEvent - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#dom-clipboardevent-clipboardevent">ClipboardEvent() - Clipboard API and events</a>
   */
  public ClipboardEvent(@Nonnull final String type,
      @Nonnull final ClipboardEventInit eventInitDict) {
    super( null );
  }

  /**
   * The ClipboardEvent() constructor returns a newly created ClipboardEvent, representing an event providing information related to modification of the clipboard, that is cut, copy, and paste events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ClipboardEvent/ClipboardEvent">ClipboardEvent.ClipboardEvent - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#dom-clipboardevent-clipboardevent">ClipboardEvent() - Clipboard API and events</a>
   */
  public ClipboardEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The ClipboardEvent.clipboardData property holds a DataTransfer object, which can be used:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ClipboardEvent/clipboardData">ClipboardEvent.clipboardData - MDN</a>
   * @see <a href="https://w3c.github.io/clipboard-apis/#clipboardevent-clipboarddata">ClipboardEvent.clipboardData - Clipboard API and events</a>
   */
  @JsProperty(
      name = "clipboardData"
  )
  @Nullable
  public native DataTransfer clipboardData();
}
