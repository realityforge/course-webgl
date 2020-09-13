package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The WebRTC interface RTCRtpTransceiver describes a permanent pairing of an RTCRtpSender and an RTCRtpReceiver, along with some shared state.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiver">RTCRtpTransceiver - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpTransceiver"
)
public class RTCRtpTransceiver {
  /**
   * The RTCRtpTransceiver property direction is a string which indicates the transceiver's preferred directionality.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiver/direction">RTCRtpTransceiver.direction - MDN</a>
   */
  @Nonnull
  @MagicConstant(
      valuesFromClass = RTCRtpTransceiverDirection.class
  )
  public String direction;

  RTCRtpTransceiver() {
  }

  /**
   * The read-only RTCRtpTransceiver property currentDirection is a string which indicates the current directionality of the transceiver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiver/currentDirection">RTCRtpTransceiver.currentDirection - MDN</a>
   */
  @JsProperty(
      name = "currentDirection"
  )
  @Nullable
  public native String currentDirection();

  /**
   * The read-only RTCRtpTransceiver interface's mid property specifies the negotiated media ID (mid) which the local and remote peers have agreed upon to uniquely identify the stream's pairing of sender and receiver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiver/mid">RTCRtpTransceiver.mid - MDN</a>
   */
  @JsProperty(
      name = "mid"
  )
  @Nullable
  public native String mid();

  /**
   * The read-only  receiver property of WebRTC's RTCRtpTransceiver interface indicates the RTCRtpReceiver responsible for receiving and decoding incoming media data for the transceiver's stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiver/receiver">RTCRtpTransceiver.receiver - MDN</a>
   */
  @JsProperty(
      name = "receiver"
  )
  @Nonnull
  public native RTCRtpReceiver receiver();

  /**
   * The read-only  sender property of WebRTC's RTCRtpTransceiver interface indicates the RTCRtpSender responsible for encoding and sending outgoing media data for the transceiver's stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiver/sender">RTCRtpTransceiver.sender - MDN</a>
   */
  @JsProperty(
      name = "sender"
  )
  @Nonnull
  public native RTCRtpSender sender();

  /**
   * The RTCRtpTransceiver method setCodecPreferences() configures the transceiver's codecs given a list of RTCRtpCodecCapability objects specifying the new preferences for each codec.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiver/setCodecPreferences">RTCRtpTransceiver.setCodecPreferences - MDN</a>
   */
  public native void setCodecPreferences(@Nonnull JsArray<RTCRtpCodecCapability> codecs);

  /**
   * The RTCRtpTransceiver method setCodecPreferences() configures the transceiver's codecs given a list of RTCRtpCodecCapability objects specifying the new preferences for each codec.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiver/setCodecPreferences">RTCRtpTransceiver.setCodecPreferences - MDN</a>
   */
  public native void setCodecPreferences(@Nonnull RTCRtpCodecCapability[] codecs);

  /**
   * The stop() method in the RTCRtpTransceiver interface permanently stops the transceiver by stopping both the associated RTCRtpSender and RTCRtpReceiver.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpTransceiver/stop">RTCRtpTransceiver.stop - MDN</a>
   */
  public native void stop();
}
