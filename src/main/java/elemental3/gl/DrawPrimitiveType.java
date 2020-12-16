package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.POINTS,
        WebGL2RenderingContext.LINE_STRIP,
        WebGL2RenderingContext.LINE_LOOP,
        WebGL2RenderingContext.LINES,
        WebGL2RenderingContext.TRIANGLE_STRIP,
        WebGL2RenderingContext.TRIANGLE_FAN,
        WebGL2RenderingContext.TRIANGLES
    }
)
public @interface DrawPrimitiveType {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.POINTS == value || WebGL2RenderingContext.LINE_STRIP == value || WebGL2RenderingContext.LINE_LOOP == value || WebGL2RenderingContext.LINES == value || WebGL2RenderingContext.TRIANGLE_STRIP == value || WebGL2RenderingContext.TRIANGLE_FAN == value || WebGL2RenderingContext.TRIANGLES == value;
    }
  }
}
