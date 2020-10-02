package elemental3;

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
    name = "TransformStreamDefaultController"
)
public class TransformStreamDefaultController {
  protected TransformStreamDefaultController() {
  }

  @JsProperty(
      name = "desiredSize"
  )
  @Nullable
  public native Double desiredSize();

  public native void enqueue(@DoNotAutobox @Nullable Object chunk);

  public native void enqueue();

  public native void error(@DoNotAutobox @Nullable Object reason);

  public native void error();

  public native void terminate();
}
