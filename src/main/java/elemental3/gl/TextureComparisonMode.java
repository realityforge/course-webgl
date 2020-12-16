package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
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

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.NONE == value || WebGL2RenderingContext.COMPARE_REF_TO_TEXTURE == value;
    }
  }
}
