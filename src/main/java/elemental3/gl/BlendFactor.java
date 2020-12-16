package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.ZERO,
        WebGL2RenderingContext.ONE,
        WebGL2RenderingContext.SRC_COLOR,
        WebGL2RenderingContext.DST_COLOR,
        WebGL2RenderingContext.ONE_MINUS_DST_COLOR,
        WebGL2RenderingContext.SRC_ALPHA,
        WebGL2RenderingContext.ONE_MINUS_SRC_ALPHA,
        WebGL2RenderingContext.DST_ALPHA,
        WebGL2RenderingContext.ONE_MINUS_DST_ALPHA,
        WebGL2RenderingContext.CONSTANT_COLOR,
        WebGL2RenderingContext.ONE_MINUS_CONSTANT_COLOR,
        WebGL2RenderingContext.CONSTANT_ALPHA,
        WebGL2RenderingContext.ONE_MINUS_CONSTANT_ALPHA,
        WebGL2RenderingContext.SRC_ALPHA_SATURATE
    }
)
public @interface BlendFactor {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.ZERO == value || WebGL2RenderingContext.ONE == value || WebGL2RenderingContext.SRC_COLOR == value || WebGL2RenderingContext.DST_COLOR == value || WebGL2RenderingContext.ONE_MINUS_DST_COLOR == value || WebGL2RenderingContext.SRC_ALPHA == value || WebGL2RenderingContext.ONE_MINUS_SRC_ALPHA == value || WebGL2RenderingContext.DST_ALPHA == value || WebGL2RenderingContext.ONE_MINUS_DST_ALPHA == value || WebGL2RenderingContext.CONSTANT_COLOR == value || WebGL2RenderingContext.ONE_MINUS_CONSTANT_COLOR == value || WebGL2RenderingContext.CONSTANT_ALPHA == value || WebGL2RenderingContext.ONE_MINUS_CONSTANT_ALPHA == value || WebGL2RenderingContext.SRC_ALPHA_SATURATE == value;
    }
  }
}
