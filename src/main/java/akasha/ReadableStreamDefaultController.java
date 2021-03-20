package akasha;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReadableStreamDefaultController"
)
public class ReadableStreamDefaultController {
  protected ReadableStreamDefaultController() {
  }

  @JsProperty(
      name = "desiredSize"
  )
  @Nullable
  public native Double desiredSize();

  public native void close();

  public native void enqueue(@DoNotAutobox @Nullable Object chunk);

  public native void enqueue();

  public native void error(@DoNotAutobox @Nullable Object e);

  public native void error();
}
