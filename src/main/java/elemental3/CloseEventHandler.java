package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type CloseEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface CloseEventHandler {
  void onInvoke(@Nonnull CloseEvent event);
}
