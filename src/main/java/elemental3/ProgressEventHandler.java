package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type ProgressEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface ProgressEventHandler {
  void onInvoke(@Nonnull ProgressEvent event);
}
