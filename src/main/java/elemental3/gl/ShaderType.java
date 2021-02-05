package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.VERTEX_SHADER,
        WebGL2RenderingContext.FRAGMENT_SHADER
    }
)
public @interface ShaderType {
  final class Validator {
    private Validator() {
    }

    @ShaderType
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@ShaderType annotated value must be one of [WebGL2RenderingContext.VERTEX_SHADER, WebGL2RenderingContext.FRAGMENT_SHADER] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.VERTEX_SHADER == value || WebGL2RenderingContext.FRAGMENT_SHADER == value;
    }
  }
}
