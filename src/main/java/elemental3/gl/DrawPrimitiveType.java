package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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

    @DrawPrimitiveType
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@DrawPrimitiveType annotated value must be one of [WebGL2RenderingContext.POINTS, WebGL2RenderingContext.LINE_STRIP, WebGL2RenderingContext.LINE_LOOP, WebGL2RenderingContext.LINES, WebGL2RenderingContext.TRIANGLE_STRIP, WebGL2RenderingContext.TRIANGLE_FAN, WebGL2RenderingContext.TRIANGLES] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.POINTS == value || WebGL2RenderingContext.LINE_STRIP == value || WebGL2RenderingContext.LINE_LOOP == value || WebGL2RenderingContext.LINES == value || WebGL2RenderingContext.TRIANGLE_STRIP == value || WebGL2RenderingContext.TRIANGLE_FAN == value || WebGL2RenderingContext.TRIANGLES == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.POINTS == value ? "POINTS" : WebGL2RenderingContext.LINE_STRIP == value ? "LINE_STRIP" : WebGL2RenderingContext.LINE_LOOP == value ? "LINE_LOOP" : WebGL2RenderingContext.LINES == value ? "LINES" : WebGL2RenderingContext.TRIANGLE_STRIP == value ? "TRIANGLE_STRIP" : WebGL2RenderingContext.TRIANGLE_FAN == value ? "TRIANGLE_FAN" : WebGL2RenderingContext.TRIANGLES == value ? "TRIANGLES" : "Unknown value " + value;
    }
  }
}
