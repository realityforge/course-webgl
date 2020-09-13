package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type SpeechSynthesisErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface SpeechSynthesisErrorEventHandler {
  void onInvoke(@Nonnull SpeechSynthesisErrorEvent event);
}
