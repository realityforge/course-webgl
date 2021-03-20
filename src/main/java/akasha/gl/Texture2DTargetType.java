package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.TEXTURE_2D,
        WebGL2RenderingContext.TEXTURE_CUBE_MAP
    }
)
public @interface Texture2DTargetType {
  final class Util {
    private Util() {
    }

    @Texture2DTargetType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@Texture2DTargetType annotated value must be one of [WebGL2RenderingContext.TEXTURE_2D, WebGL2RenderingContext.TEXTURE_CUBE_MAP] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.TEXTURE_2D == value || WebGL2RenderingContext.TEXTURE_CUBE_MAP == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.TEXTURE_2D == value ? "TEXTURE_2D" : WebGL2RenderingContext.TEXTURE_CUBE_MAP == value ? "TEXTURE_CUBE_MAP" : "Unknown value " + value;
    }
  }
}
