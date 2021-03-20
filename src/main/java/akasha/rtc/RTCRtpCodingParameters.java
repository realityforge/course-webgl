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
public interface RTCRtpCodingParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpCodingParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "rid"
  )
  String rid();

  @JsProperty
  void setRid(@Nonnull String rid);

  @JsOverlay
  @Nonnull
  default RTCRtpCodingParameters rid(@Nonnull final String rid) {
    setRid( rid );
    return this;
  }
}
