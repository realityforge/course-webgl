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
 * The RTCRtpSynchronizationSource dictionary of the the WebRTC API is used by getSynchronizationSources() to describe a particular synchronization source (SSRC).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSynchronizationSource">RTCRtpSynchronizationSource - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource">The definition of 'RTCRtpSynchronizationSource' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRtpSynchronizationSource extends RTCRtpContributingSource {
  @JsOverlay
  @Nonnull
  static RTCRtpSynchronizationSource create(final int rtpTimestamp, final int source,
      final double timestamp) {
    return Js.<RTCRtpSynchronizationSource>uncheckedCast( JsPropertyMap.of() ).rtpTimestamp( rtpTimestamp ).source( source ).timestamp( timestamp );
  }

  /**
   * The read-only voiceActivityFlag property of the RTCRtpSynchronizationSource interface indicates whether or not the most recent RTP packet on the source includes voice activity.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSynchronizationSource/voiceActivityFlag">RTCRtpSynchronizationSource.voiceActivityFlag - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource-voiceactivityflag">The definition of 'voiceActivityFlag' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "voiceActivityFlag"
  )
  boolean voiceActivityFlag();

  /**
   * The read-only voiceActivityFlag property of the RTCRtpSynchronizationSource interface indicates whether or not the most recent RTP packet on the source includes voice activity.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSynchronizationSource/voiceActivityFlag">RTCRtpSynchronizationSource.voiceActivityFlag - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource-voiceactivityflag">The definition of 'voiceActivityFlag' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty
  void setVoiceActivityFlag(boolean voiceActivityFlag);

  /**
   * The read-only voiceActivityFlag property of the RTCRtpSynchronizationSource interface indicates whether or not the most recent RTP packet on the source includes voice activity.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpSynchronizationSource/voiceActivityFlag">RTCRtpSynchronizationSource.voiceActivityFlag - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource-voiceactivityflag">The definition of 'voiceActivityFlag' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCRtpSynchronizationSource voiceActivityFlag(final boolean voiceActivityFlag) {
    setVoiceActivityFlag( voiceActivityFlag );
    return this;
  }

  /**
   * The read-only audioLevel property of the RTCRtpContributingSource interface indicates the audio level contained in the last RTP packet played from the described source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/audioLevel">RTCRtpContributingSource.audioLevel - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-audiolevel">The definition of 'audioLevel' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSynchronizationSource audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  /**
   * The read-only rtpTimestamp property of the RTCRtpContributingSource interface returns a DOMHighResTimeStamp indicating the source-generated time at which the media contained int he packet was first sampled or obtained.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/rtpTimestamp">RTCRtpContributingSource.rtpTimestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpsynchronizationsource-rtptimestamp">The definition of 'rtpTimestamp' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSynchronizationSource rtpTimestamp(final int rtpTimestamp) {
    setRtpTimestamp( rtpTimestamp );
    return this;
  }

  /**
   * The read-only source property of the RTCRtpContributingSource interface returns the source identifier of a particular stream of RTP packets.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/source">RTCRtpContributingSource.source - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-source">The definition of 'source' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSynchronizationSource source(final int source) {
    setSource( source );
    return this;
  }

  /**
   * The read-only timestamp property of the RTCRtpContributingSource interface returns a DOMHighResTimeStamp indicating the most recent time of playout of an RTP packet from the source.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpContributingSource/timestamp">RTCRtpContributingSource.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcrtpcontributingsource-timestamp">The definition of 'timestamp' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpSynchronizationSource timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }
}
