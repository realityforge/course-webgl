package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.LEQUAL,
        WebGL2RenderingContext.GEQUAL,
        WebGL2RenderingContext.LESS,
        WebGL2RenderingContext.GREATER,
        WebGL2RenderingContext.EQUAL,
        WebGL2RenderingContext.NOTEQUAL,
        WebGL2RenderingContext.ALWAYS,
        WebGL2RenderingContext.NEVER
    }
)
public @interface TextureComparisonFunction {
  final class Validator {
    private Validator() {
    }

    @TextureComparisonFunction
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@TextureComparisonFunction annotated value must be one of [WebGL2RenderingContext.LEQUAL, WebGL2RenderingContext.GEQUAL, WebGL2RenderingContext.LESS, WebGL2RenderingContext.GREATER, WebGL2RenderingContext.EQUAL, WebGL2RenderingContext.NOTEQUAL, WebGL2RenderingContext.ALWAYS, WebGL2RenderingContext.NEVER] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.LEQUAL == value || WebGL2RenderingContext.GEQUAL == value || WebGL2RenderingContext.LESS == value || WebGL2RenderingContext.GREATER == value || WebGL2RenderingContext.EQUAL == value || WebGL2RenderingContext.NOTEQUAL == value || WebGL2RenderingContext.ALWAYS == value || WebGL2RenderingContext.NEVER == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.LEQUAL == value ? "LEQUAL" : WebGL2RenderingContext.GEQUAL == value ? "GEQUAL" : WebGL2RenderingContext.LESS == value ? "LESS" : WebGL2RenderingContext.GREATER == value ? "GREATER" : WebGL2RenderingContext.EQUAL == value ? "EQUAL" : WebGL2RenderingContext.NOTEQUAL == value ? "NOTEQUAL" : WebGL2RenderingContext.ALWAYS == value ? "ALWAYS" : WebGL2RenderingContext.NEVER == value ? "NEVER" : "Unknown value " + value;
    }
  }
}
