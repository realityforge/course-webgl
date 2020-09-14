package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The BluetoothDevice interface of the Web Bluetooth API represents a Bluetooth device inside a particular script execution environment.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothDevice">BluetoothDevice - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothDevice"
)
public class BluetoothDevice extends EventTarget {
  @Nullable
  public EventHandler onadvertisementreceived;

  @Nullable
  public EventHandler oncharacteristicvaluechanged;

  @Nullable
  public EventHandler ongattserverdisconnected;

  @Nullable
  public EventHandler onserviceadded;

  @Nullable
  public EventHandler onservicechanged;

  @Nullable
  public EventHandler onserviceremoved;

  BluetoothDevice() {
  }

  /**
   * The BluetoothDevice.gatt read-only property returns a reference to the device's BluetoothRemoteGATTServer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothDevice/gatt">BluetoothDevice.gatt - MDN</a>
   */
  @JsProperty(
      name = "gatt"
  )
  @Nullable
  public native BluetoothRemoteGATTServer gatt();

  /**
   * The BluetoothDevice.id read-only property returns a DOMString that uniquely identifies a device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothDevice/id">BluetoothDevice.id - MDN</a>
   */
  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  /**
   * The BluetoothDevice.name read-only property returns a DOMString that provides a human-readable name for the device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothDevice/name">BluetoothDevice.name - MDN</a>
   */
  @JsProperty(
      name = "name"
  )
  @Nullable
  public native String name();

  @JsProperty(
      name = "watchingAdvertisements"
  )
  public native boolean watchingAdvertisements();

  @Nonnull
  public native Promise<Void> watchAdvertisements(@Nonnull WatchAdvertisementsOptions options);

  @Nonnull
  public native Promise<Void> watchAdvertisements();

  @JsOverlay
  public final void addAdvertisementreceivedListener(
      @Nonnull final BluetoothAdvertisingEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "advertisementreceived", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAdvertisementreceivedListener(
      @Nonnull final BluetoothAdvertisingEventListener callback, final boolean options) {
    addEventListener( "advertisementreceived", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAdvertisementreceivedListener(
      @Nonnull final BluetoothAdvertisingEventListener callback) {
    addEventListener( "advertisementreceived", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAdvertisementreceivedListener(
      @Nonnull final BluetoothAdvertisingEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "advertisementreceived", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAdvertisementreceivedListener(
      @Nonnull final BluetoothAdvertisingEventListener callback, final boolean options) {
    removeEventListener( "advertisementreceived", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAdvertisementreceivedListener(
      @Nonnull final BluetoothAdvertisingEventListener callback) {
    removeEventListener( "advertisementreceived", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addGattserverdisconnectedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gattserverdisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGattserverdisconnectedListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "gattserverdisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGattserverdisconnectedListener(@Nonnull final EventListener callback) {
    addEventListener( "gattserverdisconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeGattserverdisconnectedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gattserverdisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGattserverdisconnectedListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "gattserverdisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGattserverdisconnectedListener(@Nonnull final EventListener callback) {
    removeEventListener( "gattserverdisconnected", Js.cast( callback ) );
  }
}
