package akasha.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type SpeechSynthesisErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface SpeechSynthesisErrorEventListener {
  /**
   * Handle event of type SpeechSynthesisErrorEvent
   */
  void handleEvent(@Nonnull SpeechSynthesisErrorEvent event);
}
