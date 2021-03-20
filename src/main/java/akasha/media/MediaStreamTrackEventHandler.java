package akasha.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type MediaStreamTrackEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface MediaStreamTrackEventHandler {
  void onInvoke(@Nonnull MediaStreamTrackEvent event);
}
