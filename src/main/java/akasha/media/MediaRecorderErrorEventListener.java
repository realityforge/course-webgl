package akasha.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type MediaRecorderErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface MediaRecorderErrorEventListener {
  /**
   * Handle event of type MediaRecorderErrorEvent
   */
  void handleEvent(@Nonnull MediaRecorderErrorEvent event);
}
