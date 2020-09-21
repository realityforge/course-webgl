package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type OfflineAudioCompletionEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface OfflineAudioCompletionEventHandler {
  void onInvoke(@Nonnull OfflineAudioCompletionEvent event);
}
