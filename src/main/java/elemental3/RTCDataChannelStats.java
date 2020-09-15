package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

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
      @MagicConstant(valuesFromClass = RTCStatsType.class) @Nonnull final String type,
      @MagicConstant(valuesFromClass = RTCDataChannelState.class) @Nonnull final String state,
      @Nonnull final String transportId) {
    return Js.<RTCDataChannelStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).state( state ).transportId( transportId );
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
  @MagicConstant(
      valuesFromClass = RTCDataChannelState.class
  )
  @Nonnull
  String state();

  @JsProperty
  void setState(@MagicConstant(valuesFromClass = RTCDataChannelState.class) @Nonnull String state);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats state(
      @MagicConstant(valuesFromClass = RTCDataChannelState.class) @Nonnull final String state) {
    setState( state );
    return this;
  }

  @JsProperty(
      name = "transportId"
  )
  @Nonnull
  String transportId();

  @JsProperty
  void setTransportId(@Nonnull String transportId);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  /**
   * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
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
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCDataChannelStats type(
      @MagicConstant(valuesFromClass = RTCStatsType.class) @Nonnull final String type) {
    setType( type );
    return this;
  }
}