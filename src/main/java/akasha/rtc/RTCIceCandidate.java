package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCIceCandidate interface&mdash;part of the WebRTC API&mdash;represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate">RTCIceCandidate - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcicecandidate-interface">RTCIceCandidate - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIceCandidate"
)
public class RTCIceCandidate {
  /**
   * The RTCIceCandidate() constructor creates and returns a new RTCIceCandidate object, which can be configured to represent a single ICE candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/RTCIceCandidate">RTCIceCandidate.RTCIceCandidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dfn-rtcicecandidate">RTCIceCandidate() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public RTCIceCandidate(@Nonnull final RTCIceCandidateInit candidateInitDict) {
  }

  /**
   * The RTCIceCandidate() constructor creates and returns a new RTCIceCandidate object, which can be configured to represent a single ICE candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/RTCIceCandidate">RTCIceCandidate.RTCIceCandidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dfn-rtcicecandidate">RTCIceCandidate() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public RTCIceCandidate() {
  }

  /**
   * The RTCIceCandidate interface's read-only address property is a string providing the address of the device which is the source of the candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/address">RTCIceCandidate.address - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-address">RTCIceCandidate: address - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "address"
  )
  @Nullable
  public native String address();

  /**
   * The read-only property candidate on the RTCIceCandidate interface returns a DOMString describing the candidate in detail.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/candidate">RTCIceCandidate.candidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-candidate">RTCIceCandidate.candidate - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "candidate"
  )
  @Nonnull
  public native String candidate();

  /**
   * The read-only component property on the RTCIceCandidate interface is a string which indicates whether the candidate is an RTP or an RTCP candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/component">RTCIceCandidate.component - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-component">RTCIceCandidate.component - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "component"
  )
  @Nullable
  @RTCIceComponent
  public native String component();

  /**
   * The RTCIceCandidate interface's read-only foundation property is a string which uniquely identifies the candidate across multiple transports.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/foundation">RTCIceCandidate.foundation - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-foundation">RTCIceCandidate.foundation - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "foundation"
  )
  @Nullable
  public native String foundation();

  /**
   * The RTCIceCandidate interface's read-only port property contains the port number on the device at the address given by ip at which the candidate's peer can be reached.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/port">RTCIceCandidate.port - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-port">RTCIceCandidate.port - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "port"
  )
  @Nullable
  public native Double port();

  /**
   * The RTCIceCandidate interface's read-only priority property specifies the candidate's priority according to the remote peer; the higher this value is, the better the remote peer considers the candidate to be.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/priority">RTCIceCandidate.priority - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-priority">RTCIceCandidate.priority - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "priority"
  )
  @Nullable
  public native Double priority();

  /**
   * The RTCIceCandidate interface's read-only protocol property is a string which indicates whether the candidate uses UDP or TCP as its transport protocol.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/protocol">RTCIceCandidate.protocol - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-protocol">RTCIceCandidate.protocol - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "protocol"
  )
  @Nullable
  @RTCIceProtocol
  public native String protocol();

  /**
   * The RTCIceCandidate interface's read-only relatedAddress property is a string indicating the related address of a relay or reflexive candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/relatedAddress">RTCIceCandidate.relatedAddress - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-relatedaddress">RTCIceCandidate.relatedAddress - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "relatedAddress"
  )
  @Nullable
  public native String relatedAddress();

  /**
   * The RTCIceCandidate interface's read-only relatedPort property indicates the port number of reflexive or relay candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/relatedPort">RTCIceCandidate.relatedPort - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-relatedport">RTCIceCandidate.relatedPort - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "relatedPort"
  )
  @Nullable
  public native Double relatedPort();

  /**
   * The read-only sdpMLineIndex property on the RTCIceCandidate interface is a zero-based index of the m-line describing the media associated with the candidate.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/sdpMLineIndex">RTCIceCandidate.sdpMLineIndex - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-sdpmlineindex">RTCIceCandidate.sdpMLineIndex - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "sdpMLineIndex"
  )
  @Nullable
  public native Double sdpMLineIndex();

  /**
   * The read-only property sdpMid on the RTCIceCandidate interface returns a DOMString specifying the media stream identification tag of the media component with which the candidate is associated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/sdpMid">RTCIceCandidate.sdpMid - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-sdpmid">RTCIceCandidate.sdpMid - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "sdpMid"
  )
  @Nullable
  public native String sdpMid();

  /**
   * The RTCIceCandidate interface's read-only tcpType property is included on TCP candidates to provide additional details about the candidate type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/tcpType">RTCIceCandidate.tcpType - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-tcptype">RTCIceCandidate.tcpType - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "tcpType"
  )
  @Nullable
  @RTCIceTcpCandidateType
  public native String tcpType();

  /**
   * The RTCIceCandidate interface's read-only type specifies the type of candidate the object represents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/type">RTCIceCandidate.type - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-type">RTCIceCandidate.type - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nullable
  @RTCIceCandidateType
  public native String type();

  /**
   * The read-only usernameFragment property on the RTCIceCandidate interface is a string indicating the username fragment (&quot;ufrag&quot;) that uniquely identifies a single ICE interaction session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/usernameFragment">RTCIceCandidate.usernameFragment - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-usernamefragment">RTCIceCandidate.usernameFragment - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "usernameFragment"
  )
  @Nullable
  public native String usernameFragment();

  /**
   * The RTCIceCandidate method toJSON() converts the RTCIceCandidate on which it's called into JSON in the form of an RTCIceCandidateInit object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidate/toJSON">RTCIceCandidate.toJSON - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidate-tojson">RTCIceCandidate.toJSON() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native RTCIceCandidateInit toJSON();
}
