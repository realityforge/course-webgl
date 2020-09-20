package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "External"
)
public class External {
  protected External() {
  }

  public native void AddSearchProvider();

  public native void IsSearchProviderInstalled();
}
