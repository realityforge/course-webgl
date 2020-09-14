package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCRtpSender interface provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender">RTCRtpSender - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpSender"
)
public class RTCRtpSender {
  RTCRtpSender() {
  }

  /**
   * The read-only dtmf property on the RTCRtpSender interface returns a RTCDTMFSender object which can be used to send DTMF tones over the RTCPeerConnection. See Using DTMF for details on how to make use of the returned RTCDTMFSender object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender/dtmf">RTCRtpSender.dtmf - MDN</a>
   */
  @JsProperty(
      name = "dtmf"
  )
  @Nullable
  public native RTCDTMFSender dtmf();

  /**
   * The track read-only property of the RTCRtpSender interface returns the MediaStreamTrack which is being handled by the RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender/track">RTCRtpSender.track - MDN</a>
   */
  @JsProperty(
      name = "track"
  )
  @Nullable
  public native MediaStreamTrack track();

  /**
   * The read-only transport property of an RTCRtpSender object provides the RTCDtlsTransport object used to interact with the underlying transport over which the sender is exchanging Real-time Transport Control Protocol (RTCP) packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender/transport">RTCRtpSender.transport - MDN</a>
   */
  @JsProperty(
      name = "transport"
  )
  @Nullable
  public native RTCDtlsTransport transport();

  /**
   * The static function RTCRtpSender.getCapabilities() returns an RTCRtpCapabilities object describing the codecs and capabilities supported by the RTCRtpSender.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender/getCapabilities">RTCRtpSender.getCapabilities - MDN</a>
   */
  @Nullable
  public static native RTCRtpCapabilities getCapabilities(@Nonnull String kind);

  @Nonnull
  public native RTCRtpSendParameters getParameters();

  @Nonnull
  public native Promise<RTCStatsReport> getStats();

  @Nonnull
  public native Promise<Void> replaceTrack(@Nullable MediaStreamTrack withTrack);

  @Nonnull
  public native Promise<Void> setParameters(@Nonnull RTCRtpSendParameters parameters);

  public native void setStreams(@Nonnull MediaStream... streams);
}
