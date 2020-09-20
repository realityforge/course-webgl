package elemental3.bluetooth;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type BluetoothAdvertisingEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface BluetoothAdvertisingEventListener {
  /**
   * Handle event of type BluetoothAdvertisingEvent
   */
  void handleEvent(@Nonnull BluetoothAdvertisingEvent event);
}
