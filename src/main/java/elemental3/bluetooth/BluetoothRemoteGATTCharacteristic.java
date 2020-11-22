package elemental3.bluetooth;

import elemental3.AddEventListenerOptions;
import elemental3.EventHandler;
import elemental3.EventListenerOptions;
import elemental3.EventTarget;
import elemental3.core.BufferSource;
import elemental3.core.DataView;
import elemental3.core.JsArray;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The BluetoothRemoteGattCharacteristic interface of the Web Bluetooth API represents a GATT Characteristic, which is a basic data element that provides further information about a peripheral&rsquo;s service.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic">BluetoothRemoteGATTCharacteristic - MDN</a>
 * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#bluetoothremotegattcharacteristic">The definition of 'BluetoothRemoteGATTCharacteristic' in the 'Web Bluetooth' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothRemoteGATTCharacteristic"
)
public class BluetoothRemoteGATTCharacteristic extends EventTarget {
  @Nullable
  public EventHandler oncharacteristicvaluechanged;

  protected BluetoothRemoteGATTCharacteristic() {
  }

  /**
   * The BluetoothRemoteGATTCharacteristic.properties read-only property returns a BluetoothCharacteristicProperties instance containing the properties of this characteristic.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/properties">BluetoothRemoteGATTCharacteristic.properties - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-properties">The definition of 'properties' in the 'Web Bluetooth' specification.</a>
   */
  @JsProperty(
      name = "properties"
  )
  @Nonnull
  public native BluetoothCharacteristicProperties properties();

  /**
   * The BluetoothRemoteGATTCharacteristic.service read-only property returns the BluetoothGATTService this characteristic belongs to.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/service">BluetoothRemoteGATTCharacteristic.service - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-service">The definition of 'service' in the 'Web Bluetooth' specification.</a>
   */
  @JsProperty(
      name = "service"
  )
  @Nonnull
  public native BluetoothRemoteGATTService service();

  /**
   * The BluetoothRemoteGATTCharacteristic.uuid read-only property returns DOMString containing the UUID of the characteristic, for example '00002a37-0000-1000-8000-00805f9b34fb' for the Heart Rate Measurement characteristic.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/uuid">BluetoothRemoteGATTCharacteristic.uuid - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-uuid">The definition of 'uuid' in the 'Web Bluetooth' specification.</a>
   */
  @JsProperty(
      name = "uuid"
  )
  @Nonnull
  public native String uuid();

  /**
   * The BluetoothRemoteGATTCharacteristic.value read-only property returns currently cached characteristic value. This value gets updated when the value of the characteristic is read or updated via a notification or indication.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/value">BluetoothRemoteGATTCharacteristic.value - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-value">The definition of 'value' in the 'Web Bluetooth' specification.</a>
   */
  @JsProperty(
      name = "value"
  )
  @Nullable
  public native DataView value();

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptor() method returns a Promise that resolves to the first BluetoothGATTDescriptor for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptor">BluetoothRemoteGATTCharacteristic.getDescriptor - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-getdescriptor">The definition of 'getDescriptor()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(
      @Nonnull BluetoothDescriptorUUID descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptor() method returns a Promise that resolves to the first BluetoothGATTDescriptor for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptor">BluetoothRemoteGATTCharacteristic.getDescriptor - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-getdescriptor">The definition of 'getDescriptor()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(@Nonnull String descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptor() method returns a Promise that resolves to the first BluetoothGATTDescriptor for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptor">BluetoothRemoteGATTCharacteristic.getDescriptor - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-getdescriptor">The definition of 'getDescriptor()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(int descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptors() method returns a Promise that resolves to an Array of all BluetoothGATTDescriptor objects for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptors">BluetoothRemoteGATTCharacteristic.getDescriptors - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-getdescriptors">The definition of 'getDescriptors()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors(
      @Nonnull BluetoothDescriptorUUID descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptors() method returns a Promise that resolves to an Array of all BluetoothGATTDescriptor objects for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptors">BluetoothRemoteGATTCharacteristic.getDescriptors - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-getdescriptors">The definition of 'getDescriptors()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors(
      @Nonnull String descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptors() method returns a Promise that resolves to an Array of all BluetoothGATTDescriptor objects for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptors">BluetoothRemoteGATTCharacteristic.getDescriptors - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-getdescriptors">The definition of 'getDescriptors()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors(int descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptors() method returns a Promise that resolves to an Array of all BluetoothGATTDescriptor objects for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptors">BluetoothRemoteGATTCharacteristic.getDescriptors - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-getdescriptors">The definition of 'getDescriptors()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors();

  /**
   * The BluetoothRemoteGATTCharacteristic.readValue() method returns a Promise that resolves to a DataView holding a duplicate of the value property if it is available and supported. Otherwise it throws an error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/readValue">BluetoothRemoteGATTCharacteristic.readValue - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-readvalue">The definition of 'readValue()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<DataView> readValue();

  /**
   * The BluetoothRemoteGATTCharacteristic.startNotifications() method returns a Promise to the BluetoothRemoteGATTCharacteristic instance when there is an active notification on it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/startNotifications">BluetoothRemoteGATTCharacteristic.startNotifications - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-startnotifications">The definition of 'startNotifications()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTCharacteristic> startNotifications();

  /**
   * The BluetoothRemoteGATTCharacteristic.stopNotifications() method returns a Promise to the BluetoothRemoteGATTCharacteristic instance when there is no longer an active notification on it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/stopNotifications">BluetoothRemoteGATTCharacteristic.stopNotifications - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-stopnotifications">The definition of 'stopNotifications()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTCharacteristic> stopNotifications();

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattcharacteristic-writevalue">The definition of 'writeValue()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull BufferSource value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull BufferSource value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull BufferSource value);

  @JsOverlay
  public final void addCharacteristicvaluechangedListener(
      @Nonnull final ValueEventListener callback, @Nonnull final AddEventListenerOptions options) {
    addEventListener( "characteristicvaluechanged", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCharacteristicvaluechangedListener(
      @Nonnull final ValueEventListener callback, final boolean useCapture) {
    addEventListener( "characteristicvaluechanged", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCharacteristicvaluechangedListener(
      @Nonnull final ValueEventListener callback) {
    addEventListener( "characteristicvaluechanged", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCharacteristicvaluechangedListener(
      @Nonnull final ValueEventListener callback, @Nonnull final EventListenerOptions options) {
    removeEventListener( "characteristicvaluechanged", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCharacteristicvaluechangedListener(
      @Nonnull final ValueEventListener callback, final boolean useCapture) {
    removeEventListener( "characteristicvaluechanged", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCharacteristicvaluechangedListener(
      @Nonnull final ValueEventListener callback) {
    removeEventListener( "characteristicvaluechanged", Js.cast( callback ) );
  }
}
