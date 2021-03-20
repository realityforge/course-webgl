package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type KeyboardEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface KeyboardEventHandler {
  void onInvoke(@Nonnull KeyboardEvent event);
}
