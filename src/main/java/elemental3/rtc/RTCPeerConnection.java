package elemental3.rtc;

import elemental3.AddEventListenerOptions;
import elemental3.AlgorithmIdentifier;
import elemental3.EventHandler;
import elemental3.EventListener;
import elemental3.EventListenerOptions;
import elemental3.EventTarget;
import elemental3.VoidFunction;
import elemental3.core.JsArray;
import elemental3.media.MediaStream;
import elemental3.media.MediaStreamTrack;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The RTCPeerConnection interface represents a WebRTC connection between the local computer and a remote peer. It provides methods to connect to a remote peer, maintain and monitor the connection, and close the connection once it's no longer needed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection">RTCPeerConnection - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#interface-definition">RTCPeerConnection - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCPeerConnection"
)
public class RTCPeerConnection extends EventTarget {
  /**
   * The RTCPeerConnection.onconnectionstatechange property specifies an EventHandler which is called to handle the connectionstatechange event when it occurs on an instance of RTCPeerConnection. This happens whenever the aggregate state of the connection changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/onconnectionstatechange">RTCPeerConnection.onconnectionstatechange - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-onconnectionstatechange">RTCPeerConnection.onconnectionstatechange - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public EventHandler onconnectionstatechange;

  /**
   * The RTCPeerConnection.ondatachannel property is an EventHandler which specifies a function which is called when the datachannel event occurs on an RTCPeerConnection. This event, of type RTCDataChannelEvent, is sent when an RTCDataChannel is added to the connection by the remote peer calling createDataChannel().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/ondatachannel">RTCPeerConnection.ondatachannel - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-ondatachannel">RTCPeerConnection.ondatachannel - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public RTCDataChannelEventHandler ondatachannel;

  /**
   * The RTCPeerConnection property onicecandidate property is an EventHandler which specifies a function to be called when the icecandidate event occurs on an RTCPeerConnection instance. This happens whenever the local ICE agent needs to deliver a message to the other peer through the signaling server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/onicecandidate">RTCPeerConnection.onicecandidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-onicecandidate">RTCPeerConnection.onicecandidate - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public RTCPeerConnectionIceEventHandler onicecandidate;

  /**
   * The RTCPeerConnection.onicecandidateerror property is an EventHandler which specifies a function which is called to handle the icecandidateerror event when it occurs on an RTCPeerConnection instance. This event is fired when an error occurs during the ICE candidate gathering process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/onicecandidateerror">RTCPeerConnection.onicecandidateerror - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-onicecandidateerror">RTCPeerConnection.onicecandidateerror - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public RTCPeerConnectionIceErrorEventHandler onicecandidateerror;

  /**
   * The RTCPeerConnection.oniceconnectionstatechange property is an event handler which specifies a function to be called when the iceconnectionstatechange event is fired on an RTCPeerConnection instance. This happens when the state of the connection's ICE agent, as represented by the iceConnectionState property, changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/oniceconnectionstatechange">RTCPeerConnection.oniceconnectionstatechange - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-oniceconnectionstatechange">RTCPeerConnection.oniceconnectionstatechange - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public EventHandler oniceconnectionstatechange;

  /**
   * The RTCPeerConnection.onicegatheringstatechange property is an EventHandler which specifies a function to be called when the icegatheringstatechange event is sent to an RTCPeerConnection instance. This happens when the ICE gathering state&mdash;that is, whether or not the ICE agent is actively gathering candidates&mdash;changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/onicegatheringstatechange">RTCPeerConnection.onicegatheringstatechange - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-onicegatheringstatechange">RTCPeerConnection.onicegatheringstatechange - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public EventHandler onicegatheringstatechange;

  /**
   * The RTCPeerConnection interface's onnegotiationneeded property is an EventListener which specifies a function which is called to handle the negotiationneeded event when it occurs on an RTCPeerConnection instance. This event is fired when a change has occurred which requires session negotiation. This negotiation should be carried out as the offerer, because some session changes cannot be negotiated as the answerer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/onnegotiationneeded">RTCPeerConnection.onnegotiationneeded - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-onnegotiationneeded">RTCPeerConnection.onnegotiationneeded - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public EventHandler onnegotiationneeded;

  /**
   * The onsignalingstatechange event handler property of the RTCPeerConnection interface specifies a function to be called when the signalingstatechange event occurs on an RTCPeerConnection interface.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/onsignalingstatechange">RTCPeerConnection.onsignalingstatechange - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-onsignalingstatechange">RTCPeerConnection.onsignalingstatechange - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public EventHandler onsignalingstatechange;

  /**
   * The RTCPeerConnection property ontrack is an EventHandler which specifies a function to be called when the track event occurs, indicating that a track has been added to the RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/ontrack">RTCPeerConnection.ontrack - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-ontrack">RTCPeerConnection.ontrack - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public RTCTrackEventHandler ontrack;

  /**
   * The RTCPeerConnection() constructor returns a newly-created RTCPeerConnection, which represents a connection between the local device and a remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/RTCPeerConnection">RTCPeerConnection.RTCPeerConnection - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection">RTCPeerConnection() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public RTCPeerConnection(@Nonnull final RTCConfiguration configuration) {
  }

  /**
   * The RTCPeerConnection() constructor returns a newly-created RTCPeerConnection, which represents a connection between the local device and a remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/RTCPeerConnection">RTCPeerConnection.RTCPeerConnection - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection">RTCPeerConnection() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public RTCPeerConnection() {
  }

  /**
   * The read-only RTCPeerConnection property canTrickleIceCandidates returns a Boolean which indicates whether or not the remote peer can accept trickled ICE candidates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/canTrickleIceCandidates">RTCPeerConnection.canTrickleIceCandidates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-cantrickleicecandidates">RTCPeerConnection.canTrickleIceCandidates - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "canTrickleIceCandidates"
  )
  @Nullable
  public native Boolean canTrickleIceCandidates();

  /**
   * The read-only connectionState property of the RTCPeerConnection interface indicates the current state of the peer connection by returning one of the string values specified by the enum RTCPeerConnectionState.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/connectionState">RTCPeerConnection.connectionState - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-connection-state">RTCPeerConnection.connectionState - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "connectionState"
  )
  @Nonnull
  @RTCPeerConnectionState
  public native String connectionState();

  /**
   * The read-only property RTCPeerConnection.currentLocalDescription returns an RTCSessionDescription object describing the local end of the connection as it was most recently successfully negotiated since the last time the  RTCPeerConnection finished negotiating and connecting to a remote peer. Also included is a list of any ICE candidates that may already have been generated by the ICE agent since the offer or answer represented by the description was first instantiated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/currentLocalDescription">RTCPeerConnection.currentLocalDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-currentlocaldesc">RTCPeerConnection.currentLocalDescription - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "currentLocalDescription"
  )
  @Nullable
  public native RTCSessionDescription currentLocalDescription();

  /**
   * The read-only property RTCPeerConnection.currentRemoteDescription returns an RTCSessionDescription object describing the remote end of the connection as it was most recently successfully negotiated since the last time the RTCPeerConnection finished negotiating and connecting to a remote peer. Also included is a list of any ICE candidates that may already have been generated by the ICE agent since the offer or answer represented by the description was first instantiated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/currentRemoteDescription">RTCPeerConnection.currentRemoteDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-currentremotedesc">RTCPeerConnection.currentRemoteDescription - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "currentRemoteDescription"
  )
  @Nullable
  public native RTCSessionDescription currentRemoteDescription();

  /**
   * The read-only property RTCPeerConnection.iceConnectionState returns an enum of type RTCIceConnectionState which state of the ICE agent associated with the RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/iceConnectionState">RTCPeerConnection.iceConnectionState - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-ice-connection-state">RTCPeerConnection.iceConnectionState - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "iceConnectionState"
  )
  @Nonnull
  @RTCIceConnectionState
  public native String iceConnectionState();

  /**
   * The read-only property RTCPeerConnection.iceGatheringState returns an enum of type RTCIceGatheringState that describes connection's ICE gathering state. This lets you detect, for example, when collection of ICE candidates has finished.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/iceGatheringState">RTCPeerConnection.iceGatheringState - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-ice-gathering-state">RTCPeerConnection.iceGatheringState - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "iceGatheringState"
  )
  @Nonnull
  @RTCIceGatheringState
  public native String iceGatheringState();

  @JsProperty(
      name = "idpErrorInfo"
  )
  @Nullable
  public native String idpErrorInfo();

  @JsProperty(
      name = "idpLoginUrl"
  )
  @Nullable
  public native String idpLoginUrl();

  /**
   * The read-only property RTCPeerConnection.localDescription returns an RTCSessionDescription describing the session for the local end of the connection. If it has not yet been set, this is
   * null
   * .
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/localDescription">RTCPeerConnection.localDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-localdescription">RTCPeerConnection.localDescription - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "localDescription"
  )
  @Nullable
  public native RTCSessionDescription localDescription();

  /**
   * The read-only RTCPeerConnection property peerIdentity returns a JavaScript Promise that resolves to an RTCIdentityAssertion which contains a DOMString identifying the remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/peerIdentity">RTCPeerConnection.peerIdentity - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-identity/#dfn-peeridentity">Identity for WebRTC</a>
   */
  @JsProperty(
      name = "peerIdentity"
  )
  @Nonnull
  public native Promise<RTCIdentityAssertion> peerIdentity();

  /**
   * The read-only property RTCPeerConnection.pendingLocalDescription returns an RTCSessionDescription object describing a pending configuration change for the local end of the connection. This does not describe the connection as it currently stands, but as it may exist in the near future. Use RTCPeerConnection.currentLocalDescription or RTCPeerConnection.localDescription to get the current state of the endpoint. For details on the difference, see Pending and current descriptions in WebRTC connectivity.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/pendingLocalDescription">RTCPeerConnection.pendingLocalDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-pendinglocaldesc">RTCPeerConnection.pendingLocalDescription - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "pendingLocalDescription"
  )
  @Nullable
  public native RTCSessionDescription pendingLocalDescription();

  /**
   * The read-only property RTCPeerConnection.pendingRemoteDescription returns an RTCSessionDescription object describing a pending configuration change for the remote end of the connection. This does not describe the connection as it currently stands, but as it may exist in the near future. Use RTCPeerConnection.currentRemoteDescription or RTCPeerConnection.remoteDescription to get the current session description for the remote endpoint. For details on the difference, see Pending and current descriptions in WebRTC connectivity.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/pendingRemoteDescription">RTCPeerConnection.pendingRemoteDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-pendingremotedesc">RTCPeerConnection.pendingRemoteDescription - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "pendingRemoteDescription"
  )
  @Nullable
  public native RTCSessionDescription pendingRemoteDescription();

  /**
   * The read-only property RTCPeerConnection.remoteDescription returns a RTCSessionDescription describing the session (which includes configuration and media information) for the remote end of the connection. If this hasn't been set yet, this is null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/remoteDescription">RTCPeerConnection.remoteDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-remotedescription">RTCPeerConnection.remoteDescription - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "remoteDescription"
  )
  @Nullable
  public native RTCSessionDescription remoteDescription();

  /**
   * The read-only sctp property on the RTCPeerConnection interface returns an RTCSctpTransport describing the SCTP transport over which SCTP data is being sent and received. If SCTP hasn't been negotiated, this value is null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/sctp">RTCPeerConnection.sctp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-sctp">RTCPeerConnection.sctp - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "sctp"
  )
  @Nullable
  public native RTCSctpTransport sctp();

  /**
   * The read-only signalingState property on the RTCPeerConnection interface returns one of the string values specified by the RTCSignalingState enum; these values describe the state of the signaling process on the local end of the connection while connecting or reconnecting to another peer. See Signaling in Lifetime of a WebRTC session for more details about the signaling process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/signalingState">RTCPeerConnection.signalingState - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-signaling-state">RTCPeerConnection.signalingState - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "signalingState"
  )
  @Nonnull
  @RTCSignalingState
  public native String signalingState();

  /**
   * When a web site or app using RTCPeerConnection receives a new ICE candidate from the remote peer over its signaling channel, it delivers the newly-received candidate to the browser's ICE agent by calling RTCPeerConnection.addIceCandidate().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/addIceCandidate">RTCPeerConnection.addIceCandidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-addicecandidate">RTCPeerConnection.addIceCandidate() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> addIceCandidate(@Nonnull RTCIceCandidateInit candidate);

  /**
   * When a web site or app using RTCPeerConnection receives a new ICE candidate from the remote peer over its signaling channel, it delivers the newly-received candidate to the browser's ICE agent by calling RTCPeerConnection.addIceCandidate().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/addIceCandidate">RTCPeerConnection.addIceCandidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-addicecandidate">RTCPeerConnection.addIceCandidate() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> addIceCandidate();

  /**
   * When a web site or app using RTCPeerConnection receives a new ICE candidate from the remote peer over its signaling channel, it delivers the newly-received candidate to the browser's ICE agent by calling RTCPeerConnection.addIceCandidate().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/addIceCandidate">RTCPeerConnection.addIceCandidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-addicecandidate">RTCPeerConnection.addIceCandidate() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> addIceCandidate(@Nonnull RTCIceCandidateInit candidate,
      @Nonnull VoidFunction successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback);

  /**
   * The RTCPeerConnection.close() method closes the current peer connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/close">RTCPeerConnection.close - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-close">RTCPeerConnection.close() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public native void close();

  /**
   * The createAnswer() method on the RTCPeerConnection interface creates an SDP answer to an offer received from a remote peer during the offer/answer negotiation of a WebRTC connection. The answer contains information about any media already attached to the session, codecs and options supported by the browser, and any ICE candidates already gathered. The answer is delivered to the returned Promise, and should then be sent to the source of the offer to continue the negotiation process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createAnswer">RTCPeerConnection.createAnswer - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-createanswer">createAnswer() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<RTCSessionDescriptionInit> createAnswer(@Nonnull RTCAnswerOptions options);

  /**
   * The createAnswer() method on the RTCPeerConnection interface creates an SDP answer to an offer received from a remote peer during the offer/answer negotiation of a WebRTC connection. The answer contains information about any media already attached to the session, codecs and options supported by the browser, and any ICE candidates already gathered. The answer is delivered to the returned Promise, and should then be sent to the source of the offer to continue the negotiation process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createAnswer">RTCPeerConnection.createAnswer - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-createanswer">createAnswer() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<RTCSessionDescriptionInit> createAnswer();

  /**
   * The createAnswer() method on the RTCPeerConnection interface creates an SDP answer to an offer received from a remote peer during the offer/answer negotiation of a WebRTC connection. The answer contains information about any media already attached to the session, codecs and options supported by the browser, and any ICE candidates already gathered. The answer is delivered to the returned Promise, and should then be sent to the source of the offer to continue the negotiation process.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createAnswer">RTCPeerConnection.createAnswer - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-createanswer">createAnswer() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> createAnswer(@Nonnull RTCSessionDescriptionCallback successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback);

  /**
   * The createOffer() method of the RTCPeerConnection interface initiates the creation of an SDP offer for the purpose of starting a new WebRTC connection to a remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createOffer">RTCPeerConnection.createOffer - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-createoffer">createOffer() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<RTCSessionDescriptionInit> createOffer(@Nonnull RTCOfferOptions options);

  /**
   * The createOffer() method of the RTCPeerConnection interface initiates the creation of an SDP offer for the purpose of starting a new WebRTC connection to a remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createOffer">RTCPeerConnection.createOffer - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-createoffer">createOffer() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<RTCSessionDescriptionInit> createOffer();

  /**
   * The createOffer() method of the RTCPeerConnection interface initiates the creation of an SDP offer for the purpose of starting a new WebRTC connection to a remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createOffer">RTCPeerConnection.createOffer - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-createoffer">createOffer() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> createOffer(@Nonnull RTCSessionDescriptionCallback successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback, @Nonnull RTCOfferOptions options);

  /**
   * The createOffer() method of the RTCPeerConnection interface initiates the creation of an SDP offer for the purpose of starting a new WebRTC connection to a remote peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createOffer">RTCPeerConnection.createOffer - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-createoffer">createOffer() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> createOffer(@Nonnull RTCSessionDescriptionCallback successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback);

  /**
   * The RTCPeerConnection.getConfiguration() method returns an RTCConfiguration object which indicates the current configuration of the RTCPeerConnection on which the method is called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/getConfiguration">RTCPeerConnection.getConfiguration - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-getconfiguration">getConfiguration() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native RTCConfiguration getConfiguration();

  /**
   * The WebRTC API's RTCPeerConnection interface offers the restartIce() method to allow a web application to easily request that ICE candidate gathering be redone on both ends of the connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/restartIce">RTCPeerConnection.restartIce - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-restartice">RTCPeerConnection.restartIce() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public native void restartIce();

  /**
   * The RTCPeerConnection.setConfiguration() method sets the current configuration of the RTCPeerConnection based on the values included in the specified RTCConfiguration object. This lets you change the ICE servers used by the connection and which transport policies to use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/setConfiguration">RTCPeerConnection.setConfiguration - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-setconfiguration">setConfiguration() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public native void setConfiguration(@Nonnull RTCConfiguration configuration);

  /**
   * The RTCPeerConnection.setConfiguration() method sets the current configuration of the RTCPeerConnection based on the values included in the specified RTCConfiguration object. This lets you change the ICE servers used by the connection and which transport policies to use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/setConfiguration">RTCPeerConnection.setConfiguration - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-setconfiguration">setConfiguration() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public native void setConfiguration();

  /**
   * The RTCPeerConnection method setLocalDescription() changes the local description associated with the connection. This description specifies the properties of the local end of the connection, including the media format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/setLocalDescription">RTCPeerConnection.setLocalDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-setlocaldescription">RTCPeerConnection.setLocalDescription() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> setLocalDescription(
      @Nonnull RTCLocalSessionDescriptionInit description);

  /**
   * The RTCPeerConnection method setLocalDescription() changes the local description associated with the connection. This description specifies the properties of the local end of the connection, including the media format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/setLocalDescription">RTCPeerConnection.setLocalDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-setlocaldescription">RTCPeerConnection.setLocalDescription() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> setLocalDescription();

  /**
   * The RTCPeerConnection method setLocalDescription() changes the local description associated with the connection. This description specifies the properties of the local end of the connection, including the media format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/setLocalDescription">RTCPeerConnection.setLocalDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-setlocaldescription">RTCPeerConnection.setLocalDescription() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> setLocalDescription(
      @Nonnull RTCLocalSessionDescriptionInit description, @Nonnull VoidFunction successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback);

  /**
   * The RTCPeerConnection method setLocalDescription() changes the local description associated with the connection. This description specifies the properties of the local end of the connection, including the media format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/setLocalDescription">RTCPeerConnection.setLocalDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-setlocaldescription">RTCPeerConnection.setLocalDescription() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> setLocalDescription(
      @Nonnull RTCLocalSessionDescriptionInit description, @Nonnull VoidFunction successCallback);

  /**
   * The RTCPeerConnection method setRemoteDescription() sets the specified session description as the remote peer's current offer or answer. The description specifies the properties of the remote end of the connection, including the media format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/setRemoteDescription">RTCPeerConnection.setRemoteDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-setremotedescription">RTCPeerConnection.setRemoteDescription() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> setRemoteDescription(@Nonnull RTCSessionDescriptionInit description);

  /**
   * The RTCPeerConnection method setRemoteDescription() sets the specified session description as the remote peer's current offer or answer. The description specifies the properties of the remote end of the connection, including the media format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/setRemoteDescription">RTCPeerConnection.setRemoteDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-setremotedescription">RTCPeerConnection.setRemoteDescription() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> setRemoteDescription(@Nonnull RTCSessionDescriptionInit description,
      @Nonnull VoidFunction successCallback,
      @Nonnull RTCPeerConnectionErrorCallback failureCallback);

  /**
   * The static  RTCPeerConnection.generateCertificate() function creates an X.509 certificate and corresponding private key, returning a promise that resolves with the new RTCCertificate once it's generated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/generateCertificate">RTCPeerConnection.generateCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-generatecertificate">RTCPeerConnection.generateCertificate() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public static native Promise<RTCCertificate> generateCertificate(
      @Nonnull AlgorithmIdentifier keygenAlgorithm);

  /**
   * The static  RTCPeerConnection.generateCertificate() function creates an X.509 certificate and corresponding private key, returning a promise that resolves with the new RTCCertificate once it's generated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/generateCertificate">RTCPeerConnection.generateCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-generatecertificate">RTCPeerConnection.generateCertificate() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public static native Promise<RTCCertificate> generateCertificate(@Nonnull Object keygenAlgorithm);

  /**
   * The static  RTCPeerConnection.generateCertificate() function creates an X.509 certificate and corresponding private key, returning a promise that resolves with the new RTCCertificate once it's generated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/generateCertificate">RTCPeerConnection.generateCertificate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-generatecertificate">RTCPeerConnection.generateCertificate() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public static native Promise<RTCCertificate> generateCertificate(@Nonnull String keygenAlgorithm);

  /**
   * The RTCPeerConnection method addTrack() adds a new media track to the set of tracks which will be transmitted to the other peer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/addTrack">RTCPeerConnection.addTrack - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-addtrack">RTCPeerConnection.addTrack() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native RTCRtpSender addTrack(@Nonnull MediaStreamTrack track,
      @Nonnull MediaStream... streams);

  @Nonnull
  public native RTCRtpTransceiver addTransceiver(@Nonnull MediaStreamTrack trackOrKind,
      @Nonnull RTCRtpTransceiverInit init);

  @Nonnull
  public native RTCRtpTransceiver addTransceiver(@Nonnull String trackOrKind,
      @Nonnull RTCRtpTransceiverInit init);

  @Nonnull
  public native RTCRtpTransceiver addTransceiver(@Nonnull MediaStreamTrack trackOrKind);

  @Nonnull
  public native RTCRtpTransceiver addTransceiver(@Nonnull String trackOrKind);

  /**
   * The RTCPeerConnection.getReceivers() method returns an array of RTCRtpReceiver objects, each of which represents one RTP receiver. Each RTP receiver manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/getReceivers">RTCPeerConnection.getReceivers - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-getreceivers">RTCPeerConnection.getReceivers() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native JsArray<RTCRtpReceiver> getReceivers();

  /**
   * The RTCPeerConnection method getSenders() returns an array of RTCRtpSender objects, each of which represents the RTP sender responsible for transmitting one track's data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/getSenders">RTCPeerConnection.getSenders - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-getsenders">RTCPeerConnection.getSenders() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native JsArray<RTCRtpSender> getSenders();

  /**
   * The RTCPeerConnection interface's getTransceivers() method returns a list of the RTCRtpTransceiver objects being used to send and receive data on the connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/getTransceivers">RTCPeerConnection.getTransceivers - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-gettransceivers">RTCPeerConnection.getTransceivers() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native JsArray<RTCRtpTransceiver> getTransceivers();

  /**
   * The RTCPeerConnection.removeTrack() method tells the local end of the connection to stop sending media from the specified track, without actually removing the corresponding RTCRtpSender from the list of senders as reported by RTCPeerConnection.getSenders().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/removeTrack">RTCPeerConnection.removeTrack - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcpeerconnection-removetrack">RTCPeerConnection.removeTrack() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public native void removeTrack(@Nonnull RTCRtpSender sender);

  /**
   * The createDataChannel() method on the RTCPeerConnection interface creates a new channel linked with the remote peer, over which any kind of data may be transmitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createDataChannel">RTCPeerConnection.createDataChannel - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-createdatachannel">createDataChannel() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native RTCDataChannel createDataChannel(@Nonnull String label,
      @Nonnull RTCDataChannelInit dataChannelDict);

  /**
   * The createDataChannel() method on the RTCPeerConnection interface creates a new channel linked with the remote peer, over which any kind of data may be transmitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/createDataChannel">RTCPeerConnection.createDataChannel - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-peerconnection-createdatachannel">createDataChannel() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native RTCDataChannel createDataChannel(@Nonnull String label);

  /**
   * The RTCPeerConnection method getStats() returns a promise which resolves with data providing statistics about either the overall connection or about the specified MediaStreamTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/getStats">RTCPeerConnection.getStats - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#widl-RTCPeerConnection-getStats-Promise-RTCStatsReport--MediaStreamTrack-selector">RTCPeerConnection.getStats() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<RTCStatsReport> getStats(@Nullable MediaStreamTrack selector);

  /**
   * The RTCPeerConnection method getStats() returns a promise which resolves with data providing statistics about either the overall connection or about the specified MediaStreamTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/getStats">RTCPeerConnection.getStats - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#widl-RTCPeerConnection-getStats-Promise-RTCStatsReport--MediaStreamTrack-selector">RTCPeerConnection.getStats() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<RTCStatsReport> getStats();

  /**
   * The RTCPeerConnection.getIdentityAssertion() method initiates the gathering of an identity assertion. This has an effect only if the signalingState is not &quot;closed&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/getIdentityAssertion">RTCPeerConnection.getIdentityAssertion - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-identity/#dfn-getidentityassertion">RTCPeerConnection.getIdentityAssertion() - Identity for WebRTC</a>
   */
  @Nonnull
  public native Promise<String> getIdentityAssertion();

  /**
   * The RTCPeerConnection.setIdentityProvider() method sets the Identity Provider (IdP) to the triplet given in parameter: its name, the protocol used to communicate with it (optional) and an optional username. The IdP will be used only when an assertion is needed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/setIdentityProvider">RTCPeerConnection.setIdentityProvider - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-identity/#dfn-setidentityprovider">RTCPeerConnection.setIdentityProvider() - Identity for WebRTC</a>
   */
  public native void setIdentityProvider(@Nonnull String provider,
      @Nonnull RTCIdentityProviderOptions options);

  /**
   * The RTCPeerConnection.setIdentityProvider() method sets the Identity Provider (IdP) to the triplet given in parameter: its name, the protocol used to communicate with it (optional) and an optional username. The IdP will be used only when an assertion is needed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCPeerConnection/setIdentityProvider">RTCPeerConnection.setIdentityProvider - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-identity/#dfn-setidentityprovider">RTCPeerConnection.setIdentityProvider() - Identity for WebRTC</a>
   */
  public native void setIdentityProvider(@Nonnull String provider);

  @JsOverlay
  public final void addDatachannelListener(@Nonnull final RTCDataChannelEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "datachannel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDatachannelListener(@Nonnull final RTCDataChannelEventListener callback,
      final boolean useCapture) {
    addEventListener( "datachannel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDatachannelListener(@Nonnull final RTCDataChannelEventListener callback) {
    addEventListener( "datachannel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDatachannelListener(@Nonnull final RTCDataChannelEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "datachannel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDatachannelListener(@Nonnull final RTCDataChannelEventListener callback,
      final boolean useCapture) {
    removeEventListener( "datachannel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDatachannelListener(@Nonnull final RTCDataChannelEventListener callback) {
    removeEventListener( "datachannel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addIcecandidateListener(
      @Nonnull final RTCPeerConnectionIceEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "icecandidate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addIcecandidateListener(
      @Nonnull final RTCPeerConnectionIceEventListener callback, final boolean useCapture) {
    addEventListener( "icecandidate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addIcecandidateListener(
      @Nonnull final RTCPeerConnectionIceEventListener callback) {
    addEventListener( "icecandidate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeIcecandidateListener(
      @Nonnull final RTCPeerConnectionIceEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "icecandidate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeIcecandidateListener(
      @Nonnull final RTCPeerConnectionIceEventListener callback, final boolean useCapture) {
    removeEventListener( "icecandidate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeIcecandidateListener(
      @Nonnull final RTCPeerConnectionIceEventListener callback) {
    removeEventListener( "icecandidate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addIcecandidateerrorListener(
      @Nonnull final RTCPeerConnectionIceErrorEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "icecandidateerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addIcecandidateerrorListener(
      @Nonnull final RTCPeerConnectionIceErrorEventListener callback, final boolean useCapture) {
    addEventListener( "icecandidateerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addIcecandidateerrorListener(
      @Nonnull final RTCPeerConnectionIceErrorEventListener callback) {
    addEventListener( "icecandidateerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeIcecandidateerrorListener(
      @Nonnull final RTCPeerConnectionIceErrorEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "icecandidateerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeIcecandidateerrorListener(
      @Nonnull final RTCPeerConnectionIceErrorEventListener callback, final boolean useCapture) {
    removeEventListener( "icecandidateerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeIcecandidateerrorListener(
      @Nonnull final RTCPeerConnectionIceErrorEventListener callback) {
    removeEventListener( "icecandidateerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTrackListener(@Nonnull final RTCTrackEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "track", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTrackListener(@Nonnull final RTCTrackEventListener callback,
      final boolean useCapture) {
    addEventListener( "track", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTrackListener(@Nonnull final RTCTrackEventListener callback) {
    addEventListener( "track", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTrackListener(@Nonnull final RTCTrackEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "track", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTrackListener(@Nonnull final RTCTrackEventListener callback,
      final boolean useCapture) {
    removeEventListener( "track", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTrackListener(@Nonnull final RTCTrackEventListener callback) {
    removeEventListener( "track", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addConnectionstatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "connectionstatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addConnectionstatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "connectionstatechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addConnectionstatechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "connectionstatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeConnectionstatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "connectionstatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeConnectionstatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "connectionstatechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeConnectionstatechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "connectionstatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addIceconnectionstatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "iceconnectionstatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addIceconnectionstatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "iceconnectionstatechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addIceconnectionstatechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "iceconnectionstatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeIceconnectionstatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "iceconnectionstatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeIceconnectionstatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "iceconnectionstatechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeIceconnectionstatechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "iceconnectionstatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addIcegatheringstatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "icegatheringstatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addIcegatheringstatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "icegatheringstatechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addIcegatheringstatechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "icegatheringstatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeIcegatheringstatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "icegatheringstatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeIcegatheringstatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "icegatheringstatechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeIcegatheringstatechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "icegatheringstatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addNegotiationneededListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "negotiationneeded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addNegotiationneededListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "negotiationneeded", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addNegotiationneededListener(@Nonnull final EventListener callback) {
    addEventListener( "negotiationneeded", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeNegotiationneededListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "negotiationneeded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeNegotiationneededListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "negotiationneeded", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeNegotiationneededListener(@Nonnull final EventListener callback) {
    removeEventListener( "negotiationneeded", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPeeridentityListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "peeridentity", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPeeridentityListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "peeridentity", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPeeridentityListener(@Nonnull final EventListener callback) {
    addEventListener( "peeridentity", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePeeridentityListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "peeridentity", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePeeridentityListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "peeridentity", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePeeridentityListener(@Nonnull final EventListener callback) {
    removeEventListener( "peeridentity", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSignalingstatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "signalingstatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSignalingstatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "signalingstatechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSignalingstatechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "signalingstatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSignalingstatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "signalingstatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSignalingstatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "signalingstatechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSignalingstatechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "signalingstatechange", Js.cast( callback ) );
  }
}
