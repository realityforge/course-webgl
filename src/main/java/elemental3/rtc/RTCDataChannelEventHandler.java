package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type RTCDataChannelEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface RTCDataChannelEventHandler {
  void onInvoke(@Nonnull RTCDataChannelEvent event);
}
