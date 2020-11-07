package elemental3.bluetooth;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental2.promise.Promise;
import elemental3.AddEventListenerOptions;
import elemental3.ArrayBufferView;
import elemental3.BufferSource;
import elemental3.EventHandler;
import elemental3.EventListenerOptions;
import elemental3.EventTarget;
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
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(
      @Nonnull BluetoothDescriptorUUID descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptor() method returns a Promise that resolves to the first BluetoothGATTDescriptor for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptor">BluetoothRemoteGATTCharacteristic.getDescriptor - MDN</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(@Nonnull String descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptor() method returns a Promise that resolves to the first BluetoothGATTDescriptor for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptor">BluetoothRemoteGATTCharacteristic.getDescriptor - MDN</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(int descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptors() method returns a Promise that resolves to an Array of all BluetoothGATTDescriptor objects for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptors">BluetoothRemoteGATTCharacteristic.getDescriptors - MDN</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors(
      @Nonnull BluetoothDescriptorUUID descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptors() method returns a Promise that resolves to an Array of all BluetoothGATTDescriptor objects for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptors">BluetoothRemoteGATTCharacteristic.getDescriptors - MDN</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors(
      @Nonnull String descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptors() method returns a Promise that resolves to an Array of all BluetoothGATTDescriptor objects for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptors">BluetoothRemoteGATTCharacteristic.getDescriptors - MDN</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors(int descriptor);

  /**
   * The BluetoothRemoteGATTCharacteristic.getDescriptors() method returns a Promise that resolves to an Array of all BluetoothGATTDescriptor objects for a given descriptor UUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/getDescriptors">BluetoothRemoteGATTCharacteristic.getDescriptors - MDN</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors();

  /**
   * The BluetoothRemoteGATTCharacteristic.readValue() method returns a Promise that resolves to a DataView holding a duplicate of the value property if it is available and supported. Otherwise it throws an error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/readValue">BluetoothRemoteGATTCharacteristic.readValue - MDN</a>
   */
  @Nonnull
  public native Promise<DataView> readValue();

  /**
   * The BluetoothRemoteGATTCharacteristic.startNotifications() method returns a Promise to the BluetoothRemoteGATTCharacteristic instance when there is an active notification on it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/startNotifications">BluetoothRemoteGATTCharacteristic.startNotifications - MDN</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTCharacteristic> startNotifications();

  /**
   * The BluetoothRemoteGATTCharacteristic.stopNotifications() method returns a Promise to the BluetoothRemoteGATTCharacteristic instance when there is no longer an active notification on it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/stopNotifications">BluetoothRemoteGATTCharacteristic.stopNotifications - MDN</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTCharacteristic> stopNotifications();

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull BufferSource value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull ArrayBufferView value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Int8Array value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Int16Array value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Int32Array value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint8Array value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint16Array value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint32Array value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint8ClampedArray value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Float32Array value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Float64Array value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull DataView value);

  /**
   * The BluetoothRemoteGATTCharacteristic.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTCharacteristic/writeValue">BluetoothRemoteGATTCharacteristic.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull ArrayBuffer value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull BufferSource value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull ArrayBufferView value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Int8Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Int16Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Int32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Uint8Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Uint16Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Uint32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Uint8ClampedArray value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Float32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Float64Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull DataView value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull ArrayBuffer value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull BufferSource value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull ArrayBufferView value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Int8Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Int16Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Int32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Uint8Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Uint16Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Uint32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Uint8ClampedArray value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Float32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Float64Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull DataView value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull ArrayBuffer value);

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
