package akasha.rtc;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCPeerConnectionIceEvent interface represents events that occurs in relation to ICE candidates with the target, usually an RTCPeerConnection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnectionIceEvent">RTCPeerConnectionIceEvent - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcpeerconnectioniceevent">RTCPeerConnectionIceEvent - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCPeerConnectionIceEvent"
)
public class RTCPeerConnectionIceEvent extends Event {
  /**
   * The RTCPeerConnectionIceEvent() constructor creates a new RTCPeerConnectionIceEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnectionIceEvent/RTCPeerConnectionIceEvent">RTCPeerConnectionIceEvent.RTCPeerConnectionIceEvent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnectioniceevent-constructor">RTCPeerConnectionIceEvent() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public RTCPeerConnectionIceEvent(@Nonnull final String type,
      @Nonnull final RTCPeerConnectionIceEventInit eventInitDict) {
    super( null );
  }

  /**
   * The RTCPeerConnectionIceEvent() constructor creates a new RTCPeerConnectionIceEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnectionIceEvent/RTCPeerConnectionIceEvent">RTCPeerConnectionIceEvent.RTCPeerConnectionIceEvent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnectioniceevent-constructor">RTCPeerConnectionIceEvent() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public RTCPeerConnectionIceEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The read-only candidate property of the RTCPeerConnectionIceEvent interface returns the RTCIceCandidate associated with the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnectionIceEvent/candidate">RTCPeerConnectionIceEvent.candidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnectioniceevent-candidate">RTCPeerConnectionIceEvent.candidate - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "candidate"
  )
  @Nullable
  public native RTCIceCandidate candidate();

  @JsProperty(
      name = "url"
  )
  @Nullable
  public native String url();
}
