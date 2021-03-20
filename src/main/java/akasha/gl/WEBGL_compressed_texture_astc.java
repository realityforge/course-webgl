package akasha.gl;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_compressed_texture_astc extension is part of the WebGL API and exposes Adaptive Scalable Texture Compression (ASTC) compressed texture formats to WebGL.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_compressed_texture_astc">WEBGL_compressed_texture_astc - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_astc/">WEBGL_compressed_texture_astc - WEBGL_compressed_texture_astc</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_compressed_texture_astc implements WebGLCommonExtension {
  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_10x10_KHR = 0x93BB;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_10x5_KHR = 0x93B8;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_10x6_KHR = 0x93B9;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_10x8_KHR = 0x93BA;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_12x10_KHR = 0x93BC;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_12x12_KHR = 0x93BD;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_4x4_KHR = 0x93B0;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_5x4_KHR = 0x93B1;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_5x5_KHR = 0x93B2;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_6x5_KHR = 0x93B3;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_6x6_KHR = 0x93B4;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_8x5_KHR = 0x93B5;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_8x6_KHR = 0x93B6;

  @JsOverlay
  public static final int COMPRESSED_RGBA_ASTC_8x8_KHR = 0x93B7;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR = 0x93DB;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR = 0x93D8;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR = 0x93D9;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR = 0x93DA;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR = 0x93DC;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR = 0x93DD;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR = 0x93D0;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR = 0x93D1;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR = 0x93D2;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR = 0x93D3;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR = 0x93D4;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR = 0x93D5;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR = 0x93D6;

  @JsOverlay
  public static final int COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR = 0x93D7;

  @JsOverlay
  public static final String NAME = "WEBGL_compressed_texture_astc";

  protected WEBGL_compressed_texture_astc() {
  }

  /**
   * The WEBGL_compressed_texture_astc.getSupportedProfiles() method returns an array of strings containing the names of the ASTC profiles supported by the implementation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_compressed_texture_astc/getSupportedProfiles">WEBGL_compressed_texture_astc.getSupportedProfiles - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_compressed_texture_astc/">WEBGL_compressed_texture_astc - WEBGL_compressed_texture_astc</a>
   */
  @Nonnull
  public native JsArray<String> getSupportedProfiles();
}
