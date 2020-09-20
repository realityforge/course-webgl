package elemental3.bluetooth;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental2.promise.Promise;
import elemental3.ArrayBufferView;
import elemental3.BufferSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The BluetoothRemoteGATTDescriptor interface of the Web Bluetooth API provides a GATT Descriptor, which provides further information about a characteristic&rsquo;s value.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor">BluetoothRemoteGATTDescriptor - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothRemoteGATTDescriptor"
)
public class BluetoothRemoteGATTDescriptor {
  protected BluetoothRemoteGATTDescriptor() {
  }

  /**
   * The BluetoothRemoteGATTDescriptor.characteristic read-only property returns the BluetoothRemoteGATTCharacteristic this descriptor belongs to.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/characteristic">BluetoothRemoteGATTDescriptor.characteristic - MDN</a>
   */
  @JsProperty(
      name = "characteristic"
  )
  @Nonnull
  public native BluetoothRemoteGATTCharacteristic characteristic();

  /**
   * The BluetoothRemoteGATTDescriptor.uuid read-only property returns the UUID of the characteristic descriptor, for example '00002902-0000-1000-8000-00805f9b34fb' for theClient Characteristic Configuration descriptor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/uuid">BluetoothRemoteGATTDescriptor.uuid - MDN</a>
   */
  @JsProperty(
      name = "uuid"
  )
  @Nonnull
  public native String uuid();

  /**
   * The BluetoothRemoteGATTDescriptor.value read-only property returns an ArrayBuffer containing the currently cached descriptor value. This value gets updated when the value of the descriptor is read.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/value">BluetoothRemoteGATTDescriptor.value - MDN</a>
   */
  @JsProperty(
      name = "value"
  )
  @Nullable
  public native DataView value();

  /**
   * The BluetoothRemoteGATTDescriptor.readValue() method returns a Promise that resolves to an ArrayBuffer holding a duplicate  of the value property if it is available and supported. Otherwise it throws an error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/readValue">BluetoothRemoteGATTDescriptor.readValue - MDN</a>
   */
  @Nonnull
  public native Promise<DataView> readValue();

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull BufferSource value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull ArrayBufferView value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Int8Array value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Int16Array value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Int32Array value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint8Array value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint16Array value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint32Array value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint8ClampedArray value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Float32Array value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Float64Array value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull DataView value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull ArrayBuffer value);
}
