package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.TEXTURE_3D,
        WebGL2RenderingContext.TEXTURE_2D_ARRAY
    }
)
public @interface Texture3DTargetType {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.TEXTURE_3D == value || WebGL2RenderingContext.TEXTURE_2D_ARRAY == value;
    }
  }
}
