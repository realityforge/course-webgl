package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.POINTS,
        WebGL2RenderingContext.LINES,
        WebGL2RenderingContext.LINE_LOOP,
        WebGL2RenderingContext.LINE_STRIP,
        WebGL2RenderingContext.TRIANGLES,
        WebGL2RenderingContext.TRIANGLE_STRIP,
        WebGL2RenderingContext.TRIANGLE_FAN
    }
)
public @interface DrawMode {
  final class Util {
    private Util() {
    }

    @DrawMode
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@DrawMode annotated value must be one of [WebGL2RenderingContext.POINTS, WebGL2RenderingContext.LINE_STRIP, WebGL2RenderingContext.LINE_LOOP, WebGL2RenderingContext.LINES, WebGL2RenderingContext.TRIANGLE_STRIP, WebGL2RenderingContext.TRIANGLE_FAN, WebGL2RenderingContext.TRIANGLES] but is " + value;
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
