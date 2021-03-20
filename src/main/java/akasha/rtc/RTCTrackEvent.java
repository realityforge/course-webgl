package akasha.rtc;

import akasha.Event;
import akasha.lang.JsArray;
import akasha.media.MediaStream;
import akasha.media.MediaStreamTrack;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebRTC API interface RTCTrackEvent represents the track event, which is sent when a new MediaStreamTrack is added to an RTCRtpReceiver which is part of the RTCPeerConnection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEvent">RTCTrackEvent - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackevent">RTCTrackEvent - WebRTC 1.0: Real-time Communication Between Browsers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCTrackEvent"
)
public class RTCTrackEvent extends Event {
  /**
   * The RTCTrackEvent() constructor creates and returns a new RTCTrackEvent object, configured to describe the track which has been added to the RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEvent/RTCTrackEvent">RTCTrackEvent.RTCTrackEvent - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#constructors-3">RTCTrackEvent() - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  public RTCTrackEvent(@Nonnull final String type, @Nonnull final RTCTrackEventInit eventInitDict) {
    super( null );
  }

  /**
   * The read-only receiver property of the RTCTrackEvent interface indicates the RTCRtpReceiver which is used to receive data containing media for the track to which the event refers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEvent/receiver">RTCTrackEvent.receiver - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-trackevent-receiver">RTCTrackEvent.receiver - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "receiver"
  )
  @Nonnull
  public native RTCRtpReceiver receiver();

  /**
   * The WebRTC API interface RTCTrackEvent's read-only streams property specifies an array of MediaStream objects, one for each of the streams that comprise the track being added to the RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEvent/streams">RTCTrackEvent.streams - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackevent-streams">RTCTrackEvent.streams - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "streams"
  )
  @Nonnull
  public native JsArray<MediaStream> streams();

  /**
   * The WebRTC API interface RTCTrackEvent's read-only track property specifies the MediaStreamTrack that has been added to the RTCPeerConnection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEvent/track">RTCTrackEvent.track - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackevent-track">RTCTrackEvent.track - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "track"
  )
  @Nonnull
  public native MediaStreamTrack track();

  /**
   * The WebRTC API interface RTCTrackEvent's read-only transceiver property indicates the RTCRtpTransceiver affiliated with the event's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEvent/transceiver">RTCTrackEvent.transceiver - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-trackevent-transceiver">RTCTrackEvent.transceiver - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "transceiver"
  )
  @Nonnull
  public native RTCRtpTransceiver transceiver();
}
