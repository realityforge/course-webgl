package elemental3.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_color_buffer_float extension is part of the WebGL API and adds the ability to render to 32-bit floating-point color buffers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_color_buffer_float">WEBGL_color_buffer_float - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_color_buffer_float/">WEBGL_color_buffer_float - WEBGL_color_buffer_float</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_color_buffer_float {
  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = 0x8211;

  @JsOverlay
  public static final int RGBA32F_EXT = 0x8814;

  @JsOverlay
  public static final int UNSIGNED_NORMALIZED_EXT = 0x8C17;

  protected WEBGL_color_buffer_float() {
  }
}
