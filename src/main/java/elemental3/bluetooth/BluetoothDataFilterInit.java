package elemental3.bluetooth;

import elemental3.ArrayBuffer;
import elemental3.ArrayBufferView;
import elemental3.BufferSource;
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

  @JsOverlay
  default void setDataPrefix(@Nonnull final ArrayBufferView dataPrefix) {
    setDataPrefix( BufferSource.of( dataPrefix ) );
  }

  @JsOverlay
  @Nonnull
  default BluetoothDataFilterInit dataPrefix(@Nonnull final ArrayBufferView dataPrefix) {
    setDataPrefix( dataPrefix );
    return this;
  }

  @JsOverlay
  default void setDataPrefix(@Nonnull final ArrayBuffer dataPrefix) {
    setDataPrefix( BufferSource.of( dataPrefix ) );
  }

  @JsOverlay
  @Nonnull
  default BluetoothDataFilterInit dataPrefix(@Nonnull final ArrayBuffer dataPrefix) {
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

  @JsOverlay
  default void setMask(@Nonnull final ArrayBufferView mask) {
    setMask( BufferSource.of( mask ) );
  }

  @JsOverlay
  @Nonnull
  default BluetoothDataFilterInit mask(@Nonnull final ArrayBufferView mask) {
    setMask( mask );
    return this;
  }

  @JsOverlay
  default void setMask(@Nonnull final ArrayBuffer mask) {
    setMask( BufferSource.of( mask ) );
  }

  @JsOverlay
  @Nonnull
  default BluetoothDataFilterInit mask(@Nonnull final ArrayBuffer mask) {
    setMask( mask );
    return this;
  }
}
