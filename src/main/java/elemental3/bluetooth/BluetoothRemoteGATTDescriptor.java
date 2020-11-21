package elemental3.bluetooth;

import elemental3.ArrayBuffer;
import elemental3.ArrayBufferView;
import elemental3.BufferSource;
import elemental3.DataView;
import elemental3.promise.Promise;
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
 * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#bluetoothremotegattdescriptor">The definition of 'BluetoothRemoteGATTDescriptor' in the 'Web Bluetooth' specification.</a>
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
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattdescriptor-characteristic">The definition of 'characteristic' in the 'Web Bluetooth' specification.</a>
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
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattdescriptor-uuid">The definition of 'uuid' in the 'Web Bluetooth' specification.</a>
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
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattdescriptor-value">The definition of 'value' in the 'Web Bluetooth' specification.</a>
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
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattdescriptor-readvalue">The definition of 'readValue()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<DataView> readValue();

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattdescriptor-writevalue">The definition of 'writeValue()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull BufferSource value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattdescriptor-writevalue">The definition of 'writeValue()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull ArrayBufferView value);

  /**
   * The BluetoothRemoteGATTDescriptor.writeValue() method sets the value property to the bytes contained in an ArrayBuffer and returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTDescriptor/writeValue">BluetoothRemoteGATTDescriptor.writeValue - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattdescriptor-writevalue">The definition of 'writeValue()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<Void> writeValue(@Nonnull ArrayBuffer value);
}
