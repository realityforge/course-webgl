package akasha.clipboard;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type ClipboardEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface ClipboardEventHandler {
  void onInvoke(@Nonnull ClipboardEvent event);
}
