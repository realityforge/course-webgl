package akasha.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EXT_texture_compression_rgtc extension is part of the WebGL API and exposes 4 RGTC compressed texture formats. RGTC is a block-based texture compression format suited for unsigned and signed red and red-green textures (Red-Green Texture Compression).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_texture_compression_rgtc">EXT_texture_compression_rgtc - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_texture_compression_rgtc/">EXT_texture_compression_rgtc</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EXT_texture_compression_rgtc"
)
public class EXT_texture_compression_rgtc implements WebGLCommonExtension {
  @JsOverlay
  public static final int COMPRESSED_RED_GREEN_RGTC2_EXT = 0x8DBD;

  @JsOverlay
  public static final int COMPRESSED_RED_RGTC1_EXT = 0x8DBB;

  @JsOverlay
  public static final int COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT = 0x8DBE;

  @JsOverlay
  public static final int COMPRESSED_SIGNED_RED_RGTC1_EXT = 0x8DBC;

  @JsOverlay
  public static final String NAME = "EXT_texture_compression_rgtc";

  protected EXT_texture_compression_rgtc() {
  }
}
