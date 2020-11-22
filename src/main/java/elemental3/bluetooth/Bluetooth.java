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
 * The Bluetooth interface of the Web Bluetooth API returns a Promise to a BluetoothDevice object with the specified options.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth">Bluetooth - MDN</a>
 * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#bluetooth">The definition of 'Bluetooth' in the 'Web Bluetooth' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Bluetooth"
)
public class Bluetooth extends EventTarget {
  @Nullable
  public EventHandler onadvertisementreceived;

  /**
   * The onavailabilitychanged property of the Bluetooth interface is an EventHandler that processes availabilitychanged events that fire when the Bluetooth system as a whole becomes available or unavailable to the User Agent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/onavailabilitychanged">Bluetooth.onavailabilitychanged - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#bluetooth">The definition of 'Bluetooth' in the 'Web Bluetooth' specification.</a>
   */
  @Nullable
  public EventHandler onavailabilitychanged;

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

  protected Bluetooth() {
  }

  /**
   * The Bluetooth.referringDevice attribute of the Bluetooth interface returns a BluetoothDevice if the current document was opened in response to an instruction sent by this device and null otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/referringDevice">Bluetooth.referringDevice - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetooth-referringdevice">The definition of 'referringDevice' in the 'Web Bluetooth' specification.</a>
   */
  @JsProperty(
      name = "referringDevice"
  )
  @Nullable
  public native BluetoothDevice referringDevice();

  /**
   * The getAvailability() method of Bluetooth interface of Web Bluetooth API interface exposes the Bluetooth capabilities of the current device. For a returns a Boolean which is true if the deveice has a Bluetooth adapter and false otherwise (unless user configured User Agent not to expose a real value).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/getAvailability">Bluetooth.getAvailability - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetooth-getavailability">The definition of 'getAvailability()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<Boolean> getAvailability();

  /**
   * The getDevices() method of Bluetooth interface of Web Bluetooth API exposes the Bluetooth devices this origin is allowed to access. This method does not display any permission prompts.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/getDevices">Bluetooth.getDevices - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetooth-getdevices">The definition of 'getDevices()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothDevice>> getDevices();

  /**
   * The Bluetooth.requestDevice() method of the Bluetooth interface returns a Promise to a BluetoothDevice object with the specified options. If there is no chooser UI, this method returns the first device matching the criteria.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/requestDevice">Bluetooth.requestDevice - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetooth-requestdevice">The definition of 'requestDevice()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothDevice> requestDevice(@Nonnull RequestDeviceOptions options);

  /**
   * The Bluetooth.requestDevice() method of the Bluetooth interface returns a Promise to a BluetoothDevice object with the specified options. If there is no chooser UI, this method returns the first device matching the criteria.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/requestDevice">Bluetooth.requestDevice - MDN</a>
   * @see <a href="https://webbluetoothcg.github.io/web-bluetooth/#dom-bluetooth-requestdevice">The definition of 'requestDevice()' in the 'Web Bluetooth' specification.</a>
   */
  @Nonnull
  public native Promise<BluetoothDevice> requestDevice();

  @JsOverlay
  public final void addAvailabilitychangedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "availabilitychanged", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAvailabilitychangedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "availabilitychanged", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAvailabilitychangedListener(@Nonnull final EventListener callback) {
    addEventListener( "availabilitychanged", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAvailabilitychangedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "availabilitychanged", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAvailabilitychangedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "availabilitychanged", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAvailabilitychangedListener(@Nonnull final EventListener callback) {
    removeEventListener( "availabilitychanged", Js.cast( callback ) );
  }
}
