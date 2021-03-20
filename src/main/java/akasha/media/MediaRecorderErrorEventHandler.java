package akasha.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type MediaRecorderErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface MediaRecorderErrorEventHandler {
  void onInvoke(@Nonnull MediaRecorderErrorEvent event);
}
