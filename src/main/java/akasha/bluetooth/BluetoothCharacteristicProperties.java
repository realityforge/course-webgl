package akasha.bluetooth;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The BluetoothCharacteristicProperties interface of the Web Bluetooth API provides the operations that are valid on the given BluetoothRemoteGATTCharacteristic.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties">BluetoothCharacteristicProperties - MDN</a>
 * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#characteristicproperties-interface">BluetoothCharacteristicProperties - Web Bluetooth</a>
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
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothcharacteristicproperties-authenticatedsignedwrites">authenticatedSignedWrites - Web Bluetooth</a>
   */
  @JsProperty(
      name = "authenticatedSignedWrites"
  )
  public native boolean authenticatedSignedWrites();

  /**
   * The broadcast read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if the broadcast of the characteristic value is permitted using the Server Characteristic Configuration Descriptor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/broadcast">BluetoothCharacteristicProperties.broadcast - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothcharacteristicproperties-broadcast">broadcast - Web Bluetooth</a>
   */
  @JsProperty(
      name = "broadcast"
  )
  public native boolean broadcast();

  /**
   * The indicate read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if indications of the characteristic value with acknowledgement is permitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/indicate">BluetoothCharacteristicProperties.indicate - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothcharacteristicproperties-indicate">indicate - Web Bluetooth</a>
   */
  @JsProperty(
      name = "indicate"
  )
  public native boolean indicate();

  /**
   * The notify read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if notifications of the characteristic value without acknowledgement is permitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/notify">BluetoothCharacteristicProperties.notify - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothcharacteristicproperties-notify">notify - Web Bluetooth</a>
   */
  @JsProperty(
      name = "notify"
  )
  public native boolean notify_();

  /**
   * The read read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if the reading of the characteristic value is permitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/read">BluetoothCharacteristicProperties.read - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothcharacteristicproperties-read">read - Web Bluetooth</a>
   */
  @JsProperty(
      name = "read"
  )
  public native boolean read();

  /**
   * The reliableWrite read-only property of the BluetoothCharacteristicProperties interface returns a boolean that is true if reliable writes to the characteristic is permitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothCharacteristicProperties/reliableWrite">BluetoothCharacteristicProperties.reliableWrite - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothcharacteristicproperties-reliablewrite">reliableWrite - Web Bluetooth</a>
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
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothcharacteristicproperties-write">write - Web Bluetooth</a>
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
