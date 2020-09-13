package elemental3;

import elemental2.core.JsArray;
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
 * The RTCConfiguration dictionary is used to provide configuration options for an RTCPeerConnection. It may be passed into the constructor when instantiating a connection, or used with the RTCPeerConnection.getConfiguration() and RTCPeerConnection.setConfiguration() methods, which allow inspecting and changing the configuration while a connection is established.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration">RTCConfiguration - MDN</a>
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
   */
  @JsProperty(
      name = "bundlePolicy"
  )
  @MagicConstant(
      valuesFromClass = RTCBundlePolicy.class
  )
  String bundlePolicy();

  /**
   * The RTCConfiguration dictionary's bundlePolicy property is a string value indicating which SDP bundling policy, if any, to use for the underlying RTP streams used by an RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/bundlePolicy">RTCConfiguration.bundlePolicy - MDN</a>
   */
  @JsProperty
  void setBundlePolicy(
      @MagicConstant(valuesFromClass = RTCBundlePolicy.class) @Nonnull String bundlePolicy);

  /**
   * The RTCConfiguration dictionary's bundlePolicy property is a string value indicating which SDP bundling policy, if any, to use for the underlying RTP streams used by an RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/bundlePolicy">RTCConfiguration.bundlePolicy - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCConfiguration bundlePolicy(
      @MagicConstant(valuesFromClass = RTCBundlePolicy.class) @Nonnull final String bundlePolicy) {
    setBundlePolicy( bundlePolicy );
    return this;
  }

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
   */
  @JsProperty(
      name = "certificates"
  )
  JsArray<RTCCertificate> certificates();

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
   */
  @JsProperty
  void setCertificates(@Nonnull JsArray<RTCCertificate> certificates);

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
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
   */
  @JsOverlay
  default void setCertificates(@Nonnull final RTCCertificate... certificates) {
    setCertificates( Js.<JsArray<RTCCertificate>>uncheckedCast( certificates ) );
  }

  /**
   * The RTCConfiguration dictionary's optional certificates property is an array of RTCCertificate objects providing the security certificates available for use when authenticating duing the connection process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/certificates">RTCConfiguration.certificates - MDN</a>
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
   */
  @JsProperty(
      name = "iceServers"
  )
  JsArray<RTCIceServer> iceServers();

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
   */
  @JsProperty
  void setIceServers(@Nonnull JsArray<RTCIceServer> iceServers);

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
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
   */
  @JsOverlay
  default void setIceServers(@Nonnull final RTCIceServer... iceServers) {
    setIceServers( Js.<JsArray<RTCIceServer>>uncheckedCast( iceServers ) );
  }

  /**
   *
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceServers">RTCConfiguration.iceServers - MDN</a>
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
   */
  @JsProperty(
      name = "iceTransportPolicy"
  )
  @MagicConstant(
      valuesFromClass = RTCIceTransportPolicy.class
  )
  String iceTransportPolicy();

  /**
   * The WebRTC Device API dictionary RTCConfiguration's iceTransportPolicy property is a string indicating the transport selection policy the ICE agent should use during negotiation of connections. Its value must come from the RTCIceTransportPolicy enumerated type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceTransportPolicy">RTCConfiguration.iceTransportPolicy - MDN</a>
   */
  @JsProperty
  void setIceTransportPolicy(
      @MagicConstant(valuesFromClass = RTCIceTransportPolicy.class) @Nonnull String iceTransportPolicy);

  /**
   * The WebRTC Device API dictionary RTCConfiguration's iceTransportPolicy property is a string indicating the transport selection policy the ICE agent should use during negotiation of connections. Its value must come from the RTCIceTransportPolicy enumerated type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCConfiguration/iceTransportPolicy">RTCConfiguration.iceTransportPolicy - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCConfiguration iceTransportPolicy(
      @MagicConstant(valuesFromClass = RTCIceTransportPolicy.class) @Nonnull final String iceTransportPolicy) {
    setIceTransportPolicy( iceTransportPolicy );
    return this;
  }

  @JsProperty(
      name = "rtcpMuxPolicy"
  )
  @MagicConstant(
      valuesFromClass = RTCRtcpMuxPolicy.class
  )
  String rtcpMuxPolicy();

  @JsProperty
  void setRtcpMuxPolicy(
      @MagicConstant(valuesFromClass = RTCRtcpMuxPolicy.class) @Nonnull String rtcpMuxPolicy);

  @JsOverlay
  @Nonnull
  default RTCConfiguration rtcpMuxPolicy(
      @MagicConstant(valuesFromClass = RTCRtcpMuxPolicy.class) @Nonnull final String rtcpMuxPolicy) {
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
