package elemental3.gl;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type WebGLContextEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface WebGLContextEventListener {
  /**
   * Handle event of type WebGLContextEvent
   */
  void handleEvent(@Nonnull WebGLContextEvent event);
}
