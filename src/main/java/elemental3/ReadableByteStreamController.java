package elemental3;

import elemental3.core.ArrayBufferView;
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

  public native void error(@DoNotAutobox @Nullable Object e);

  public native void error();
}
