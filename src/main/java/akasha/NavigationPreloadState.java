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
public interface NavigationPreloadState {
  @JsOverlay
  @Nonnull
  static NavigationPreloadState create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "enabled"
  )
  boolean enabled();

  @JsProperty
  void setEnabled(boolean enabled);

  @JsOverlay
  @Nonnull
  default NavigationPreloadState enabled(final boolean enabled) {
    setEnabled( enabled );
    return this;
  }

  @JsProperty(
      name = "headerValue"
  )
  String headerValue();

  @JsProperty
  void setHeaderValue(@Nonnull String headerValue);

  @JsOverlay
  @Nonnull
  default NavigationPreloadState headerValue(@Nonnull final String headerValue) {
    setHeaderValue( headerValue );
    return this;
  }
}
