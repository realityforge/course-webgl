package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type WheelEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface WheelEventHandler {
  void onInvoke(@Nonnull WheelEvent event);
}
