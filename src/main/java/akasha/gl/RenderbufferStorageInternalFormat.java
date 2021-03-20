package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.RGB8,
        WebGL2RenderingContext.RGBA4,
        WebGL2RenderingContext.RGB5_A1,
        WebGL2RenderingContext.RGBA8,
        WebGL2RenderingContext.RGB10_A2,
        EXT_texture_norm16.RGBA16_EXT,
        WebGL2RenderingContext.DEPTH_COMPONENT16,
        WebGL2RenderingContext.DEPTH_COMPONENT24,
        WebGL2RenderingContext.R8,
        EXT_texture_norm16.R16_EXT,
        WebGL2RenderingContext.RG8,
        EXT_texture_norm16.RG16_EXT,
        WebGL2RenderingContext.R16F,
        WebGL2RenderingContext.R32F,
        WebGL2RenderingContext.RG16F,
        WebGL2RenderingContext.RG32F,
        WebGL2RenderingContext.R8I,
        WebGL2RenderingContext.R8UI,
        WebGL2RenderingContext.R16I,
        WebGL2RenderingContext.R16UI,
        WebGL2RenderingContext.R32I,
        WebGL2RenderingContext.R32UI,
        WebGL2RenderingContext.RG8I,
        WebGL2RenderingContext.RG8UI,
        WebGL2RenderingContext.RG16I,
        WebGL2RenderingContext.RG16UI,
        WebGL2RenderingContext.RG32I,
        WebGL2RenderingContext.RG32UI,
        WebGL2RenderingContext.DEPTH_STENCIL,
        WEBGL_color_buffer_float.RGBA32F_EXT,
        WebGL2RenderingContext.RGBA32F,
        EXT_color_buffer_half_float.RGBA16F_EXT,
        EXT_color_buffer_half_float.RGBA16F_EXT,
        WebGL2RenderingContext.RGBA16F,
        WebGL2RenderingContext.DEPTH24_STENCIL8,
        WebGL2RenderingContext.R11F_G11F_B10F,
        WebGL2RenderingContext.SRGB8_ALPHA8,
        WebGL2RenderingContext.DEPTH_COMPONENT32F,
        WebGL2RenderingContext.DEPTH32F_STENCIL8,
        WebGL2RenderingContext.STENCIL_INDEX8,
        WebGL2RenderingContext.RGB565,
        WebGL2RenderingContext.RGBA32UI,
        WebGL2RenderingContext.RGBA16UI,
        WebGL2RenderingContext.RGBA8UI,
        WebGL2RenderingContext.RGBA32I,
        WebGL2RenderingContext.RGBA16I,
        WebGL2RenderingContext.RGBA8I,
        WebGL2RenderingContext.RGB10_A2UI
    }
)
public @interface RenderbufferStorageInternalFormat {
  final class Util {
    private Util() {
    }

    @RenderbufferStorageInternalFormat
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@RenderbufferStorageInternalFormat annotated value must be one of [WebGL2RenderingContext.RGBA4, WebGL2RenderingContext.RGB565, WebGL2RenderingContext.RGB5_A1, WebGL2RenderingContext.DEPTH_COMPONENT16, WebGL2RenderingContext.STENCIL_INDEX8, WebGL2RenderingContext.DEPTH_STENCIL, WebGL2RenderingContext.R8, WebGL2RenderingContext.R8UI, WebGL2RenderingContext.R8I, WebGL2RenderingContext.R16UI, WebGL2RenderingContext.R16I, WebGL2RenderingContext.R32UI, WebGL2RenderingContext.R32I, WebGL2RenderingContext.RG8, WebGL2RenderingContext.RG8UI, WebGL2RenderingContext.RG8I, WebGL2RenderingContext.RG16UI, WebGL2RenderingContext.RG16I, WebGL2RenderingContext.RG32UI, WebGL2RenderingContext.RG32I, WebGL2RenderingContext.RGB8, WebGL2RenderingContext.RGBA8, WebGL2RenderingContext.SRGB8_ALPHA8, WebGL2RenderingContext.RGB10_A2, WebGL2RenderingContext.RGBA8UI, WebGL2RenderingContext.RGBA8I, WebGL2RenderingContext.RGB10_A2UI, WebGL2RenderingContext.RGBA16UI, WebGL2RenderingContext.RGBA16I, WebGL2RenderingContext.RGBA32I, WebGL2RenderingContext.RGBA32UI, WebGL2RenderingContext.DEPTH_COMPONENT24, WebGL2RenderingContext.DEPTH_COMPONENT32F, WebGL2RenderingContext.DEPTH24_STENCIL8, WebGL2RenderingContext.DEPTH32F_STENCIL8, WEBGL_color_buffer_float.RGBA32F_EXT, WebGL2RenderingContext.R16F, WebGL2RenderingContext.RG16F, WebGL2RenderingContext.RGBA16F, WebGL2RenderingContext.R32F, WebGL2RenderingContext.RG32F, WebGL2RenderingContext.RGBA32F, WebGL2RenderingContext.R11F_G11F_B10F, EXT_color_buffer_half_float.RGBA16F_EXT, EXT_color_buffer_half_float.RGBA16F_EXT, EXT_texture_norm16.R16_EXT, EXT_texture_norm16.RG16_EXT, EXT_texture_norm16.RGBA16_EXT] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.RGBA4 == value || WebGL2RenderingContext.RGB565 == value || WebGL2RenderingContext.RGB5_A1 == value || WebGL2RenderingContext.DEPTH_COMPONENT16 == value || WebGL2RenderingContext.STENCIL_INDEX8 == value || WebGL2RenderingContext.DEPTH_STENCIL == value || WebGL2RenderingContext.R8 == value || WebGL2RenderingContext.R8UI == value || WebGL2RenderingContext.R8I == value || WebGL2RenderingContext.R16UI == value || WebGL2RenderingContext.R16I == value || WebGL2RenderingContext.R32UI == value || WebGL2RenderingContext.R32I == value || WebGL2RenderingContext.RG8 == value || WebGL2RenderingContext.RG8UI == value || WebGL2RenderingContext.RG8I == value || WebGL2RenderingContext.RG16UI == value || WebGL2RenderingContext.RG16I == value || WebGL2RenderingContext.RG32UI == value || WebGL2RenderingContext.RG32I == value || WebGL2RenderingContext.RGB8 == value || WebGL2RenderingContext.RGBA8 == value || WebGL2RenderingContext.SRGB8_ALPHA8 == value || WebGL2RenderingContext.RGB10_A2 == value || WebGL2RenderingContext.RGBA8UI == value || WebGL2RenderingContext.RGBA8I == value || WebGL2RenderingContext.RGB10_A2UI == value || WebGL2RenderingContext.RGBA16UI == value || WebGL2RenderingContext.RGBA16I == value || WebGL2RenderingContext.RGBA32I == value || WebGL2RenderingContext.RGBA32UI == value || WebGL2RenderingContext.DEPTH_COMPONENT24 == value || WebGL2RenderingContext.DEPTH_COMPONENT32F == value || WebGL2RenderingContext.DEPTH24_STENCIL8 == value || WebGL2RenderingContext.DEPTH32F_STENCIL8 == value || WEBGL_color_buffer_float.RGBA32F_EXT == value || WebGL2RenderingContext.R16F == value || WebGL2RenderingContext.RG16F == value || WebGL2RenderingContext.RGBA16F == value || WebGL2RenderingContext.R32F == value || WebGL2RenderingContext.RG32F == value || WebGL2RenderingContext.RGBA32F == value || WebGL2RenderingContext.R11F_G11F_B10F == value || EXT_color_buffer_half_float.RGBA16F_EXT == value || EXT_color_buffer_half_float.RGBA16F_EXT == value || EXT_texture_norm16.R16_EXT == value || EXT_texture_norm16.RG16_EXT == value || EXT_texture_norm16.RGBA16_EXT == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.RGBA4 == value ? "RGBA4" : WebGL2RenderingContext.RGB565 == value ? "RGB565" : WebGL2RenderingContext.RGB5_A1 == value ? "RGB5_A1" : WebGL2RenderingContext.DEPTH_COMPONENT16 == value ? "DEPTH_COMPONENT16" : WebGL2RenderingContext.STENCIL_INDEX8 == value ? "STENCIL_INDEX8" : WebGL2RenderingContext.DEPTH_STENCIL == value ? "DEPTH_STENCIL" : WebGL2RenderingContext.R8 == value ? "R8" : WebGL2RenderingContext.R8UI == value ? "R8UI" : WebGL2RenderingContext.R8I == value ? "R8I" : WebGL2RenderingContext.R16UI == value ? "R16UI" : WebGL2RenderingContext.R16I == value ? "R16I" : WebGL2RenderingContext.R32UI == value ? "R32UI" : WebGL2RenderingContext.R32I == value ? "R32I" : WebGL2RenderingContext.RG8 == value ? "RG8" : WebGL2RenderingContext.RG8UI == value ? "RG8UI" : WebGL2RenderingContext.RG8I == value ? "RG8I" : WebGL2RenderingContext.RG16UI == value ? "RG16UI" : WebGL2RenderingContext.RG16I == value ? "RG16I" : WebGL2RenderingContext.RG32UI == value ? "RG32UI" : WebGL2RenderingContext.RG32I == value ? "RG32I" : WebGL2RenderingContext.RGB8 == value ? "RGB8" : WebGL2RenderingContext.RGBA8 == value ? "RGBA8" : WebGL2RenderingContext.SRGB8_ALPHA8 == value ? "SRGB8_ALPHA8" : WebGL2RenderingContext.RGB10_A2 == value ? "RGB10_A2" : WebGL2RenderingContext.RGBA8UI == value ? "RGBA8UI" : WebGL2RenderingContext.RGBA8I == value ? "RGBA8I" : WebGL2RenderingContext.RGB10_A2UI == value ? "RGB10_A2UI" : WebGL2RenderingContext.RGBA16UI == value ? "RGBA16UI" : WebGL2RenderingContext.RGBA16I == value ? "RGBA16I" : WebGL2RenderingContext.RGBA32I == value ? "RGBA32I" : WebGL2RenderingContext.RGBA32UI == value ? "RGBA32UI" : WebGL2RenderingContext.DEPTH_COMPONENT24 == value ? "DEPTH_COMPONENT24" : WebGL2RenderingContext.DEPTH_COMPONENT32F == value ? "DEPTH_COMPONENT32F" : WebGL2RenderingContext.DEPTH24_STENCIL8 == value ? "DEPTH24_STENCIL8" : WebGL2RenderingContext.DEPTH32F_STENCIL8 == value ? "DEPTH32F_STENCIL8" : WEBGL_color_buffer_float.RGBA32F_EXT == value ? "RGBA32F_EXT" : WebGL2RenderingContext.R16F == value ? "R16F" : WebGL2RenderingContext.RG16F == value ? "RG16F" : WebGL2RenderingContext.RGBA16F == value ? "RGBA16F" : WebGL2RenderingContext.R32F == value ? "R32F" : WebGL2RenderingContext.RG32F == value ? "RG32F" : WebGL2RenderingContext.RGBA32F == value ? "RGBA32F" : WebGL2RenderingContext.R11F_G11F_B10F == value ? "R11F_G11F_B10F" : EXT_color_buffer_half_float.RGBA16F_EXT == value ? "RGBA16F_EXT" : EXT_color_buffer_half_float.RGBA16F_EXT == value ? "RGBA16F_EXT" : EXT_texture_norm16.R16_EXT == value ? "R16_EXT" : EXT_texture_norm16.RG16_EXT == value ? "RG16_EXT" : EXT_texture_norm16.RGBA16_EXT == value ? "RGBA16_EXT" : "Unknown value " + value;
    }
  }
}
