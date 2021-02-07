package elemental3.bluetooth;

import elemental3.AddEventListenerOptions;
import elemental3.EventHandler;
import elemental3.EventListener;
import elemental3.EventListenerOptions;
import elemental3.EventTarget;
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
 * The BluetoothRemoteGATTService interface of the Web Bluetooth API represents a service provided by a GATT server, including a device, a list of referenced services, and a list of the characteristics of this service.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService">BluetoothRemoteGATTService - MDN</a>
 * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#bluetoothremotegattservice">BluetoothRemoteGATTService - Web Bluetooth</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothRemoteGATTService"
)
public class BluetoothRemoteGATTService extends EventTarget {
  @Nullable
  public EventHandler oncharacteristicvaluechanged;

  @Nullable
  public EventHandler onserviceadded;

  @Nullable
  public EventHandler onservicechanged;

  @Nullable
  public EventHandler onserviceremoved;

  protected BluetoothRemoteGATTService() {
  }

  /**
   * The BluetoothGATTService.device read-only property returns information about a Bluetooth device through an instance of BluetoothDevice.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/device">BluetoothRemoteGATTService.device - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-device">device - Web Bluetooth</a>
   */
  @JsProperty(
      name = "device"
  )
  @Nonnull
  public native BluetoothDevice device();

  /**
   * The BluetoothGATTService.isPrimary read-only property returns a Boolean that indicates whether this is a primary service. If it is not a primary service, it is a secondary service.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/isPrimary">BluetoothRemoteGATTService.isPrimary - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-isprimary">isPrimary - Web Bluetooth</a>
   */
  @JsProperty(
      name = "isPrimary"
  )
  public native boolean isPrimary();

  /**
   * The BluetoothGATTService.uuid read-only property returns a DOMString representing the UUID of this service.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/uuid">BluetoothRemoteGATTService.uuid - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-uuid">uuid - Web Bluetooth</a>
   */
  @JsProperty(
      name = "uuid"
  )
  @Nonnull
  public native String uuid();

  /**
   * The BluetoothGATTService.getCharacteristic() method returns a Promise to an instance of BluetoothGATTCharacteristic for a given universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getCharacteristic">BluetoothRemoteGATTService.getCharacteristic - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getcharacteristic">getCharacteristic() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTCharacteristic> getCharacteristic(
      @Nonnull BluetoothCharacteristicUUID characteristic);

  /**
   * The BluetoothGATTService.getCharacteristic() method returns a Promise to an instance of BluetoothGATTCharacteristic for a given universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getCharacteristic">BluetoothRemoteGATTService.getCharacteristic - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getcharacteristic">getCharacteristic() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTCharacteristic> getCharacteristic(
      @Nonnull String characteristic);

  /**
   * The BluetoothGATTService.getCharacteristic() method returns a Promise to an instance of BluetoothGATTCharacteristic for a given universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getCharacteristic">BluetoothRemoteGATTService.getCharacteristic - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getcharacteristic">getCharacteristic() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTCharacteristic> getCharacteristic(int characteristic);

  /**
   * The BluetoothGATTService.getCharacteristics() method returns a Promise to a list of BluetoothGATTCharacteristic instances for a given universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getCharacteristics">BluetoothRemoteGATTService.getCharacteristics - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getcharacteristics">getCharacteristics() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTCharacteristic>> getCharacteristics(
      @Nonnull BluetoothCharacteristicUUID characteristic);

  /**
   * The BluetoothGATTService.getCharacteristics() method returns a Promise to a list of BluetoothGATTCharacteristic instances for a given universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getCharacteristics">BluetoothRemoteGATTService.getCharacteristics - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getcharacteristics">getCharacteristics() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTCharacteristic>> getCharacteristics(
      @Nonnull String characteristic);

  /**
   * The BluetoothGATTService.getCharacteristics() method returns a Promise to a list of BluetoothGATTCharacteristic instances for a given universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getCharacteristics">BluetoothRemoteGATTService.getCharacteristics - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getcharacteristics">getCharacteristics() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTCharacteristic>> getCharacteristics(
      int characteristic);

  /**
   * The BluetoothGATTService.getCharacteristics() method returns a Promise to a list of BluetoothGATTCharacteristic instances for a given universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getCharacteristics">BluetoothRemoteGATTService.getCharacteristics - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getcharacteristics">getCharacteristics() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTCharacteristic>> getCharacteristics();

  /**
   * The BluetoothGATTService.getIncludedService() method returns a Promise to an instance of BluetoothGATTService for a given universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getIncludedService">BluetoothRemoteGATTService.getIncludedService - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getincludedservice">getIncludedService() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTService> getIncludedService(
      @Nonnull BluetoothServiceUUID service);

  /**
   * The BluetoothGATTService.getIncludedService() method returns a Promise to an instance of BluetoothGATTService for a given universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getIncludedService">BluetoothRemoteGATTService.getIncludedService - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getincludedservice">getIncludedService() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTService> getIncludedService(@Nonnull String service);

  /**
   * The BluetoothGATTService.getIncludedService() method returns a Promise to an instance of BluetoothGATTService for a given universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getIncludedService">BluetoothRemoteGATTService.getIncludedService - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getincludedservice">getIncludedService() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<BluetoothRemoteGATTService> getIncludedService(int service);

  /**
   * The BluetoothGATTService.getIncludedServices() method returns a Promise to an Array of BluetoothGATTService instances for an optional universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getIncludedServices">BluetoothRemoteGATTService.getIncludedServices - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getincludedservices">getIncludedServices() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTService>> getIncludedServices(
      @Nonnull BluetoothServiceUUID service);

  /**
   * The BluetoothGATTService.getIncludedServices() method returns a Promise to an Array of BluetoothGATTService instances for an optional universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getIncludedServices">BluetoothRemoteGATTService.getIncludedServices - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getincludedservices">getIncludedServices() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTService>> getIncludedServices(
      @Nonnull String service);

  /**
   * The BluetoothGATTService.getIncludedServices() method returns a Promise to an Array of BluetoothGATTService instances for an optional universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getIncludedServices">BluetoothRemoteGATTService.getIncludedServices - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getincludedservices">getIncludedServices() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTService>> getIncludedServices(int service);

  /**
   * The BluetoothGATTService.getIncludedServices() method returns a Promise to an Array of BluetoothGATTService instances for an optional universally unique identifier (UUID).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/BluetoothRemoteGATTService/getIncludedServices">BluetoothRemoteGATTService.getIncludedServices - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetoothremotegattservice-getincludedservices">getIncludedServices() - Web Bluetooth</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTService>> getIncludedServices();

  @JsOverlay
  public final void addServiceaddedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "serviceadded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addServiceaddedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "serviceadded", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addServiceaddedListener(@Nonnull final EventListener callback) {
    addEventListener( "serviceadded", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeServiceaddedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "serviceadded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeServiceaddedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "serviceadded", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeServiceaddedListener(@Nonnull final EventListener callback) {
    removeEventListener( "serviceadded", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addServicechangedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "servicechanged", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addServicechangedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "servicechanged", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addServicechangedListener(@Nonnull final EventListener callback) {
    addEventListener( "servicechanged", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeServicechangedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "servicechanged", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeServicechangedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "servicechanged", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeServicechangedListener(@Nonnull final EventListener callback) {
    removeEventListener( "servicechanged", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addServiceremovedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "serviceremoved", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addServiceremovedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "serviceremoved", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addServiceremovedListener(@Nonnull final EventListener callback) {
    addEventListener( "serviceremoved", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeServiceremovedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "serviceremoved", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeServiceremovedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "serviceremoved", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeServiceremovedListener(@Nonnull final EventListener callback) {
    removeEventListener( "serviceremoved", Js.cast( callback ) );
  }
}
