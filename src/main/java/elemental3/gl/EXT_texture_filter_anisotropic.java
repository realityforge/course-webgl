package elemental3.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EXT_texture_filter_anisotropic extension is part of the WebGL API and exposes two constants for anisotropic filtering (AF).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_texture_filter_anisotropic">EXT_texture_filter_anisotropic - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_texture_filter_anisotropic/">The definition of 'EXT_texture_filter_anisotropic' in the 'EXT_texture_filter_anisotropic' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class EXT_texture_filter_anisotropic {
  @JsOverlay
  public static final int MAX_TEXTURE_MAX_ANISOTROPY_EXT = 0x84FF;

  @JsOverlay
  public static final int TEXTURE_MAX_ANISOTROPY_EXT = 0x84FE;

  protected EXT_texture_filter_anisotropic() {
  }
}
