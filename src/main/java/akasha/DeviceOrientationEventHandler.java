package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type DeviceOrientationEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface DeviceOrientationEventHandler {
  void onInvoke(@Nonnull DeviceOrientationEvent event);
}
