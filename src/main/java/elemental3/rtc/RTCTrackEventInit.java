package elemental3.rtc;

import elemental3.EventInit;
import elemental3.core.JsArray;
import elemental3.media.MediaStream;
import elemental3.media.MediaStreamTrack;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The WebRTC API's RTCTrackEventInit dictionary is used to provide information describing an RTCTrackEvent when instantiating a new track event using new RTCTrackEvent().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit">RTCTrackEventInit - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit">The definition of 'RTCTrackEventInit' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCTrackEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static RTCTrackEventInit create(@Nonnull final RTCRtpReceiver receiver,
      @Nonnull final MediaStreamTrack track, @Nonnull final RTCRtpTransceiver transceiver) {
    return Js.<RTCTrackEventInit>uncheckedCast( JsPropertyMap.of() ).receiver( receiver ).track( track ).transceiver( transceiver );
  }

  /**
   * The RTCTrackEventInit dictionary's receiver property specifies the RTCRtpReceiver associated with the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/receiver">RTCTrackEventInit.receiver - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-receiver">The definition of 'RTCTrackEventInit.receiver' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "receiver"
  )
  @Nonnull
  RTCRtpReceiver receiver();

  /**
   * The RTCTrackEventInit dictionary's receiver property specifies the RTCRtpReceiver associated with the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/receiver">RTCTrackEventInit.receiver - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-receiver">The definition of 'RTCTrackEventInit.receiver' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty
  void setReceiver(@Nonnull RTCRtpReceiver receiver);

  /**
   * The RTCTrackEventInit dictionary's receiver property specifies the RTCRtpReceiver associated with the event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/receiver">RTCTrackEventInit.receiver - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-receiver">The definition of 'RTCTrackEventInit.receiver' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCTrackEventInit receiver(@Nonnull final RTCRtpReceiver receiver) {
    setReceiver( receiver );
    return this;
  }

  /**
   * The RTCTrackEventInit dictionary's optional streams property provides an array containing a MediaStream object for each of the streams associated with the event's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/streams">RTCTrackEventInit.streams - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-streams">The definition of 'RTCTrackEventInit.streams' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "streams"
  )
  JsArray<MediaStream> streams();

  /**
   * The RTCTrackEventInit dictionary's optional streams property provides an array containing a MediaStream object for each of the streams associated with the event's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/streams">RTCTrackEventInit.streams - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-streams">The definition of 'RTCTrackEventInit.streams' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty
  void setStreams(@Nonnull JsArray<MediaStream> streams);

  /**
   * The RTCTrackEventInit dictionary's optional streams property provides an array containing a MediaStream object for each of the streams associated with the event's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/streams">RTCTrackEventInit.streams - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-streams">The definition of 'RTCTrackEventInit.streams' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCTrackEventInit streams(@Nonnull final JsArray<MediaStream> streams) {
    setStreams( streams );
    return this;
  }

  /**
   * The RTCTrackEventInit dictionary's optional streams property provides an array containing a MediaStream object for each of the streams associated with the event's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/streams">RTCTrackEventInit.streams - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-streams">The definition of 'RTCTrackEventInit.streams' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  default void setStreams(@Nonnull final MediaStream... streams) {
    setStreams( Js.<JsArray<MediaStream>>uncheckedCast( streams ) );
  }

  /**
   * The RTCTrackEventInit dictionary's optional streams property provides an array containing a MediaStream object for each of the streams associated with the event's track.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/streams">RTCTrackEventInit.streams - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-streams">The definition of 'RTCTrackEventInit.streams' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCTrackEventInit streams(@Nonnull final MediaStream... streams) {
    setStreams( streams );
    return this;
  }

  /**
   * The RTCTrackEventInit dictionary's track property specifies the MediaStreamTrack associated with the track event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/track">RTCTrackEventInit.track - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-track">The definition of 'RTCTrackEventInit.track' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty(
      name = "track"
  )
  @Nonnull
  MediaStreamTrack track();

  /**
   * The RTCTrackEventInit dictionary's track property specifies the MediaStreamTrack associated with the track event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/track">RTCTrackEventInit.track - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-track">The definition of 'RTCTrackEventInit.track' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsProperty
  void setTrack(@Nonnull MediaStreamTrack track);

  /**
   * The RTCTrackEventInit dictionary's track property specifies the MediaStreamTrack associated with the track event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCTrackEventInit/track">RTCTrackEventInit.track - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtctrackeventinit-track">The definition of 'RTCTrackEventInit.track' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  default RTCTrackEventInit track(@Nonnull final MediaStreamTrack track) {
    setTrack( track );
    return this;
  }

  @JsProperty(
      name = "transceiver"
  )
  @Nonnull
  RTCRtpTransceiver transceiver();

  @JsProperty
  void setTransceiver(@Nonnull RTCRtpTransceiver transceiver);

  @JsOverlay
  @Nonnull
  default RTCTrackEventInit transceiver(@Nonnull final RTCRtpTransceiver transceiver) {
    setTransceiver( transceiver );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCTrackEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCTrackEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCTrackEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
