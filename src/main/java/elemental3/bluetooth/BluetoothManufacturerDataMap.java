package elemental3.bluetooth;

import elemental3.core.DataView;
import elemental3.core.JsIterator;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothManufacturerDataMap"
)
public class BluetoothManufacturerDataMap {
  protected BluetoothManufacturerDataMap() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  public native boolean has(int key);

  @Nullable
  public native DataView get(int key);

  @Nonnull
  public native JsIterator<Double> keys();

  @Nonnull
  public native JsIterator<DataView> values();

  @Nonnull
  public native JsIterator<Entry> entries();

  public native void forEach(@Nonnull ForEachCallback callback);

  public native void forEach(@Nonnull ForEachCallback2 callback);

  public native void forEach(@Nonnull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      name = "?",
      namespace = JsPackage.GLOBAL
  )
  public interface Entry {
    @JsOverlay
    default int key() {
      return Js.asArray( this )[ 0 ].cast();
    }

    @JsOverlay
    default DataView value() {
      return Js.asArray( this )[ 1 ].cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull DataView value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull DataView value, int key);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull DataView value, int key, @Nonnull BluetoothManufacturerDataMap map);
  }
}
