package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface DeviceMotionEventRotationRateInit {
  @JsOverlay
  @Nonnull
  static DeviceMotionEventRotationRateInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "alpha"
  )
  @Nullable
  Double alpha();

  @JsProperty
  void setAlpha(@Nullable Double alpha);

  @JsOverlay
  @Nonnull
  default DeviceMotionEventRotationRateInit alpha(@Nullable final Double alpha) {
    setAlpha( alpha );
    return this;
  }

  @JsProperty(
      name = "beta"
  )
  @Nullable
  Double beta();

  @JsProperty
  void setBeta(@Nullable Double beta);

  @JsOverlay
  @Nonnull
  default DeviceMotionEventRotationRateInit beta(@Nullable final Double beta) {
    setBeta( beta );
    return this;
  }

  @JsProperty(
      name = "gamma"
  )
  @Nullable
  Double gamma();

  @JsProperty
  void setGamma(@Nullable Double gamma);

  @JsOverlay
  @Nonnull
  default DeviceMotionEventRotationRateInit gamma(@Nullable final Double gamma) {
    setGamma( gamma );
    return this;
  }
}
