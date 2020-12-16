package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.LINEAR,
        WebGL2RenderingContext.NEAREST,
        WebGL2RenderingContext.NEAREST_MIPMAP_NEAREST,
        WebGL2RenderingContext.LINEAR_MIPMAP_NEAREST,
        WebGL2RenderingContext.NEAREST_MIPMAP_LINEAR,
        WebGL2RenderingContext.LINEAR_MIPMAP_LINEAR
    }
)
public @interface TextureMinificationFilter {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.LINEAR == value || WebGL2RenderingContext.NEAREST == value || WebGL2RenderingContext.NEAREST_MIPMAP_NEAREST == value || WebGL2RenderingContext.LINEAR_MIPMAP_NEAREST == value || WebGL2RenderingContext.NEAREST_MIPMAP_LINEAR == value || WebGL2RenderingContext.LINEAR_MIPMAP_LINEAR == value;
    }
  }
}
