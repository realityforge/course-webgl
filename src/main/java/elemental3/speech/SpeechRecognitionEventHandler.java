package elemental3.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type SpeechRecognitionEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface SpeechRecognitionEventHandler {
  void onInvoke(@Nonnull SpeechRecognitionEvent event);
}
