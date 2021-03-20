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
public interface RTCRtpHeaderExtensionCapability {
  @JsOverlay
  @Nonnull
  static RTCRtpHeaderExtensionCapability create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "uri"
  )
  String uri();

  @JsProperty
  void setUri(@Nonnull String uri);

  @JsOverlay
  @Nonnull
  default RTCRtpHeaderExtensionCapability uri(@Nonnull final String uri) {
    setUri( uri );
    return this;
  }
}
