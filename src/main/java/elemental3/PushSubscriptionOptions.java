package elemental3;

import elemental3.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PushSubscriptionOptions"
)
public class PushSubscriptionOptions {
  protected PushSubscriptionOptions() {
  }

  @JsProperty(
      name = "applicationServerKey"
  )
  @Nullable
  public native ArrayBuffer applicationServerKey();

  @JsProperty(
      name = "userVisibleOnly"
  )
  public native boolean userVisibleOnly();
}
