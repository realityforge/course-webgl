package akasha.bluetooth;

import akasha.lang.JsArray;
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
public interface BluetoothLEScanFilterInit {
  @JsOverlay
  @Nonnull
  static BluetoothLEScanFilterInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "manufacturerData"
  )
  Object manufacturerData();

  @JsProperty
  void setManufacturerData(@Nonnull Object manufacturerData);

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit manufacturerData(@Nonnull final Object manufacturerData) {
    setManufacturerData( manufacturerData );
    return this;
  }

  @JsProperty(
      name = "name"
  )
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit name(@Nonnull final String name) {
    setName( name );
    return this;
  }

  @JsProperty(
      name = "namePrefix"
  )
  String namePrefix();

  @JsProperty
  void setNamePrefix(@Nonnull String namePrefix);

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit namePrefix(@Nonnull final String namePrefix) {
    setNamePrefix( namePrefix );
    return this;
  }

  @JsProperty(
      name = "serviceData"
  )
  Object serviceData();

  @JsProperty
  void setServiceData(@Nonnull Object serviceData);

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit serviceData(@Nonnull final Object serviceData) {
    setServiceData( serviceData );
    return this;
  }

  @JsProperty(
      name = "services"
  )
  JsArray<BluetoothServiceUUID> services();

  @JsProperty
  void setServices(@Nonnull JsArray<BluetoothServiceUUID> services);

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit services(
      @Nonnull final JsArray<BluetoothServiceUUID> services) {
    setServices( services );
    return this;
  }

  @JsOverlay
  default void setServices(@Nonnull final BluetoothServiceUUID... services) {
    setServices( Js.<JsArray<BluetoothServiceUUID>>uncheckedCast( services ) );
  }

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit services(@Nonnull final BluetoothServiceUUID... services) {
    setServices( services );
    return this;
  }
}
