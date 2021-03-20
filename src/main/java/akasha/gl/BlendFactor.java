package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.ZERO,
        WebGL2RenderingContext.ONE,
        WebGL2RenderingContext.SRC_COLOR,
        WebGL2RenderingContext.SRC_ALPHA,
        WebGL2RenderingContext.ONE_MINUS_SRC_ALPHA,
        WebGL2RenderingContext.DST_ALPHA,
        WebGL2RenderingContext.ONE_MINUS_DST_ALPHA,
        WebGL2RenderingContext.DST_COLOR,
        WebGL2RenderingContext.ONE_MINUS_DST_COLOR,
        WebGL2RenderingContext.SRC_ALPHA_SATURATE,
        WebGL2RenderingContext.CONSTANT_COLOR,
        WebGL2RenderingContext.ONE_MINUS_CONSTANT_COLOR,
        WebGL2RenderingContext.CONSTANT_ALPHA,
        WebGL2RenderingContext.ONE_MINUS_CONSTANT_ALPHA
    }
)
public @interface BlendFactor {
  final class Util {
    private Util() {
    }

    @BlendFactor
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@BlendFactor annotated value must be one of [WebGL2RenderingContext.ZERO, WebGL2RenderingContext.ONE, WebGL2RenderingContext.SRC_COLOR, WebGL2RenderingContext.DST_COLOR, WebGL2RenderingContext.ONE_MINUS_DST_COLOR, WebGL2RenderingContext.SRC_ALPHA, WebGL2RenderingContext.ONE_MINUS_SRC_ALPHA, WebGL2RenderingContext.DST_ALPHA, WebGL2RenderingContext.ONE_MINUS_DST_ALPHA, WebGL2RenderingContext.CONSTANT_COLOR, WebGL2RenderingContext.ONE_MINUS_CONSTANT_COLOR, WebGL2RenderingContext.CONSTANT_ALPHA, WebGL2RenderingContext.ONE_MINUS_CONSTANT_ALPHA, WebGL2RenderingContext.SRC_ALPHA_SATURATE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.ZERO == value || WebGL2RenderingContext.ONE == value || WebGL2RenderingContext.SRC_COLOR == value || WebGL2RenderingContext.DST_COLOR == value || WebGL2RenderingContext.ONE_MINUS_DST_COLOR == value || WebGL2RenderingContext.SRC_ALPHA == value || WebGL2RenderingContext.ONE_MINUS_SRC_ALPHA == value || WebGL2RenderingContext.DST_ALPHA == value || WebGL2RenderingContext.ONE_MINUS_DST_ALPHA == value || WebGL2RenderingContext.CONSTANT_COLOR == value || WebGL2RenderingContext.ONE_MINUS_CONSTANT_COLOR == value || WebGL2RenderingContext.CONSTANT_ALPHA == value || WebGL2RenderingContext.ONE_MINUS_CONSTANT_ALPHA == value || WebGL2RenderingContext.SRC_ALPHA_SATURATE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.ZERO == value ? "ZERO" : WebGL2RenderingContext.ONE == value ? "ONE" : WebGL2RenderingContext.SRC_COLOR == value ? "SRC_COLOR" : WebGL2RenderingContext.DST_COLOR == value ? "DST_COLOR" : WebGL2RenderingContext.ONE_MINUS_DST_COLOR == value ? "ONE_MINUS_DST_COLOR" : WebGL2RenderingContext.SRC_ALPHA == value ? "SRC_ALPHA" : WebGL2RenderingContext.ONE_MINUS_SRC_ALPHA == value ? "ONE_MINUS_SRC_ALPHA" : WebGL2RenderingContext.DST_ALPHA == value ? "DST_ALPHA" : WebGL2RenderingContext.ONE_MINUS_DST_ALPHA == value ? "ONE_MINUS_DST_ALPHA" : WebGL2RenderingContext.CONSTANT_COLOR == value ? "CONSTANT_COLOR" : WebGL2RenderingContext.ONE_MINUS_CONSTANT_COLOR == value ? "ONE_MINUS_CONSTANT_COLOR" : WebGL2RenderingContext.CONSTANT_ALPHA == value ? "CONSTANT_ALPHA" : WebGL2RenderingContext.ONE_MINUS_CONSTANT_ALPHA == value ? "ONE_MINUS_CONSTANT_ALPHA" : WebGL2RenderingContext.SRC_ALPHA_SATURATE == value ? "SRC_ALPHA_SATURATE" : "Unknown value " + value;
    }
  }
}
