package akasha.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EXT_texture_norm16 extension is part of the WebGL API and provides a set of new 16-bit signed normalized and unsigned normalized formats (fixed-point texture, renderbuffer and texture buffer).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_texture_norm16">EXT_texture_norm16 - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_texture_norm16/">EXT_texture_norm16 - EXT_texture_norm16</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EXT_texture_norm16"
)
public class EXT_texture_norm16 implements WebGLExtension {
  @JsOverlay
  public static final String NAME = "EXT_texture_norm16";

  @JsOverlay
  public static final int R16_EXT = 0x822A;

  @JsOverlay
  public static final int R16_SNORM_EXT = 0x8F98;

  @JsOverlay
  public static final int RG16_EXT = 0x822C;

  @JsOverlay
  public static final int RG16_SNORM_EXT = 0x8F99;

  @JsOverlay
  public static final int RGB16_EXT = 0x8054;

  @JsOverlay
  public static final int RGB16_SNORM_EXT = 0x8F9A;

  @JsOverlay
  public static final int RGBA16_EXT = 0x805B;

  @JsOverlay
  public static final int RGBA16_SNORM_EXT = 0x8F9B;

  protected EXT_texture_norm16() {
  }
}
