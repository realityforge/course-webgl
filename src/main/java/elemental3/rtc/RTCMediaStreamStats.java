package elemental3.rtc;

import elemental3.core.JsArray;
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
public interface RTCMediaStreamStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCMediaStreamStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type) {
    return Js.<RTCMediaStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type );
  }

  @JsProperty(
      name = "streamIdentifier"
  )
  String streamIdentifier();

  @JsProperty
  void setStreamIdentifier(@Nonnull String streamIdentifier);

  @JsOverlay
  @Nonnull
  default RTCMediaStreamStats streamIdentifier(@Nonnull final String streamIdentifier) {
    setStreamIdentifier( streamIdentifier );
    return this;
  }

  @JsProperty(
      name = "trackIds"
  )
  JsArray<String> trackIds();

  @JsProperty
  void setTrackIds(@Nonnull JsArray<String> trackIds);

  @JsOverlay
  @Nonnull
  default RTCMediaStreamStats trackIds(@Nonnull final JsArray<String> trackIds) {
    setTrackIds( trackIds );
    return this;
  }

  @JsOverlay
  default void setTrackIds(@Nonnull final String... trackIds) {
    setTrackIds( Js.<JsArray<String>>uncheckedCast( trackIds ) );
  }

  @JsOverlay
  @Nonnull
  default RTCMediaStreamStats trackIds(@Nonnull final String... trackIds) {
    setTrackIds( trackIds );
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
  default RTCMediaStreamStats id(@Nonnull final String id) {
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
  default RTCMediaStreamStats timestamp(final double timestamp) {
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
  default RTCMediaStreamStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
