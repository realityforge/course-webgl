package elemental3.bluetooth;

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
public interface RequestDeviceOptions {
  @JsOverlay
  @Nonnull
  static RequestDeviceOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "acceptAllDevices"
  )
  boolean acceptAllDevices();

  @JsProperty
  void setAcceptAllDevices(boolean acceptAllDevices);

  @JsOverlay
  @Nonnull
  default RequestDeviceOptions acceptAllDevices(final boolean acceptAllDevices) {
    setAcceptAllDevices( acceptAllDevices );
    return this;
  }

  @JsProperty(
      name = "filters"
  )
  JsArray<BluetoothLEScanFilterInit> filters();

  @JsProperty
  void setFilters(@Nonnull JsArray<BluetoothLEScanFilterInit> filters);

  @JsOverlay
  @Nonnull
  default RequestDeviceOptions filters(@Nonnull final JsArray<BluetoothLEScanFilterInit> filters) {
    setFilters( filters );
    return this;
  }

  @JsOverlay
  default void setFilters(@Nonnull final BluetoothLEScanFilterInit... filters) {
    setFilters( Js.<JsArray<BluetoothLEScanFilterInit>>uncheckedCast( filters ) );
  }

  @JsOverlay
  @Nonnull
  default RequestDeviceOptions filters(@Nonnull final BluetoothLEScanFilterInit... filters) {
    setFilters( filters );
    return this;
  }

  @JsProperty(
      name = "optionalServices"
  )
  JsArray<BluetoothServiceUUID> optionalServices();

  @JsProperty
  void setOptionalServices(@Nonnull JsArray<BluetoothServiceUUID> optionalServices);

  @JsOverlay
  @Nonnull
  default RequestDeviceOptions optionalServices(
      @Nonnull final JsArray<BluetoothServiceUUID> optionalServices) {
    setOptionalServices( optionalServices );
    return this;
  }

  @JsOverlay
  default void setOptionalServices(@Nonnull final BluetoothServiceUUID... optionalServices) {
    setOptionalServices( Js.<JsArray<BluetoothServiceUUID>>uncheckedCast( optionalServices ) );
  }

  @JsOverlay
  @Nonnull
  default RequestDeviceOptions optionalServices(
      @Nonnull final BluetoothServiceUUID... optionalServices) {
    setOptionalServices( optionalServices );
    return this;
  }
}
