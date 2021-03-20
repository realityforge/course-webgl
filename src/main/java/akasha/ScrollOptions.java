package akasha;

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
public interface ScrollOptions {
  @JsOverlay
  @Nonnull
  static ScrollOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "behavior"
  )
  @ScrollBehavior
  String behavior();

  @JsProperty
  void setBehavior(@ScrollBehavior @Nonnull String behavior);

  @JsOverlay
  @Nonnull
  default ScrollOptions behavior(@ScrollBehavior @Nonnull final String behavior) {
    setBehavior( behavior );
    return this;
  }
}
