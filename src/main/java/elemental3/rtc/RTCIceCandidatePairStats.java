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
 * The WebRTC RTCIceCandidatePairStats dictionary reports statistics which provide insight into the quality and performance of an RTCPeerConnection while connected and configured as described by the specified pair of ICE candidates.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats">RTCIceCandidatePairStats - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats">RTCIceCandidatePairStats - Identifiers for WebRTC's Statistics API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCIceCandidatePairStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCIceCandidatePairStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String localCandidateId,
      @Nonnull final String remoteCandidateId,
      @RTCStatsIceCandidatePairState @Nonnull final String state,
      @Nonnull final String transportId) {
    return Js.<RTCIceCandidatePairStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).localCandidateId( localCandidateId ).remoteCandidateId( remoteCandidateId ).state( state ).transportId( transportId );
  }

  /**
   * The RTCIceCandidatePairStats property availableIncomingBitrate returns a value indicative of the available inbound capacity of the network connection represented by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/availableIncomingBitrate">RTCIceCandidatePairStats.availableIncomingBitrate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-availableincomingbitrate">The definition of 'RTCIceCandidatePairStats.availableIncomingBitrate' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "availableIncomingBitrate"
  )
  double availableIncomingBitrate();

  /**
   * The RTCIceCandidatePairStats property availableIncomingBitrate returns a value indicative of the available inbound capacity of the network connection represented by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/availableIncomingBitrate">RTCIceCandidatePairStats.availableIncomingBitrate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-availableincomingbitrate">The definition of 'RTCIceCandidatePairStats.availableIncomingBitrate' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setAvailableIncomingBitrate(double availableIncomingBitrate);

  /**
   * The RTCIceCandidatePairStats property availableIncomingBitrate returns a value indicative of the available inbound capacity of the network connection represented by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/availableIncomingBitrate">RTCIceCandidatePairStats.availableIncomingBitrate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-availableincomingbitrate">The definition of 'RTCIceCandidatePairStats.availableIncomingBitrate' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats availableIncomingBitrate(final double availableIncomingBitrate) {
    setAvailableIncomingBitrate( availableIncomingBitrate );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property availableOutgoingBitrate returns a value indicative of the available outbound capacity of the network connection represented by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/availableOutgoingBitrate">RTCIceCandidatePairStats.availableOutgoingBitrate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-availableoutgoingbitrate">The definition of 'RTCIceCandidatePairStats.availableoutgoingbitrate' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "availableOutgoingBitrate"
  )
  double availableOutgoingBitrate();

  /**
   * The RTCIceCandidatePairStats property availableOutgoingBitrate returns a value indicative of the available outbound capacity of the network connection represented by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/availableOutgoingBitrate">RTCIceCandidatePairStats.availableOutgoingBitrate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-availableoutgoingbitrate">The definition of 'RTCIceCandidatePairStats.availableoutgoingbitrate' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setAvailableOutgoingBitrate(double availableOutgoingBitrate);

  /**
   * The RTCIceCandidatePairStats property availableOutgoingBitrate returns a value indicative of the available outbound capacity of the network connection represented by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/availableOutgoingBitrate">RTCIceCandidatePairStats.availableOutgoingBitrate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-availableoutgoingbitrate">The definition of 'RTCIceCandidatePairStats.availableoutgoingbitrate' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats availableOutgoingBitrate(final double availableOutgoingBitrate) {
    setAvailableOutgoingBitrate( availableOutgoingBitrate );
    return this;
  }

  @JsProperty(
      name = "bytesDiscardedOnSend"
  )
  int bytesDiscardedOnSend();

  @JsProperty
  void setBytesDiscardedOnSend(int bytesDiscardedOnSend);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats bytesDiscardedOnSend(final int bytesDiscardedOnSend) {
    setBytesDiscardedOnSend( bytesDiscardedOnSend );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property bytesReceived indicates the total number of payload bytes&mdash;that is, bytes which aren't overhead such as headers or padding&mdash;that hve been received to date on the connection described by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/bytesReceived">RTCIceCandidatePairStats.bytesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-bytesreceived">The definition of 'RTCIceCandidatePairStats.bytesReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "bytesReceived"
  )
  int bytesReceived();

  /**
   * The RTCIceCandidatePairStats property bytesReceived indicates the total number of payload bytes&mdash;that is, bytes which aren't overhead such as headers or padding&mdash;that hve been received to date on the connection described by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/bytesReceived">RTCIceCandidatePairStats.bytesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-bytesreceived">The definition of 'RTCIceCandidatePairStats.bytesReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setBytesReceived(int bytesReceived);

  /**
   * The RTCIceCandidatePairStats property bytesReceived indicates the total number of payload bytes&mdash;that is, bytes which aren't overhead such as headers or padding&mdash;that hve been received to date on the connection described by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/bytesReceived">RTCIceCandidatePairStats.bytesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-bytesreceived">The definition of 'RTCIceCandidatePairStats.bytesReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats bytesReceived(final int bytesReceived) {
    setBytesReceived( bytesReceived );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property bytesSent indicates the total number of payload bytes&mdash;that is, bytes which aren't overhead such as headers or padding&mdash;that hve been sent so far on the connection described by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/bytesSent">RTCIceCandidatePairStats.bytesSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-bytessent">The definition of 'RTCIceCandidatePairStats.bytesSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "bytesSent"
  )
  int bytesSent();

  /**
   * The RTCIceCandidatePairStats property bytesSent indicates the total number of payload bytes&mdash;that is, bytes which aren't overhead such as headers or padding&mdash;that hve been sent so far on the connection described by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/bytesSent">RTCIceCandidatePairStats.bytesSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-bytessent">The definition of 'RTCIceCandidatePairStats.bytesSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setBytesSent(int bytesSent);

  /**
   * The RTCIceCandidatePairStats property bytesSent indicates the total number of payload bytes&mdash;that is, bytes which aren't overhead such as headers or padding&mdash;that hve been sent so far on the connection described by the candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/bytesSent">RTCIceCandidatePairStats.bytesSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-bytessent">The definition of 'RTCIceCandidatePairStats.bytesSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats bytesSent(final int bytesSent) {
    setBytesSent( bytesSent );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property circuitBreakerTriggerCount indicates the number of times the circuit-breaker has been triggered to indicate a connection timeout or other unexpected connection abort on this specific connection configuration.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/circuitBreakerTriggerCount">RTCIceCandidatePairStats.circuitBreakerTriggerCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-circuitbreakertriggercount">The definition of 'RTCIceCandidatePairStats.circuitBreakerTriggerCount' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "circuitBreakerTriggerCount"
  )
  int circuitBreakerTriggerCount();

  /**
   * The RTCIceCandidatePairStats property circuitBreakerTriggerCount indicates the number of times the circuit-breaker has been triggered to indicate a connection timeout or other unexpected connection abort on this specific connection configuration.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/circuitBreakerTriggerCount">RTCIceCandidatePairStats.circuitBreakerTriggerCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-circuitbreakertriggercount">The definition of 'RTCIceCandidatePairStats.circuitBreakerTriggerCount' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setCircuitBreakerTriggerCount(int circuitBreakerTriggerCount);

  /**
   * The RTCIceCandidatePairStats property circuitBreakerTriggerCount indicates the number of times the circuit-breaker has been triggered to indicate a connection timeout or other unexpected connection abort on this specific connection configuration.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/circuitBreakerTriggerCount">RTCIceCandidatePairStats.circuitBreakerTriggerCount - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-circuitbreakertriggercount">The definition of 'RTCIceCandidatePairStats.circuitBreakerTriggerCount' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats circuitBreakerTriggerCount(
      final int circuitBreakerTriggerCount) {
    setCircuitBreakerTriggerCount( circuitBreakerTriggerCount );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property consentExpiredTimestamp indicates the time at which the most recent STUN binding response expired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/consentExpiredTimestamp">RTCIceCandidatePairStats.consentExpiredTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-consentexpiredtimestamp">The definition of 'RTCIceCandidatePairStats.consentExpiredTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "consentExpiredTimestamp"
  )
  double consentExpiredTimestamp();

  /**
   * The RTCIceCandidatePairStats property consentExpiredTimestamp indicates the time at which the most recent STUN binding response expired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/consentExpiredTimestamp">RTCIceCandidatePairStats.consentExpiredTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-consentexpiredtimestamp">The definition of 'RTCIceCandidatePairStats.consentExpiredTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setConsentExpiredTimestamp(double consentExpiredTimestamp);

  /**
   * The RTCIceCandidatePairStats property consentExpiredTimestamp indicates the time at which the most recent STUN binding response expired.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/consentExpiredTimestamp">RTCIceCandidatePairStats.consentExpiredTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-consentexpiredtimestamp">The definition of 'RTCIceCandidatePairStats.consentExpiredTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats consentExpiredTimestamp(final double consentExpiredTimestamp) {
    setConsentExpiredTimestamp( consentExpiredTimestamp );
    return this;
  }

  @JsProperty(
      name = "consentRequestBytesSent"
  )
  int consentRequestBytesSent();

  @JsProperty
  void setConsentRequestBytesSent(int consentRequestBytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats consentRequestBytesSent(final int consentRequestBytesSent) {
    setConsentRequestBytesSent( consentRequestBytesSent );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property consentRequestsSent specifies the number of consent requests that have been sent by this peer to the remote peer on the connection described by the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/consentRequestsSent">RTCIceCandidatePairStats.consentRequestsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-consentrequestssent">The definition of 'RTCIceCandidatePairStats.consentRequestsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "consentRequestsSent"
  )
  int consentRequestsSent();

  /**
   * The RTCIceCandidatePairStats property consentRequestsSent specifies the number of consent requests that have been sent by this peer to the remote peer on the connection described by the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/consentRequestsSent">RTCIceCandidatePairStats.consentRequestsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-consentrequestssent">The definition of 'RTCIceCandidatePairStats.consentRequestsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setConsentRequestsSent(int consentRequestsSent);

  /**
   * The RTCIceCandidatePairStats property consentRequestsSent specifies the number of consent requests that have been sent by this peer to the remote peer on the connection described by the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/consentRequestsSent">RTCIceCandidatePairStats.consentRequestsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-consentrequestssent">The definition of 'RTCIceCandidatePairStats.consentRequestsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats consentRequestsSent(final int consentRequestsSent) {
    setConsentRequestsSent( consentRequestsSent );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property currentRoundTripTime is a floating-point value indicating the number of seconds it takes for data to be sent by this peer to the remote peer and back over the connection described by this pair of ICE candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/currentRoundTripTime">RTCIceCandidatePairStats.currentRoundTripTime - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-currentroundtriptime">The definition of 'RTCIceCandidatePairStats.currentRoundTripTime' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "currentRoundTripTime"
  )
  double currentRoundTripTime();

  /**
   * The RTCIceCandidatePairStats property currentRoundTripTime is a floating-point value indicating the number of seconds it takes for data to be sent by this peer to the remote peer and back over the connection described by this pair of ICE candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/currentRoundTripTime">RTCIceCandidatePairStats.currentRoundTripTime - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-currentroundtriptime">The definition of 'RTCIceCandidatePairStats.currentRoundTripTime' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setCurrentRoundTripTime(double currentRoundTripTime);

  /**
   * The RTCIceCandidatePairStats property currentRoundTripTime is a floating-point value indicating the number of seconds it takes for data to be sent by this peer to the remote peer and back over the connection described by this pair of ICE candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/currentRoundTripTime">RTCIceCandidatePairStats.currentRoundTripTime - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-currentroundtriptime">The definition of 'RTCIceCandidatePairStats.currentRoundTripTime' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats currentRoundTripTime(final double currentRoundTripTime) {
    setCurrentRoundTripTime( currentRoundTripTime );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property firstRequestTimestamp specifies the time at which the first STUN request was sent on the described candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/firstRequestTimestamp">RTCIceCandidatePairStats.firstRequestTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-firstrequesttimestamp">The definition of 'RTCIceCandidatePairStats.firstRequestTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "firstRequestTimestamp"
  )
  double firstRequestTimestamp();

  /**
   * The RTCIceCandidatePairStats property firstRequestTimestamp specifies the time at which the first STUN request was sent on the described candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/firstRequestTimestamp">RTCIceCandidatePairStats.firstRequestTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-firstrequesttimestamp">The definition of 'RTCIceCandidatePairStats.firstRequestTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setFirstRequestTimestamp(double firstRequestTimestamp);

  /**
   * The RTCIceCandidatePairStats property firstRequestTimestamp specifies the time at which the first STUN request was sent on the described candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/firstRequestTimestamp">RTCIceCandidatePairStats.firstRequestTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-firstrequesttimestamp">The definition of 'RTCIceCandidatePairStats.firstRequestTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats firstRequestTimestamp(final double firstRequestTimestamp) {
    setFirstRequestTimestamp( firstRequestTimestamp );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property lastPacketReceivedTimestamp indicates the time at which the connection described by the candidate pair last received a packet. STUN packets are not included.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastPacketReceivedTimestamp">RTCIceCandidatePairStats.lastPacketReceivedTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastpacketreceivedtimestamp">The definition of 'RTCIceCandidatePairStats.lastPacketReceivedTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "lastPacketReceivedTimestamp"
  )
  double lastPacketReceivedTimestamp();

  /**
   * The RTCIceCandidatePairStats property lastPacketReceivedTimestamp indicates the time at which the connection described by the candidate pair last received a packet. STUN packets are not included.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastPacketReceivedTimestamp">RTCIceCandidatePairStats.lastPacketReceivedTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastpacketreceivedtimestamp">The definition of 'RTCIceCandidatePairStats.lastPacketReceivedTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setLastPacketReceivedTimestamp(double lastPacketReceivedTimestamp);

  /**
   * The RTCIceCandidatePairStats property lastPacketReceivedTimestamp indicates the time at which the connection described by the candidate pair last received a packet. STUN packets are not included.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastPacketReceivedTimestamp">RTCIceCandidatePairStats.lastPacketReceivedTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastpacketreceivedtimestamp">The definition of 'RTCIceCandidatePairStats.lastPacketReceivedTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastPacketReceivedTimestamp(
      final double lastPacketReceivedTimestamp) {
    setLastPacketReceivedTimestamp( lastPacketReceivedTimestamp );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property lastPacketSentTimestamp indicates the time at which the connection described by the candidate pair last sent a packet, not including STUN packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastPacketSentTimestamp">RTCIceCandidatePairStats.lastPacketSentTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastpacketsenttimestamp">The definition of 'RTCIceCandidatePairStats.lastPacketSentTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "lastPacketSentTimestamp"
  )
  double lastPacketSentTimestamp();

  /**
   * The RTCIceCandidatePairStats property lastPacketSentTimestamp indicates the time at which the connection described by the candidate pair last sent a packet, not including STUN packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastPacketSentTimestamp">RTCIceCandidatePairStats.lastPacketSentTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastpacketsenttimestamp">The definition of 'RTCIceCandidatePairStats.lastPacketSentTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setLastPacketSentTimestamp(double lastPacketSentTimestamp);

  /**
   * The RTCIceCandidatePairStats property lastPacketSentTimestamp indicates the time at which the connection described by the candidate pair last sent a packet, not including STUN packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastPacketSentTimestamp">RTCIceCandidatePairStats.lastPacketSentTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastpacketsenttimestamp">The definition of 'RTCIceCandidatePairStats.lastPacketSentTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastPacketSentTimestamp(final double lastPacketSentTimestamp) {
    setLastPacketSentTimestamp( lastPacketSentTimestamp );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property lastRequestTimestamp indicates the time at which the most recent STUN request was sent on the described candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastRequestTimestamp">RTCIceCandidatePairStats.lastRequestTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastrequesttimestamp">The definition of 'RTCIceCandidatePairStats.lastRequestTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "lastRequestTimestamp"
  )
  double lastRequestTimestamp();

  /**
   * The RTCIceCandidatePairStats property lastRequestTimestamp indicates the time at which the most recent STUN request was sent on the described candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastRequestTimestamp">RTCIceCandidatePairStats.lastRequestTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastrequesttimestamp">The definition of 'RTCIceCandidatePairStats.lastRequestTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setLastRequestTimestamp(double lastRequestTimestamp);

  /**
   * The RTCIceCandidatePairStats property lastRequestTimestamp indicates the time at which the most recent STUN request was sent on the described candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastRequestTimestamp">RTCIceCandidatePairStats.lastRequestTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastrequesttimestamp">The definition of 'RTCIceCandidatePairStats.lastRequestTimestamp' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastRequestTimestamp(final double lastRequestTimestamp) {
    setLastRequestTimestamp( lastRequestTimestamp );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property lastResponseTimestamp indicates the time at which the last STUN response was received on the described candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastResponseTimestamp">RTCIceCandidatePairStats.lastResponseTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastresponsetimestamp">RTCIceCandidatePairStats.lastResponseTimestamp - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "lastResponseTimestamp"
  )
  double lastResponseTimestamp();

  /**
   * The RTCIceCandidatePairStats property lastResponseTimestamp indicates the time at which the last STUN response was received on the described candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastResponseTimestamp">RTCIceCandidatePairStats.lastResponseTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastresponsetimestamp">RTCIceCandidatePairStats.lastResponseTimestamp - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setLastResponseTimestamp(double lastResponseTimestamp);

  /**
   * The RTCIceCandidatePairStats property lastResponseTimestamp indicates the time at which the last STUN response was received on the described candidate pair.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/lastResponseTimestamp">RTCIceCandidatePairStats.lastResponseTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-lastresponsetimestamp">RTCIceCandidatePairStats.lastResponseTimestamp - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats lastResponseTimestamp(final double lastResponseTimestamp) {
    setLastResponseTimestamp( lastResponseTimestamp );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property localCandidateId is a string that uniquely identifies the local ICE candidate which was analyzed to generate the RTCIceCandidateStats used to compute the statistics for this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/localCandidateId">RTCIceCandidatePairStats.localCandidateId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-localcandidateid">RTCIceCandidatePairStats.localCandidateId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty(
      name = "localCandidateId"
  )
  @Nonnull
  String localCandidateId();

  /**
   * The RTCIceCandidatePairStats property localCandidateId is a string that uniquely identifies the local ICE candidate which was analyzed to generate the RTCIceCandidateStats used to compute the statistics for this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/localCandidateId">RTCIceCandidatePairStats.localCandidateId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-localcandidateid">RTCIceCandidatePairStats.localCandidateId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsProperty
  void setLocalCandidateId(@Nonnull String localCandidateId);

  /**
   * The RTCIceCandidatePairStats property localCandidateId is a string that uniquely identifies the local ICE candidate which was analyzed to generate the RTCIceCandidateStats used to compute the statistics for this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/localCandidateId">RTCIceCandidatePairStats.localCandidateId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-localcandidateid">RTCIceCandidatePairStats.localCandidateId - Identifiers for WebRTC's Statistics API</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats localCandidateId(@Nonnull final String localCandidateId) {
    setLocalCandidateId( localCandidateId );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property nominated specifies whether or not the candidate pair described by the underlying RTCIceCandidatePair has been nominated to be used as the configuration for the WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/nominated">RTCIceCandidatePairStats.nominated - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-nominated">The definition of 'RTCIceCandidatePairStats.nominated' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "nominated"
  )
  boolean nominated();

  /**
   * The RTCIceCandidatePairStats property nominated specifies whether or not the candidate pair described by the underlying RTCIceCandidatePair has been nominated to be used as the configuration for the WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/nominated">RTCIceCandidatePairStats.nominated - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-nominated">The definition of 'RTCIceCandidatePairStats.nominated' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setNominated(boolean nominated);

  /**
   * The RTCIceCandidatePairStats property nominated specifies whether or not the candidate pair described by the underlying RTCIceCandidatePair has been nominated to be used as the configuration for the WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/nominated">RTCIceCandidatePairStats.nominated - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-nominated">The definition of 'RTCIceCandidatePairStats.nominated' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats nominated(final boolean nominated) {
    setNominated( nominated );
    return this;
  }

  @JsProperty(
      name = "packetsDiscardedOnSend"
  )
  int packetsDiscardedOnSend();

  @JsProperty
  void setPacketsDiscardedOnSend(int packetsDiscardedOnSend);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats packetsDiscardedOnSend(final int packetsDiscardedOnSend) {
    setPacketsDiscardedOnSend( packetsDiscardedOnSend );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats dictionary's packetsReceived property indicates the total number of packets of any kind that have been received on the connection described by the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/packetsReceived">RTCIceCandidatePairStats.packetsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-packetsreceived">The definition of 'RTCIceCandidatePairStats.packetsReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "packetsReceived"
  )
  int packetsReceived();

  /**
   * The RTCIceCandidatePairStats dictionary's packetsReceived property indicates the total number of packets of any kind that have been received on the connection described by the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/packetsReceived">RTCIceCandidatePairStats.packetsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-packetsreceived">The definition of 'RTCIceCandidatePairStats.packetsReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setPacketsReceived(int packetsReceived);

  /**
   * The RTCIceCandidatePairStats dictionary's packetsReceived property indicates the total number of packets of any kind that have been received on the connection described by the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/packetsReceived">RTCIceCandidatePairStats.packetsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-packetsreceived">The definition of 'RTCIceCandidatePairStats.packetsReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats dictionary's packetsSent property indicates the total number of packets which have been sent on the connection described by the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/packetsSent">RTCIceCandidatePairStats.packetsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-packetssent">The definition of 'RTCIceCandidatePairStats.packetsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "packetsSent"
  )
  int packetsSent();

  /**
   * The RTCIceCandidatePairStats dictionary's packetsSent property indicates the total number of packets which have been sent on the connection described by the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/packetsSent">RTCIceCandidatePairStats.packetsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-packetssent">The definition of 'RTCIceCandidatePairStats.packetsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setPacketsSent(int packetsSent);

  /**
   * The RTCIceCandidatePairStats dictionary's packetsSent property indicates the total number of packets which have been sent on the connection described by the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/packetsSent">RTCIceCandidatePairStats.packetsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-packetssent">The definition of 'RTCIceCandidatePairStats.packetsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats packetsSent(final int packetsSent) {
    setPacketsSent( packetsSent );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats property remoteCandidateId is a string that uniquely identifies the remote ICE candidate which was analyzed to generate the RTCIceCandidateStats used to compute the statistics for this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/remoteCandidateId">RTCIceCandidatePairStats.remoteCandidateId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-remotecandidateid">The definition of 'RTCIceCandidatePairStats.remoteCandidateId' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "remoteCandidateId"
  )
  @Nonnull
  String remoteCandidateId();

  /**
   * The RTCIceCandidatePairStats property remoteCandidateId is a string that uniquely identifies the remote ICE candidate which was analyzed to generate the RTCIceCandidateStats used to compute the statistics for this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/remoteCandidateId">RTCIceCandidatePairStats.remoteCandidateId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-remotecandidateid">The definition of 'RTCIceCandidatePairStats.remoteCandidateId' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setRemoteCandidateId(@Nonnull String remoteCandidateId);

  /**
   * The RTCIceCandidatePairStats property remoteCandidateId is a string that uniquely identifies the remote ICE candidate which was analyzed to generate the RTCIceCandidateStats used to compute the statistics for this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/remoteCandidateId">RTCIceCandidatePairStats.remoteCandidateId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-remotecandidateid">The definition of 'RTCIceCandidatePairStats.remoteCandidateId' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats remoteCandidateId(@Nonnull final String remoteCandidateId) {
    setRemoteCandidateId( remoteCandidateId );
    return this;
  }

  @JsProperty(
      name = "requestBytesSent"
  )
  int requestBytesSent();

  @JsProperty
  void setRequestBytesSent(int requestBytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats requestBytesSent(final int requestBytesSent) {
    setRequestBytesSent( requestBytesSent );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats dictionary's requestsReceived property indicates the total number of STUN connectivity check requests that have been received so far on the connection described by this pairing of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/requestsReceived">RTCIceCandidatePairStats.requestsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-requestsreceived">The definition of 'RTCIceCandidatePairStats.requestsReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "requestsReceived"
  )
  int requestsReceived();

  /**
   * The RTCIceCandidatePairStats dictionary's requestsReceived property indicates the total number of STUN connectivity check requests that have been received so far on the connection described by this pairing of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/requestsReceived">RTCIceCandidatePairStats.requestsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-requestsreceived">The definition of 'RTCIceCandidatePairStats.requestsReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setRequestsReceived(int requestsReceived);

  /**
   * The RTCIceCandidatePairStats dictionary's requestsReceived property indicates the total number of STUN connectivity check requests that have been received so far on the connection described by this pairing of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/requestsReceived">RTCIceCandidatePairStats.requestsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-requestsreceived">The definition of 'RTCIceCandidatePairStats.requestsReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats requestsReceived(final int requestsReceived) {
    setRequestsReceived( requestsReceived );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats dictionary's requestsSent property indicates the total number of STUN connectivity check requests that have been sent so far on the connection described by this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/requestsSent">RTCIceCandidatePairStats.requestsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-requestssent">The definition of 'RTCIceCandidatePairStats.requestsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "requestsSent"
  )
  int requestsSent();

  /**
   * The RTCIceCandidatePairStats dictionary's requestsSent property indicates the total number of STUN connectivity check requests that have been sent so far on the connection described by this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/requestsSent">RTCIceCandidatePairStats.requestsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-requestssent">The definition of 'RTCIceCandidatePairStats.requestsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setRequestsSent(int requestsSent);

  /**
   * The RTCIceCandidatePairStats dictionary's requestsSent property indicates the total number of STUN connectivity check requests that have been sent so far on the connection described by this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/requestsSent">RTCIceCandidatePairStats.requestsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-requestssent">The definition of 'RTCIceCandidatePairStats.requestsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats requestsSent(final int requestsSent) {
    setRequestsSent( requestsSent );
    return this;
  }

  @JsProperty(
      name = "responseBytesSent"
  )
  int responseBytesSent();

  @JsProperty
  void setResponseBytesSent(int responseBytesSent);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats responseBytesSent(final int responseBytesSent) {
    setResponseBytesSent( responseBytesSent );
    return this;
  }

  /**
   * The responsesReceived property in the RTCIceCandidatePairStats dictionary indicates the total number of STUN connectivity check responses that have been received on the connection described by this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/responsesReceived">RTCIceCandidatePairStats.responsesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-responsesreceived">The definition of 'RTCIceCandidatePairStats.responsesReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "responsesReceived"
  )
  int responsesReceived();

  /**
   * The responsesReceived property in the RTCIceCandidatePairStats dictionary indicates the total number of STUN connectivity check responses that have been received on the connection described by this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/responsesReceived">RTCIceCandidatePairStats.responsesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-responsesreceived">The definition of 'RTCIceCandidatePairStats.responsesReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setResponsesReceived(int responsesReceived);

  /**
   * The responsesReceived property in the RTCIceCandidatePairStats dictionary indicates the total number of STUN connectivity check responses that have been received on the connection described by this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/responsesReceived">RTCIceCandidatePairStats.responsesReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-responsesreceived">The definition of 'RTCIceCandidatePairStats.responsesReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats responsesReceived(final int responsesReceived) {
    setResponsesReceived( responsesReceived );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats dictionary's responsesSent property indicates the total number of STUN connectivity check responses that have been sent so far on the connection described by this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/responsesSent">RTCIceCandidatePairStats.responsesSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-responsessent">The definition of 'RTCIceCandidatePairStats.responsesSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "responsesSent"
  )
  int responsesSent();

  /**
   * The RTCIceCandidatePairStats dictionary's responsesSent property indicates the total number of STUN connectivity check responses that have been sent so far on the connection described by this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/responsesSent">RTCIceCandidatePairStats.responsesSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-responsessent">The definition of 'RTCIceCandidatePairStats.responsesSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setResponsesSent(int responsesSent);

  /**
   * The RTCIceCandidatePairStats dictionary's responsesSent property indicates the total number of STUN connectivity check responses that have been sent so far on the connection described by this pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/responsesSent">RTCIceCandidatePairStats.responsesSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-responsessent">The definition of 'RTCIceCandidatePairStats.responsesSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats responsesSent(final int responsesSent) {
    setResponsesSent( responsesSent );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats dictionary's retransmissionsReceived property indicates the total number of STUN connectivity check request retransmissions that have been received so far on the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/retransmissionsReceived">RTCIceCandidatePairStats.retransmissionsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-retransmissionsreceived">The definition of 'RTCIceCandidatePairStats.retransmissionsReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "retransmissionsReceived"
  )
  int retransmissionsReceived();

  /**
   * The RTCIceCandidatePairStats dictionary's retransmissionsReceived property indicates the total number of STUN connectivity check request retransmissions that have been received so far on the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/retransmissionsReceived">RTCIceCandidatePairStats.retransmissionsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-retransmissionsreceived">The definition of 'RTCIceCandidatePairStats.retransmissionsReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setRetransmissionsReceived(int retransmissionsReceived);

  /**
   * The RTCIceCandidatePairStats dictionary's retransmissionsReceived property indicates the total number of STUN connectivity check request retransmissions that have been received so far on the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/retransmissionsReceived">RTCIceCandidatePairStats.retransmissionsReceived - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-retransmissionsreceived">The definition of 'RTCIceCandidatePairStats.retransmissionsReceived' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats retransmissionsReceived(final int retransmissionsReceived) {
    setRetransmissionsReceived( retransmissionsReceived );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats dictionary's retransmissionsSent property indicates the total number of STUN connectivity check request retransmissions that have been sent so far on the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/retransmissionsSent">RTCIceCandidatePairStats.retransmissionsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-retransmissionssent">The definition of 'RTCIceCandidatePairStats.retransmissionsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "retransmissionsSent"
  )
  int retransmissionsSent();

  /**
   * The RTCIceCandidatePairStats dictionary's retransmissionsSent property indicates the total number of STUN connectivity check request retransmissions that have been sent so far on the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/retransmissionsSent">RTCIceCandidatePairStats.retransmissionsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-retransmissionssent">The definition of 'RTCIceCandidatePairStats.retransmissionsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setRetransmissionsSent(int retransmissionsSent);

  /**
   * The RTCIceCandidatePairStats dictionary's retransmissionsSent property indicates the total number of STUN connectivity check request retransmissions that have been sent so far on the pair of candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/retransmissionsSent">RTCIceCandidatePairStats.retransmissionsSent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-retransmissionssent">The definition of 'RTCIceCandidatePairStats.retransmissionsSent' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats retransmissionsSent(final int retransmissionsSent) {
    setRetransmissionsSent( retransmissionsSent );
    return this;
  }

  /**
   * The state property in an RTCIceCandidatePairStats object indicates the state of the check list of which the candidate pair is a member.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/state">RTCIceCandidatePairStats.state - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-state">The definition of 'RTCIceCandidatePairStats.state' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "state"
  )
  @RTCStatsIceCandidatePairState
  @Nonnull
  String state();

  /**
   * The state property in an RTCIceCandidatePairStats object indicates the state of the check list of which the candidate pair is a member.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/state">RTCIceCandidatePairStats.state - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-state">The definition of 'RTCIceCandidatePairStats.state' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setState(@RTCStatsIceCandidatePairState @Nonnull String state);

  /**
   * The state property in an RTCIceCandidatePairStats object indicates the state of the check list of which the candidate pair is a member.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/state">RTCIceCandidatePairStats.state - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-state">The definition of 'RTCIceCandidatePairStats.state' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats state(
      @RTCStatsIceCandidatePairState @Nonnull final String state) {
    setState( state );
    return this;
  }

  /**
   * The RTCIceCandidatePairStats dictionary's totalRoundTripTime property is the total time that has elapsed between sending STUN requests and receiving the responses, for all such requests that have been made so far on the pair of candidates described by this RTCIceCandidatePairStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/totalRoundTripTime">RTCIceCandidatePairStats.totalRoundTripTime - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-totalroundtriptime">The definition of 'RTCIceCandidatePairStats.totalRoundTripTime' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "totalRoundTripTime"
  )
  double totalRoundTripTime();

  /**
   * The RTCIceCandidatePairStats dictionary's totalRoundTripTime property is the total time that has elapsed between sending STUN requests and receiving the responses, for all such requests that have been made so far on the pair of candidates described by this RTCIceCandidatePairStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/totalRoundTripTime">RTCIceCandidatePairStats.totalRoundTripTime - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-totalroundtriptime">The definition of 'RTCIceCandidatePairStats.totalRoundTripTime' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setTotalRoundTripTime(double totalRoundTripTime);

  /**
   * The RTCIceCandidatePairStats dictionary's totalRoundTripTime property is the total time that has elapsed between sending STUN requests and receiving the responses, for all such requests that have been made so far on the pair of candidates described by this RTCIceCandidatePairStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/totalRoundTripTime">RTCIceCandidatePairStats.totalRoundTripTime - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-totalroundtriptime">The definition of 'RTCIceCandidatePairStats.totalRoundTripTime' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats totalRoundTripTime(final double totalRoundTripTime) {
    setTotalRoundTripTime( totalRoundTripTime );
    return this;
  }

  /**
   * The transportId property uniquely identifies the RTCIceTransport that was inspected to obtain the transport-related statistics contained in the RTCIceCandidatePairStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/transportId">RTCIceCandidatePairStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-transportid">The definition of 'RTCIceCandidatePairStats.transportId' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty(
      name = "transportId"
  )
  @Nonnull
  String transportId();

  /**
   * The transportId property uniquely identifies the RTCIceTransport that was inspected to obtain the transport-related statistics contained in the RTCIceCandidatePairStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/transportId">RTCIceCandidatePairStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-transportid">The definition of 'RTCIceCandidatePairStats.transportId' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsProperty
  void setTransportId(@Nonnull String transportId);

  /**
   * The transportId property uniquely identifies the RTCIceTransport that was inspected to obtain the transport-related statistics contained in the RTCIceCandidatePairStats object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePairStats/transportId">RTCIceCandidatePairStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatepairstats-transportid">The definition of 'RTCIceCandidatePairStats.transportId' in Identifiers for WebRTC's Statistics API.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsProperty(
      name = "currentRtt"
  )
  double currentRtt();

  @JsProperty
  void setCurrentRtt(double currentRtt);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats currentRtt(final double currentRtt) {
    setCurrentRtt( currentRtt );
    return this;
  }

  @JsProperty(
      name = "priority"
  )
  int priority();

  @JsProperty
  void setPriority(int priority);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats priority(final int priority) {
    setPriority( priority );
    return this;
  }

  @JsProperty(
      name = "totalRtt"
  )
  double totalRtt();

  @JsProperty
  void setTotalRtt(double totalRtt);

  @JsOverlay
  @Nonnull
  default RTCIceCandidatePairStats totalRtt(final double totalRtt) {
    setTotalRtt( totalRtt );
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
  default RTCIceCandidatePairStats id(@Nonnull final String id) {
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
  default RTCIceCandidatePairStats timestamp(final double timestamp) {
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
  default RTCIceCandidatePairStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
