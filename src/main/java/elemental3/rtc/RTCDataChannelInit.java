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
public interface RTCDataChannelInit {
  @JsOverlay
  @Nonnull
  static RTCDataChannelInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "id"
  )
  int id();

  @JsProperty
  void setId(int id);

  @JsOverlay
  @Nonnull
  default RTCDataChannelInit id(final int id) {
    setId( id );
    return this;
  }

  @JsProperty(
      name = "maxPacketLifeTime"
  )
  int maxPacketLifeTime();

  @JsProperty
  void setMaxPacketLifeTime(int maxPacketLifeTime);

  @JsOverlay
  @Nonnull
  default RTCDataChannelInit maxPacketLifeTime(final int maxPacketLifeTime) {
    setMaxPacketLifeTime( maxPacketLifeTime );
    return this;
  }

  @JsProperty(
      name = "maxRetransmits"
  )
  int maxRetransmits();

  @JsProperty
  void setMaxRetransmits(int maxRetransmits);

  @JsOverlay
  @Nonnull
  default RTCDataChannelInit maxRetransmits(final int maxRetransmits) {
    setMaxRetransmits( maxRetransmits );
    return this;
  }

  @JsProperty(
      name = "negotiated"
  )
  boolean negotiated();

  @JsProperty
  void setNegotiated(boolean negotiated);

  @JsOverlay
  @Nonnull
  default RTCDataChannelInit negotiated(final boolean negotiated) {
    setNegotiated( negotiated );
    return this;
  }

  @JsProperty(
      name = "ordered"
  )
  boolean ordered();

  @JsProperty
  void setOrdered(boolean ordered);

  @JsOverlay
  @Nonnull
  default RTCDataChannelInit ordered(final boolean ordered) {
    setOrdered( ordered );
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
  default RTCDataChannelInit protocol(@Nonnull final String protocol) {
    setProtocol( protocol );
    return this;
  }

  @JsProperty(
      name = "priority"
  )
  @RTCPriorityType
  String priority();

  @JsProperty
  void setPriority(@RTCPriorityType @Nonnull String priority);

  @JsOverlay
  @Nonnull
  default RTCDataChannelInit priority(@RTCPriorityType @Nonnull final String priority) {
    setPriority( priority );
    return this;
  }
}
