package elemental3.bluetooth;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The BluetoothCharacteristicProperties interface of the the Web Bluetooth API provides the operations that are valid on the given BluetoothRemoteGATTCharacteristic.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties">BluetoothCharacteristicProperties - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothCharacteristicProperties"
)
public class BluetoothCharacteristicProperties {
  protected BluetoothCharacteristicProperties() {
  }

  /**
   * The authenticatedSignedWrites read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if signed writing to the characteristic value is permitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/authenticatedSignedWrites">BluetoothCharacteristicProperties.authenticatedSignedWrites - MDN</a>
   */
  @JsProperty(
      name = "authenticatedSignedWrites"
  )
  public native boolean authenticatedSignedWrites();

  /**
   * The broadcast read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if the broadcast of the characteristic value is permitted using the Server Characteristic Configuration Descriptor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/broadcast">BluetoothCharacteristicProperties.broadcast - MDN</a>
   */
  @JsProperty(
      name = "broadcast"
  )
  public native boolean broadcast();

  /**
   * The indicate read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if indications of the characteristic value with acknowledgement is permitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/indicate">BluetoothCharacteristicProperties.indicate - MDN</a>
   */
  @JsProperty(
      name = "indicate"
  )
  public native boolean indicate();

  /**
   * The notify read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if notifications of the characteristic value without acknowledgement is permitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/notify">BluetoothCharacteristicProperties.notify - MDN</a>
   */
  @JsProperty(
      name = "notify"
  )
  public native boolean notify_();

  /**
   * The read read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if the reading of the characteristic value is permitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/read">BluetoothCharacteristicProperties.read - MDN</a>
   */
  @JsProperty(
      name = "read"
  )
  public native boolean read();

  /**
   * The reliableWrite read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if reliable writes to the characteristic is permitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/reliableWrite">BluetoothCharacteristicProperties.reliableWrite - MDN</a>
   */
  @JsProperty(
      name = "reliableWrite"
  )
  public native boolean reliableWrite();

  @JsProperty(
      name = "writableAuxiliaries"
  )
  public native boolean writableAuxiliaries();

  /**
   * The write read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if the writing to the characteristic with response is permitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/write">BluetoothCharacteristicProperties.write - MDN</a>
   */
  @JsProperty(
      name = "write"
  )
  public native boolean write();

  @JsProperty(
      name = "writeWithoutResponse"
  )
  public native boolean writeWithoutResponse();
}
