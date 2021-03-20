package akasha.rtc;

import akasha.lang.JsArray;
import akasha.media.MediaStream;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCRtpTransceiverInit dictionary is used when calling the WebRTC function RTCPeerConnection.addTransceiver() to provide configuration options for the new transceiver.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiverInit">RTCRtpTransceiverInit - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtptransceiverinit">RTCRtpTransceiverInit - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface RTCRtpTransceiverInit {
  @JsOverlay
  @Nonnull
  static RTCRtpTransceiverInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "direction"
  )
  @RTCRtpTransceiverDirection
  String direction();

  @JsProperty
  void setDirection(@RTCRtpTransceiverDirection @Nonnull String direction);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverInit direction(
      @RTCRtpTransceiverDirection @Nonnull final String direction) {
    setDirection( direction );
    return this;
  }

  @JsProperty(
      name = "sendEncodings"
  )
  JsArray<RTCRtpEncodingParameters> sendEncodings();

  @JsProperty
  void setSendEncodings(@Nonnull JsArray<RTCRtpEncodingParameters> sendEncodings);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverInit sendEncodings(
      @Nonnull final JsArray<RTCRtpEncodingParameters> sendEncodings) {
    setSendEncodings( sendEncodings );
    return this;
  }

  @JsOverlay
  default void setSendEncodings(@Nonnull final RTCRtpEncodingParameters... sendEncodings) {
    setSendEncodings( Js.<JsArray<RTCRtpEncodingParameters>>uncheckedCast( sendEncodings ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverInit sendEncodings(
      @Nonnull final RTCRtpEncodingParameters... sendEncodings) {
    setSendEncodings( sendEncodings );
    return this;
  }

  @JsProperty(
      name = "streams"
  )
  JsArray<MediaStream> streams();

  @JsProperty
  void setStreams(@Nonnull JsArray<MediaStream> streams);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverInit streams(@Nonnull final JsArray<MediaStream> streams) {
    setStreams( streams );
    return this;
  }

  @JsOverlay
  default void setStreams(@Nonnull final MediaStream... streams) {
    setStreams( Js.<JsArray<MediaStream>>uncheckedCast( streams ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverInit streams(@Nonnull final MediaStream... streams) {
    setStreams( streams );
    return this;
  }
}
