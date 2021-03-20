package akasha.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The OES_texture_half_float extension is part of the WebGL API and adds texture formats with 16- (aka half float) and 32-bit floating-point components.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OES_texture_half_float">OES_texture_half_float - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/OES_texture_half_float/">OES_texture_half_float - OES_texture_half_float</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class OES_texture_half_float implements WebGL1Extension {
  @JsOverlay
  public static final int HALF_FLOAT_OES = 0x8D61;

  @JsOverlay
  public static final String NAME = "OES_texture_half_float";

  protected OES_texture_half_float() {
  }
}
