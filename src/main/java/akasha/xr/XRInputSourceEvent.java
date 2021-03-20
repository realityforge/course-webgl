package akasha.xr;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebXR Device API's XRInputSourceEvent interface describes an event which has occurred on a WebXR user input device such as a hand controller, gaze tracking system, or motion tracking system.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEvent">XRInputSourceEvent - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourceevent">XRInputSourceEvent - WebXR Device API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRInputSourceEvent"
)
public class XRInputSourceEvent extends Event {
  /**
   * The XRInputSourceEvent() constructor creates and returns a new XRInputSourceEvent object describing an event (state change) which has occurred on a WebXR user input device represented by an XRInputSource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEvent/XRInputSourceEvent">XRInputSourceEvent.XRInputSourceEvent - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourceevent">XRInputSourceEvent - WebXR Device API</a>
   */
  public XRInputSourceEvent(@Nonnull final String type,
      @Nonnull final XRInputSourceEventInit eventInitDict) {
    super( null );
  }

  /**
   * The read-only XRInputSourceEvent property frame specifies an XRFrame object representing the event frame during which a WebXR user input occurred.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEvent/frame">XRInputSourceEvent.frame - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceevent-frame">XRInputSourceEvent.frame - WebXR Device API</a>
   */
  @JsProperty(
      name = "frame"
  )
  @Nonnull
  public native XRFrame frame();

  /**
   * The XRInputSourceEvent interface's read-only inputSource property specifies the XRInputSource which generated the input event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEvent/inputSource">XRInputSourceEvent.inputSource - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#dom-xrinputsourceevent-inputsource">XRInputSourceEvent.inputSource - WebXR Device API</a>
   */
  @JsProperty(
      name = "inputSource"
  )
  @Nonnull
  public native XRInputSource inputSource();
}
