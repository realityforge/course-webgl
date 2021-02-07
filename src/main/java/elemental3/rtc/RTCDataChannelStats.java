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
public interface RTCDataChannelStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCDataChannelStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type, @RTCDataChannelState @Nonnull final String state) {
    return Js.<RTCDataChannelStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).state( state );
  }

  @JsProperty(
      name = "bytesReceived"
  )
  int bytesReceived();

  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats bytesReceived(final int bytesReceived) {
    setBytesReceived( bytesReceived );
    return this;
  }

  @JsProperty(
      name = "bytesSent"
  )
  int bytesSent();

  @JsProperty
  void setBytesSent(int bytesSent);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats bytesSent(final int bytesSent) {
    setBytesSent( bytesSent );
    return this;
  }

  @JsProperty(
      name = "dataChannelIdentifier"
  )
  int dataChannelIdentifier();

  @JsProperty
  void setDataChannelIdentifier(int dataChannelIdentifier);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats dataChannelIdentifier(final int dataChannelIdentifier) {
    setDataChannelIdentifier( dataChannelIdentifier );
    return this;
  }

  @JsProperty(
      name = "label"
  )
  String label();

  @JsProperty
  void setLabel(@Nonnull String label);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats label(@Nonnull final String label) {
    setLabel( label );
    return this;
  }

  @JsProperty(
      name = "messagesReceived"
  )
  int messagesReceived();

  @JsProperty
  void setMessagesReceived(int messagesReceived);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats messagesReceived(final int messagesReceived) {
    setMessagesReceived( messagesReceived );
    return this;
  }

  @JsProperty(
      name = "messagesSent"
  )
  int messagesSent();

  @JsProperty
  void setMessagesSent(int messagesSent);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats messagesSent(final int messagesSent) {
    setMessagesSent( messagesSent );
    return this;
  }

  @JsProperty(
      name = "protocol"
  )
  String protocol();

  @JsProperty
  void setProtocol(@Nonnull String protocol);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats protocol(@Nonnull final String protocol) {
    setProtocol( protocol );
    return this;
  }

  @JsProperty(
      name = "state"
  )
  @RTCDataChannelState
  @Nonnull
  String state();

  @JsProperty
  void setState(@RTCDataChannelState @Nonnull String state);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats state(@RTCDataChannelState @Nonnull final String state) {
    setState( state );
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
  default RTCDataChannelStats id(@Nonnull final String id) {
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
  default RTCDataChannelStats timestamp(final double timestamp) {
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
  default RTCDataChannelStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
