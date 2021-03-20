package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.FRAGMENT_SHADER,
        WebGL2RenderingContext.VERTEX_SHADER
    }
)
public @interface ShaderType {
  final class Util {
    private Util() {
    }

    @ShaderType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@ShaderType annotated value must be one of [WebGL2RenderingContext.VERTEX_SHADER, WebGL2RenderingContext.FRAGMENT_SHADER] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.VERTEX_SHADER == value || WebGL2RenderingContext.FRAGMENT_SHADER == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.VERTEX_SHADER == value ? "VERTEX_SHADER" : WebGL2RenderingContext.FRAGMENT_SHADER == value ? "FRAGMENT_SHADER" : "Unknown value " + value;
    }
  }
}
