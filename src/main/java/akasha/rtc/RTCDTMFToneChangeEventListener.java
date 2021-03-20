package akasha.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type RTCDTMFToneChangeEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface RTCDTMFToneChangeEventListener {
  /**
   * Handle event of type RTCDTMFToneChangeEvent
   */
  void handleEvent(@Nonnull RTCDTMFToneChangeEvent event);
}
