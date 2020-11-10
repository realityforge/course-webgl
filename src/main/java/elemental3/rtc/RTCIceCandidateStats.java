package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The WebRTC API's RTCIceCandidateStats dictionary provides statistics related to an RTCIceCandidate.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats">RTCIceCandidateStats - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-stats/#icecandidate-dict*">The definition of 'RTCIceCandidateStats' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCIceCandidateStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCIceCandidateStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type,
      @RTCIceCandidateType @Nonnull final String candidateType, @Nonnull final String transportId) {
    return Js.<RTCIceCandidateStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).candidateType( candidateType ).transportId( transportId );
  }

  /**
   * The address property of the RTCIceCandidateStats dictionary indicates the address of the ICE candidate. While it's preferred that the address be specified as an IPv4 or IPv6 numeric address, a fully-qualified domain name can be used as well.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/address">RTCIceCandidateStats.address - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-address">The definition of 'RTCIceCandidateStats.address' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "address"
  )
  @Nullable
  String address();

  /**
   * The address property of the RTCIceCandidateStats dictionary indicates the address of the ICE candidate. While it's preferred that the address be specified as an IPv4 or IPv6 numeric address, a fully-qualified domain name can be used as well.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/address">RTCIceCandidateStats.address - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-address">The definition of 'RTCIceCandidateStats.address' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setAddress(@Nullable String address);

  /**
   * The address property of the RTCIceCandidateStats dictionary indicates the address of the ICE candidate. While it's preferred that the address be specified as an IPv4 or IPv6 numeric address, a fully-qualified domain name can be used as well.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/address">RTCIceCandidateStats.address - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-address">The definition of 'RTCIceCandidateStats.address' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats address(@Nullable final String address) {
    setAddress( address );
    return this;
  }

  /**
   * The RTCIceCandidateStats interface's candidateType property is a string which indicates the type of ICE candidate the object represents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/candidateType">RTCIceCandidateStats.candidateType - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats">The definition of 'RTCIceCandidateStats.candidateType' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "candidateType"
  )
  @RTCIceCandidateType
  @Nonnull
  String candidateType();

  /**
   * The RTCIceCandidateStats interface's candidateType property is a string which indicates the type of ICE candidate the object represents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/candidateType">RTCIceCandidateStats.candidateType - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats">The definition of 'RTCIceCandidateStats.candidateType' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setCandidateType(@RTCIceCandidateType @Nonnull String candidateType);

  /**
   * The RTCIceCandidateStats interface's candidateType property is a string which indicates the type of ICE candidate the object represents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/candidateType">RTCIceCandidateStats.candidateType - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats">The definition of 'RTCIceCandidateStats.candidateType' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats candidateType(
      @RTCIceCandidateType @Nonnull final String candidateType) {
    setCandidateType( candidateType );
    return this;
  }

  /**
   * The RTCIceCandidateStats dictionary's port property specifies the network port used by the candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/port">RTCIceCandidateStats.port - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">The definition of 'RTCIceCandidateStats.port' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "port"
  )
  int port();

  /**
   * The RTCIceCandidateStats dictionary's port property specifies the network port used by the candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/port">RTCIceCandidateStats.port - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">The definition of 'RTCIceCandidateStats.port' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setPort(int port);

  /**
   * The RTCIceCandidateStats dictionary's port property specifies the network port used by the candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/port">RTCIceCandidateStats.port - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">The definition of 'RTCIceCandidateStats.port' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats port(final int port) {
    setPort( port );
    return this;
  }

  /**
   * The RTCIceCandidateStats dictionary's priority property is a positive integer value indicating the priority (or desirability) of the described candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/priority">RTCIceCandidateStats.priority - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">The definition of 'RTCIceCandidateStats.port' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "priority"
  )
  int priority();

  /**
   * The RTCIceCandidateStats dictionary's priority property is a positive integer value indicating the priority (or desirability) of the described candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/priority">RTCIceCandidateStats.priority - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">The definition of 'RTCIceCandidateStats.port' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setPriority(int priority);

  /**
   * The RTCIceCandidateStats dictionary's priority property is a positive integer value indicating the priority (or desirability) of the described candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/priority">RTCIceCandidateStats.priority - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-port">The definition of 'RTCIceCandidateStats.port' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats priority(final int priority) {
    setPriority( priority );
    return this;
  }

  /**
   * The RTCIceCandidateStats dictionary's protocol  property specifies the protocol the specified candidate would use for communication with the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/protocol">RTCIceCandidateStats.protocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-protocol">The definition of 'RTCIceCandidateStats.protocol' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "protocol"
  )
  String protocol();

  /**
   * The RTCIceCandidateStats dictionary's protocol  property specifies the protocol the specified candidate would use for communication with the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/protocol">RTCIceCandidateStats.protocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-protocol">The definition of 'RTCIceCandidateStats.protocol' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setProtocol(@Nonnull String protocol);

  /**
   * The RTCIceCandidateStats dictionary's protocol  property specifies the protocol the specified candidate would use for communication with the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/protocol">RTCIceCandidateStats.protocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-protocol">The definition of 'RTCIceCandidateStats.protocol' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats protocol(@Nonnull final String protocol) {
    setProtocol( protocol );
    return this;
  }

  /**
   * The RTCIceCandidateStats dictionary's relayProtocol property specifies the protocol being used by a local ICE candidate to communicate with the TURN server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/relayProtocol">RTCIceCandidateStats.relayProtocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-relayprotocol">The definition of 'RTCIceCandidateStats.relayProtocol' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "relayProtocol"
  )
  String relayProtocol();

  /**
   * The RTCIceCandidateStats dictionary's relayProtocol property specifies the protocol being used by a local ICE candidate to communicate with the TURN server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/relayProtocol">RTCIceCandidateStats.relayProtocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-relayprotocol">The definition of 'RTCIceCandidateStats.relayProtocol' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setRelayProtocol(@Nonnull String relayProtocol);

  /**
   * The RTCIceCandidateStats dictionary's relayProtocol property specifies the protocol being used by a local ICE candidate to communicate with the TURN server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/relayProtocol">RTCIceCandidateStats.relayProtocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-relayprotocol">The definition of 'RTCIceCandidateStats.relayProtocol' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats relayProtocol(@Nonnull final String relayProtocol) {
    setRelayProtocol( relayProtocol );
    return this;
  }

  /**
   * The RTCIceCandidateStats dictionary's transportId property is a string that uniquely identifies the transport that produced the RTCTransportStats from which information about this candidate was taken.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/transportId">RTCIceCandidateStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-transportid">The definition of 'RTCIceCandidateStats.transportId' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "transportId"
  )
  @Nonnull
  String transportId();

  /**
   * The RTCIceCandidateStats dictionary's transportId property is a string that uniquely identifies the transport that produced the RTCTransportStats from which information about this candidate was taken.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/transportId">RTCIceCandidateStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-transportid">The definition of 'RTCIceCandidateStats.transportId' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setTransportId(@Nonnull String transportId);

  /**
   * The RTCIceCandidateStats dictionary's transportId property is a string that uniquely identifies the transport that produced the RTCTransportStats from which information about this candidate was taken.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/transportId">RTCIceCandidateStats.transportId - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-transportid">The definition of 'RTCIceCandidateStats.transportId' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  /**
   * The RTCIceCandidateStats dictionary's url property specifies the URL of the ICE server from which the described candidate was obtained. This property is only available for local candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/url">RTCIceCandidateStats.url - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-url">The definition of 'RTCIceCandidateStats.url' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "url"
  )
  String url();

  /**
   * The RTCIceCandidateStats dictionary's url property specifies the URL of the ICE server from which the described candidate was obtained. This property is only available for local candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/url">RTCIceCandidateStats.url - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-url">The definition of 'RTCIceCandidateStats.url' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setUrl(@Nonnull String url);

  /**
   * The RTCIceCandidateStats dictionary's url property specifies the URL of the ICE server from which the described candidate was obtained. This property is only available for local candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/url">RTCIceCandidateStats.url - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-url">The definition of 'RTCIceCandidateStats.url' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats url(@Nonnull final String url) {
    setUrl( url );
    return this;
  }

  /**
   * The RTCIceCandidateStats dictionary's deleted property indicates whether or not the candidate has been deleted or released.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/deleted">RTCIceCandidateStats.deleted - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-deleted">The definition of 'RTCIceCandidateStats.deleted' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty(
      name = "deleted"
  )
  boolean deleted();

  /**
   * The RTCIceCandidateStats dictionary's deleted property indicates whether or not the candidate has been deleted or released.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/deleted">RTCIceCandidateStats.deleted - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-deleted">The definition of 'RTCIceCandidateStats.deleted' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsProperty
  void setDeleted(boolean deleted);

  /**
   * The RTCIceCandidateStats dictionary's deleted property indicates whether or not the candidate has been deleted or released.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateStats/deleted">RTCIceCandidateStats.deleted - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-stats/#dom-rtcicecandidatestats-deleted">The definition of 'RTCIceCandidateStats.deleted' in the 'Identifiers for WebRTC's Statistics API' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats deleted(final boolean deleted) {
    setDeleted( deleted );
    return this;
  }

  @JsProperty(
      name = "isRemote"
  )
  boolean isRemote();

  @JsProperty
  void setIsRemote(boolean isRemote);

  @JsOverlay
  @Nonnull
  default RTCIceCandidateStats isRemote(final boolean isRemote) {
    setIsRemote( isRemote );
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
  default RTCIceCandidateStats id(@Nonnull final String id) {
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
  default RTCIceCandidateStats timestamp(final double timestamp) {
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
  default RTCIceCandidateStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
