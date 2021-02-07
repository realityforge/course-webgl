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
 * The WebRTC API's RTCInboundRtpStreamStats dictionary, based upon RTCReceivedRtpStreamStats and RTCStats, contains statistics related to the receiving end of an RTP stream on the local end of the RTCPeerConnection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats">RTCInboundRtpStreamStats - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#inboundrtpstats-dict*">RTCInboundRtpStreamStats - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCInboundRtpStreamStats extends RTCReceivedRtpStreamStats {
  @JsOverlay
  @Nonnull
  static RTCInboundRtpStreamStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String kind, final int ssrc,
      @Nonnull final String receiverId) {
    return Js.<RTCInboundRtpStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc ).receiverId( receiverId );
  }

  @JsProperty(
      name = "audioLevel"
  )
  double audioLevel();

  @JsProperty
  void setAudioLevel(double audioLevel);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  /**
   * The averageRtcpInterval property of the RTCInboundRtpStreamStats dictionary is a floating-point value indicating the average RTCP transmission interval, in seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/averageRtcpInterval">RTCInboundRtpStreamStats.averageRtcpInterval - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-averagertcpinterval">RTCInboundRtpStreamStats.averageRtcpInterval - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "averageRtcpInterval"
  )
  double averageRtcpInterval();

  /**
   * The averageRtcpInterval property of the RTCInboundRtpStreamStats dictionary is a floating-point value indicating the average RTCP transmission interval, in seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/averageRtcpInterval">RTCInboundRtpStreamStats.averageRtcpInterval - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-averagertcpinterval">RTCInboundRtpStreamStats.averageRtcpInterval - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setAverageRtcpInterval(double averageRtcpInterval);

  /**
   * The averageRtcpInterval property of the RTCInboundRtpStreamStats dictionary is a floating-point value indicating the average RTCP transmission interval, in seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/averageRtcpInterval">RTCInboundRtpStreamStats.averageRtcpInterval - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-averagertcpinterval">RTCInboundRtpStreamStats.averageRtcpInterval - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats averageRtcpInterval(final double averageRtcpInterval) {
    setAverageRtcpInterval( averageRtcpInterval );
    return this;
  }

  /**
   * The RTCInboundRtpStreamStats dictionary's bytesReceived property is an integer value which indicates the total number of bytes received so far from this synchronization source (SSRC).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/bytesReceived">RTCInboundRtpStreamStats.bytesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-bytesreceived">RTCInboundRtpStreamStats.bytesReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "bytesReceived"
  )
  int bytesReceived();

  /**
   * The RTCInboundRtpStreamStats dictionary's bytesReceived property is an integer value which indicates the total number of bytes received so far from this synchronization source (SSRC).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/bytesReceived">RTCInboundRtpStreamStats.bytesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-bytesreceived">RTCInboundRtpStreamStats.bytesReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setBytesReceived(int bytesReceived);

  /**
   * The RTCInboundRtpStreamStats dictionary's bytesReceived property is an integer value which indicates the total number of bytes received so far from this synchronization source (SSRC).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/bytesReceived">RTCInboundRtpStreamStats.bytesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-bytesreceived">RTCInboundRtpStreamStats.bytesReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats bytesReceived(final int bytesReceived) {
    setBytesReceived( bytesReceived );
    return this;
  }

  @JsProperty(
      name = "concealedSamples"
  )
  int concealedSamples();

  @JsProperty
  void setConcealedSamples(int concealedSamples);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats concealedSamples(final int concealedSamples) {
    setConcealedSamples( concealedSamples );
    return this;
  }

  @JsProperty(
      name = "concealmentEvents"
  )
  int concealmentEvents();

  @JsProperty
  void setConcealmentEvents(int concealmentEvents);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats concealmentEvents(final int concealmentEvents) {
    setConcealmentEvents( concealmentEvents );
    return this;
  }

  @JsProperty(
      name = "decoderImplementation"
  )
  String decoderImplementation();

  @JsProperty
  void setDecoderImplementation(@Nonnull String decoderImplementation);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats decoderImplementation(
      @Nonnull final String decoderImplementation) {
    setDecoderImplementation( decoderImplementation );
    return this;
  }

  @JsProperty(
      name = "estimatedPlayoutTimestamp"
  )
  double estimatedPlayoutTimestamp();

  @JsProperty
  void setEstimatedPlayoutTimestamp(double estimatedPlayoutTimestamp);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats estimatedPlayoutTimestamp(
      final double estimatedPlayoutTimestamp) {
    setEstimatedPlayoutTimestamp( estimatedPlayoutTimestamp );
    return this;
  }

  /**
   * The fecPacketsDiscarded property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of RTP Forward Error Correction (FEC) packets that have been discarded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsDiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsdiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "fecPacketsDiscarded"
  )
  int fecPacketsDiscarded();

  /**
   * The fecPacketsDiscarded property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of RTP Forward Error Correction (FEC) packets that have been discarded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsDiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsdiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setFecPacketsDiscarded(int fecPacketsDiscarded);

  /**
   * The fecPacketsDiscarded property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of RTP Forward Error Correction (FEC) packets that have been discarded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsDiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsdiscarded">RTCInboundRtpStreamStats.fecPacketsDiscarded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats fecPacketsDiscarded(final int fecPacketsDiscarded) {
    setFecPacketsDiscarded( fecPacketsDiscarded );
    return this;
  }

  /**
   * The fecPacketsReceived property of the RTCInboundRtpStreamStats dictionary indicates how many Forward Error Correction (FEC) packets have been received by this RTP receiver from the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsReceived">RTCInboundRtpStreamStats.fecPacketsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsreceived">RTCInboundRtpStreamStats.fecPacketsReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "fecPacketsReceived"
  )
  int fecPacketsReceived();

  /**
   * The fecPacketsReceived property of the RTCInboundRtpStreamStats dictionary indicates how many Forward Error Correction (FEC) packets have been received by this RTP receiver from the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsReceived">RTCInboundRtpStreamStats.fecPacketsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsreceived">RTCInboundRtpStreamStats.fecPacketsReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setFecPacketsReceived(int fecPacketsReceived);

  /**
   * The fecPacketsReceived property of the RTCInboundRtpStreamStats dictionary indicates how many Forward Error Correction (FEC) packets have been received by this RTP receiver from the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/fecPacketsReceived">RTCInboundRtpStreamStats.fecPacketsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fecpacketsreceived">RTCInboundRtpStreamStats.fecPacketsReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats fecPacketsReceived(final int fecPacketsReceived) {
    setFecPacketsReceived( fecPacketsReceived );
    return this;
  }

  /**
   * The firCount property of the RTCInboundRtpStreamStats dictionary indicates the number of Full Intra Request (FIR) packets have been sent by the receiver to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/firCount">RTCInboundRtpStreamStats.firCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fircount">RTCInboundRtpStreamStats.firCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "firCount"
  )
  int firCount();

  /**
   * The firCount property of the RTCInboundRtpStreamStats dictionary indicates the number of Full Intra Request (FIR) packets have been sent by the receiver to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/firCount">RTCInboundRtpStreamStats.firCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fircount">RTCInboundRtpStreamStats.firCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setFirCount(int firCount);

  /**
   * The firCount property of the RTCInboundRtpStreamStats dictionary indicates the number of Full Intra Request (FIR) packets have been sent by the receiver to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/firCount">RTCInboundRtpStreamStats.firCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-fircount">RTCInboundRtpStreamStats.firCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats firCount(final int firCount) {
    setFirCount( firCount );
    return this;
  }

  @JsProperty(
      name = "frameBitDepth"
  )
  int frameBitDepth();

  @JsProperty
  void setFrameBitDepth(int frameBitDepth);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats frameBitDepth(final int frameBitDepth) {
    setFrameBitDepth( frameBitDepth );
    return this;
  }

  @JsProperty(
      name = "frameHeight"
  )
  int frameHeight();

  @JsProperty
  void setFrameHeight(int frameHeight);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats frameHeight(final int frameHeight) {
    setFrameHeight( frameHeight );
    return this;
  }

  @JsProperty(
      name = "frameWidth"
  )
  int frameWidth();

  @JsProperty
  void setFrameWidth(int frameWidth);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats frameWidth(final int frameWidth) {
    setFrameWidth( frameWidth );
    return this;
  }

  /**
   * The framesDecoded property of the RTCInboundRtpStreamStats dictionary indicates the total number of frames which have been decoded successfully for this media source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/framesDecoded">RTCInboundRtpStreamStats.framesDecoded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-framesdecoded">RTCInboundRtpStreamStats.framesDecoded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "framesDecoded"
  )
  int framesDecoded();

  /**
   * The framesDecoded property of the RTCInboundRtpStreamStats dictionary indicates the total number of frames which have been decoded successfully for this media source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/framesDecoded">RTCInboundRtpStreamStats.framesDecoded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-framesdecoded">RTCInboundRtpStreamStats.framesDecoded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setFramesDecoded(int framesDecoded);

  /**
   * The framesDecoded property of the RTCInboundRtpStreamStats dictionary indicates the total number of frames which have been decoded successfully for this media source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/framesDecoded">RTCInboundRtpStreamStats.framesDecoded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-framesdecoded">RTCInboundRtpStreamStats.framesDecoded - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats framesDecoded(final int framesDecoded) {
    setFramesDecoded( framesDecoded );
    return this;
  }

  @JsProperty(
      name = "framesPerSecond"
  )
  double framesPerSecond();

  @JsProperty
  void setFramesPerSecond(double framesPerSecond);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsProperty(
      name = "framesReceived"
  )
  int framesReceived();

  @JsProperty
  void setFramesReceived(int framesReceived);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats framesReceived(final int framesReceived) {
    setFramesReceived( framesReceived );
    return this;
  }

  @JsProperty(
      name = "headerBytesReceived"
  )
  int headerBytesReceived();

  @JsProperty
  void setHeaderBytesReceived(int headerBytesReceived);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats headerBytesReceived(final int headerBytesReceived) {
    setHeaderBytesReceived( headerBytesReceived );
    return this;
  }

  @JsProperty(
      name = "insertedSamplesForDeceleration"
  )
  int insertedSamplesForDeceleration();

  @JsProperty
  void setInsertedSamplesForDeceleration(int insertedSamplesForDeceleration);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats insertedSamplesForDeceleration(
      final int insertedSamplesForDeceleration) {
    setInsertedSamplesForDeceleration( insertedSamplesForDeceleration );
    return this;
  }

  @JsProperty(
      name = "jitterBufferDelay"
  )
  double jitterBufferDelay();

  @JsProperty
  void setJitterBufferDelay(double jitterBufferDelay);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats jitterBufferDelay(final double jitterBufferDelay) {
    setJitterBufferDelay( jitterBufferDelay );
    return this;
  }

  @JsProperty(
      name = "jitterBufferEmittedCount"
  )
  int jitterBufferEmittedCount();

  @JsProperty
  void setJitterBufferEmittedCount(int jitterBufferEmittedCount);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats jitterBufferEmittedCount(final int jitterBufferEmittedCount) {
    setJitterBufferEmittedCount( jitterBufferEmittedCount );
    return this;
  }

  @JsProperty(
      name = "keyFramesDecoded"
  )
  int keyFramesDecoded();

  @JsProperty
  void setKeyFramesDecoded(int keyFramesDecoded);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats keyFramesDecoded(final int keyFramesDecoded) {
    setKeyFramesDecoded( keyFramesDecoded );
    return this;
  }

  /**
   * The lastPacketReceivedTimestamp property of the RTCInboundRtpStreamStats dictionary indicates the time at which the most recently received packet arrived from this source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/lastPacketReceivedTimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-lastpacketreceivedtimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "lastPacketReceivedTimestamp"
  )
  double lastPacketReceivedTimestamp();

  /**
   * The lastPacketReceivedTimestamp property of the RTCInboundRtpStreamStats dictionary indicates the time at which the most recently received packet arrived from this source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/lastPacketReceivedTimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-lastpacketreceivedtimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setLastPacketReceivedTimestamp(double lastPacketReceivedTimestamp);

  /**
   * The lastPacketReceivedTimestamp property of the RTCInboundRtpStreamStats dictionary indicates the time at which the most recently received packet arrived from this source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/lastPacketReceivedTimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-lastpacketreceivedtimestamp">RTCInboundRtpStreamStats.lastPacketReceivedTimestamp - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats lastPacketReceivedTimestamp(
      final double lastPacketReceivedTimestamp) {
    setLastPacketReceivedTimestamp( lastPacketReceivedTimestamp );
    return this;
  }

  /**
   * The nackCount property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of times the receiver sent a NACK packet to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/nackCount">RTCInboundRtpStreamStats.nackCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-nackcount">RTCInboundRtpStreamStats.nackCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "nackCount"
  )
  int nackCount();

  /**
   * The nackCount property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of times the receiver sent a NACK packet to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/nackCount">RTCInboundRtpStreamStats.nackCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-nackcount">RTCInboundRtpStreamStats.nackCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setNackCount(int nackCount);

  /**
   * The nackCount property of the RTCInboundRtpStreamStats dictionary is a numeric value indicating the number of times the receiver sent a NACK packet to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/nackCount">RTCInboundRtpStreamStats.nackCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-nackcount">RTCInboundRtpStreamStats.nackCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats nackCount(final int nackCount) {
    setNackCount( nackCount );
    return this;
  }

  /**
   * The packetsDuplicated property of the RTCInboundRtpStreamStats dictionary indicates the total number of packets discarded because they were duplicates of previously-received packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsDuplicated">RTCInboundRtpStreamStats.packetsDuplicated - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsduplicated">RTCInboundRtpStreamStats.packetsDuplicated - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "packetsDuplicated"
  )
  int packetsDuplicated();

  /**
   * The packetsDuplicated property of the RTCInboundRtpStreamStats dictionary indicates the total number of packets discarded because they were duplicates of previously-received packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsDuplicated">RTCInboundRtpStreamStats.packetsDuplicated - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsduplicated">RTCInboundRtpStreamStats.packetsDuplicated - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPacketsDuplicated(int packetsDuplicated);

  /**
   * The packetsDuplicated property of the RTCInboundRtpStreamStats dictionary indicates the total number of packets discarded because they were duplicates of previously-received packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsDuplicated">RTCInboundRtpStreamStats.packetsDuplicated - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsduplicated">RTCInboundRtpStreamStats.packetsDuplicated - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats packetsDuplicated(final int packetsDuplicated) {
    setPacketsDuplicated( packetsDuplicated );
    return this;
  }

  /**
   * The packetsFailedDecryption property of the RTCInboundRtpStreamStats dictionary indicates the total number of RTP packets which failed to be decrypted successfully after being received by the local end of the connection during this session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsFailedDecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsfaileddecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "packetsFailedDecryption"
  )
  int packetsFailedDecryption();

  /**
   * The packetsFailedDecryption property of the RTCInboundRtpStreamStats dictionary indicates the total number of RTP packets which failed to be decrypted successfully after being received by the local end of the connection during this session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsFailedDecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsfaileddecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPacketsFailedDecryption(int packetsFailedDecryption);

  /**
   * The packetsFailedDecryption property of the RTCInboundRtpStreamStats dictionary indicates the total number of RTP packets which failed to be decrypted successfully after being received by the local end of the connection during this session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/packetsFailedDecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-packetsfaileddecryption">RTCInboundRtpStreamStats.packetsFailedDecryption - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats packetsFailedDecryption(final int packetsFailedDecryption) {
    setPacketsFailedDecryption( packetsFailedDecryption );
    return this;
  }

  /**
   * The perDscpPacketsReceived property of the RTCInboundRtpStreamStats dictionary is a record comprised of key/value pairs in which each key is a string representation of a Differentiated Services Code Point and the value is the number of packets received for that DCSP.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/perDscpPacketsReceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-perdscppacketsreceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "perDscpPacketsReceived"
  )
  JsPropertyMap<Double> perDscpPacketsReceived();

  /**
   * The perDscpPacketsReceived property of the RTCInboundRtpStreamStats dictionary is a record comprised of key/value pairs in which each key is a string representation of a Differentiated Services Code Point and the value is the number of packets received for that DCSP.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/perDscpPacketsReceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-perdscppacketsreceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPerDscpPacketsReceived(@Nonnull JsPropertyMap<Double> perDscpPacketsReceived);

  /**
   * The perDscpPacketsReceived property of the RTCInboundRtpStreamStats dictionary is a record comprised of key/value pairs in which each key is a string representation of a Differentiated Services Code Point and the value is the number of packets received for that DCSP.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/perDscpPacketsReceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-perdscppacketsreceived">RTCInboundRtpStreamStats.perDscpPacketsReceived - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats perDscpPacketsReceived(
      @Nonnull final JsPropertyMap<Double> perDscpPacketsReceived) {
    setPerDscpPacketsReceived( perDscpPacketsReceived );
    return this;
  }

  /**
   * The pliCount property of the RTCInboundRtpStreamStats dictionary states the number of times the RTCRtpReceiver described by these statistics sent a Picture Loss Indication (PLI) packet to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/pliCount">RTCInboundRtpStreamStats.pliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-plicount">RTCInboundRtpStreamStats.pliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "pliCount"
  )
  int pliCount();

  /**
   * The pliCount property of the RTCInboundRtpStreamStats dictionary states the number of times the RTCRtpReceiver described by these statistics sent a Picture Loss Indication (PLI) packet to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/pliCount">RTCInboundRtpStreamStats.pliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-plicount">RTCInboundRtpStreamStats.pliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setPliCount(int pliCount);

  /**
   * The pliCount property of the RTCInboundRtpStreamStats dictionary states the number of times the RTCRtpReceiver described by these statistics sent a Picture Loss Indication (PLI) packet to the sender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/pliCount">RTCInboundRtpStreamStats.pliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-plicount">RTCInboundRtpStreamStats.pliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats pliCount(final int pliCount) {
    setPliCount( pliCount );
    return this;
  }

  /**
   * The qpSum property of the RTCInboundRtpStreamStats dictionary is a value generated by adding the Quantization Parameter (QP) values for every frame sent or received to date on the video track corresponding to this RTCInboundRtpStreamStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/qpSum">RTCInboundRtpStreamStats.qpSum - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-qpsum">RTCInboundRtpStreamStats.qpSum - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "qpSum"
  )
  int qpSum();

  /**
   * The qpSum property of the RTCInboundRtpStreamStats dictionary is a value generated by adding the Quantization Parameter (QP) values for every frame sent or received to date on the video track corresponding to this RTCInboundRtpStreamStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/qpSum">RTCInboundRtpStreamStats.qpSum - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-qpsum">RTCInboundRtpStreamStats.qpSum - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setQpSum(int qpSum);

  /**
   * The qpSum property of the RTCInboundRtpStreamStats dictionary is a value generated by adding the Quantization Parameter (QP) values for every frame sent or received to date on the video track corresponding to this RTCInboundRtpStreamStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/qpSum">RTCInboundRtpStreamStats.qpSum - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-qpsum">RTCInboundRtpStreamStats.qpSum - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats qpSum(final int qpSum) {
    setQpSum( qpSum );
    return this;
  }

  /**
   * The receiverId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCAudioReceiverStats or RTCVideoReceiverStats object representing the RTCRtpReceiver receiving the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/receiverId">RTCInboundRtpStreamStats.receiverId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-receiverid">RTCInboundRtpStreamStats.receiverId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "receiverId"
  )
  @Nonnull
  String receiverId();

  /**
   * The receiverId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCAudioReceiverStats or RTCVideoReceiverStats object representing the RTCRtpReceiver receiving the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/receiverId">RTCInboundRtpStreamStats.receiverId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-receiverid">RTCInboundRtpStreamStats.receiverId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setReceiverId(@Nonnull String receiverId);

  /**
   * The receiverId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCAudioReceiverStats or RTCVideoReceiverStats object representing the RTCRtpReceiver receiving the stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/receiverId">RTCInboundRtpStreamStats.receiverId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-receiverid">RTCInboundRtpStreamStats.receiverId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats receiverId(@Nonnull final String receiverId) {
    setReceiverId( receiverId );
    return this;
  }

  /**
   * The remoteId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCRemoteOutboundRtpStreamStats object representing the remote peer's RTCRtpSender which is sending the media to the local peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/remoteId">RTCInboundRtpStreamStats.remoteId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-remoteid">RTCInboundRtpStreamStats.remoteId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "remoteId"
  )
  String remoteId();

  /**
   * The remoteId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCRemoteOutboundRtpStreamStats object representing the remote peer's RTCRtpSender which is sending the media to the local peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/remoteId">RTCInboundRtpStreamStats.remoteId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-remoteid">RTCInboundRtpStreamStats.remoteId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setRemoteId(@Nonnull String remoteId);

  /**
   * The remoteId property of the RTCInboundRtpStreamStats dictionary specifies the id of the RTCRemoteOutboundRtpStreamStats object representing the remote peer's RTCRtpSender which is sending the media to the local peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/remoteId">RTCInboundRtpStreamStats.remoteId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-remoteid">RTCInboundRtpStreamStats.remoteId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats remoteId(@Nonnull final String remoteId) {
    setRemoteId( remoteId );
    return this;
  }

  @JsProperty(
      name = "removedSamplesForAcceleration"
  )
  int removedSamplesForAcceleration();

  @JsProperty
  void setRemovedSamplesForAcceleration(int removedSamplesForAcceleration);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats removedSamplesForAcceleration(
      final int removedSamplesForAcceleration) {
    setRemovedSamplesForAcceleration( removedSamplesForAcceleration );
    return this;
  }

  @JsProperty(
      name = "samplesDecodedWithCelt"
  )
  int samplesDecodedWithCelt();

  @JsProperty
  void setSamplesDecodedWithCelt(int samplesDecodedWithCelt);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats samplesDecodedWithCelt(final int samplesDecodedWithCelt) {
    setSamplesDecodedWithCelt( samplesDecodedWithCelt );
    return this;
  }

  @JsProperty(
      name = "samplesDecodedWithSilk"
  )
  int samplesDecodedWithSilk();

  @JsProperty
  void setSamplesDecodedWithSilk(int samplesDecodedWithSilk);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats samplesDecodedWithSilk(final int samplesDecodedWithSilk) {
    setSamplesDecodedWithSilk( samplesDecodedWithSilk );
    return this;
  }

  @JsProperty(
      name = "silentConcealedSamples"
  )
  int silentConcealedSamples();

  @JsProperty
  void setSilentConcealedSamples(int silentConcealedSamples);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats silentConcealedSamples(final int silentConcealedSamples) {
    setSilentConcealedSamples( silentConcealedSamples );
    return this;
  }

  /**
   * The sliCount property of the RTCInboundRtpStreamStats dictionary indicates how many Slice Loss Indication (SLI) packets the RTCRtpReceiver for which this object provdes statistics sent to the remote RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/sliCount">RTCInboundRtpStreamStats.sliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-slicount">RTCInboundRtpStreamStats.sliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "sliCount"
  )
  int sliCount();

  /**
   * The sliCount property of the RTCInboundRtpStreamStats dictionary indicates how many Slice Loss Indication (SLI) packets the RTCRtpReceiver for which this object provdes statistics sent to the remote RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/sliCount">RTCInboundRtpStreamStats.sliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-slicount">RTCInboundRtpStreamStats.sliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setSliCount(int sliCount);

  /**
   * The sliCount property of the RTCInboundRtpStreamStats dictionary indicates how many Slice Loss Indication (SLI) packets the RTCRtpReceiver for which this object provdes statistics sent to the remote RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/sliCount">RTCInboundRtpStreamStats.sliCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-slicount">RTCInboundRtpStreamStats.sliCount - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats sliCount(final int sliCount) {
    setSliCount( sliCount );
    return this;
  }

  @JsProperty(
      name = "totalAudioEnergy"
  )
  double totalAudioEnergy();

  @JsProperty
  void setTotalAudioEnergy(double totalAudioEnergy);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalAudioEnergy(final double totalAudioEnergy) {
    setTotalAudioEnergy( totalAudioEnergy );
    return this;
  }

  @JsProperty(
      name = "totalDecodeTime"
  )
  double totalDecodeTime();

  @JsProperty
  void setTotalDecodeTime(double totalDecodeTime);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalDecodeTime(final double totalDecodeTime) {
    setTotalDecodeTime( totalDecodeTime );
    return this;
  }

  @JsProperty(
      name = "totalInterFrameDelay"
  )
  double totalInterFrameDelay();

  @JsProperty
  void setTotalInterFrameDelay(double totalInterFrameDelay);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalInterFrameDelay(final double totalInterFrameDelay) {
    setTotalInterFrameDelay( totalInterFrameDelay );
    return this;
  }

  @JsProperty(
      name = "totalProcessingDelay"
  )
  double totalProcessingDelay();

  @JsProperty
  void setTotalProcessingDelay(double totalProcessingDelay);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalProcessingDelay(final double totalProcessingDelay) {
    setTotalProcessingDelay( totalProcessingDelay );
    return this;
  }

  @JsProperty(
      name = "totalSamplesDecoded"
  )
  int totalSamplesDecoded();

  @JsProperty
  void setTotalSamplesDecoded(int totalSamplesDecoded);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalSamplesDecoded(final int totalSamplesDecoded) {
    setTotalSamplesDecoded( totalSamplesDecoded );
    return this;
  }

  @JsProperty(
      name = "totalSamplesDuration"
  )
  double totalSamplesDuration();

  @JsProperty
  void setTotalSamplesDuration(double totalSamplesDuration);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalSamplesDuration(final double totalSamplesDuration) {
    setTotalSamplesDuration( totalSamplesDuration );
    return this;
  }

  @JsProperty(
      name = "totalSamplesReceived"
  )
  int totalSamplesReceived();

  @JsProperty
  void setTotalSamplesReceived(int totalSamplesReceived);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalSamplesReceived(final int totalSamplesReceived) {
    setTotalSamplesReceived( totalSamplesReceived );
    return this;
  }

  @JsProperty(
      name = "totalSquaredInterFrameDelay"
  )
  double totalSquaredInterFrameDelay();

  @JsProperty
  void setTotalSquaredInterFrameDelay(double totalSquaredInterFrameDelay);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalSquaredInterFrameDelay(
      final double totalSquaredInterFrameDelay) {
    setTotalSquaredInterFrameDelay( totalSquaredInterFrameDelay );
    return this;
  }

  @JsProperty(
      name = "voiceActivityFlag"
  )
  boolean voiceActivityFlag();

  @JsProperty
  void setVoiceActivityFlag(boolean voiceActivityFlag);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats voiceActivityFlag(final boolean voiceActivityFlag) {
    setVoiceActivityFlag( voiceActivityFlag );
    return this;
  }

  @JsProperty(
      name = "fractionLost"
  )
  double fractionLost();

  @JsProperty
  void setFractionLost(double fractionLost);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats fractionLost(final double fractionLost) {
    setFractionLost( fractionLost );
    return this;
  }

  /**
   * The trackId property of the RTCInboundRtpStreamStats dictionary indicates the id of the RTCReceiverAudioTrackAttachmentStats or RTCReceiverVideoTrackAttachmentStats object representing the MediaStreamTrack which is receiving the incoming media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/trackId">RTCInboundRtpStreamStats.trackId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-trackId">RTCInboundRtpStreamStats.trackId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "trackId"
  )
  String trackId();

  /**
   * The trackId property of the RTCInboundRtpStreamStats dictionary indicates the id of the RTCReceiverAudioTrackAttachmentStats or RTCReceiverVideoTrackAttachmentStats object representing the MediaStreamTrack which is receiving the incoming media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/trackId">RTCInboundRtpStreamStats.trackId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-trackId">RTCInboundRtpStreamStats.trackId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setTrackId(@Nonnull String trackId);

  /**
   * The trackId property of the RTCInboundRtpStreamStats dictionary indicates the id of the RTCReceiverAudioTrackAttachmentStats or RTCReceiverVideoTrackAttachmentStats object representing the MediaStreamTrack which is receiving the incoming media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats/trackId">RTCInboundRtpStreamStats.trackId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcinboundrtpstreamstats-trackId">RTCInboundRtpStreamStats.trackId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats trackId(@Nonnull final String trackId) {
    setTrackId( trackId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstDiscardCount(final int burstDiscardCount) {
    setBurstDiscardCount( burstDiscardCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstDiscardRate(final double burstDiscardRate) {
    setBurstDiscardRate( burstDiscardRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstLossCount(final int burstLossCount) {
    setBurstLossCount( burstLossCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstLossRate(final double burstLossRate) {
    setBurstLossRate( burstLossRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstPacketsDiscarded(final int burstPacketsDiscarded) {
    setBurstPacketsDiscarded( burstPacketsDiscarded );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstPacketsLost(final int burstPacketsLost) {
    setBurstPacketsLost( burstPacketsLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats framesDropped(final int framesDropped) {
    setFramesDropped( framesDropped );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats fullFramesLost(final int fullFramesLost) {
    setFullFramesLost( fullFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats gapDiscardRate(final double gapDiscardRate) {
    setGapDiscardRate( gapDiscardRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats gapLossRate(final double gapLossRate) {
    setGapLossRate( gapLossRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats jitter(final double jitter) {
    setJitter( jitter );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats packetsDiscarded(final int packetsDiscarded) {
    setPacketsDiscarded( packetsDiscarded );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats packetsLost(final int packetsLost) {
    setPacketsLost( packetsLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats packetsRepaired(final int packetsRepaired) {
    setPacketsRepaired( packetsRepaired );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats partialFramesLost(final int partialFramesLost) {
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
  default RTCInboundRtpStreamStats codecId(@Nonnull final String codecId) {
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
  default RTCInboundRtpStreamStats kind(@Nonnull final String kind) {
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
  default RTCInboundRtpStreamStats ssrc(final int ssrc) {
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
  default RTCInboundRtpStreamStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats averageRTCPInterval(final double averageRTCPInterval) {
    setAverageRTCPInterval( averageRTCPInterval );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats mediaType(@Nonnull final String mediaType) {
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
  default RTCInboundRtpStreamStats id(@Nonnull final String id) {
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
  default RTCInboundRtpStreamStats timestamp(final double timestamp) {
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
  default RTCInboundRtpStreamStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
