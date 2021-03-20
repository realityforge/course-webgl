package akasha.rtc;

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
 * The WebRTC API's RTCIceCandidateInit dictionary, which contains the information needed to fundamentally describe an RTCIceCandidate.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit">RTCIceCandidateInit - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit">RTCIceCandidateInit - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface RTCIceCandidateInit {
  @JsOverlay
  @Nonnull
  static RTCIceCandidateInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The optional property candidate in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's candidate property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/candidate">RTCIceCandidateInit.candidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-candidate">RTCIceCandidateInit.candidate - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "candidate"
  )
  String candidate();

  /**
   * The optional property candidate in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's candidate property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/candidate">RTCIceCandidateInit.candidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-candidate">RTCIceCandidateInit.candidate - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setCandidate(@Nonnull String candidate);

  /**
   * The optional property candidate in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's candidate property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/candidate">RTCIceCandidateInit.candidate - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-candidate">RTCIceCandidateInit.candidate - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateInit candidate(@Nonnull final String candidate) {
    setCandidate( candidate );
    return this;
  }

  /**
   * The optional property sdpMLineIndex in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMLineIndex property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMLineIndex">RTCIceCandidateInit.sdpMLineIndex - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-sdpmlineindex">RTCIceCandidateInit.sdpMLineIndex - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "sdpMLineIndex"
  )
  @Nullable
  Double sdpMLineIndex();

  /**
   * The optional property sdpMLineIndex in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMLineIndex property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMLineIndex">RTCIceCandidateInit.sdpMLineIndex - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-sdpmlineindex">RTCIceCandidateInit.sdpMLineIndex - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setSdpMLineIndex(@Nullable Double sdpMLineIndex);

  /**
   * The optional property sdpMLineIndex in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMLineIndex property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMLineIndex">RTCIceCandidateInit.sdpMLineIndex - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-sdpmlineindex">RTCIceCandidateInit.sdpMLineIndex - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateInit sdpMLineIndex(@Nullable final Double sdpMLineIndex) {
    setSdpMLineIndex( sdpMLineIndex );
    return this;
  }

  /**
   * The optional property sdpMid in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMid property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMid">RTCIceCandidateInit.sdpMid - MDN</a>
   */
  @JsProperty(
      name = "sdpMid"
  )
  @Nullable
  String sdpMid();

  /**
   * The optional property sdpMid in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMid property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMid">RTCIceCandidateInit.sdpMid - MDN</a>
   */
  @JsProperty
  void setSdpMid(@Nullable String sdpMid);

  /**
   * The optional property sdpMid in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's sdpMid property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/sdpMid">RTCIceCandidateInit.sdpMid - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateInit sdpMid(@Nullable final String sdpMid) {
    setSdpMid( sdpMid );
    return this;
  }

  /**
   * The optional property usernameFragment in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's usernameFragment property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/usernameFragment">RTCIceCandidateInit.usernameFragment - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-usernamefragment">RTCIceCandidateInit.usernameFragment - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "usernameFragment"
  )
  @Nullable
  String usernameFragment();

  /**
   * The optional property usernameFragment in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's usernameFragment property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/usernameFragment">RTCIceCandidateInit.usernameFragment - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-usernamefragment">RTCIceCandidateInit.usernameFragment - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setUsernameFragment(@Nullable String usernameFragment);

  /**
   * The optional property usernameFragment in the RTCIceCandidateInit dictionary specifies the value of the RTCIceCandidate object's usernameFragment property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidateInit/usernameFragment">RTCIceCandidateInit.usernameFragment - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcicecandidateinit-usernamefragment">RTCIceCandidateInit.usernameFragment - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidateInit usernameFragment(@Nullable final String usernameFragment) {
    setUsernameFragment( usernameFragment );
    return this;
  }
}
