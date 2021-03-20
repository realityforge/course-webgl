package akasha;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BarProp"
)
public class BarProp {
  protected BarProp() {
  }

  @JsProperty(
      name = "visible"
  )
  public native boolean visible();
}
