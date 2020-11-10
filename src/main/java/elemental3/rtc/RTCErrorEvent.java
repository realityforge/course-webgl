package elemental3.rtc;

import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebRTC API's RTCErrorEvent interface represents an error sent to a WebRTC object. It's based on the standard Event interface, but adds RTC-specific information describing the error, as shown below.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCErrorEvent">RTCErrorEvent - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcerrorevent">The definition of 'RTCErrorEvent' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCErrorEvent"
)
public class RTCErrorEvent extends Event {
  public RTCErrorEvent(@Nonnull final String type, @Nonnull final RTCErrorEventInit eventInitDict) {
    super( null );
  }

  /**
   * The read-only RTCErrorEvent property error contains an RTCError object describing the details of the error which the event is announcing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCErrorEvent/error">RTCErrorEvent.error - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcerrorevent-error">The definition of 'RTCErrorEvent.error' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nonnull
  public native RTCError error();
}
