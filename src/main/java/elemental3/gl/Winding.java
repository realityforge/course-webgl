package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.CW,
        WebGL2RenderingContext.CCW
    }
)
public @interface Winding {
  final class Validator {
    private Validator() {
    }

    @Winding
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@Winding annotated value must be one of [WebGL2RenderingContext.CW, WebGL2RenderingContext.CCW] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.CW == value || WebGL2RenderingContext.CCW == value;
    }
  }
}
