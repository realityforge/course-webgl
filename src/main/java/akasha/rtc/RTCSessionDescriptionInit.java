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
public interface RTCSessionDescriptionInit {
  @JsOverlay
  @Nonnull
  static RTCSessionDescriptionInit create(@RTCSdpType @Nonnull final String type) {
    return Js.<RTCSessionDescriptionInit>uncheckedCast( JsPropertyMap.of() ).type( type );
  }

  @JsProperty(
      name = "sdp"
  )
  String sdp();

  @JsProperty
  void setSdp(@Nonnull String sdp);

  @JsOverlay
  @Nonnull
  default RTCSessionDescriptionInit sdp(@Nonnull final String sdp) {
    setSdp( sdp );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @RTCSdpType
  @Nonnull
  String type();

  @JsProperty
  void setType(@RTCSdpType @Nonnull String type);

  @JsOverlay
  @Nonnull
  default RTCSessionDescriptionInit type(@RTCSdpType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
