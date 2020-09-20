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
public interface RTCRtpHeaderExtensionParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpHeaderExtensionParameters create(final int id, @Nonnull final String uri) {
    return Js.<RTCRtpHeaderExtensionParameters>uncheckedCast( JsPropertyMap.of() ).id( id ).uri( uri );
  }

  @JsProperty(
      name = "encrypted"
  )
  boolean encrypted();

  @JsProperty
  void setEncrypted(boolean encrypted);

  @JsOverlay
  @Nonnull
  default RTCRtpHeaderExtensionParameters encrypted(final boolean encrypted) {
    setEncrypted( encrypted );
    return this;
  }

  @JsProperty(
      name = "id"
  )
  int id();

  @JsProperty
  void setId(int id);

  @JsOverlay
  @Nonnull
  default RTCRtpHeaderExtensionParameters id(final int id) {
    setId( id );
    return this;
  }

  @JsProperty(
      name = "uri"
  )
  @Nonnull
  String uri();

  @JsProperty
  void setUri(@Nonnull String uri);

  @JsOverlay
  @Nonnull
  default RTCRtpHeaderExtensionParameters uri(@Nonnull final String uri) {
    setUri( uri );
    return this;
  }
}
