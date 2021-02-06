package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.TEXTURE_3D,
        WebGL2RenderingContext.TEXTURE_2D_ARRAY
    }
)
public @interface Texture3DTargetType {
  final class Validator {
    private Validator() {
    }

    @Texture3DTargetType
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@Texture3DTargetType annotated value must be one of [WebGL2RenderingContext.TEXTURE_3D, WebGL2RenderingContext.TEXTURE_2D_ARRAY] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.TEXTURE_3D == value || WebGL2RenderingContext.TEXTURE_2D_ARRAY == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.TEXTURE_3D == value ? "TEXTURE_3D" : WebGL2RenderingContext.TEXTURE_2D_ARRAY == value ? "TEXTURE_2D_ARRAY" : "Unknown value " + value;
    }
  }
}
