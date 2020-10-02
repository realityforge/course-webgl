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
    name = "ReadableStreamBYOBRequest"
)
public class ReadableStreamBYOBRequest {
  protected ReadableStreamBYOBRequest() {
  }

  @JsProperty(
      name = "view"
  )
  @Nullable
  public native ArrayBufferView view();

  public native void respond(int bytesWritten);

  public native void respondWithNewView(@Nonnull ArrayBufferView view);

  public native void respondWithNewView(@Nonnull Int8Array view);

  public native void respondWithNewView(@Nonnull Int16Array view);

  public native void respondWithNewView(@Nonnull Int32Array view);

  public native void respondWithNewView(@Nonnull Uint8Array view);

  public native void respondWithNewView(@Nonnull Uint16Array view);

  public native void respondWithNewView(@Nonnull Uint32Array view);

  public native void respondWithNewView(@Nonnull Uint8ClampedArray view);

  public native void respondWithNewView(@Nonnull Float32Array view);

  public native void respondWithNewView(@Nonnull Float64Array view);

  public native void respondWithNewView(@Nonnull DataView view);
}
