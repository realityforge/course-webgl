package elemental3;

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
public interface MediaKeySystemMediaCapability {
  @JsOverlay
  @Nonnull
  static MediaKeySystemMediaCapability create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "contentType"
  )
  String contentType();

  @JsProperty
  void setContentType(@Nonnull String contentType);

  @JsOverlay
  @Nonnull
  default MediaKeySystemMediaCapability contentType(@Nonnull final String contentType) {
    setContentType( contentType );
    return this;
  }

  @JsProperty(
      name = "robustness"
  )
  String robustness();

  @JsProperty
  void setRobustness(@Nonnull String robustness);

  @JsOverlay
  @Nonnull
  default MediaKeySystemMediaCapability robustness(@Nonnull final String robustness) {
    setRobustness( robustness );
    return this;
  }
}
