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
public interface RTCRtpTransceiverStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCRtpTransceiverStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @Nonnull final String receiverId,
      @Nonnull final String senderId) {
    return Js.<RTCRtpTransceiverStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).receiverId( receiverId ).senderId( senderId );
  }

  @JsProperty(
      name = "mid"
  )
  String mid();

  @JsProperty
  void setMid(@Nonnull String mid);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverStats mid(@Nonnull final String mid) {
    setMid( mid );
    return this;
  }

  @JsProperty(
      name = "receiverId"
  )
  @Nonnull
  String receiverId();

  @JsProperty
  void setReceiverId(@Nonnull String receiverId);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverStats receiverId(@Nonnull final String receiverId) {
    setReceiverId( receiverId );
    return this;
  }

  @JsProperty(
      name = "senderId"
  )
  @Nonnull
  String senderId();

  @JsProperty
  void setSenderId(@Nonnull String senderId);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverStats senderId(@Nonnull final String senderId) {
    setSenderId( senderId );
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
  default RTCRtpTransceiverStats id(@Nonnull final String id) {
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
  default RTCRtpTransceiverStats timestamp(final double timestamp) {
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
  default RTCRtpTransceiverStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
