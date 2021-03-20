package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type InputEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface InputEventHandler {
  void onInvoke(@Nonnull InputEvent event);
}
