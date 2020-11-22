package elemental3.bluetooth;

import elemental3.PermissionStatus;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothPermissionResult"
)
public class BluetoothPermissionResult extends PermissionStatus {
  @Nonnull
  public JsArray<BluetoothDevice> devices;

  protected BluetoothPermissionResult() {
  }
}
