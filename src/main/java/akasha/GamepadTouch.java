package akasha;

import akasha.core.Float32Array;
import akasha.core.Uint32Array;
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
    name = "GamepadTouch"
)
public class GamepadTouch {
  protected GamepadTouch() {
  }

  @JsProperty(
      name = "position"
  )
  @Nonnull
  public native Float32Array position();

  @JsProperty(
      name = "surfaceDimensions"
  )
  @Nullable
  public native Uint32Array surfaceDimensions();

  @JsProperty(
      name = "surfaceId"
  )
  public native short surfaceId();

  @JsProperty(
      name = "touchId"
  )
  public native int touchId();
}
