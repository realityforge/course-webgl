package akasha.bluetooth;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothUUID"
)
public class BluetoothUUID {
  protected BluetoothUUID() {
  }

  @Nonnull
  public static native String canonicalUUID(int alias);

  @Nonnull
  public static native String getCharacteristic(@Nonnull String name);

  @Nonnull
  public static native String getCharacteristic(int name);

  @Nonnull
  public static native String getDescriptor(@Nonnull String name);

  @Nonnull
  public static native String getDescriptor(int name);

  @Nonnull
  public static native String getService(@Nonnull String name);

  @Nonnull
  public static native String getService(int name);
}
