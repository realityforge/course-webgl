package akasha.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type XRReferenceSpaceEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface XRReferenceSpaceEventHandler {
  void onInvoke(@Nonnull XRReferenceSpaceEvent event);
}
