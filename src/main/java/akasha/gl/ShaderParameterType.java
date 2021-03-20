package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.SHADER_TYPE,
        WebGL2RenderingContext.DELETE_STATUS,
        WebGL2RenderingContext.COMPILE_STATUS
    }
)
public @interface ShaderParameterType {
  final class Util {
    private Util() {
    }

    @ShaderParameterType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@ShaderParameterType annotated value must be one of [WebGL2RenderingContext.DELETE_STATUS, WebGL2RenderingContext.COMPILE_STATUS, WebGL2RenderingContext.SHADER_TYPE] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.DELETE_STATUS == value || WebGL2RenderingContext.COMPILE_STATUS == value || WebGL2RenderingContext.SHADER_TYPE == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.DELETE_STATUS == value ? "DELETE_STATUS" : WebGL2RenderingContext.COMPILE_STATUS == value ? "COMPILE_STATUS" : WebGL2RenderingContext.SHADER_TYPE == value ? "SHADER_TYPE" : "Unknown value " + value;
    }
  }
}
