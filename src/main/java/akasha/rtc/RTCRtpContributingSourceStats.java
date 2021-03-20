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
public interface RTCRtpContributingSourceStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCRtpContributingSourceStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, final int contributorSsrc,
      @Nonnull final String inboundRtpStreamId) {
    return Js.<RTCRtpContributingSourceStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).contributorSsrc( contributorSsrc ).inboundRtpStreamId( inboundRtpStreamId );
  }

  @JsProperty(
      name = "audioLevel"
  )
  double audioLevel();

  @JsProperty
  void setAudioLevel(double audioLevel);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSourceStats audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  @JsProperty(
      name = "contributorSsrc"
  )
  int contributorSsrc();

  @JsProperty
  void setContributorSsrc(int contributorSsrc);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSourceStats contributorSsrc(final int contributorSsrc) {
    setContributorSsrc( contributorSsrc );
    return this;
  }

  @JsProperty(
      name = "inboundRtpStreamId"
  )
  @Nonnull
  String inboundRtpStreamId();

  @JsProperty
  void setInboundRtpStreamId(@Nonnull String inboundRtpStreamId);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSourceStats inboundRtpStreamId(
      @Nonnull final String inboundRtpStreamId) {
    setInboundRtpStreamId( inboundRtpStreamId );
    return this;
  }

  @JsProperty(
      name = "packetsContributedTo"
  )
  int packetsContributedTo();

  @JsProperty
  void setPacketsContributedTo(int packetsContributedTo);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSourceStats packetsContributedTo(final int packetsContributedTo) {
    setPacketsContributedTo( packetsContributedTo );
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
  default RTCRtpContributingSourceStats id(@Nonnull final String id) {
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
  default RTCRtpContributingSourceStats timestamp(final double timestamp) {
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
  default RTCRtpContributingSourceStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
