package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCRtcpParameters dictionary provides parameters of an RTCP connection. It's used as the value of the rtcp property of the parameters of an RTCRtpSender or RTCRtpReceiver.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtcpParameters">RTCRtcpParameters - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtcpparameters">RTCRtcpParameters - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRtcpParameters {
  @JsOverlay
  @Nonnull
  static RTCRtcpParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "cname"
  )
  String cname();

  @JsProperty
  void setCname(@Nonnull String cname);

  @JsOverlay
  @Nonnull
  default RTCRtcpParameters cname(@Nonnull final String cname) {
    setCname( cname );
    return this;
  }

  @JsProperty(
      name = "reducedSize"
  )
  boolean reducedSize();

  @JsProperty
  void setReducedSize(boolean reducedSize);

  @JsOverlay
  @Nonnull
  default RTCRtcpParameters reducedSize(final boolean reducedSize) {
    setReducedSize( reducedSize );
    return this;
  }
}
