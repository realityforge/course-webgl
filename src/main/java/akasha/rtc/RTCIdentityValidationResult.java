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
public interface RTCIdentityValidationResult {
  @JsOverlay
  @Nonnull
  static RTCIdentityValidationResult create(@Nonnull final String contents,
      @Nonnull final String identity) {
    return Js.<RTCIdentityValidationResult>uncheckedCast( JsPropertyMap.of() ).contents( contents ).identity( identity );
  }

  @JsProperty(
      name = "contents"
  )
  @Nonnull
  String contents();

  @JsProperty
  void setContents(@Nonnull String contents);

  @JsOverlay
  @Nonnull
  default RTCIdentityValidationResult contents(@Nonnull final String contents) {
    setContents( contents );
    return this;
  }

  @JsProperty(
      name = "identity"
  )
  @Nonnull
  String identity();

  @JsProperty
  void setIdentity(@Nonnull String identity);

  @JsOverlay
  @Nonnull
  default RTCIdentityValidationResult identity(@Nonnull final String identity) {
    setIdentity( identity );
    return this;
  }
}
