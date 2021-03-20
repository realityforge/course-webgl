package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type UIEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface UIEventHandler {
  void onInvoke(@Nonnull UIEvent event);
}
