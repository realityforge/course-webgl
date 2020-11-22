package elemental3.bluetooth;

import elemental3.EventInit;
import elemental3.StringOrUnsignedLongUnion;
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
public interface BluetoothAdvertisingEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static BluetoothAdvertisingEventInit create(@Nonnull final BluetoothDevice device) {
    return Js.<BluetoothAdvertisingEventInit>uncheckedCast( JsPropertyMap.of() ).device( device );
  }

  @JsProperty(
      name = "appearance"
  )
  int appearance();

  @JsProperty
  void setAppearance(int appearance);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit appearance(final int appearance) {
    setAppearance( appearance );
    return this;
  }

  @JsProperty(
      name = "device"
  )
  @Nonnull
  BluetoothDevice device();

  @JsProperty
  void setDevice(@Nonnull BluetoothDevice device);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit device(@Nonnull final BluetoothDevice device) {
    setDevice( device );
    return this;
  }

  @JsProperty(
      name = "manufacturerData"
  )
  BluetoothManufacturerDataMap manufacturerData();

  @JsProperty
  void setManufacturerData(@Nonnull BluetoothManufacturerDataMap manufacturerData);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit manufacturerData(
      @Nonnull final BluetoothManufacturerDataMap manufacturerData) {
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
  default BluetoothAdvertisingEventInit name(@Nonnull final String name) {
    setName( name );
    return this;
  }

  @JsProperty(
      name = "rssi"
  )
  byte rssi();

  @JsProperty
  void setRssi(byte rssi);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit rssi(final byte rssi) {
    setRssi( rssi );
    return this;
  }

  @JsProperty(
      name = "serviceData"
  )
  BluetoothServiceDataMap serviceData();

  @JsProperty
  void setServiceData(@Nonnull BluetoothServiceDataMap serviceData);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit serviceData(
      @Nonnull final BluetoothServiceDataMap serviceData) {
    setServiceData( serviceData );
    return this;
  }

  @JsProperty(
      name = "txPower"
  )
  byte txPower();

  @JsProperty
  void setTxPower(byte txPower);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit txPower(final byte txPower) {
    setTxPower( txPower );
    return this;
  }

  @JsProperty(
      name = "uuids"
  )
  JsArray<StringOrUnsignedLongUnion> uuids();

  @JsProperty
  void setUuids(@Nonnull JsArray<StringOrUnsignedLongUnion> uuids);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit uuids(
      @Nonnull final JsArray<StringOrUnsignedLongUnion> uuids) {
    setUuids( uuids );
    return this;
  }

  @JsOverlay
  default void setUuids(@Nonnull final StringOrUnsignedLongUnion... uuids) {
    setUuids( Js.<JsArray<StringOrUnsignedLongUnion>>uncheckedCast( uuids ) );
  }

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit uuids(@Nonnull final StringOrUnsignedLongUnion... uuids) {
    setUuids( uuids );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default BluetoothAdvertisingEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default BluetoothAdvertisingEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default BluetoothAdvertisingEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
