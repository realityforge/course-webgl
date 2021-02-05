package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.REPEAT,
        WebGL2RenderingContext.CLAMP_TO_EDGE,
        WebGL2RenderingContext.MIRRORED_REPEAT
    }
)
public @interface TextureWrapMode {
  final class Validator {
    private Validator() {
    }

    @TextureWrapMode
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@TextureWrapMode annotated value must be one of [WebGL2RenderingContext.REPEAT, WebGL2RenderingContext.CLAMP_TO_EDGE, WebGL2RenderingContext.MIRRORED_REPEAT] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.REPEAT == value || WebGL2RenderingContext.CLAMP_TO_EDGE == value || WebGL2RenderingContext.MIRRORED_REPEAT == value;
    }
  }
}
