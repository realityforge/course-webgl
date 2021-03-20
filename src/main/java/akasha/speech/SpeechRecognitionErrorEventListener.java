package akasha.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type SpeechRecognitionErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface SpeechRecognitionErrorEventListener {
  /**
   * Handle event of type SpeechRecognitionErrorEvent
   */
  void handleEvent(@Nonnull SpeechRecognitionErrorEvent event);
}
