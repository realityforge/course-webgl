package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The RTCRtpStreamStats dictionary is returned by the RTCPeerConnection.getStats(), RTCRtpSender.getStats(), and RTCRtpReceiver.getStats() methods to provide detailed statistics about WebRTC connectivity.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats">RTCRtpStreamStats - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRtpStreamStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCRtpStreamStats create(@Nonnull final String id, final double timestamp,
      @MagicConstant(valuesFromClass = RTCStatsType.class) @Nonnull final String type,
      @Nonnull final String kind, final int ssrc) {
    return Js.<RTCRtpStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc );
  }

  @JsProperty(
      name = "codecId"
  )
  String codecId();

  @JsProperty
  void setCodecId(@Nonnull String codecId);

  @JsOverlay
  @Nonnull
  default RTCRtpStreamStats codecId(@Nonnull final String codecId) {
    setCodecId( codecId );
    return this;
  }

  @JsProperty(
      name = "kind"
  )
  @Nonnull
  String kind();

  @JsProperty
  void setKind(@Nonnull String kind);

  @JsOverlay
  @Nonnull
  default RTCRtpStreamStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsProperty(
      name = "ssrc"
  )
  int ssrc();

  @JsProperty
  void setSsrc(int ssrc);

  @JsOverlay
  @Nonnull
  default RTCRtpStreamStats ssrc(final int ssrc) {
    setSsrc( ssrc );
    return this;
  }

  @JsProperty(
      name = "transportId"
  )
  String transportId();

  @JsProperty
  void setTransportId(@Nonnull String transportId);

  @JsOverlay
  @Nonnull
  default RTCRtpStreamStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsProperty(
      name = "averageRTCPInterval"
  )
  double averageRTCPInterval();

  @JsProperty
  void setAverageRTCPInterval(double averageRTCPInterval);

  @JsOverlay
  @Nonnull
  default RTCRtpStreamStats averageRTCPInterval(final double averageRTCPInterval) {
    setAverageRTCPInterval( averageRTCPInterval );
    return this;
  }

  @JsProperty(
      name = "mediaType"
  )
  String mediaType();

  @JsProperty
  void setMediaType(@Nonnull String mediaType);

  @JsOverlay
  @Nonnull
  default RTCRtpStreamStats mediaType(@Nonnull final String mediaType) {
    setMediaType( mediaType );
    return this;
  }

  /**
   * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpStreamStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  /**
   * The timestamp property of the RTCStats dictionary is a DOMHighResTimeStamp object specifying the time at which the data in the object was sampled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/timestamp">RTCStats.timestamp - MDN</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpStreamStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  /**
   * The RTCStats dictionary's property type is a string which specifies the type of statistic represented by the object, where the permitted values are drawn from the enum type RTCStatsType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/type">RTCStats.type - MDN</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpStreamStats type(
      @MagicConstant(valuesFromClass = RTCStatsType.class) @Nonnull final String type) {
    setType( type );
    return this;
  }
}