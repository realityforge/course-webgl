package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.NEAREST,
        WebGL2RenderingContext.LINEAR
    }
)
public @interface TextureMagnificationFilter {
  final class Util {
    private Util() {
    }

    @TextureMagnificationFilter
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@TextureMagnificationFilter annotated value must be one of [WebGL2RenderingContext.LINEAR, WebGL2RenderingContext.NEAREST] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.LINEAR == value || WebGL2RenderingContext.NEAREST == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.LINEAR == value ? "LINEAR" : WebGL2RenderingContext.NEAREST == value ? "NEAREST" : "Unknown value " + value;
    }
  }
}
