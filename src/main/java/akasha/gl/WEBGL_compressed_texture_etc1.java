package akasha.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_compressed_texture_etc1 extension is part of the WebGL API and exposes the ETC1 compressed texture format.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_compressed_texture_etc1">WEBGL_compressed_texture_etc1 - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_etc1/">WEBGL_compressed_texture_etc1 - WEBGL_compressed_texture_etc1</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_compressed_texture_etc1 implements WebGLCommonExtension {
  @JsOverlay
  public static final int COMPRESSED_RGB_ETC1_WEBGL = 0x8D64;

  @JsOverlay
  public static final String NAME = "WEBGL_compressed_texture_etc1";

  protected WEBGL_compressed_texture_etc1() {
  }
}
