package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type RTCPeerConnectionIceErrorEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface RTCPeerConnectionIceErrorEventListener {
  /**
   * Handle event of type RTCPeerConnectionIceErrorEvent
   */
  void handleEvent(@Nonnull RTCPeerConnectionIceErrorEvent event);
}
