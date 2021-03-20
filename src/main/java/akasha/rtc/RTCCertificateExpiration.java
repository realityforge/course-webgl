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
public interface RTCCertificateExpiration {
  @JsOverlay
  @Nonnull
  static RTCCertificateExpiration create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "expires"
  )
  int expires();

  @JsProperty
  void setExpires(int expires);

  @JsOverlay
  @Nonnull
  default RTCCertificateExpiration expires(final int expires) {
    setExpires( expires );
    return this;
  }
}
