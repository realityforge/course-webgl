package akasha.notifications;

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
public interface GetNotificationOptions {
  @JsOverlay
  @Nonnull
  static GetNotificationOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "tag"
  )
  String tag();

  @JsProperty
  void setTag(@Nonnull String tag);

  @JsOverlay
  @Nonnull
  default GetNotificationOptions tag(@Nonnull final String tag) {
    setTag( tag );
    return this;
  }
}
