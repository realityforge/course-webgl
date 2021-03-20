package akasha.bluetooth;

import akasha.AbortSignal;
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
public interface WatchAdvertisementsOptions {
  @JsOverlay
  @Nonnull
  static WatchAdvertisementsOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "signal"
  )
  AbortSignal signal();

  @JsProperty
  void setSignal(@Nonnull AbortSignal signal);

  @JsOverlay
  @Nonnull
  default WatchAdvertisementsOptions signal(@Nonnull final AbortSignal signal) {
    setSignal( signal );
    return this;
  }
}
