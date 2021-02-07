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
public interface RTCAudioReceiverStats extends RTCAudioHandlerStats {
  @JsOverlay
  @Nonnull
  static RTCAudioReceiverStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCAudioReceiverStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty(
      name = "concealedSamples"
  )
  int concealedSamples();

  @JsProperty
  void setConcealedSamples(int concealedSamples);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats concealedSamples(final int concealedSamples) {
    setConcealedSamples( concealedSamples );
    return this;
  }

  @JsProperty(
      name = "concealmentEvents"
  )
  int concealmentEvents();

  @JsProperty
  void setConcealmentEvents(int concealmentEvents);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats concealmentEvents(final int concealmentEvents) {
    setConcealmentEvents( concealmentEvents );
    return this;
  }

  @JsProperty(
      name = "estimatedPlayoutTimestamp"
  )
  double estimatedPlayoutTimestamp();

  @JsProperty
  void setEstimatedPlayoutTimestamp(double estimatedPlayoutTimestamp);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats estimatedPlayoutTimestamp(final double estimatedPlayoutTimestamp) {
    setEstimatedPlayoutTimestamp( estimatedPlayoutTimestamp );
    return this;
  }

  @JsProperty(
      name = "insertedSamplesForDeceleration"
  )
  int insertedSamplesForDeceleration();

  @JsProperty
  void setInsertedSamplesForDeceleration(int insertedSamplesForDeceleration);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats insertedSamplesForDeceleration(
      final int insertedSamplesForDeceleration) {
    setInsertedSamplesForDeceleration( insertedSamplesForDeceleration );
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
  default RTCAudioReceiverStats jitterBufferDelay(final double jitterBufferDelay) {
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
  default RTCAudioReceiverStats jitterBufferEmittedCount(final int jitterBufferEmittedCount) {
    setJitterBufferEmittedCount( jitterBufferEmittedCount );
    return this;
  }

  @JsProperty(
      name = "removedSamplesForAcceleration"
  )
  int removedSamplesForAcceleration();

  @JsProperty
  void setRemovedSamplesForAcceleration(int removedSamplesForAcceleration);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats removedSamplesForAcceleration(
      final int removedSamplesForAcceleration) {
    setRemovedSamplesForAcceleration( removedSamplesForAcceleration );
    return this;
  }

  @JsProperty(
      name = "silentConcealedSamples"
  )
  int silentConcealedSamples();

  @JsProperty
  void setSilentConcealedSamples(int silentConcealedSamples);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats silentConcealedSamples(final int silentConcealedSamples) {
    setSilentConcealedSamples( silentConcealedSamples );
    return this;
  }

  @JsProperty(
      name = "totalSamplesReceived"
  )
  int totalSamplesReceived();

  @JsProperty
  void setTotalSamplesReceived(int totalSamplesReceived);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats totalSamplesReceived(final int totalSamplesReceived) {
    setTotalSamplesReceived( totalSamplesReceived );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats totalAudioEnergy(final double totalAudioEnergy) {
    setTotalAudioEnergy( totalAudioEnergy );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats totalSamplesDuration(final double totalSamplesDuration) {
    setTotalSamplesDuration( totalSamplesDuration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats voiceActivityFlag(final boolean voiceActivityFlag) {
    setVoiceActivityFlag( voiceActivityFlag );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats priority(@RTCPriorityType @Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  /**
   * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-id">RTCStats.id - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  /**
   * The timestamp property of the RTCStats dictionary is a DOMHighResTimeStamp object specifying the time at which the data in the object was sampled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/timestamp">RTCStats.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-timestamp">RTCStats.timestamp - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  /**
   * The RTCStats dictionary's property type is a string which specifies the type of statistic represented by the object, where the permitted values are drawn from the enum type RTCStatsType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/type">RTCStats.type - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-type">RTCStats.type - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
