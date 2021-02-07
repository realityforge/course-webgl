package elemental3.xr;

import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API's XRSessionEvent interface describes an event which indicates the change of the state of an XRSession.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionEvent">XRSessionEvent - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrsessionevent">XRSessionEvent - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRSessionEvent"
)
public class XRSessionEvent extends Event {
  /**
   * The WebXR Device API's XRSessionEvent() constructor creates and returns a new XRSessionEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionEvent/XRSessionEvent">XRSessionEvent.XRSessionEvent - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsessionevent-xrsessionevent">XRSessionEvent() constructor - WebXR Device API</a>
   */
  public XRSessionEvent(@Nonnull final String type,
      @Nonnull final XRSessionEventInit eventInitDict) {
    super( null );
  }

  /**
   * The read-only XRSessionEvent interface's session property indicates which XRSession the event is about.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionEvent/session">XRSessionEvent.session - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrsessionevent-session">XRSessionEvent.session - WebXR Device API</a>
   */
  @JsProperty(
      name = "session"
  )
  @Nonnull
  public native XRSession session();
}
