package akasha.speech;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type SpeechRecognitionErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface SpeechRecognitionErrorEventHandler {
  void onInvoke(@Nonnull SpeechRecognitionErrorEvent event);
}
