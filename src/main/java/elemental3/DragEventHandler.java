package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type DragEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface DragEventHandler {
  void onInvoke(@Nonnull DragEvent event);
}
