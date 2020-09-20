package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRtpCodecCapability {
  @JsOverlay
  @Nonnull
  static RTCRtpCodecCapability create(final int clockRate, @Nonnull final String mimeType) {
    return Js.<RTCRtpCodecCapability>uncheckedCast( JsPropertyMap.of() ).clockRate( clockRate ).mimeType( mimeType );
  }

  @JsProperty(
      name = "channels"
  )
  int channels();

  @JsProperty
  void setChannels(int channels);

  @JsOverlay
  @Nonnull
  default RTCRtpCodecCapability channels(final int channels) {
    setChannels( channels );
    return this;
  }

  @JsProperty(
      name = "clockRate"
  )
  int clockRate();

  @JsProperty
  void setClockRate(int clockRate);

  @JsOverlay
  @Nonnull
  default RTCRtpCodecCapability clockRate(final int clockRate) {
    setClockRate( clockRate );
    return this;
  }

  @JsProperty(
      name = "mimeType"
  )
  @Nonnull
  String mimeType();

  @JsProperty
  void setMimeType(@Nonnull String mimeType);

  @JsOverlay
  @Nonnull
  default RTCRtpCodecCapability mimeType(@Nonnull final String mimeType) {
    setMimeType( mimeType );
    return this;
  }

  @JsProperty(
      name = "sdpFmtpLine"
  )
  String sdpFmtpLine();

  @JsProperty
  void setSdpFmtpLine(@Nonnull String sdpFmtpLine);

  @JsOverlay
  @Nonnull
  default RTCRtpCodecCapability sdpFmtpLine(@Nonnull final String sdpFmtpLine) {
    setSdpFmtpLine( sdpFmtpLine );
    return this;
  }
}
