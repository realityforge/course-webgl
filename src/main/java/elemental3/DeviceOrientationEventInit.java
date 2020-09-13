package elemental3;

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
    name = "?"
)
public interface DeviceOrientationEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static DeviceOrientationEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "absolute"
  )
  boolean absolute();

  @JsProperty
  void setAbsolute(boolean absolute);

  @JsOverlay
  @Nonnull
  default DeviceOrientationEventInit absolute(final boolean absolute) {
    setAbsolute( absolute );
    return this;
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
  default DeviceOrientationEventInit alpha(@Nullable final Double alpha) {
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
  default DeviceOrientationEventInit beta(@Nullable final Double beta) {
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
  default DeviceOrientationEventInit gamma(@Nullable final Double gamma) {
    setGamma( gamma );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DeviceOrientationEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DeviceOrientationEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DeviceOrientationEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
