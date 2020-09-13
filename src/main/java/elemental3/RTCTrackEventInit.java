package elemental3;

import elemental2.core.JsArray;
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

  @JsProperty(
      name = "receiver"
  )
  @Nonnull
  RTCRtpReceiver receiver();

  @JsProperty
  void setReceiver(@Nonnull RTCRtpReceiver receiver);

  @JsOverlay
  @Nonnull
  default RTCTrackEventInit receiver(@Nonnull final RTCRtpReceiver receiver) {
    setReceiver( receiver );
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
  default RTCTrackEventInit streams(@Nonnull final JsArray<MediaStream> streams) {
    setStreams( streams );
    return this;
  }

  @JsOverlay
  default void setStreams(@Nonnull final MediaStream... streams) {
    setStreams( Js.<JsArray<MediaStream>>uncheckedCast( streams ) );
  }

  @JsOverlay
  @Nonnull
  default RTCTrackEventInit streams(@Nonnull final MediaStream... streams) {
    setStreams( streams );
    return this;
  }

  @JsProperty(
      name = "track"
  )
  @Nonnull
  MediaStreamTrack track();

  @JsProperty
  void setTrack(@Nonnull MediaStreamTrack track);

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
