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
public interface RTCCodecStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCCodecStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String mimeType,
      final int payloadType, @Nonnull final String transportId) {
    return Js.<RTCCodecStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).mimeType( mimeType ).payloadType( payloadType ).transportId( transportId );
  }

  @JsProperty(
      name = "channels"
  )
  int channels();

  @JsProperty
  void setChannels(int channels);

  @JsOverlay
  @Nonnull
  default RTCCodecStats channels(final int channels) {
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
  default RTCCodecStats clockRate(final int clockRate) {
    setClockRate( clockRate );
    return this;
  }

  @JsProperty(
      name = "codecType"
  )
  @RTCCodecType
  String codecType();

  @JsProperty
  void setCodecType(@RTCCodecType @Nonnull String codecType);

  @JsOverlay
  @Nonnull
  default RTCCodecStats codecType(@RTCCodecType @Nonnull final String codecType) {
    setCodecType( codecType );
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
  default RTCCodecStats mimeType(@Nonnull final String mimeType) {
    setMimeType( mimeType );
    return this;
  }

  @JsProperty(
      name = "payloadType"
  )
  int payloadType();

  @JsProperty
  void setPayloadType(int payloadType);

  @JsOverlay
  @Nonnull
  default RTCCodecStats payloadType(final int payloadType) {
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
  default RTCCodecStats sdpFmtpLine(@Nonnull final String sdpFmtpLine) {
    setSdpFmtpLine( sdpFmtpLine );
    return this;
  }

  @JsProperty(
      name = "transportId"
  )
  @Nonnull
  String transportId();

  @JsProperty
  void setTransportId(@Nonnull String transportId);

  @JsOverlay
  @Nonnull
  default RTCCodecStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsProperty(
      name = "implementation"
  )
  String implementation();

  @JsProperty
  void setImplementation(@Nonnull String implementation);

  @JsOverlay
  @Nonnull
  default RTCCodecStats implementation(@Nonnull final String implementation) {
    setImplementation( implementation );
    return this;
  }

  /**
   * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-id">The definition of 'RTCStats.id' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCCodecStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  /**
   * The timestamp property of the RTCStats dictionary is a DOMHighResTimeStamp object specifying the time at which the data in the object was sampled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/timestamp">RTCStats.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-timestamp">The definition of 'RTCStats.timestamp' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCCodecStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  /**
   * The RTCStats dictionary's property type is a string which specifies the type of statistic represented by the object, where the permitted values are drawn from the enum type RTCStatsType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/type">RTCStats.type - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-type">The definition of 'RTCStats.type' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCCodecStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
