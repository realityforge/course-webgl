package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
        WebGL2RenderingContext.TEXTURE_MAX_LEVEL,
        WebGL2RenderingContext.TEXTURE_MAX_LOD,
        WebGL2RenderingContext.TEXTURE_MIN_LOD,
        WebGL2RenderingContext.TEXTURE_WRAP_R
    }
)
public @interface TextureParameter {
  final class Validator {
    private Validator() {
    }

    @TextureParameter
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@TextureParameter annotated value must be one of [WebGL2RenderingContext.TEXTURE_MAG_FILTER, WebGL2RenderingContext.TEXTURE_MIN_FILTER, WebGL2RenderingContext.TEXTURE_WRAP_S, WebGL2RenderingContext.TEXTURE_WRAP_T, EXT_texture_filter_anisotropic.TEXTURE_MAX_ANISOTROPY_EXT, WebGL2RenderingContext.TEXTURE_BASE_LEVEL, WebGL2RenderingContext.TEXTURE_COMPARE_FUNC, WebGL2RenderingContext.TEXTURE_COMPARE_MODE, WebGL2RenderingContext.TEXTURE_MAX_LEVEL, WebGL2RenderingContext.TEXTURE_MAX_LOD, WebGL2RenderingContext.TEXTURE_MIN_LOD, WebGL2RenderingContext.TEXTURE_WRAP_R] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.TEXTURE_MAG_FILTER == value || WebGL2RenderingContext.TEXTURE_MIN_FILTER == value || WebGL2RenderingContext.TEXTURE_WRAP_S == value || WebGL2RenderingContext.TEXTURE_WRAP_T == value || EXT_texture_filter_anisotropic.TEXTURE_MAX_ANISOTROPY_EXT == value || WebGL2RenderingContext.TEXTURE_BASE_LEVEL == value || WebGL2RenderingContext.TEXTURE_COMPARE_FUNC == value || WebGL2RenderingContext.TEXTURE_COMPARE_MODE == value || WebGL2RenderingContext.TEXTURE_MAX_LEVEL == value || WebGL2RenderingContext.TEXTURE_MAX_LOD == value || WebGL2RenderingContext.TEXTURE_MIN_LOD == value || WebGL2RenderingContext.TEXTURE_WRAP_R == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.TEXTURE_MAG_FILTER == value ? "TEXTURE_MAG_FILTER" : WebGL2RenderingContext.TEXTURE_MIN_FILTER == value ? "TEXTURE_MIN_FILTER" : WebGL2RenderingContext.TEXTURE_WRAP_S == value ? "TEXTURE_WRAP_S" : WebGL2RenderingContext.TEXTURE_WRAP_T == value ? "TEXTURE_WRAP_T" : EXT_texture_filter_anisotropic.TEXTURE_MAX_ANISOTROPY_EXT == value ? "TEXTURE_MAX_ANISOTROPY_EXT" : WebGL2RenderingContext.TEXTURE_BASE_LEVEL == value ? "TEXTURE_BASE_LEVEL" : WebGL2RenderingContext.TEXTURE_COMPARE_FUNC == value ? "TEXTURE_COMPARE_FUNC" : WebGL2RenderingContext.TEXTURE_COMPARE_MODE == value ? "TEXTURE_COMPARE_MODE" : WebGL2RenderingContext.TEXTURE_MAX_LEVEL == value ? "TEXTURE_MAX_LEVEL" : WebGL2RenderingContext.TEXTURE_MAX_LOD == value ? "TEXTURE_MAX_LOD" : WebGL2RenderingContext.TEXTURE_MIN_LOD == value ? "TEXTURE_MIN_LOD" : WebGL2RenderingContext.TEXTURE_WRAP_R == value ? "TEXTURE_WRAP_R" : "Unknown value " + value;
    }
  }
}
