package elemental3.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_compressed_texture_s3tc_srgb extension is part of the WebGL API and exposes four S3TC compressed texture formats for the sRGB colorspace.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_compressed_texture_s3tc_srgb">WEBGL_compressed_texture_s3tc_srgb - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_s3tc_srgb/">WEBGL_compressed_texture_s3tc_srgb - WEBGL_compressed_texture_s3tc_srgb</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_compressed_texture_s3tc_srgb {
  @JsOverlay
  public static final int COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT = 0x8C4D;

  @JsOverlay
  public static final int COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT = 0x8C4E;

  @JsOverlay
  public static final int COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT = 0x8C4F;

  @JsOverlay
  public static final int COMPRESSED_SRGB_S3TC_DXT1_EXT = 0x8C4C;

  protected WEBGL_compressed_texture_s3tc_srgb() {
  }
}
