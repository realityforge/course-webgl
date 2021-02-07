package elemental3.rtc;

import elemental3.media.MediaStream;
import elemental3.media.MediaStreamTrack;
import elemental3.promise.Promise;
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
 * @see <a href="https://w3c.github.io/webrtc-pc/#rtcrtpsender-interface">RTCRtpSender - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpSender"
)
public class RTCRtpSender {
  protected RTCRtpSender() {
  }

  /**
   * The read-only dtmf property on the RTCRtpSender interface returns a RTCDTMFSender object which can be used to send DTMF tones over the RTCPeerConnection. See Using DTMF for details on how to make use of the returned RTCDTMFSender object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender/dtmf">RTCRtpSender.dtmf - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsender-dtmf">RTCRtpSender.dtmf - WebRTC 1.0: Real-time Communication Between Browsers</a>
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
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsender-track">track - WebRTC 1.0: Real-time Communication Between Browsers</a>
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
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsender-transport">RTCRtpSender.transport - WebRTC 1.0: Real-time Communication Between Browsers</a>
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
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsender-getcapabilities">RTCRtpSender.getCapabilities() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nullable
  public static native RTCRtpCapabilities getCapabilities(@Nonnull String kind);

  /**
   * The getParameters() method of the RTCRtpSender interface returns an RTCRtpSendParameters object describing the current configuration for the encoding and transmission of media on the sender's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender/getParameters">RTCRtpSender.getParameters - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsender-getparameters">getParameters() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native RTCRtpSendParameters getParameters();

  /**
   * The RTCRtpSender method getStats() asynchronously requests an RTCStatsReport object which provides statistics about outgoing traffic on the RTCPeerConnection which owns the sender, returning a Promise which is fulfilled when the results are available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender/getStats">RTCRtpSender.getStats - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#widl-RTCRtpSender-getStats-Promise-RTCStatsReport">RTCRtpSender.getStats() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<RTCStatsReport> getStats();

  /**
   * The RTCRtpSender method replaceTrack() replaces the track currently being used as the sender's source with a new MediaStreamTrack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender/replaceTrack">RTCRtpSender.replaceTrack - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsender-replacetrack">RTCRtpSender.replaceTrack() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> replaceTrack(@Nullable MediaStreamTrack withTrack);

  /**
   * The setParameters() method of the RTCRtpSender interface applies changes the configuration of sender's track, which is the MediaStreamTrack for which the RTCRtpSender is responsible.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender/setParameters">RTCRtpSender.setParameters - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsender-setparameters">RTCRtpSender.setParameters() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @Nonnull
  public native Promise<Void> setParameters(@Nonnull RTCRtpSendParameters parameters);

  /**
   * The RTCRtpSender method setStreams() associates the sender's track with the specified MediaStream or array of MediaStream objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSender/setStreams">RTCRtpSender.setStreams - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsender-setstreams">RTCRtpSender.setStreams() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public native void setStreams(@Nonnull MediaStream... streams);
}
