package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type HashChangeEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface HashChangeEventHandler {
  void onInvoke(@Nonnull HashChangeEvent event);
}
