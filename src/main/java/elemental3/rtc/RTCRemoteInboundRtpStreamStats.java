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
public interface RTCRemoteInboundRtpStreamStats extends RTCReceivedRtpStreamStats {
  @JsOverlay
  @Nonnull
  static RTCRemoteInboundRtpStreamStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String kind, final int ssrc) {
    return Js.<RTCRemoteInboundRtpStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc );
  }

  @JsProperty(
      name = "fractionLost"
  )
  double fractionLost();

  @JsProperty
  void setFractionLost(double fractionLost);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats fractionLost(final double fractionLost) {
    setFractionLost( fractionLost );
    return this;
  }

  @JsProperty(
      name = "localId"
  )
  String localId();

  @JsProperty
  void setLocalId(@Nonnull String localId);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats localId(@Nonnull final String localId) {
    setLocalId( localId );
    return this;
  }

  @JsProperty(
      name = "reportsReceived"
  )
  int reportsReceived();

  @JsProperty
  void setReportsReceived(int reportsReceived);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats reportsReceived(final int reportsReceived) {
    setReportsReceived( reportsReceived );
    return this;
  }

  @JsProperty(
      name = "roundTripTime"
  )
  double roundTripTime();

  @JsProperty
  void setRoundTripTime(double roundTripTime);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats roundTripTime(final double roundTripTime) {
    setRoundTripTime( roundTripTime );
    return this;
  }

  @JsProperty(
      name = "roundTripTimeMeasurements"
  )
  int roundTripTimeMeasurements();

  @JsProperty
  void setRoundTripTimeMeasurements(int roundTripTimeMeasurements);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats roundTripTimeMeasurements(
      final int roundTripTimeMeasurements) {
    setRoundTripTimeMeasurements( roundTripTimeMeasurements );
    return this;
  }

  @JsProperty(
      name = "totalRoundTripTime"
  )
  double totalRoundTripTime();

  @JsProperty
  void setTotalRoundTripTime(double totalRoundTripTime);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats totalRoundTripTime(final double totalRoundTripTime) {
    setTotalRoundTripTime( totalRoundTripTime );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstDiscardCount(final int burstDiscardCount) {
    setBurstDiscardCount( burstDiscardCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstDiscardRate(final double burstDiscardRate) {
    setBurstDiscardRate( burstDiscardRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstLossCount(final int burstLossCount) {
    setBurstLossCount( burstLossCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstLossRate(final double burstLossRate) {
    setBurstLossRate( burstLossRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstPacketsDiscarded(final int burstPacketsDiscarded) {
    setBurstPacketsDiscarded( burstPacketsDiscarded );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstPacketsLost(final int burstPacketsLost) {
    setBurstPacketsLost( burstPacketsLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats framesDropped(final int framesDropped) {
    setFramesDropped( framesDropped );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats fullFramesLost(final int fullFramesLost) {
    setFullFramesLost( fullFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats gapDiscardRate(final double gapDiscardRate) {
    setGapDiscardRate( gapDiscardRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats gapLossRate(final double gapLossRate) {
    setGapLossRate( gapLossRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats jitter(final double jitter) {
    setJitter( jitter );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats packetsDiscarded(final int packetsDiscarded) {
    setPacketsDiscarded( packetsDiscarded );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats packetsLost(final int packetsLost) {
    setPacketsLost( packetsLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats packetsRepaired(final int packetsRepaired) {
    setPacketsRepaired( packetsRepaired );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats partialFramesLost(final int partialFramesLost) {
    setPartialFramesLost( partialFramesLost );
    return this;
  }

  /**
   * The RTCRtpStreamStats dictionary's codecId property is a string which uniquely identifies the object that was inspected to produce the data in the RTCCodecStats for the RTP stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/codecId">RTCRtpStreamStats.codecId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-codecid">RTCRtpStreamStats.codecId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats codecId(@Nonnull final String codecId) {
    setCodecId( codecId );
    return this;
  }

  /**
   * The kind property of the RTCRtpStreamStats dictionary is a string indicating whether the described RTP stream contains audio or video media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/kind">RTCRtpStreamStats.kind - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-kind">RTCRtpStreamStats.kind - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  /**
   * The RTCRtpStreamStats dictionary's ssrc property provides the Synchronization Source (SSRC), an integer which uniquely identifies the source of the RTP packets whose statistics are covered by the RTCStatsReport that includes this RTCRtpStreamStats dictionary.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/ssrc">RTCRtpStreamStats.ssrc - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-ssrc">RTCRtpStreamStats.ssrc - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats ssrc(final int ssrc) {
    setSsrc( ssrc );
    return this;
  }

  /**
   * The RTCRtpStreamStats dictionary's transportId property is a string which uniquely identifies the object from which the statistics contained in the RTCTransportStats properties in the RTCStatsReport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpStreamStats/transportId">RTCRtpStreamStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcrtpstreamstats-transportid">RTCRtpStreamStats.transportId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats averageRTCPInterval(final double averageRTCPInterval) {
    setAverageRTCPInterval( averageRTCPInterval );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats mediaType(@Nonnull final String mediaType) {
    setMediaType( mediaType );
    return this;
  }

  /**
   * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-id">RTCStats.id - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  /**
   * The timestamp property of the RTCStats dictionary is a DOMHighResTimeStamp object specifying the time at which the data in the object was sampled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/timestamp">RTCStats.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-timestamp">RTCStats.timestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  /**
   * The RTCStats dictionary's property type is a string which specifies the type of statistic represented by the object, where the permitted values are drawn from the enum type RTCStatsType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/type">RTCStats.type - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-type">RTCStats.type - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
