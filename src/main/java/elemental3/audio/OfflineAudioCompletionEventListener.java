package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type OfflineAudioCompletionEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface OfflineAudioCompletionEventListener {
  /**
   * Handle event of type OfflineAudioCompletionEvent
   */
  void handleEvent(@Nonnull OfflineAudioCompletionEvent event);
}
