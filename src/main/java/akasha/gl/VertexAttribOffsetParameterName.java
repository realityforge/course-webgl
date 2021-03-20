package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = WebGL2RenderingContext.VERTEX_ATTRIB_ARRAY_POINTER
)
public @interface VertexAttribOffsetParameterName {
  final class Util {
    private Util() {
    }

    @VertexAttribOffsetParameterName
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@VertexAttribOffsetParameterName annotated value must be one of [WebGL2RenderingContext.VERTEX_ATTRIB_ARRAY_POINTER] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.VERTEX_ATTRIB_ARRAY_POINTER == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.VERTEX_ATTRIB_ARRAY_POINTER == value ? "VERTEX_ATTRIB_ARRAY_POINTER" : "Unknown value " + value;
    }
  }
}
