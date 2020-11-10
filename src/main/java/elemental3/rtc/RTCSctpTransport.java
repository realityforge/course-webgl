package elemental3.rtc;

import elemental3.EventHandler;
import elemental3.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCSctpTransport interface provides information which describes a Stream Control Transmission Protocol (SCTP) transport. This provides information about limitations of the transport, but also provides a way to access the underlying Datagram Transport Layer Security (DTLS) transport over which SCTP packets for all of an RTCPeerConnection's data channels are sent and received.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCSctpTransport">RTCSctpTransport - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcsctptransport-interface">The definition of 'RTCSctpTransport' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCSctpTransport"
)
public class RTCSctpTransport extends EventTarget {
  @Nullable
  public EventHandler onstatechange;

  protected RTCSctpTransport() {
  }

  @JsProperty(
      name = "maxChannels"
  )
  @Nullable
  public native Double maxChannels();

  @JsProperty(
      name = "maxMessageSize"
  )
  public native double maxMessageSize();

  /**
   * The state read-only property of the RTCSctpTransport interface provides information which describes a Stream Control Transmission Protocol (SCTP) transport state.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCSctpTransport/state">RTCSctpTransport.state - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcsctptransport-state">The definition of 'RTCSctpTransport.state' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  @RTCSctpTransportState
  public native String state();

  @JsProperty(
      name = "transport"
  )
  @Nonnull
  public native RTCDtlsTransport transport();
}
