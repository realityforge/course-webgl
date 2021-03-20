package akasha.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type XRReferenceSpaceEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface XRReferenceSpaceEventListener {
  /**
   * Handle event of type XRReferenceSpaceEvent
   */
  void handleEvent(@Nonnull XRReferenceSpaceEvent event);
}
