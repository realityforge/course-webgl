package akasha.rtc;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCRtpParameters dictionary is the basic object describing the parameters of an RTP transport. It is extended separately for senders and receivers in the form of the RTCRtpSendParameters and RTCRtpReceiveParameters dictionaries.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpParameters">RTCRtpParameters - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpreceiveparameters">RTCRtpReceiveParameters - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface RTCRtpParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpParameters create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpParameters create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpParameters create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpParameters create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsProperty(
      name = "codecs"
  )
  @Nonnull
  JsArray<RTCRtpCodecParameters> codecs();

  @JsProperty
  void setCodecs(@Nonnull JsArray<RTCRtpCodecParameters> codecs);

  @JsOverlay
  @Nonnull
  default RTCRtpParameters codecs(@Nonnull final JsArray<RTCRtpCodecParameters> codecs) {
    setCodecs( codecs );
    return this;
  }

  @JsOverlay
  default void setCodecs(@Nonnull final RTCRtpCodecParameters... codecs) {
    setCodecs( Js.<JsArray<RTCRtpCodecParameters>>uncheckedCast( codecs ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpParameters codecs(@Nonnull final RTCRtpCodecParameters... codecs) {
    setCodecs( codecs );
    return this;
  }

  @JsProperty(
      name = "headerExtensions"
  )
  @Nonnull
  JsArray<RTCRtpHeaderExtensionParameters> headerExtensions();

  @JsProperty
  void setHeaderExtensions(@Nonnull JsArray<RTCRtpHeaderExtensionParameters> headerExtensions);

  @JsOverlay
  @Nonnull
  default RTCRtpParameters headerExtensions(
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions) {
    setHeaderExtensions( headerExtensions );
    return this;
  }

  @JsOverlay
  default void setHeaderExtensions(
      @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
    setHeaderExtensions( Js.<JsArray<RTCRtpHeaderExtensionParameters>>uncheckedCast( headerExtensions ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpParameters headerExtensions(
      @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
    setHeaderExtensions( headerExtensions );
    return this;
  }

  @JsProperty(
      name = "rtcp"
  )
  @Nonnull
  RTCRtcpParameters rtcp();

  @JsProperty
  void setRtcp(@Nonnull RTCRtcpParameters rtcp);

  @JsOverlay
  @Nonnull
  default RTCRtpParameters rtcp(@Nonnull final RTCRtcpParameters rtcp) {
    setRtcp( rtcp );
    return this;
  }
}
