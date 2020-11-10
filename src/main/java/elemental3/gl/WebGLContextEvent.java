package elemental3.gl;

import elemental3.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WebContextEvent interface is part of the WebGL API and is an interface for an event that is generated in response to a status change to the WebGL rendering context.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLContextEvent">WebGLContextEvent - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.15">The definition of 'WebGLContextEvent' in the 'WebGL 1.0' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebGLContextEvent"
)
public class WebGLContextEvent extends Event {
  public WebGLContextEvent(@Nonnull final String type,
      @Nonnull final WebGLContextEventInit eventInit) {
    super( null );
  }

  public WebGLContextEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The read-only WebGLContextEvent.statusMessage property contains additional event status information, or is an empty string if no additional information is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLContextEvent/statusMessage">WebGLContextEvent.statusMessage - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.15.1">The definition of 'WebGLContextEvent.statusMessage' in the 'WebGL 1.0' specification.</a>
   */
  @JsProperty(
      name = "statusMessage"
  )
  @Nonnull
  public native String statusMessage();
}
