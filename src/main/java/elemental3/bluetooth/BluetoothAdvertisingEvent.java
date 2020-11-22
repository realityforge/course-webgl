package elemental3.bluetooth;

import elemental3.Event;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothAdvertisingEvent"
)
public class BluetoothAdvertisingEvent extends Event {
  public BluetoothAdvertisingEvent(@Nonnull final String type,
      @Nonnull final BluetoothAdvertisingEventInit init) {
    super( null );
  }

  @JsProperty(
      name = "appearance"
  )
  @Nullable
  public native Double appearance();

  @JsProperty(
      name = "device"
  )
  @Nonnull
  public native BluetoothDevice device();

  @JsProperty(
      name = "manufacturerData"
  )
  @Nonnull
  public native BluetoothManufacturerDataMap manufacturerData();

  @JsProperty(
      name = "name"
  )
  @Nullable
  public native String name();

  @JsProperty(
      name = "rssi"
  )
  @Nullable
  public native Double rssi();

  @JsProperty(
      name = "serviceData"
  )
  @Nonnull
  public native BluetoothServiceDataMap serviceData();

  @JsProperty(
      name = "txPower"
  )
  @Nullable
  public native Double txPower();

  @JsProperty(
      name = "uuids"
  )
  @Nonnull
  public native JsArray<String> uuids();
}
