package akasha.rtc;

import akasha.AddEventListenerOptions;
import akasha.EventHandler;
import akasha.EventListener;
import akasha.EventListenerOptions;
import akasha.EventTarget;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The RTCIceTransport interface provides access to information about the ICE transport layer over which the data is being sent and received.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport">RTCIceTransport - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicetransport">RTCIceTransport - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIceTransport"
)
public class RTCIceTransport extends EventTarget {
  /**
   * The ongatheringstatechange event handler for the RTCIceTransport interface specifies an event handler that is to be called when the gatheringstatechange event occurs on the transport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/ongatheringstatechange">RTCIceTransport.ongatheringstatechange - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicetransport-ongatheringstatechange">RTCIceTransport.ongatheringstatechange - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public EventHandler ongatheringstatechange;

  /**
   * The RTCIceTransport interface's onselectedcandidatepairchange event handler specifies a function to be called to handle the selectedcandidatepairchange event, which is fired when the ICE agent selects a new candidate pair to be used for the connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/onselectedcandidatepairchange">RTCIceTransport.onselectedcandidatepairchange - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicetransport-onselectedcandidatepairchange">RTCIceTransport.onselectedcandidatepairchange - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public EventHandler onselectedcandidatepairchange;

  /**
   * The onstatechange event handler for the RTCIceTransport interface is a property which specifies a function to serve as the EventHandler for the statechange event that is fired whenever the transport's state changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/onstatechange">RTCIceTransport.onstatechange - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicetransport-onstatechange">RTCIceTransport.onstatechange - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public EventHandler onstatechange;

  protected RTCIceTransport() {
  }

  /**
   * The read-only RTCIceTransport property component specifies whether the object is serving to transport RTP or RTCP. The value is one of the strings in RTCIceComponent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/component">RTCIceTransport.component - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-icetransport-component">RTCIceTransport.component - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "component"
  )
  @Nonnull
  @RTCIceComponent
  public native String component();

  /**
   * The read-only RTCIceTransport property gatheringState returns a DOMString from the enumerated type RTCIceGathererState that indicates what gathering state the ICE agent is currently in: &quot;new&quot;, &quot;gathering&quot;, or &quot;complete&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/gatheringState">RTCIceTransport.gatheringState - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-icetransport-gatheringstate">RTCIceTransport.gatheringState - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "gatheringState"
  )
  @Nonnull
  @RTCIceGathererState
  public native String gatheringState();

  /**
   * The read-only RTCIceTransport property role indicates which ICE role the transport is fulfilling: that of the controlling agent, or the agent that is being controlled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/role">RTCIceTransport.role - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-icetransport-role">RTCIceTransport.role - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "role"
  )
  @Nonnull
  @RTCIceRole
  public native String role();

  /**
   * The read-only RTCIceTransport property state returns the current state of the ICE transport, so you can determine the state of ICE gathering in which the ICE agent currently is operating.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/state">RTCIceTransport.state - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#rtcicetransportstate">RTCIceTransportState - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  @RTCIceTransportState
  public native String state();

  /**
   * The RTCIceTransport method getLocalCandidates() returns an array of RTCIceCandidate objects, one for each of the candidates that have been gathered by the local device during the current ICE agent session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/getLocalCandidates">RTCIceTransport.getLocalCandidates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicetransport-getlocalcandidates">RTCIceCandidate.getLocalCandidates() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native JsArray<RTCIceCandidate> getLocalCandidates();

  /**
   * The RTCIceTransport method getLocalParameters() returns an RTCIceParameters object which provides information uniquely identifying the local peer for the duration of the ICE session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/getLocalParameters">RTCIceTransport.getLocalParameters - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicetransport-getlocalparameters">RTCIceTransport.getLocalParameters - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public native RTCIceParameters getLocalParameters();

  /**
   * The RTCIceTransport method getRemoteCandidates() returns an array which contains one RTCIceCandidate for each of the candidates that have been received from the remote peer so far during the current ICE gathering session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/getRemoteCandidates">RTCIceTransport.getRemoteCandidates - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicetransport-getremotecandidates">RTCIceCandidate.getRemoteCandidates() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native JsArray<RTCIceCandidate> getRemoteCandidates();

  /**
   * The RTCIceTransport method getRemoteParameters() returns an RTCIceParameters object which provides information uniquely identifying the remote peer for the duration of the ICE session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/getRemoteParameters">RTCIceTransport.getRemoteParameters - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicetransport-getremoteparameters">RTCIceTransport.getRemoteParameters - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public native RTCIceParameters getRemoteParameters();

  /**
   * The RTCIceTransport method getSelectedCandidatePair() returns an RTCIceCandidatePair object containing the current best-choice pair of ICE candidates describing the configuration of the endpoints of the transport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceTransport/getSelectedCandidatePair">RTCIceTransport.getSelectedCandidatePair - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicetransport-getselectedcandidatepair">RTCIceTransport.getSelectedCandidatePair() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public native RTCIceCandidatePair getSelectedCandidatePair();

  @JsOverlay
  public final void addGatheringstatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gatheringstatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGatheringstatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "gatheringstatechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addGatheringstatechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "gatheringstatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeGatheringstatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gatheringstatechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGatheringstatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "gatheringstatechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeGatheringstatechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "gatheringstatechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSelectedcandidatepairchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "selectedcandidatepairchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSelectedcandidatepairchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "selectedcandidatepairchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSelectedcandidatepairchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "selectedcandidatepairchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSelectedcandidatepairchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "selectedcandidatepairchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSelectedcandidatepairchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "selectedcandidatepairchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSelectedcandidatepairchangeListener(
      @Nonnull final EventListener callback) {
    removeEventListener( "selectedcandidatepairchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addStatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "statechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "statechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addStatechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "statechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeStatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "statechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "statechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeStatechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "statechange", Js.cast( callback ) );
  }
}
