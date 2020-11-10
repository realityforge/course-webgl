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
 * The RTCRtpStreamStats dictionary is returned by the RTCPeerConnection.getStats(), RTCRtpSender.getStats(), and RTCRtpReceiver.getStats() methods to provide detailed statistics about WebRTC connectivity.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats">RTCRtpStreamStats - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-stats/#streamstats-dict*">The definition of 'RTCRtpStreamStats' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
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
      @RTCStatsType @Nonnull final String type, @Nonnull final String kind, final int ssrc) {
    return Js.<RTCRtpStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc );
  }

  /**
   * The RTCRtpStreamStats dictionary's codecId property is a string which uniquely identifies the object that was inspected to produce the data in the RTCCodecStats for the RTP stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/codecId">RTCRtpStreamStats.codecId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-codecid">The definition of 'RTCRtpStreamStats.codecId' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "codecId"
  )
  String codecId();

  /**
   * The RTCRtpStreamStats dictionary's codecId property is a string which uniquely identifies the object that was inspected to produce the data in the RTCCodecStats for the RTP stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/codecId">RTCRtpStreamStats.codecId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-codecid">The definition of 'RTCRtpStreamStats.codecId' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setCodecId(@Nonnull String codecId);

  /**
   * The RTCRtpStreamStats dictionary's codecId property is a string which uniquely identifies the object that was inspected to produce the data in the RTCCodecStats for the RTP stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/codecId">RTCRtpStreamStats.codecId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-codecid">The definition of 'RTCRtpStreamStats.codecId' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCRtpStreamStats codecId(@Nonnull final String codecId) {
    setCodecId( codecId );
    return this;
  }

  /**
   * The kind property of the RTCRtpStreamStats dictionary is a string indicating whether the described RTP stream contains audio or video media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/kind">RTCRtpStreamStats.kind - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-kind">The definition of 'RTCRtpStreamStats.kind' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "kind"
  )
  @Nonnull
  String kind();

  /**
   * The kind property of the RTCRtpStreamStats dictionary is a string indicating whether the described RTP stream contains audio or video media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/kind">RTCRtpStreamStats.kind - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-kind">The definition of 'RTCRtpStreamStats.kind' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setKind(@Nonnull String kind);

  /**
   * The kind property of the RTCRtpStreamStats dictionary is a string indicating whether the described RTP stream contains audio or video media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/kind">RTCRtpStreamStats.kind - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-kind">The definition of 'RTCRtpStreamStats.kind' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCRtpStreamStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  /**
   * The RTCRtpStreamStats dictionary's ssrc property provides the Synchronization Source (SSRC), an integer which uniquely identifies the source of the RTP packets whose statistics are covered by the RTCStatsReport that includes this RTCRtpStreamStats dictionary.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/ssrc">RTCRtpStreamStats.ssrc - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-ssrc">The definition of 'RTCRtpStreamStats.ssrc' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "ssrc"
  )
  int ssrc();

  /**
   * The RTCRtpStreamStats dictionary's ssrc property provides the Synchronization Source (SSRC), an integer which uniquely identifies the source of the RTP packets whose statistics are covered by the RTCStatsReport that includes this RTCRtpStreamStats dictionary.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/ssrc">RTCRtpStreamStats.ssrc - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-ssrc">The definition of 'RTCRtpStreamStats.ssrc' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setSsrc(int ssrc);

  /**
   * The RTCRtpStreamStats dictionary's ssrc property provides the Synchronization Source (SSRC), an integer which uniquely identifies the source of the RTP packets whose statistics are covered by the RTCStatsReport that includes this RTCRtpStreamStats dictionary.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/ssrc">RTCRtpStreamStats.ssrc - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-ssrc">The definition of 'RTCRtpStreamStats.ssrc' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCRtpStreamStats ssrc(final int ssrc) {
    setSsrc( ssrc );
    return this;
  }

  /**
   * The RTCRtpStreamStats dictionary's transportId property is a string which uniquely identifies the object from which the statistics contained in the RTCTransportStats properties in the RTCStatsReport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/transportId">RTCRtpStreamStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-transportid">The definition of 'RTCRtpStreamStats.transportId' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "transportId"
  )
  String transportId();

  /**
   * The RTCRtpStreamStats dictionary's transportId property is a string which uniquely identifies the object from which the statistics contained in the RTCTransportStats properties in the RTCStatsReport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/transportId">RTCRtpStreamStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-transportid">The definition of 'RTCRtpStreamStats.transportId' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setTransportId(@Nonnull String transportId);

  /**
   * The RTCRtpStreamStats dictionary's transportId property is a string which uniquely identifies the object from which the statistics contained in the RTCTransportStats properties in the RTCStatsReport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/transportId">RTCRtpStreamStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-transportid">The definition of 'RTCRtpStreamStats.transportId' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
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
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-id">The definition of 'RTCStats.id' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
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
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-timestamp">The definition of 'RTCStats.timestamp' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
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
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-type">The definition of 'RTCStats.type' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpStreamStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
