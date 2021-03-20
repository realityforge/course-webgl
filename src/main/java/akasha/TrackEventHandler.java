package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type TrackEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface TrackEventHandler {
  void onInvoke(@Nonnull TrackEvent event);
}
