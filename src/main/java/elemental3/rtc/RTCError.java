package elemental3.rtc;

import elemental3.DOMException;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCError interface describes an error which has occurred while handling WebRTC operations. It's based upon the standard DOMException interface that describes general DOM errors.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCError">RTCError - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcerror">The definition of 'RTCError' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCError"
)
public class RTCError extends DOMException {
  public RTCError(@Nonnull final RTCErrorInit init, @Nonnull final String message) {
  }

  public RTCError(@Nonnull final RTCErrorInit init) {
  }

  @JsProperty(
      name = "errorDetail"
  )
  @Nonnull
  @RTCErrorDetailType
  public native String errorDetail();

  @JsProperty(
      name = "httpRequestStatusCode"
  )
  @Nullable
  public native Double httpRequestStatusCode();

  @JsProperty(
      name = "receivedAlert"
  )
  @Nullable
  public native Double receivedAlert();

  @JsProperty(
      name = "sctpCauseCode"
  )
  @Nullable
  public native Double sctpCauseCode();

  @JsProperty(
      name = "sdpLineNumber"
  )
  @Nullable
  public native Double sdpLineNumber();

  @JsProperty(
      name = "sentAlert"
  )
  @Nullable
  public native Double sentAlert();
}
