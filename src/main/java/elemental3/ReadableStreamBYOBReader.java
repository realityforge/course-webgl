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
import elemental2.promise.Promise;
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
    name = "ReadableStreamBYOBReader"
)
public class ReadableStreamBYOBReader {
  public ReadableStreamBYOBReader(@Nonnull final ReadableStream stream) {
  }

  @JsProperty(
      name = "closed"
  )
  @Nonnull
  public native Promise<Void> closed();

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull ArrayBufferView view);

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull Int8Array view);

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull Int16Array view);

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull Int32Array view);

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull Uint8Array view);

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull Uint16Array view);

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull Uint32Array view);

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull Uint8ClampedArray view);

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull Float32Array view);

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull Float64Array view);

  @Nonnull
  public native Promise<ReadableStreamBYOBReadResult> read(@Nonnull DataView view);

  public native void releaseLock();

  @Nonnull
  public native Promise<Void> cancel(@DoNotAutobox @Nullable Object reason);

  @Nonnull
  public native Promise<Void> cancel();
}
