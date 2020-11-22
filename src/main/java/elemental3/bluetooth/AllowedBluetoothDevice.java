package elemental3.bluetooth;

import elemental3.StringOrUUIDArrayUnion;
import elemental3.core.JsArray;
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
public interface AllowedBluetoothDevice {
  @JsOverlay
  @Nonnull
  static AllowedBluetoothDevice create(@Nonnull final String allowedServices,
      @Nonnull final String deviceId, final boolean mayUseGATT) {
    return Js.<AllowedBluetoothDevice>uncheckedCast( JsPropertyMap.of() ).allowedServices( allowedServices ).deviceId( deviceId ).mayUseGATT( mayUseGATT );
  }

  @JsOverlay
  @Nonnull
  static AllowedBluetoothDevice create(@Nonnull final JsArray<String> allowedServices,
      @Nonnull final String deviceId, final boolean mayUseGATT) {
    return Js.<AllowedBluetoothDevice>uncheckedCast( JsPropertyMap.of() ).allowedServices( allowedServices ).deviceId( deviceId ).mayUseGATT( mayUseGATT );
  }

  @JsOverlay
  @Nonnull
  static AllowedBluetoothDevice create(@Nonnull final String[] allowedServices,
      @Nonnull final String deviceId, final boolean mayUseGATT) {
    return Js.<AllowedBluetoothDevice>uncheckedCast( JsPropertyMap.of() ).allowedServices( allowedServices ).deviceId( deviceId ).mayUseGATT( mayUseGATT );
  }

  @JsProperty(
      name = "allowedServices"
  )
  @Nonnull
  StringOrUUIDArrayUnion allowedServices();

  @JsProperty
  void setAllowedServices(@Nonnull StringOrUUIDArrayUnion allowedServices);

  @JsOverlay
  default void setAllowedServices(@Nonnull final String allowedServices) {
    setAllowedServices( StringOrUUIDArrayUnion.of( allowedServices ) );
  }

  @JsOverlay
  @Nonnull
  default AllowedBluetoothDevice allowedServices(@Nonnull final String allowedServices) {
    setAllowedServices( allowedServices );
    return this;
  }

  @JsOverlay
  default void setAllowedServices(@Nonnull final JsArray<String> allowedServices) {
    setAllowedServices( StringOrUUIDArrayUnion.of( allowedServices ) );
  }

  @JsOverlay
  @Nonnull
  default AllowedBluetoothDevice allowedServices(@Nonnull final JsArray<String> allowedServices) {
    setAllowedServices( allowedServices );
    return this;
  }

  @JsOverlay
  default void setAllowedServices(@Nonnull final String... allowedServices) {
    setAllowedServices( StringOrUUIDArrayUnion.of( allowedServices ) );
  }

  @JsOverlay
  @Nonnull
  default AllowedBluetoothDevice allowedServices(@Nonnull final String... allowedServices) {
    setAllowedServices( allowedServices );
    return this;
  }

  @JsProperty(
      name = "deviceId"
  )
  @Nonnull
  String deviceId();

  @JsProperty
  void setDeviceId(@Nonnull String deviceId);

  @JsOverlay
  @Nonnull
  default AllowedBluetoothDevice deviceId(@Nonnull final String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsProperty(
      name = "mayUseGATT"
  )
  boolean mayUseGATT();

  @JsProperty
  void setMayUseGATT(boolean mayUseGATT);

  @JsOverlay
  @Nonnull
  default AllowedBluetoothDevice mayUseGATT(final boolean mayUseGATT) {
    setMayUseGATT( mayUseGATT );
    return this;
  }
}
