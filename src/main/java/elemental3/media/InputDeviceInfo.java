package elemental3.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "InputDeviceInfo"
)
public class InputDeviceInfo extends MediaDeviceInfo {
  protected InputDeviceInfo() {
  }

  @Nonnull
  public native MediaTrackCapabilities getCapabilities();
}
