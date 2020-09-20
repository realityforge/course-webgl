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
public interface RTCLocalSessionDescriptionInit {
  @JsOverlay
  @Nonnull
  static RTCLocalSessionDescriptionInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "sdp"
  )
  String sdp();

  @JsProperty
  void setSdp(@Nonnull String sdp);

  @JsOverlay
  @Nonnull
  default RTCLocalSessionDescriptionInit sdp(@Nonnull final String sdp) {
    setSdp( sdp );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @RTCSdpType
  String type();

  @JsProperty
  void setType(@RTCSdpType @Nonnull String type);

  @JsOverlay
  @Nonnull
  default RTCLocalSessionDescriptionInit type(@RTCSdpType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
