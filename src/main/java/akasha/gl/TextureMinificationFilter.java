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
        WebGL2RenderingContext.LINEAR,
        WebGL2RenderingContext.NEAREST_MIPMAP_NEAREST,
        WebGL2RenderingContext.LINEAR_MIPMAP_NEAREST,
        WebGL2RenderingContext.NEAREST_MIPMAP_LINEAR,
        WebGL2RenderingContext.LINEAR_MIPMAP_LINEAR
    }
)
public @interface TextureMinificationFilter {
  final class Util {
    private Util() {
    }

    @TextureMinificationFilter
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@TextureMinificationFilter annotated value must be one of [WebGL2RenderingContext.LINEAR, WebGL2RenderingContext.NEAREST, WebGL2RenderingContext.NEAREST_MIPMAP_NEAREST, WebGL2RenderingContext.LINEAR_MIPMAP_NEAREST, WebGL2RenderingContext.NEAREST_MIPMAP_LINEAR, WebGL2RenderingContext.LINEAR_MIPMAP_LINEAR] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.LINEAR == value || WebGL2RenderingContext.NEAREST == value || WebGL2RenderingContext.NEAREST_MIPMAP_NEAREST == value || WebGL2RenderingContext.LINEAR_MIPMAP_NEAREST == value || WebGL2RenderingContext.NEAREST_MIPMAP_LINEAR == value || WebGL2RenderingContext.LINEAR_MIPMAP_LINEAR == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.LINEAR == value ? "LINEAR" : WebGL2RenderingContext.NEAREST == value ? "NEAREST" : WebGL2RenderingContext.NEAREST_MIPMAP_NEAREST == value ? "NEAREST_MIPMAP_NEAREST" : WebGL2RenderingContext.LINEAR_MIPMAP_NEAREST == value ? "LINEAR_MIPMAP_NEAREST" : WebGL2RenderingContext.NEAREST_MIPMAP_LINEAR == value ? "NEAREST_MIPMAP_LINEAR" : WebGL2RenderingContext.LINEAR_MIPMAP_LINEAR == value ? "LINEAR_MIPMAP_LINEAR" : "Unknown value " + value;
    }
  }
}
