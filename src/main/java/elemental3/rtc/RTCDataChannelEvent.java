package elemental3.rtc;

import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCDataChannelEvent() constructor returns a new RTCDataChannelEvent object, which represents a datachannel event. These events sent to an RTCPeerConnection when its remote peer is asking to open an RTCDataChannel between the two peers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannelEvent">RTCDataChannelEvent - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcdatachannelevent">RTCDataChannelEvent - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCDataChannelEvent"
)
public class RTCDataChannelEvent extends Event {
  /**
   * The RTCDataChannelEvent() constructor creates a new RTCDataChannelEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannelEvent/RTCDataChannelEvent">RTCDataChannelEvent.RTCDataChannelEvent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdatachannelevent">RTCDataChannelEvent - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public RTCDataChannelEvent(@Nonnull final String type,
      @Nonnull final RTCDataChannelEventInit eventInitDict) {
    super( null );
  }

  /**
   * The read-only property RTCDataChannelEvent.channel returns the RTCDataChannel associated with the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDataChannelEvent/channel">RTCDataChannelEvent.channel - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-datachannelevent-channel">RTCDataChannelEvent.channel - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "channel"
  )
  @Nonnull
  public native RTCDataChannel channel();
}
