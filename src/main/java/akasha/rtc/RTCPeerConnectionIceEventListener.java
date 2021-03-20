package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type RTCPeerConnectionIceEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface RTCPeerConnectionIceEventListener {
  /**
   * Handle event of type RTCPeerConnectionIceEvent
   */
  void handleEvent(@Nonnull RTCPeerConnectionIceEvent event);
}
