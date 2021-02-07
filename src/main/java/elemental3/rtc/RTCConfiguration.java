package elemental3.rtc;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCConfiguration dictionary is used to provide configuration options for an RTCPeerConnection. It may be passed into the constructor when instantiating a connection, or used with the RTCPeerConnection.getConfiguration() and RTCPeerConnection.setConfiguration() methods, which allow inspecting and changing the configuration while a connection is established.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration">RTCConfiguration - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration">RTCConfiguration - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCConfiguration {
  @JsOverlay
  @Nonnull
  static RTCConfiguration create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The RTCConfiguration dictionary's bundlePolicy property is a string value indicating which SDP bundling policy, if any, to use for the underlying RTP streams used by an RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/bundlePolicy">RTCConfiguration.bundlePolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-bundlepolicy">RTCConfiguration.bundlePolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "bundlePolicy"
  )
  @RTCBundlePolicy
  String bundlePolicy();

  /**
   * The RTCConfiguration dictionary's bundlePolicy property is a string value indicating which SDP bundling policy, if any, to use for the underlying RTP streams used by an RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/bundlePolicy">RTCConfiguration.bundlePolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-bundlepolicy">RTCConfiguration.bundlePolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setBundlePolicy(@RTCBundlePolicy @Nonnull String bundlePolicy);

  /**
   * The RTCConfiguration dictionary's bundlePolicy property is a string value indicating which SDP bundling policy, if any, to use for the underlying RTP streams used by an RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/bundlePolicy">RTCConfiguration.bundlePolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-bundlepolicy">RTCConfiguration.bundlePolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCConfiguration bundlePolicy(@RTCBundlePolicy @Nonnull final String bundlePolicy) {
    setBundlePolicy( bundlePolicy );
    return this;
  }

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-certificates">RTCConfiguration.certificates - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "certificates"
  )
  JsArray<RTCCertificate> certificates();

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-certificates">RTCConfiguration.certificates - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setCertificates(@Nonnull JsArray<RTCCertificate> certificates);

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-certificates">RTCConfiguration.certificates - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCConfiguration certificates(@Nonnull final JsArray<RTCCertificate> certificates) {
    setCertificates( certificates );
    return this;
  }

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-certificates">RTCConfiguration.certificates - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  default void setCertificates(@Nonnull final RTCCertificate... certificates) {
    setCertificates( Js.<JsArray<RTCCertificate>>uncheckedCast( certificates ) );
  }

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-certificates">RTCConfiguration.certificates - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCConfiguration certificates(@Nonnull final RTCCertificate... certificates) {
    setCertificates( certificates );
    return this;
  }

  @JsProperty(
      name = "iceCandidatePoolSize"
  )
  short iceCandidatePoolSize();

  @JsProperty
  void setIceCandidatePoolSize(short iceCandidatePoolSize);

  @JsOverlay
  @Nonnull
  default RTCConfiguration iceCandidatePoolSize(final short iceCandidatePoolSize) {
    setIceCandidatePoolSize( iceCandidatePoolSize );
    return this;
  }

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-iceservers">RTCConfiguration.iceServers - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "iceServers"
  )
  JsArray<RTCIceServer> iceServers();

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-iceservers">RTCConfiguration.iceServers - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setIceServers(@Nonnull JsArray<RTCIceServer> iceServers);

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-iceservers">RTCConfiguration.iceServers - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCConfiguration iceServers(@Nonnull final JsArray<RTCIceServer> iceServers) {
    setIceServers( iceServers );
    return this;
  }

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-iceservers">RTCConfiguration.iceServers - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  default void setIceServers(@Nonnull final RTCIceServer... iceServers) {
    setIceServers( Js.<JsArray<RTCIceServer>>uncheckedCast( iceServers ) );
  }

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-iceservers">RTCConfiguration.iceServers - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCConfiguration iceServers(@Nonnull final RTCIceServer... iceServers) {
    setIceServers( iceServers );
    return this;
  }

  /**
   * The WebRTC Device API dictionary RTCConfiguration's iceTransportPolicy property is a string indicating the transport selection policy the ICE agent should use during negotiation of connections. Its value must come from the RTCIceTransportPolicy enumerated type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceTransportPolicy">RTCConfiguration.iceTransportPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-icetransportpolicy">RTCCandidate.iceTransportPolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "iceTransportPolicy"
  )
  @RTCIceTransportPolicy
  String iceTransportPolicy();

  /**
   * The WebRTC Device API dictionary RTCConfiguration's iceTransportPolicy property is a string indicating the transport selection policy the ICE agent should use during negotiation of connections. Its value must come from the RTCIceTransportPolicy enumerated type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceTransportPolicy">RTCConfiguration.iceTransportPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-icetransportpolicy">RTCCandidate.iceTransportPolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setIceTransportPolicy(@RTCIceTransportPolicy @Nonnull String iceTransportPolicy);

  /**
   * The WebRTC Device API dictionary RTCConfiguration's iceTransportPolicy property is a string indicating the transport selection policy the ICE agent should use during negotiation of connections. Its value must come from the RTCIceTransportPolicy enumerated type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceTransportPolicy">RTCConfiguration.iceTransportPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcconfiguration-icetransportpolicy">RTCCandidate.iceTransportPolicy - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCConfiguration iceTransportPolicy(
      @RTCIceTransportPolicy @Nonnull final String iceTransportPolicy) {
    setIceTransportPolicy( iceTransportPolicy );
    return this;
  }

  @JsProperty(
      name = "rtcpMuxPolicy"
  )
  @RTCRtcpMuxPolicy
  String rtcpMuxPolicy();

  @JsProperty
  void setRtcpMuxPolicy(@RTCRtcpMuxPolicy @Nonnull String rtcpMuxPolicy);

  @JsOverlay
  @Nonnull
  default RTCConfiguration rtcpMuxPolicy(@RTCRtcpMuxPolicy @Nonnull final String rtcpMuxPolicy) {
    setRtcpMuxPolicy( rtcpMuxPolicy );
    return this;
  }

  @JsProperty(
      name = "peerIdentity"
  )
  String peerIdentity();

  @JsProperty
  void setPeerIdentity(@Nonnull String peerIdentity);

  @JsOverlay
  @Nonnull
  default RTCConfiguration peerIdentity(@Nonnull final String peerIdentity) {
    setPeerIdentity( peerIdentity );
    return this;
  }
}
