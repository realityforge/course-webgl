package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type StorageEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface StorageEventHandler {
  void onInvoke(@Nonnull StorageEvent event);
}
