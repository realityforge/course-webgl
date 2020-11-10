package elemental3.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EXT_sRGB extension is part of the WebGL API and adds sRGB support to textures and framebuffer objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_sRGB">EXT_sRGB - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_sRGB/">The definition of 'EXT_sRGB' in the 'EXT_sRGB' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class EXT_sRGB {
  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = 0x8210;

  @JsOverlay
  public static final int SRGB8_ALPHA8_EXT = 0x8C43;

  @JsOverlay
  public static final int SRGB_ALPHA_EXT = 0x8C42;

  @JsOverlay
  public static final int SRGB_EXT = 0x8C40;

  protected EXT_sRGB() {
  }
}
