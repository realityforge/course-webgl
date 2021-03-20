package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The RTCIdentityAssertion interface of the WebRTC API represents the identity of the a remote peer of the current connection. If no peer has yet been set and verified this interface returns null. Once set it can't be changed.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIdentityAssertion">RTCIdentityAssertion - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/">WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIdentityAssertion"
)
public class RTCIdentityAssertion {
  @Nonnull
  public String idp;

  @Nonnull
  public String name;

  public RTCIdentityAssertion(@Nonnull final String idp, @Nonnull final String name) {
  }
}
