package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type MessageEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface MessageEventHandler {
  void onInvoke(@Nonnull MessageEvent event);
}
