package elemental3.rtc;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import elemental3.media.MediaStreamTrack;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The RTCRtpReceiver interface of the WebRTC API manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpReceiver">RTCRtpReceiver - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpReceiver"
)
public class RTCRtpReceiver {
  protected RTCRtpReceiver() {
  }

  /**
   * The track read-only property of the RTCRtpReceiver interface returns the MediaStreamTrack associated with the current RTCRtpReceiver instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpReceiver/track">RTCRtpReceiver.track - MDN</a>
   */
  @JsProperty(
      name = "track"
  )
  @Nonnull
  public native MediaStreamTrack track();

  /**
   * The read-only transport property of an RTCRtpReceiver object provides the RTCDtlsTransport object used to interact with the underlying transport over which the receiver is exchanging Real-time Transport Control Protocol (RTCP) packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpReceiver/transport">RTCRtpReceiver.transport - MDN</a>
   */
  @JsProperty(
      name = "transport"
  )
  @Nullable
  public native RTCDtlsTransport transport();

  /**
   * The static function RTCRtpReceiver.getCapabilities() returns an RTCRtpCapabilities object describing the codecs and capabilities supported by RTCRtpReceivers on the current device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpReceiver/getCapabilities">RTCRtpReceiver.getCapabilities - MDN</a>
   */
  @Nullable
  public static native RTCRtpCapabilities getCapabilities(@Nonnull String kind);

  /**
   * The getContributingSources() method of the RTCRtpReceiver interface returns an array of RTCRtpContributingSource instances, each corresponding to one CSRC (contributing source) identifier received by the current RTCRtpReceiver in the last ten seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpReceiver/getContributingSources">RTCRtpReceiver.getContributingSources - MDN</a>
   */
  @Nonnull
  public native JsArray<RTCRtpContributingSource> getContributingSources();

  /**
   * The getParameters() method of the RTCRtpReceiver interface returns an RTCRtpReceiveParameters object describing the current configuration for the encoding and transmission of media on the receiver's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpReceiver/getParameters">RTCRtpReceiver.getParameters - MDN</a>
   */
  @Nonnull
  public native RTCRtpReceiveParameters getParameters();

  /**
   * The RTCRtpReceiver method getStats() asynchronously requests an RTCStatsReport object which provides statistics about incoming traffic on the owning RTCPeerConnection, returning a Promise whose fulfillment handler will be called once the results are available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpReceiver/getStats">RTCRtpReceiver.getStats - MDN</a>
   */
  @Nonnull
  public native Promise<RTCStatsReport> getStats();

  /**
   * The getSynchronizationSources() method of the RTCRtpReceiver interface returns an array of RTCRtpContributingSource instances, each corresponding to one SSRC (synchronization source) identifier received by the current RTCRtpReceiver in the last ten seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpReceiver/getSynchronizationSources">RTCRtpReceiver.getSynchronizationSources - MDN</a>
   */
  @Nonnull
  public native JsArray<RTCRtpSynchronizationSource> getSynchronizationSources();
}
