package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type DeviceMotionEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface DeviceMotionEventHandler {
  void onInvoke(@Nonnull DeviceMotionEvent event);
}
