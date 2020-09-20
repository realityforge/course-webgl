package elemental3.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type SpeechRecognitionEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface SpeechRecognitionEventListener {
  /**
   * Handle event of type SpeechRecognitionEvent
   */
  void handleEvent(@Nonnull SpeechRecognitionEvent event);
}
