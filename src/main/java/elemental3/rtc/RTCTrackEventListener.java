package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type RTCTrackEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface RTCTrackEventListener {
  /**
   * Handle event of type RTCTrackEvent
   */
  void handleEvent(@Nonnull RTCTrackEvent event);
}
