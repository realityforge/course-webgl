package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type RTCTrackEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface RTCTrackEventHandler {
  void onInvoke(@Nonnull RTCTrackEvent event);
}
