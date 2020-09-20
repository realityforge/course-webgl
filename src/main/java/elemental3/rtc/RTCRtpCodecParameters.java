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
 * The RTCRtpCodecParameters dictionary, part of the WebRTC API, is used to describe the configuration parameters for a single media codec.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpCodecParameters">RTCRtpCodecParameters - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRtpCodecParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpCodecParameters create(final int clockRate, @Nonnull final String mimeType,
      final short payloadType) {
    return Js.<RTCRtpCodecParameters>uncheckedCast( JsPropertyMap.of() ).clockRate( clockRate ).mimeType( mimeType ).payloadType( payloadType );
  }

  @JsProperty(
      name = "channels"
  )
  int channels();

  @JsProperty
  void setChannels(int channels);

  @JsOverlay
  @Nonnull
  default RTCRtpCodecParameters channels(final int channels) {
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
  default RTCRtpCodecParameters clockRate(final int clockRate) {
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
  default RTCRtpCodecParameters mimeType(@Nonnull final String mimeType) {
    setMimeType( mimeType );
    return this;
  }

  @JsProperty(
      name = "payloadType"
  )
  short payloadType();

  @JsProperty
  void setPayloadType(short payloadType);

  @JsOverlay
  @Nonnull
  default RTCRtpCodecParameters payloadType(final short payloadType) {
    setPayloadType( payloadType );
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
  default RTCRtpCodecParameters sdpFmtpLine(@Nonnull final String sdpFmtpLine) {
    setSdpFmtpLine( sdpFmtpLine );
    return this;
  }
}
