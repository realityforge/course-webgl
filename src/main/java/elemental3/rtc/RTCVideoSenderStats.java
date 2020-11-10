package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCVideoSenderStats extends RTCVideoHandlerStats {
  @JsOverlay
  @Nonnull
  static RTCVideoSenderStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCVideoSenderStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty(
      name = "mediaSourceId"
  )
  String mediaSourceId();

  @JsProperty
  void setMediaSourceId(@Nonnull String mediaSourceId);

  @JsOverlay
  @Nonnull
  default RTCVideoSenderStats mediaSourceId(@Nonnull final String mediaSourceId) {
    setMediaSourceId( mediaSourceId );
    return this;
  }

  @JsProperty(
      name = "framesCaptured"
  )
  int framesCaptured();

  @JsProperty
  void setFramesCaptured(int framesCaptured);

  @JsOverlay
  @Nonnull
  default RTCVideoSenderStats framesCaptured(final int framesCaptured) {
    setFramesCaptured( framesCaptured );
    return this;
  }

  @JsProperty(
      name = "framesSent"
  )
  int framesSent();

  @JsProperty
  void setFramesSent(int framesSent);

  @JsOverlay
  @Nonnull
  default RTCVideoSenderStats framesSent(final int framesSent) {
    setFramesSent( framesSent );
    return this;
  }

  @JsProperty(
      name = "hugeFramesSent"
  )
  int hugeFramesSent();

  @JsProperty
  void setHugeFramesSent(int hugeFramesSent);

  @JsOverlay
  @Nonnull
  default RTCVideoSenderStats hugeFramesSent(final int hugeFramesSent) {
    setHugeFramesSent( hugeFramesSent );
    return this;
  }

  @JsProperty(
      name = "keyFramesSent"
  )
  int keyFramesSent();

  @JsProperty
  void setKeyFramesSent(int keyFramesSent);

  @JsOverlay
  @Nonnull
  default RTCVideoSenderStats keyFramesSent(final int keyFramesSent) {
    setKeyFramesSent( keyFramesSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats frameHeight(final int frameHeight) {
    setFrameHeight( frameHeight );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats frameWidth(final int frameWidth) {
    setFrameWidth( frameWidth );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats priority(@RTCPriorityType @Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  /**
   * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-id">The definition of 'RTCStats.id' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  /**
   * The timestamp property of the RTCStats dictionary is a DOMHighResTimeStamp object specifying the time at which the data in the object was sampled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/timestamp">RTCStats.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-timestamp">The definition of 'RTCStats.timestamp' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  /**
   * The RTCStats dictionary's property type is a string which specifies the type of statistic represented by the object, where the permitted values are drawn from the enum type RTCStatsType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/type">RTCStats.type - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-type">The definition of 'RTCStats.type' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoSenderStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
