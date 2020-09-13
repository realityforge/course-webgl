package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type MouseEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface MouseEventHandler {
  void onInvoke(@Nonnull MouseEvent event);
}
