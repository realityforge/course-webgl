package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type AudioProcessingEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface AudioProcessingEventHandler {
  void onInvoke(@Nonnull AudioProcessingEvent event);
}
