package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type DeviceOrientationEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface DeviceOrientationEventListener {
  /**
   * Handle event of type DeviceOrientationEvent
   */
  void handleEvent(@Nonnull DeviceOrientationEvent event);
}
