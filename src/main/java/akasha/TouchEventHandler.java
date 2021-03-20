package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type TouchEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface TouchEventHandler {
  void onInvoke(@Nonnull TouchEvent event);
}
