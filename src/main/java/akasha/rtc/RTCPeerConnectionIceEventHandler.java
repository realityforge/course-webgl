package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type RTCPeerConnectionIceEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface RTCPeerConnectionIceEventHandler {
  void onInvoke(@Nonnull RTCPeerConnectionIceEvent event);
}
