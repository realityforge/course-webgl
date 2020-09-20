package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type RTCPeerConnectionIceErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface RTCPeerConnectionIceErrorEventHandler {
  void onInvoke(@Nonnull RTCPeerConnectionIceErrorEvent event);
}
