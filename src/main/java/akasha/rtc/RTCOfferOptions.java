package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCOfferOptions dictionary is used to provide optional settings when creating an RTCPeerConnection offer with the createOffer() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions">RTCOfferOptions - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferoptions">RTCOfferOptions - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface RTCOfferOptions extends RTCOfferAnswerOptions {
  @JsOverlay
  @Nonnull
  static RTCOfferOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The iceRestart property of the RTCOfferOptions dictionary is a Boolean value which, when true, tells the RTCPeerConnection to start ICE renegotiation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions/iceRestart">RTCOfferOptions.iceRestart - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferoptions-icerestart">RTCOfferOptions.iceRestart - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "iceRestart"
  )
  boolean iceRestart();

  /**
   * The iceRestart property of the RTCOfferOptions dictionary is a Boolean value which, when true, tells the RTCPeerConnection to start ICE renegotiation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions/iceRestart">RTCOfferOptions.iceRestart - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferoptions-icerestart">RTCOfferOptions.iceRestart - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setIceRestart(boolean iceRestart);

  /**
   * The iceRestart property of the RTCOfferOptions dictionary is a Boolean value which, when true, tells the RTCPeerConnection to start ICE renegotiation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferOptions/iceRestart">RTCOfferOptions.iceRestart - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferoptions-icerestart">RTCOfferOptions.iceRestart - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCOfferOptions iceRestart(final boolean iceRestart) {
    setIceRestart( iceRestart );
    return this;
  }

  @JsProperty(
      name = "offerToReceiveAudio"
  )
  boolean offerToReceiveAudio();

  @JsProperty
  void setOfferToReceiveAudio(boolean offerToReceiveAudio);

  @JsOverlay
  @Nonnull
  default RTCOfferOptions offerToReceiveAudio(final boolean offerToReceiveAudio) {
    setOfferToReceiveAudio( offerToReceiveAudio );
    return this;
  }

  @JsProperty(
      name = "offerToReceiveVideo"
  )
  boolean offerToReceiveVideo();

  @JsProperty
  void setOfferToReceiveVideo(boolean offerToReceiveVideo);

  @JsOverlay
  @Nonnull
  default RTCOfferOptions offerToReceiveVideo(final boolean offerToReceiveVideo) {
    setOfferToReceiveVideo( offerToReceiveVideo );
    return this;
  }
}
