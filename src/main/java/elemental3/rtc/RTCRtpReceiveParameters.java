package elemental3.rtc;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRtpReceiveParameters extends RTCRtpParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpReceiveParameters create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpReceiveParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpReceiveParameters create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpReceiveParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpReceiveParameters create(@Nonnull final JsArray<RTCRtpCodecParameters> codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpReceiveParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsOverlay
  @Nonnull
  static RTCRtpReceiveParameters create(@Nonnull final RTCRtpCodecParameters[] codecs,
      @Nonnull final RTCRtpHeaderExtensionParameters[] headerExtensions,
      @Nonnull final RTCRtcpParameters rtcp) {
    return Js.<RTCRtpReceiveParameters>uncheckedCast( JsPropertyMap.of() ).codecs( codecs ).headerExtensions( headerExtensions ).rtcp( rtcp );
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpReceiveParameters codecs(@Nonnull final JsArray<RTCRtpCodecParameters> codecs) {
    setCodecs( codecs );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpReceiveParameters codecs(@Nonnull final RTCRtpCodecParameters... codecs) {
    setCodecs( codecs );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpReceiveParameters headerExtensions(
      @Nonnull final JsArray<RTCRtpHeaderExtensionParameters> headerExtensions) {
    setHeaderExtensions( headerExtensions );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpReceiveParameters headerExtensions(
      @Nonnull final RTCRtpHeaderExtensionParameters... headerExtensions) {
    setHeaderExtensions( headerExtensions );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpReceiveParameters rtcp(@Nonnull final RTCRtcpParameters rtcp) {
    setRtcp( rtcp );
    return this;
  }
}
