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
public interface RTCReceivedRtpStreamStats extends RTCRtpStreamStats {
  @JsOverlay
  @Nonnull
  static RTCReceivedRtpStreamStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String kind, final int ssrc) {
    return Js.<RTCReceivedRtpStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc );
  }

  @JsProperty(
      name = "burstDiscardCount"
  )
  int burstDiscardCount();

  @JsProperty
  void setBurstDiscardCount(int burstDiscardCount);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstDiscardCount(final int burstDiscardCount) {
    setBurstDiscardCount( burstDiscardCount );
    return this;
  }

  @JsProperty(
      name = "burstDiscardRate"
  )
  double burstDiscardRate();

  @JsProperty
  void setBurstDiscardRate(double burstDiscardRate);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstDiscardRate(final double burstDiscardRate) {
    setBurstDiscardRate( burstDiscardRate );
    return this;
  }

  @JsProperty(
      name = "burstLossCount"
  )
  int burstLossCount();

  @JsProperty
  void setBurstLossCount(int burstLossCount);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstLossCount(final int burstLossCount) {
    setBurstLossCount( burstLossCount );
    return this;
  }

  @JsProperty(
      name = "burstLossRate"
  )
  double burstLossRate();

  @JsProperty
  void setBurstLossRate(double burstLossRate);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstLossRate(final double burstLossRate) {
    setBurstLossRate( burstLossRate );
    return this;
  }

  @JsProperty(
      name = "burstPacketsDiscarded"
  )
  int burstPacketsDiscarded();

  @JsProperty
  void setBurstPacketsDiscarded(int burstPacketsDiscarded);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstPacketsDiscarded(final int burstPacketsDiscarded) {
    setBurstPacketsDiscarded( burstPacketsDiscarded );
    return this;
  }

  @JsProperty(
      name = "burstPacketsLost"
  )
  int burstPacketsLost();

  @JsProperty
  void setBurstPacketsLost(int burstPacketsLost);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstPacketsLost(final int burstPacketsLost) {
    setBurstPacketsLost( burstPacketsLost );
    return this;
  }

  @JsProperty(
      name = "framesDropped"
  )
  int framesDropped();

  @JsProperty
  void setFramesDropped(int framesDropped);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats framesDropped(final int framesDropped) {
    setFramesDropped( framesDropped );
    return this;
  }

  @JsProperty(
      name = "fullFramesLost"
  )
  int fullFramesLost();

  @JsProperty
  void setFullFramesLost(int fullFramesLost);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats fullFramesLost(final int fullFramesLost) {
    setFullFramesLost( fullFramesLost );
    return this;
  }

  @JsProperty(
      name = "gapDiscardRate"
  )
  double gapDiscardRate();

  @JsProperty
  void setGapDiscardRate(double gapDiscardRate);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats gapDiscardRate(final double gapDiscardRate) {
    setGapDiscardRate( gapDiscardRate );
    return this;
  }

  @JsProperty(
      name = "gapLossRate"
  )
  double gapLossRate();

  @JsProperty
  void setGapLossRate(double gapLossRate);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats gapLossRate(final double gapLossRate) {
    setGapLossRate( gapLossRate );
    return this;
  }

  @JsProperty(
      name = "jitter"
  )
  double jitter();

  @JsProperty
  void setJitter(double jitter);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats jitter(final double jitter) {
    setJitter( jitter );
    return this;
  }

  @JsProperty(
      name = "packetsDiscarded"
  )
  int packetsDiscarded();

  @JsProperty
  void setPacketsDiscarded(int packetsDiscarded);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats packetsDiscarded(final int packetsDiscarded) {
    setPacketsDiscarded( packetsDiscarded );
    return this;
  }

  @JsProperty(
      name = "packetsLost"
  )
  int packetsLost();

  @JsProperty
  void setPacketsLost(int packetsLost);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats packetsLost(final int packetsLost) {
    setPacketsLost( packetsLost );
    return this;
  }

  @JsProperty(
      name = "packetsReceived"
  )
  int packetsReceived();

  @JsProperty
  void setPacketsReceived(int packetsReceived);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  @JsProperty(
      name = "packetsRepaired"
  )
  int packetsRepaired();

  @JsProperty
  void setPacketsRepaired(int packetsRepaired);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats packetsRepaired(final int packetsRepaired) {
    setPacketsRepaired( packetsRepaired );
    return this;
  }

  @JsProperty(
      name = "partialFramesLost"
  )
  int partialFramesLost();

  @JsProperty
  void setPartialFramesLost(int partialFramesLost);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats partialFramesLost(final int partialFramesLost) {
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
  default RTCReceivedRtpStreamStats codecId(@Nonnull final String codecId) {
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
  default RTCReceivedRtpStreamStats kind(@Nonnull final String kind) {
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
  default RTCReceivedRtpStreamStats ssrc(final int ssrc) {
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
  default RTCReceivedRtpStreamStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats averageRTCPInterval(final double averageRTCPInterval) {
    setAverageRTCPInterval( averageRTCPInterval );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats mediaType(@Nonnull final String mediaType) {
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
  default RTCReceivedRtpStreamStats id(@Nonnull final String id) {
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
  default RTCReceivedRtpStreamStats timestamp(final double timestamp) {
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
  default RTCReceivedRtpStreamStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
