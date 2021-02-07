package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A CloseEvent is sent to clients using WebSockets when the connection is closed. This is delivered to the listener indicated by the WebSocket object's onclose attribute.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CloseEvent">CloseEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/web-sockets.html#the-closeevent-interface">CloseEvent - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CloseEvent"
)
public class CloseEvent extends Event {
  /**
   * The CloseEvent() constructor creates a new CloseEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CloseEvent/CloseEvent">CloseEvent.CloseEvent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#closeevent">CloseEvent() - HTML Living Standard</a>
   */
  public CloseEvent(@Nonnull final String type, @Nonnull final CloseEventInit eventInitDict) {
    super( null );
  }

  /**
   * The CloseEvent() constructor creates a new CloseEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CloseEvent/CloseEvent">CloseEvent.CloseEvent - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/comms.html#closeevent">CloseEvent() - HTML Living Standard</a>
   */
  public CloseEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "code"
  )
  public native int code();

  @JsProperty(
      name = "reason"
  )
  @Nonnull
  public native String reason();

  @JsProperty(
      name = "wasClean"
  )
  public native boolean wasClean();
}
