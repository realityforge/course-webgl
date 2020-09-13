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
public interface DeviceMotionEventAccelerationInit {
  @JsOverlay
  @Nonnull
  static DeviceMotionEventAccelerationInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "x"
  )
  @Nullable
  Double x();

  @JsProperty
  void setX(@Nullable Double x);

  @JsOverlay
  @Nonnull
  default DeviceMotionEventAccelerationInit x(@Nullable final Double x) {
    setX( x );
    return this;
  }

  @JsProperty(
      name = "y"
  )
  @Nullable
  Double y();

  @JsProperty
  void setY(@Nullable Double y);

  @JsOverlay
  @Nonnull
  default DeviceMotionEventAccelerationInit y(@Nullable final Double y) {
    setY( y );
    return this;
  }

  @JsProperty(
      name = "z"
  )
  @Nullable
  Double z();

  @JsProperty
  void setZ(@Nullable Double z);

  @JsOverlay
  @Nonnull
  default DeviceMotionEventAccelerationInit z(@Nullable final Double z) {
    setZ( z );
    return this;
  }
}
