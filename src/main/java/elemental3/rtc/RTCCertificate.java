package elemental3.rtc;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The interface of the WebRTC API provides an object represents a certificate that an RTCPeerConnection uses to authenticate.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCCertificate">RTCCertificate - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtccertificate">WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCCertificate"
)
public class RTCCertificate {
  protected RTCCertificate() {
  }

  @JsProperty(
      name = "expires"
  )
  public native int expires();

  @Nonnull
  public native JsArray<RTCDtlsFingerprint> getFingerprints();
}
