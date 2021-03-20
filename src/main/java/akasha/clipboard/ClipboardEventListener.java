package akasha.clipboard;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type ClipboardEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface ClipboardEventListener {
  /**
   * Handle event of type ClipboardEvent
   */
  void handleEvent(@Nonnull ClipboardEvent event);
}
