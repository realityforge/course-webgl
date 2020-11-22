package elemental3.bluetooth;

import elemental3.core.JsArray;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The BluetoothRemoteGATTServer interface of the Web Bluetooth API represents a GATT Server on a remote device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer">BluetoothRemoteGATTServer - MDN</a>
 * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#bluetoothremotegattserver">The definition of 'BluetoothRemoteGATTServer' in the 'Web Bluetooth' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothRemoteGATTServer"
)
public class BluetoothRemoteGATTServer {
  protected BluetoothRemoteGATTServer() {
  }

  /**
   * The BluetoothRemoteGATTServer.connected read-only property returns a boolean value that returns true while this script execution environment is connected to this.device. It can be false while the user agent is physically connected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/connected">BluetoothRemoteGATTServer.connected - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-connected">The definition of 'connected' in the 'Web Bluetooth' specification.</a>
   */
  @JsProperty(
      name = "connected"
  )
  public native boolean connected();

  /**
   * The BluetoothRemoteGATTServer.device read-only property returns a reference to the BluetoothDevice running the server.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/device">BluetoothRemoteGATTServer.device - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-device">The definition of 'device' in the 'Web Bluetooth' specification.</a>
   */
  @JsProperty(
      name = "device"
  )
  @Nonnull
  public native BluetoothDevice device();

  /**
   * The BluetoothRemoteGATTServer.connect() method causes the script execution environment to connect to this.device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/connect">BluetoothRemoteGATTServer.connect - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-connect">The definition of 'connect()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTServer> connect();

  /**
   * The BluetoothRemoteGATTServer.disconnect() method causes the script execution environment to disconnect from this.device.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/disconnect">BluetoothRemoteGATTServer.disconnect - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-disconnect">The definition of 'disconnect()' in the 'Web Bluetooth' specification.</a>
   */
  public native void disconnect();

  /**
   * The BluetoothRemoteGATTServer.getPrimaryService() method returns a promise to the primary BluetoothGATTService offered by the bluetooth device for a specified BluetoothServiceUUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/getPrimaryService">BluetoothRemoteGATTServer.getPrimaryService - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-getprimaryservice">The definition of 'getPrimaryService()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTService> getPrimaryService(
      @Nonnull BluetoothServiceUUID service);

  /**
   * The BluetoothRemoteGATTServer.getPrimaryService() method returns a promise to the primary BluetoothGATTService offered by the bluetooth device for a specified BluetoothServiceUUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/getPrimaryService">BluetoothRemoteGATTServer.getPrimaryService - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-getprimaryservice">The definition of 'getPrimaryService()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTService> getPrimaryService(@Nonnull String service);

  /**
   * The BluetoothRemoteGATTServer.getPrimaryService() method returns a promise to the primary BluetoothGATTService offered by the bluetooth device for a specified BluetoothServiceUUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/getPrimaryService">BluetoothRemoteGATTServer.getPrimaryService - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-getprimaryservice">The definition of 'getPrimaryService()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTService> getPrimaryService(int service);

  /**
   * The BluetoothRemoteGATTServer.getPrimaryServices() method returns a promise to a list of primary BluetoothGATTService objects offered by the bluetooth device for a specified BluetoothServiceUUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/getPrimaryServices">BluetoothRemoteGATTServer.getPrimaryServices - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-getprimaryservices">The definition of 'getPrimaryServices()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTService>> getPrimaryServices(
      @Nonnull BluetoothServiceUUID service);

  /**
   * The BluetoothRemoteGATTServer.getPrimaryServices() method returns a promise to a list of primary BluetoothGATTService objects offered by the bluetooth device for a specified BluetoothServiceUUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/getPrimaryServices">BluetoothRemoteGATTServer.getPrimaryServices - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-getprimaryservices">The definition of 'getPrimaryServices()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTService>> getPrimaryServices(
      @Nonnull String service);

  /**
   * The BluetoothRemoteGATTServer.getPrimaryServices() method returns a promise to a list of primary BluetoothGATTService objects offered by the bluetooth device for a specified BluetoothServiceUUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/getPrimaryServices">BluetoothRemoteGATTServer.getPrimaryServices - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-getprimaryservices">The definition of 'getPrimaryServices()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTService>> getPrimaryServices(int service);

  /**
   * The BluetoothRemoteGATTServer.getPrimaryServices() method returns a promise to a list of primary BluetoothGATTService objects offered by the bluetooth device for a specified BluetoothServiceUUID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTServer/getPrimaryServices">BluetoothRemoteGATTServer.getPrimaryServices - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattserver-getprimaryservices">The definition of 'getPrimaryServices()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTService>> getPrimaryServices();
}
