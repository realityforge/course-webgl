package akasha.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EXT_color_buffer_half_float extension is part of the WebGL API and adds the ability to render to 16-bit floating-point color buffers.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_color_buffer_half_float">EXT_color_buffer_half_float - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_color_buffer_half_float/">EXT_color_buffer_half_float - EXT_color_buffer_half_float</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class EXT_color_buffer_half_float implements WebGLCommonExtension {
  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = 0x8211;

  @JsOverlay
  public static final String NAME = "EXT_color_buffer_half_float";

  @JsOverlay
  public static final int RGB16F_EXT = 0x881B;

  @JsOverlay
  public static final int RGBA16F_EXT = 0x881A;

  @JsOverlay
  public static final int UNSIGNED_NORMALIZED_EXT = 0x8C17;

  protected EXT_color_buffer_half_float() {
  }
}
