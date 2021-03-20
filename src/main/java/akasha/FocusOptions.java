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
public interface FocusOptions {
  @JsOverlay
  @Nonnull
  static FocusOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "preventScroll"
  )
  boolean preventScroll();

  @JsProperty
  void setPreventScroll(boolean preventScroll);

  @JsOverlay
  @Nonnull
  default FocusOptions preventScroll(final boolean preventScroll) {
    setPreventScroll( preventScroll );
    return this;
  }
}
