package akasha.rtc;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCPeerConnectionIceErrorEvent interface&mdash;based upon the Event interface&mdash;provides details pertaining to an ICE error announced by sending an icecandidateerror event to the RTCPeerConnection object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnectionIceErrorEvent">RTCPeerConnectionIceErrorEvent - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcpeerconnectioniceerrorevent">RTCPeerConnectionIceErrorEvent - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCPeerConnectionIceErrorEvent"
)
public class RTCPeerConnectionIceErrorEvent extends Event {
  public RTCPeerConnectionIceErrorEvent(@Nonnull final String type,
      @Nonnull final RTCPeerConnectionIceErrorEventInit eventInitDict) {
    super( null );
  }

  /**
   * The RTCPeerConnectionIceErrorEvent property address is a string which indicates the local IP address being used to communicate with the STUN or TURN server during negotiations. The error which occurred involved this address.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnectionIceErrorEvent/address">RTCPeerConnectionIceErrorEvent.address - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnectioniceerrorevent-address">RTCPeerConnectionIceErrorEvent.address - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "address"
  )
  @Nullable
  public native String address();

  @JsProperty(
      name = "errorCode"
  )
  public native int errorCode();

  @JsProperty(
      name = "errorText"
  )
  @Nonnull
  public native String errorText();

  @JsProperty(
      name = "port"
  )
  @Nullable
  public native Double port();

  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();
}
