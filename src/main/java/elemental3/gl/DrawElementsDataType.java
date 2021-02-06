package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.UNSIGNED_BYTE,
        WebGL2RenderingContext.UNSIGNED_SHORT,
        WebGL2RenderingContext.UNSIGNED_INT
    }
)
public @interface DrawElementsDataType {
  final class Validator {
    private Validator() {
    }

    @DrawElementsDataType
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@DrawElementsDataType annotated value must be one of [WebGL2RenderingContext.UNSIGNED_BYTE, WebGL2RenderingContext.UNSIGNED_SHORT, WebGL2RenderingContext.UNSIGNED_INT] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.UNSIGNED_BYTE == value || WebGL2RenderingContext.UNSIGNED_SHORT == value || WebGL2RenderingContext.UNSIGNED_INT == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.UNSIGNED_BYTE == value ? "UNSIGNED_BYTE" : WebGL2RenderingContext.UNSIGNED_SHORT == value ? "UNSIGNED_SHORT" : WebGL2RenderingContext.UNSIGNED_INT == value ? "UNSIGNED_INT" : "Unknown value " + value;
    }
  }
}
