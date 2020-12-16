package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.RGB,
        WebGL2RenderingContext.RGBA,
        WebGL2RenderingContext.LUMINANCE_ALPHA,
        WebGL2RenderingContext.LUMINANCE,
        WebGL2RenderingContext.ALPHA,
        WebGL2RenderingContext.R8,
        WebGL2RenderingContext.R8_SNORM,
        WebGL2RenderingContext.R16F,
        WebGL2RenderingContext.R32F,
        WebGL2RenderingContext.R8UI,
        WebGL2RenderingContext.R8I,
        WebGL2RenderingContext.R16UI,
        WebGL2RenderingContext.R16I,
        WebGL2RenderingContext.R32UI,
        WebGL2RenderingContext.R32I,
        WebGL2RenderingContext.RG8,
        WebGL2RenderingContext.RG8_SNORM,
        WebGL2RenderingContext.RG16F,
        WebGL2RenderingContext.RG32F,
        WebGL2RenderingContext.RG8UI,
        WebGL2RenderingContext.RG8I,
        WebGL2RenderingContext.RG16UI,
        WebGL2RenderingContext.RG16I,
        WebGL2RenderingContext.RG32UI,
        WebGL2RenderingContext.RG32I,
        WebGL2RenderingContext.RGB8,
        WebGL2RenderingContext.SRGB8,
        WebGL2RenderingContext.RGB565,
        WebGL2RenderingContext.RGB8_SNORM,
        WebGL2RenderingContext.R11F_G11F_B10F,
        WebGL2RenderingContext.RGB9_E5,
        WebGL2RenderingContext.RGB16F,
        WebGL2RenderingContext.RGB32F,
        WebGL2RenderingContext.RGB8UI,
        WebGL2RenderingContext.RGB8I,
        WebGL2RenderingContext.RGB16UI,
        WebGL2RenderingContext.RGB16I,
        WebGL2RenderingContext.RGB32UI,
        WebGL2RenderingContext.RGB32I,
        WebGL2RenderingContext.RGBA8,
        WebGL2RenderingContext.SRGB8_ALPHA8,
        WebGL2RenderingContext.RGBA8_SNORM,
        WebGL2RenderingContext.RGB5_A1,
        WebGL2RenderingContext.RGBA4,
        WebGL2RenderingContext.RGB10_A2,
        WebGL2RenderingContext.RGBA16F,
        WebGL2RenderingContext.RGBA32F,
        WebGL2RenderingContext.RGBA8UI,
        WebGL2RenderingContext.RGBA8I,
        WebGL2RenderingContext.RGB10_A2UI,
        WebGL2RenderingContext.RGBA16UI,
        WebGL2RenderingContext.RGBA16I,
        WebGL2RenderingContext.RGBA32I,
        WebGL2RenderingContext.RGBA32UI,
        WebGL2RenderingContext.DEPTH_COMPONENT16,
        WebGL2RenderingContext.DEPTH_COMPONENT24,
        WebGL2RenderingContext.DEPTH_COMPONENT32F,
        WebGL2RenderingContext.DEPTH24_STENCIL8,
        EXT_sRGB.SRGB_EXT,
        EXT_sRGB.SRGB_ALPHA_EXT
    }
)
public @interface TextureInternalFormat {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.RGB == value || WebGL2RenderingContext.RGBA == value || WebGL2RenderingContext.LUMINANCE_ALPHA == value || WebGL2RenderingContext.LUMINANCE == value || WebGL2RenderingContext.ALPHA == value || WebGL2RenderingContext.R8 == value || WebGL2RenderingContext.R8_SNORM == value || WebGL2RenderingContext.R16F == value || WebGL2RenderingContext.R32F == value || WebGL2RenderingContext.R8UI == value || WebGL2RenderingContext.R8I == value || WebGL2RenderingContext.R16UI == value || WebGL2RenderingContext.R16I == value || WebGL2RenderingContext.R32UI == value || WebGL2RenderingContext.R32I == value || WebGL2RenderingContext.RG8 == value || WebGL2RenderingContext.RG8_SNORM == value || WebGL2RenderingContext.RG16F == value || WebGL2RenderingContext.RG32F == value || WebGL2RenderingContext.RG8UI == value || WebGL2RenderingContext.RG8I == value || WebGL2RenderingContext.RG16UI == value || WebGL2RenderingContext.RG16I == value || WebGL2RenderingContext.RG32UI == value || WebGL2RenderingContext.RG32I == value || WebGL2RenderingContext.RGB8 == value || WebGL2RenderingContext.SRGB8 == value || WebGL2RenderingContext.RGB565 == value || WebGL2RenderingContext.RGB8_SNORM == value || WebGL2RenderingContext.R11F_G11F_B10F == value || WebGL2RenderingContext.RGB9_E5 == value || WebGL2RenderingContext.RGB16F == value || WebGL2RenderingContext.RGB32F == value || WebGL2RenderingContext.RGB8UI == value || WebGL2RenderingContext.RGB8I == value || WebGL2RenderingContext.RGB16UI == value || WebGL2RenderingContext.RGB16I == value || WebGL2RenderingContext.RGB32UI == value || WebGL2RenderingContext.RGB32I == value || WebGL2RenderingContext.RGBA8 == value || WebGL2RenderingContext.SRGB8_ALPHA8 == value || WebGL2RenderingContext.RGBA8_SNORM == value || WebGL2RenderingContext.RGB5_A1 == value || WebGL2RenderingContext.RGBA4 == value || WebGL2RenderingContext.RGB10_A2 == value || WebGL2RenderingContext.RGBA16F == value || WebGL2RenderingContext.RGBA32F == value || WebGL2RenderingContext.RGBA8UI == value || WebGL2RenderingContext.RGBA8I == value || WebGL2RenderingContext.RGB10_A2UI == value || WebGL2RenderingContext.RGBA16UI == value || WebGL2RenderingContext.RGBA16I == value || WebGL2RenderingContext.RGBA32I == value || WebGL2RenderingContext.RGBA32UI == value || WebGL2RenderingContext.DEPTH_COMPONENT16 == value || WebGL2RenderingContext.DEPTH_COMPONENT24 == value || WebGL2RenderingContext.DEPTH_COMPONENT32F == value || WebGL2RenderingContext.DEPTH24_STENCIL8 == value || EXT_sRGB.SRGB_EXT == value || EXT_sRGB.SRGB_ALPHA_EXT == value;
    }
  }
}
