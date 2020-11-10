package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCSessionDescription interface describes one end of a connection&mdash;or potential connection&mdash;and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCSessionDescription">RTCSessionDescription - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcsessiondescription-class">The definition of 'RTCSessionDescription' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCSessionDescription"
)
public class RTCSessionDescription {
  /**
   * The RTCSessionDescription() constructor creates a new RTCSessionDescription with its properties initialized as described in the specified object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCSessionDescription/RTCSessionDescription">RTCSessionDescription.RTCSessionDescription - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#widl-ctor-RTCSessionDescription--RTCSessionDescriptionInit-descriptionInitDict">The definition of 'RTCSessionDescription()' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  public RTCSessionDescription(@Nonnull final RTCSessionDescriptionInit descriptionInitDict) {
  }

  /**
   * The property RTCSessionDescription.sdp is a read-only DOMString containing the SDP which describes the session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCSessionDescription/sdp">RTCSessionDescription.sdp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcsessiondescription-sdp">The definition of 'RTCSessionDescription.sdp' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "sdp"
  )
  @Nonnull
  public native String sdp();

  /**
   * The property RTCSessionDescription.type is a read-only value of type RTCSdpType which describes the description's type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCSessionDescription/type">RTCSessionDescription.type - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcsessiondescription-type">The definition of 'RTCSessionDescription.type' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  @RTCSdpType
  public native String type();

  /**
   * The RTCSessionDescription.toJSON() method generates a JSON description of the object. Both properties, type and sdp, are contained in the generated JSON.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCSessionDescription/toJSON">RTCSessionDescription.toJSON - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcsessiondescription-tojson">The definition of 'RTCSessionDescription: toJSON()' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @Nonnull
  public native Object toJSON();
}
