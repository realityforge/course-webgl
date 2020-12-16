package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
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

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.LEQUAL == value || WebGL2RenderingContext.GEQUAL == value || WebGL2RenderingContext.LESS == value || WebGL2RenderingContext.GREATER == value || WebGL2RenderingContext.EQUAL == value || WebGL2RenderingContext.NOTEQUAL == value || WebGL2RenderingContext.ALWAYS == value || WebGL2RenderingContext.NEVER == value;
    }
  }
}
