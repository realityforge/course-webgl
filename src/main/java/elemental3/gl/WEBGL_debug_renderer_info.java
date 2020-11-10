package elemental3.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_debug_renderer_info extension is part of the WebGL API and exposes two constants with information about the graphics driver for debugging purposes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_debug_renderer_info">WEBGL_debug_renderer_info - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_debug_renderer_info/">The definition of 'WEBGL_debug_renderer_info' in the 'WEBGL_debug_renderer_info' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_debug_renderer_info {
  @JsOverlay
  public static final int UNMASKED_RENDERER_WEBGL = 0x9246;

  @JsOverlay
  public static final int UNMASKED_VENDOR_WEBGL = 0x9245;

  protected WEBGL_debug_renderer_info() {
  }
}
