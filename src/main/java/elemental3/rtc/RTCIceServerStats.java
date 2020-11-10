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
public interface RTCIceServerStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCIceServerStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String url) {
    return Js.<RTCIceServerStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).url( url );
  }

  @JsProperty(
      name = "port"
  )
  int port();

  @JsProperty
  void setPort(int port);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats port(final int port) {
    setPort( port );
    return this;
  }

  @JsProperty(
      name = "relayProtocol"
  )
  String relayProtocol();

  @JsProperty
  void setRelayProtocol(@Nonnull String relayProtocol);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats relayProtocol(@Nonnull final String relayProtocol) {
    setRelayProtocol( relayProtocol );
    return this;
  }

  @JsProperty(
      name = "totalRequestsSent"
  )
  int totalRequestsSent();

  @JsProperty
  void setTotalRequestsSent(int totalRequestsSent);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats totalRequestsSent(final int totalRequestsSent) {
    setTotalRequestsSent( totalRequestsSent );
    return this;
  }

  @JsProperty(
      name = "totalResponsesReceived"
  )
  int totalResponsesReceived();

  @JsProperty
  void setTotalResponsesReceived(int totalResponsesReceived);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats totalResponsesReceived(final int totalResponsesReceived) {
    setTotalResponsesReceived( totalResponsesReceived );
    return this;
  }

  @JsProperty(
      name = "totalRoundTripTime"
  )
  double totalRoundTripTime();

  @JsProperty
  void setTotalRoundTripTime(double totalRoundTripTime);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats totalRoundTripTime(final double totalRoundTripTime) {
    setTotalRoundTripTime( totalRoundTripTime );
    return this;
  }

  @JsProperty(
      name = "url"
  )
  @Nonnull
  String url();

  @JsProperty
  void setUrl(@Nonnull String url);

  @JsOverlay
  @Nonnull
  default RTCIceServerStats url(@Nonnull final String url) {
    setUrl( url );
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
  default RTCIceServerStats id(@Nonnull final String id) {
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
  default RTCIceServerStats timestamp(final double timestamp) {
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
  default RTCIceServerStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
