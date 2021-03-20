package akasha.rtc;

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
    name = "Object"
)
public interface RTCSctpTransportStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCSctpTransportStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type) {
    return Js.<RTCSctpTransportStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type );
  }

  @JsProperty(
      name = "congestionWindow"
  )
  int congestionWindow();

  @JsProperty
  void setCongestionWindow(int congestionWindow);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats congestionWindow(final int congestionWindow) {
    setCongestionWindow( congestionWindow );
    return this;
  }

  @JsProperty(
      name = "mtu"
  )
  int mtu();

  @JsProperty
  void setMtu(int mtu);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats mtu(final int mtu) {
    setMtu( mtu );
    return this;
  }

  @JsProperty(
      name = "receiverWindow"
  )
  int receiverWindow();

  @JsProperty
  void setReceiverWindow(int receiverWindow);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats receiverWindow(final int receiverWindow) {
    setReceiverWindow( receiverWindow );
    return this;
  }

  @JsProperty(
      name = "smoothedRoundTripTime"
  )
  double smoothedRoundTripTime();

  @JsProperty
  void setSmoothedRoundTripTime(double smoothedRoundTripTime);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats smoothedRoundTripTime(final double smoothedRoundTripTime) {
    setSmoothedRoundTripTime( smoothedRoundTripTime );
    return this;
  }

  @JsProperty(
      name = "transportId"
  )
  String transportId();

  @JsProperty
  void setTransportId(@Nonnull String transportId);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsProperty(
      name = "unackData"
  )
  int unackData();

  @JsProperty
  void setUnackData(int unackData);

  @JsOverlay
  @Nonnull
  default RTCSctpTransportStats unackData(final int unackData) {
    setUnackData( unackData );
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
  default RTCSctpTransportStats id(@Nonnull final String id) {
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
  default RTCSctpTransportStats timestamp(final double timestamp) {
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
  default RTCSctpTransportStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
