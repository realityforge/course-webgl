package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type PointerEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface PointerEventHandler {
  void onInvoke(@Nonnull PointerEvent event);
}
