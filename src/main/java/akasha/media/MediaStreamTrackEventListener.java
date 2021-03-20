package akasha.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type MediaStreamTrackEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface MediaStreamTrackEventListener {
  /**
   * Handle event of type MediaStreamTrackEvent
   */
  void handleEvent(@Nonnull MediaStreamTrackEvent event);
}
