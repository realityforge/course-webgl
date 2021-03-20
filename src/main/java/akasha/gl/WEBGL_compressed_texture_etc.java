package akasha.gl;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_compressed_texture_etc extension is part of the WebGL API and exposes 10 ETC/EAC compressed texture formats.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_compressed_texture_etc">WEBGL_compressed_texture_etc - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_etc/">WEBGL_compressed_texture_etc - WEBGL_compressed_texture_etc</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_compressed_texture_etc implements WebGLCommonExtension {
  @JsOverlay
  public static final int COMPRESSED_R11_EAC = 0x9270;

  @JsOverlay
  public static final int COMPRESSED_RG11_EAC = 0x9272;

  @JsOverlay
  public static final int COMPRESSED_RGB8_ETC2 = 0x9274;

  @JsOverlay
  public static final int COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;

  @JsOverlay
  public static final int COMPRESSED_RGBA8_ETC2_EAC = 0x9278;

  @JsOverlay
  public static final int COMPRESSED_SIGNED_R11_EAC = 0x9271;

  @JsOverlay
  public static final int COMPRESSED_SIGNED_RG11_EAC = 0x9273;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ETC2 = 0x9275;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;

  @JsOverlay
  public static final String NAME = "WEBGL_compressed_texture_etc";

  protected WEBGL_compressed_texture_etc() {
  }
}
