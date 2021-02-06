package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.NONE,
        WebGL2RenderingContext.COMPARE_REF_TO_TEXTURE
    }
)
public @interface TextureComparisonMode {
  final class Validator {
    private Validator() {
    }

    @TextureComparisonMode
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@TextureComparisonMode annotated value must be one of [WebGL2RenderingContext.NONE, WebGL2RenderingContext.COMPARE_REF_TO_TEXTURE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.NONE == value || WebGL2RenderingContext.COMPARE_REF_TO_TEXTURE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.NONE == value ? "NONE" : WebGL2RenderingContext.COMPARE_REF_TO_TEXTURE == value ? "COMPARE_REF_TO_TEXTURE" : "Unknown value " + value;
    }
  }
}
