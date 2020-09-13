package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type PromiseRejectionEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface PromiseRejectionEventHandler {
  void onInvoke(@Nonnull PromiseRejectionEvent event);
}
