package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.TEXTURE_MAG_FILTER,
        WebGL2RenderingContext.TEXTURE_MIN_FILTER,
        WebGL2RenderingContext.TEXTURE_WRAP_S,
        WebGL2RenderingContext.TEXTURE_WRAP_T,
        EXT_texture_filter_anisotropic.TEXTURE_MAX_ANISOTROPY_EXT,
        WebGL2RenderingContext.TEXTURE_BASE_LEVEL,
        WebGL2RenderingContext.TEXTURE_COMPARE_FUNC,
        WebGL2RenderingContext.TEXTURE_COMPARE_MODE,
        WebGL2RenderingContext.TEXTURE_IMMUTABLE_FORMAT,
        WebGL2RenderingContext.TEXTURE_IMMUTABLE_LEVELS,
        WebGL2RenderingContext.TEXTURE_MAX_LEVEL,
        WebGL2RenderingContext.TEXTURE_MAX_LOD,
        WebGL2RenderingContext.TEXTURE_MIN_LOD,
        WebGL2RenderingContext.TEXTURE_WRAP_R
    }
)
public @interface ReadableTextureParameter {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.TEXTURE_MAG_FILTER == value || WebGL2RenderingContext.TEXTURE_MIN_FILTER == value || WebGL2RenderingContext.TEXTURE_WRAP_S == value || WebGL2RenderingContext.TEXTURE_WRAP_T == value || EXT_texture_filter_anisotropic.TEXTURE_MAX_ANISOTROPY_EXT == value || WebGL2RenderingContext.TEXTURE_BASE_LEVEL == value || WebGL2RenderingContext.TEXTURE_COMPARE_FUNC == value || WebGL2RenderingContext.TEXTURE_COMPARE_MODE == value || WebGL2RenderingContext.TEXTURE_IMMUTABLE_FORMAT == value || WebGL2RenderingContext.TEXTURE_IMMUTABLE_LEVELS == value || WebGL2RenderingContext.TEXTURE_MAX_LEVEL == value || WebGL2RenderingContext.TEXTURE_MAX_LOD == value || WebGL2RenderingContext.TEXTURE_MIN_LOD == value || WebGL2RenderingContext.TEXTURE_WRAP_R == value;
    }
  }
}
