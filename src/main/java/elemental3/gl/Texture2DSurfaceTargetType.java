package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.TEXTURE_2D,
        WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X,
        WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X,
        WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y,
        WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y,
        WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z,
        WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z
    }
)
public @interface Texture2DSurfaceTargetType {
  final class Validator {
    private Validator() {
    }

    @Texture2DSurfaceTargetType
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@Texture2DSurfaceTargetType annotated value must be one of [WebGL2RenderingContext.TEXTURE_2D, WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X, WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X, WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y, WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y, WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z, WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.TEXTURE_2D == value || WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X == value || WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X == value || WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y == value || WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y == value || WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z == value || WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.TEXTURE_2D == value ? "TEXTURE_2D" : WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X == value ? "TEXTURE_CUBE_MAP_POSITIVE_X" : WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X == value ? "TEXTURE_CUBE_MAP_NEGATIVE_X" : WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y == value ? "TEXTURE_CUBE_MAP_POSITIVE_Y" : WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y == value ? "TEXTURE_CUBE_MAP_NEGATIVE_Y" : WebGL2RenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z == value ? "TEXTURE_CUBE_MAP_POSITIVE_Z" : WebGL2RenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z == value ? "TEXTURE_CUBE_MAP_NEGATIVE_Z" : "Unknown value " + value;
    }
  }
}
