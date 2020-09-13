package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCDtlsTransport interface provides access to information about the Datagram Transport Layer Security (DTLS) transport over which a RTCPeerConnection's RTP and RTCP packets are sent and received by its RTCRtpSender and RTCRtpReceiver objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDtlsTransport">RTCDtlsTransport - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCDtlsTransport"
)
public class RTCDtlsTransport extends EventTarget {
  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onstatechange;

  RTCDtlsTransport() {
  }

  /**
   * The read-only RTCDtlsTransport property iceTransport contains a reference to the underlying RTCIceTransport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDtlsTransport/iceTransport">RTCDtlsTransport.iceTransport - MDN</a>
   */
  @JsProperty(
      name = "iceTransport"
  )
  @Nonnull
  public native RTCIceTransport iceTransport();

  /**
   * The state read-only property of the RTCDtlsTransport interface provides information which describes a Datagram Transport Layer Security (DTLS) transport state.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDtlsTransport/state">RTCDtlsTransport.state - MDN</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  @Nonnull
  public native JsArray<ArrayBuffer> getRemoteCertificates();
}
