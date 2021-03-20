package akasha.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EXT_texture_compression_bptc extension is part of the WebGL API and exposes 4 BPTC compressed texture formats. These compression formats are called BC7 and BC6H in Microsoft's DirectX API.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_texture_compression_bptc">EXT_texture_compression_bptc - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_texture_compression_bptc/">EXT_texture_compression_bptc</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EXT_texture_compression_bptc"
)
public class EXT_texture_compression_bptc implements WebGLCommonExtension {
  @JsOverlay
  public static final int COMPRESSED_RGBA_BPTC_UNORM_EXT = 0x8E8C;

  @JsOverlay
  public static final int COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT = 0x8E8E;

  @JsOverlay
  public static final int COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT = 0x8E8F;

  @JsOverlay
  public static final int COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT = 0x8E8D;

  @JsOverlay
  public static final String NAME = "EXT_texture_compression_bptc";

  protected EXT_texture_compression_bptc() {
  }
}
