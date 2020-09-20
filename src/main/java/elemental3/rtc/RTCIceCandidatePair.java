package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCIceCandidatePair dictionary describes a pair of ICE candidates which together comprise a description of a viable connection between two WebRTC endpoints.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair">RTCIceCandidatePair - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCIceCandidatePair {
  @JsOverlay
  @Nonnull
  static RTCIceCandidatePair create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The local property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate which describes the configuration of the local end of a viable WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/local">RTCIceCandidatePair.local - MDN</a>
   */
  @JsProperty(
      name = "local"
  )
  RTCIceCandidate local();

  /**
   * The local property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate which describes the configuration of the local end of a viable WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/local">RTCIceCandidatePair.local - MDN</a>
   */
  @JsProperty
  void setLocal(@Nonnull RTCIceCandidate local);

  /**
   * The local property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate which describes the configuration of the local end of a viable WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/local">RTCIceCandidatePair.local - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePair local(@Nonnull final RTCIceCandidate local) {
    setLocal( local );
    return this;
  }

  /**
   * The remote property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate describing the configuration of the remote end of a viable WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/remote">RTCIceCandidatePair.remote - MDN</a>
   */
  @JsProperty(
      name = "remote"
  )
  RTCIceCandidate remote();

  /**
   * The remote property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate describing the configuration of the remote end of a viable WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/remote">RTCIceCandidatePair.remote - MDN</a>
   */
  @JsProperty
  void setRemote(@Nonnull RTCIceCandidate remote);

  /**
   * The remote property of the RTCIceCandidatePair dictionary specifies the RTCIceCandidate describing the configuration of the remote end of a viable WebRTC connection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceCandidatePair/remote">RTCIceCandidatePair.remote - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCIceCandidatePair remote(@Nonnull final RTCIceCandidate remote) {
    setRemote( remote );
    return this;
  }
}
