package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type AnimationEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface AnimationEventHandler {
  void onInvoke(@Nonnull AnimationEvent event);
}
