package akasha.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_compressed_texture_pvrtc extension is part of the WebGL API and exposes four PVRTC compressed texture formats.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_compressed_texture_pvrtc">WEBGL_compressed_texture_pvrtc - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_pvrtc/">WEBGL_compressed_texture_pvrtc - WEBGL_compressed_texture_pvrtc</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_compressed_texture_pvrtc implements WebGLCommonExtension {
  @JsOverlay
  public static final int COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = 0x8C03;

  @JsOverlay
  public static final int COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = 0x8C02;

  @JsOverlay
  public static final int COMPRESSED_RGB_PVRTC_2BPPV1_IMG = 0x8C01;

  @JsOverlay
  public static final int COMPRESSED_RGB_PVRTC_4BPPV1_IMG = 0x8C00;

  @JsOverlay
  public static final String NAME = "WEBGL_compressed_texture_pvrtc";

  protected WEBGL_compressed_texture_pvrtc() {
  }
}
