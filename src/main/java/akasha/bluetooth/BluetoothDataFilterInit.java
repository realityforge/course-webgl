package akasha.bluetooth;

import akasha.core.BufferSource;
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
public interface BluetoothDataFilterInit {
  @JsOverlay
  @Nonnull
  static BluetoothDataFilterInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "dataPrefix"
  )
  BufferSource dataPrefix();

  @JsProperty
  void setDataPrefix(@Nonnull BufferSource dataPrefix);

  @JsOverlay
  @Nonnull
  default BluetoothDataFilterInit dataPrefix(@Nonnull final BufferSource dataPrefix) {
    setDataPrefix( dataPrefix );
    return this;
  }

  @JsProperty(
      name = "mask"
  )
  BufferSource mask();

  @JsProperty
  void setMask(@Nonnull BufferSource mask);

  @JsOverlay
  @Nonnull
  default BluetoothDataFilterInit mask(@Nonnull final BufferSource mask) {
    setMask( mask );
    return this;
  }
}
