package elemental3;

import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReadableByteStreamController"
)
public class ReadableByteStreamController {
  protected ReadableByteStreamController() {
  }

  @JsProperty(
      name = "byobRequest"
  )
  @Nullable
  public native ReadableStreamBYOBRequest byobRequest();

  @JsProperty(
      name = "desiredSize"
  )
  @Nullable
  public native Double desiredSize();

  public native void close();

  public native void enqueue(@Nonnull ArrayBufferView chunk);

  public native void enqueue(@Nonnull Int8Array chunk);

  public native void enqueue(@Nonnull Int16Array chunk);

  public native void enqueue(@Nonnull Int32Array chunk);

  public native void enqueue(@Nonnull Uint8Array chunk);

  public native void enqueue(@Nonnull Uint16Array chunk);

  public native void enqueue(@Nonnull Uint32Array chunk);

  public native void enqueue(@Nonnull Uint8ClampedArray chunk);

  public native void enqueue(@Nonnull Float32Array chunk);

  public native void enqueue(@Nonnull Float64Array chunk);

  public native void enqueue(@Nonnull DataView chunk);

  public native void error(@DoNotAutobox @Nullable Object e);

  public native void error();
}
