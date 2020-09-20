package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRtpDecodingParameters extends RTCRtpCodingParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpDecodingParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpDecodingParameters rid(@Nonnull final String rid) {
    setRid( rid );
    return this;
  }
}
