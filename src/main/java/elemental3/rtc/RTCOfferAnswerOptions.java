package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The WebRTC API's RTCOfferAnswerOptions dictionary is used to specify options that configure and control the process of creating WebRTC offers or answers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCOfferAnswerOptions">RTCOfferAnswerOptions - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcofferansweroptions">The definition of 'RTCOfferAnswerOptions' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCOfferAnswerOptions {
  @JsOverlay
  @Nonnull
  static RTCOfferAnswerOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }
}
