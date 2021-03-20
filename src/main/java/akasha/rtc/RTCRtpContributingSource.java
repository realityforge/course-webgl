package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The RTCRtpContributingSource dictionary of the WebRTC API is used by getContributingSources() to provide information about a given contributing source (CSRC), including the most recent time a packet that the source contributed was played out.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource">RTCRtpContributingSource - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource">RTCRtpContributingSource - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface RTCRtpContributingSource {
  @JsOverlay
  @Nonnull
  static RTCRtpContributingSource create(final int rtpTimestamp, final int source,
      final double timestamp) {
    return Js.<RTCRtpContributingSource>uncheckedCast( JsPropertyMap.of() ).rtpTimestamp( rtpTimestamp ).source( source ).timestamp( timestamp );
  }

  /**
   * The read-only audioLevel property of the RTCRtpContributingSource interface indicates the audio level contained in the last RTP packet played from the described source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/audioLevel">RTCRtpContributingSource.audioLevel - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-audiolevel">audioLevel - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "audioLevel"
  )
  double audioLevel();

  /**
   * The read-only audioLevel property of the RTCRtpContributingSource interface indicates the audio level contained in the last RTP packet played from the described source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/audioLevel">RTCRtpContributingSource.audioLevel - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-audiolevel">audioLevel - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setAudioLevel(double audioLevel);

  /**
   * The read-only audioLevel property of the RTCRtpContributingSource interface indicates the audio level contained in the last RTP packet played from the described source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/audioLevel">RTCRtpContributingSource.audioLevel - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-audiolevel">audioLevel - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCRtpContributingSource audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  /**
   * The read-only rtpTimestamp property of the RTCRtpContributingSource interface returns a DOMHighResTimeStamp indicating the source-generated time at which the media contained int he packet was first sampled or obtained.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/rtpTimestamp">RTCRtpContributingSource.rtpTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource-rtptimestamp">rtpTimestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "rtpTimestamp"
  )
  int rtpTimestamp();

  /**
   * The read-only rtpTimestamp property of the RTCRtpContributingSource interface returns a DOMHighResTimeStamp indicating the source-generated time at which the media contained int he packet was first sampled or obtained.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/rtpTimestamp">RTCRtpContributingSource.rtpTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource-rtptimestamp">rtpTimestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setRtpTimestamp(int rtpTimestamp);

  /**
   * The read-only rtpTimestamp property of the RTCRtpContributingSource interface returns a DOMHighResTimeStamp indicating the source-generated time at which the media contained int he packet was first sampled or obtained.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/rtpTimestamp">RTCRtpContributingSource.rtpTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource-rtptimestamp">rtpTimestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCRtpContributingSource rtpTimestamp(final int rtpTimestamp) {
    setRtpTimestamp( rtpTimestamp );
    return this;
  }

  /**
   * The read-only source property of the RTCRtpContributingSource interface returns the source identifier of a particular stream of RTP packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/source">RTCRtpContributingSource.source - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-source">source - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "source"
  )
  int source();

  /**
   * The read-only source property of the RTCRtpContributingSource interface returns the source identifier of a particular stream of RTP packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/source">RTCRtpContributingSource.source - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-source">source - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setSource(int source);

  /**
   * The read-only source property of the RTCRtpContributingSource interface returns the source identifier of a particular stream of RTP packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/source">RTCRtpContributingSource.source - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-source">source - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCRtpContributingSource source(final int source) {
    setSource( source );
    return this;
  }

  /**
   * The read-only timestamp property of the RTCRtpContributingSource interface returns a DOMHighResTimeStamp indicating the most recent time of playout of an RTP packet from the source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/timestamp">RTCRtpContributingSource.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-timestamp">timestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "timestamp"
  )
  double timestamp();

  /**
   * The read-only timestamp property of the RTCRtpContributingSource interface returns a DOMHighResTimeStamp indicating the most recent time of playout of an RTP packet from the source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/timestamp">RTCRtpContributingSource.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-timestamp">timestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty
  void setTimestamp(double timestamp);

  /**
   * The read-only timestamp property of the RTCRtpContributingSource interface returns a DOMHighResTimeStamp indicating the most recent time of playout of an RTP packet from the source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/timestamp">RTCRtpContributingSource.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-timestamp">timestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  default RTCRtpContributingSource timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }
}
