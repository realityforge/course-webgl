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
public interface RTCVideoReceiverStats extends RTCVideoHandlerStats {
  @JsOverlay
  @Nonnull
  static RTCVideoReceiverStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCVideoReceiverStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty(
      name = "estimatedPlayoutTimestamp"
  )
  double estimatedPlayoutTimestamp();

  @JsProperty
  void setEstimatedPlayoutTimestamp(double estimatedPlayoutTimestamp);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats estimatedPlayoutTimestamp(final double estimatedPlayoutTimestamp) {
    setEstimatedPlayoutTimestamp( estimatedPlayoutTimestamp );
    return this;
  }

  @JsProperty(
      name = "framesDecoded"
  )
  int framesDecoded();

  @JsProperty
  void setFramesDecoded(int framesDecoded);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats framesDecoded(final int framesDecoded) {
    setFramesDecoded( framesDecoded );
    return this;
  }

  @JsProperty(
      name = "framesDropped"
  )
  int framesDropped();

  @JsProperty
  void setFramesDropped(int framesDropped);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats framesDropped(final int framesDropped) {
    setFramesDropped( framesDropped );
    return this;
  }

  @JsProperty(
      name = "framesReceived"
  )
  int framesReceived();

  @JsProperty
  void setFramesReceived(int framesReceived);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats framesReceived(final int framesReceived) {
    setFramesReceived( framesReceived );
    return this;
  }

  @JsProperty(
      name = "fullFramesLost"
  )
  int fullFramesLost();

  @JsProperty
  void setFullFramesLost(int fullFramesLost);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats fullFramesLost(final int fullFramesLost) {
    setFullFramesLost( fullFramesLost );
    return this;
  }

  @JsProperty(
      name = "jitterBufferDelay"
  )
  double jitterBufferDelay();

  @JsProperty
  void setJitterBufferDelay(double jitterBufferDelay);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats jitterBufferDelay(final double jitterBufferDelay) {
    setJitterBufferDelay( jitterBufferDelay );
    return this;
  }

  @JsProperty(
      name = "jitterBufferEmittedCount"
  )
  int jitterBufferEmittedCount();

  @JsProperty
  void setJitterBufferEmittedCount(int jitterBufferEmittedCount);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats jitterBufferEmittedCount(final int jitterBufferEmittedCount) {
    setJitterBufferEmittedCount( jitterBufferEmittedCount );
    return this;
  }

  @JsProperty(
      name = "keyFramesReceived"
  )
  int keyFramesReceived();

  @JsProperty
  void setKeyFramesReceived(int keyFramesReceived);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats keyFramesReceived(final int keyFramesReceived) {
    setKeyFramesReceived( keyFramesReceived );
    return this;
  }

  @JsProperty(
      name = "partialFramesLost"
  )
  int partialFramesLost();

  @JsProperty
  void setPartialFramesLost(int partialFramesLost);

  @JsOverlay
  @Nonnull
  default RTCVideoReceiverStats partialFramesLost(final int partialFramesLost) {
    setPartialFramesLost( partialFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats frameHeight(final int frameHeight) {
    setFrameHeight( frameHeight );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats frameWidth(final int frameWidth) {
    setFrameWidth( frameWidth );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats priority(@RTCPriorityType @Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCVideoReceiverStats remoteSource(final boolean remoteSource) {
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
  default RTCVideoReceiverStats id(@Nonnull final String id) {
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
  default RTCVideoReceiverStats timestamp(final double timestamp) {
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
  default RTCVideoReceiverStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
