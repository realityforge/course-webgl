package elemental3;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WritableStreamDefaultController"
)
public class WritableStreamDefaultController {
  protected WritableStreamDefaultController() {
  }

  public native void error(@DoNotAutobox @Nullable Object e);

  public native void error();
}
