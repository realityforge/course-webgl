package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.INT,
        WebGL2RenderingContext.UNSIGNED_INT,
        WebGL2RenderingContext.FLOAT,
        WebGL2RenderingContext.FLOAT_VEC2,
        WebGL2RenderingContext.FLOAT_VEC3,
        WebGL2RenderingContext.FLOAT_VEC4,
        WebGL2RenderingContext.INT_VEC2,
        WebGL2RenderingContext.INT_VEC3,
        WebGL2RenderingContext.INT_VEC4,
        WebGL2RenderingContext.BOOL,
        WebGL2RenderingContext.BOOL_VEC2,
        WebGL2RenderingContext.BOOL_VEC3,
        WebGL2RenderingContext.BOOL_VEC4,
        WebGL2RenderingContext.FLOAT_MAT2,
        WebGL2RenderingContext.FLOAT_MAT3,
        WebGL2RenderingContext.FLOAT_MAT4,
        WebGL2RenderingContext.FLOAT_MAT2x3,
        WebGL2RenderingContext.FLOAT_MAT2x4,
        WebGL2RenderingContext.FLOAT_MAT3x2,
        WebGL2RenderingContext.FLOAT_MAT3x4,
        WebGL2RenderingContext.FLOAT_MAT4x2,
        WebGL2RenderingContext.FLOAT_MAT4x3,
        WebGL2RenderingContext.UNSIGNED_INT_VEC2,
        WebGL2RenderingContext.UNSIGNED_INT_VEC3,
        WebGL2RenderingContext.UNSIGNED_INT_VEC4
    }
)
public @interface AttributeDataType {
  final class Util {
    private Util() {
    }

    @AttributeDataType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@AttributeDataType annotated value must be one of [WebGL2RenderingContext.FLOAT, WebGL2RenderingContext.FLOAT_VEC2, WebGL2RenderingContext.FLOAT_VEC3, WebGL2RenderingContext.FLOAT_VEC4, WebGL2RenderingContext.INT, WebGL2RenderingContext.INT_VEC2, WebGL2RenderingContext.INT_VEC3, WebGL2RenderingContext.INT_VEC4, WebGL2RenderingContext.BOOL, WebGL2RenderingContext.BOOL_VEC2, WebGL2RenderingContext.BOOL_VEC3, WebGL2RenderingContext.BOOL_VEC4, WebGL2RenderingContext.FLOAT_MAT2, WebGL2RenderingContext.FLOAT_MAT3, WebGL2RenderingContext.FLOAT_MAT4, WebGL2RenderingContext.UNSIGNED_INT, WebGL2RenderingContext.UNSIGNED_INT_VEC2, WebGL2RenderingContext.UNSIGNED_INT_VEC3, WebGL2RenderingContext.UNSIGNED_INT_VEC4, WebGL2RenderingContext.FLOAT_MAT2x3, WebGL2RenderingContext.FLOAT_MAT2x4, WebGL2RenderingContext.FLOAT_MAT3x2, WebGL2RenderingContext.FLOAT_MAT3x4, WebGL2RenderingContext.FLOAT_MAT4x2, WebGL2RenderingContext.FLOAT_MAT4x3] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.FLOAT == value || WebGL2RenderingContext.FLOAT_VEC2 == value || WebGL2RenderingContext.FLOAT_VEC3 == value || WebGL2RenderingContext.FLOAT_VEC4 == value || WebGL2RenderingContext.INT == value || WebGL2RenderingContext.INT_VEC2 == value || WebGL2RenderingContext.INT_VEC3 == value || WebGL2RenderingContext.INT_VEC4 == value || WebGL2RenderingContext.BOOL == value || WebGL2RenderingContext.BOOL_VEC2 == value || WebGL2RenderingContext.BOOL_VEC3 == value || WebGL2RenderingContext.BOOL_VEC4 == value || WebGL2RenderingContext.FLOAT_MAT2 == value || WebGL2RenderingContext.FLOAT_MAT3 == value || WebGL2RenderingContext.FLOAT_MAT4 == value || WebGL2RenderingContext.UNSIGNED_INT == value || WebGL2RenderingContext.UNSIGNED_INT_VEC2 == value || WebGL2RenderingContext.UNSIGNED_INT_VEC3 == value || WebGL2RenderingContext.UNSIGNED_INT_VEC4 == value || WebGL2RenderingContext.FLOAT_MAT2x3 == value || WebGL2RenderingContext.FLOAT_MAT2x4 == value || WebGL2RenderingContext.FLOAT_MAT3x2 == value || WebGL2RenderingContext.FLOAT_MAT3x4 == value || WebGL2RenderingContext.FLOAT_MAT4x2 == value || WebGL2RenderingContext.FLOAT_MAT4x3 == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.FLOAT == value ? "FLOAT" : WebGL2RenderingContext.FLOAT_VEC2 == value ? "FLOAT_VEC2" : WebGL2RenderingContext.FLOAT_VEC3 == value ? "FLOAT_VEC3" : WebGL2RenderingContext.FLOAT_VEC4 == value ? "FLOAT_VEC4" : WebGL2RenderingContext.INT == value ? "INT" : WebGL2RenderingContext.INT_VEC2 == value ? "INT_VEC2" : WebGL2RenderingContext.INT_VEC3 == value ? "INT_VEC3" : WebGL2RenderingContext.INT_VEC4 == value ? "INT_VEC4" : WebGL2RenderingContext.BOOL == value ? "BOOL" : WebGL2RenderingContext.BOOL_VEC2 == value ? "BOOL_VEC2" : WebGL2RenderingContext.BOOL_VEC3 == value ? "BOOL_VEC3" : WebGL2RenderingContext.BOOL_VEC4 == value ? "BOOL_VEC4" : WebGL2RenderingContext.FLOAT_MAT2 == value ? "FLOAT_MAT2" : WebGL2RenderingContext.FLOAT_MAT3 == value ? "FLOAT_MAT3" : WebGL2RenderingContext.FLOAT_MAT4 == value ? "FLOAT_MAT4" : WebGL2RenderingContext.UNSIGNED_INT == value ? "UNSIGNED_INT" : WebGL2RenderingContext.UNSIGNED_INT_VEC2 == value ? "UNSIGNED_INT_VEC2" : WebGL2RenderingContext.UNSIGNED_INT_VEC3 == value ? "UNSIGNED_INT_VEC3" : WebGL2RenderingContext.UNSIGNED_INT_VEC4 == value ? "UNSIGNED_INT_VEC4" : WebGL2RenderingContext.FLOAT_MAT2x3 == value ? "FLOAT_MAT2x3" : WebGL2RenderingContext.FLOAT_MAT2x4 == value ? "FLOAT_MAT2x4" : WebGL2RenderingContext.FLOAT_MAT3x2 == value ? "FLOAT_MAT3x2" : WebGL2RenderingContext.FLOAT_MAT3x4 == value ? "FLOAT_MAT3x4" : WebGL2RenderingContext.FLOAT_MAT4x2 == value ? "FLOAT_MAT4x2" : WebGL2RenderingContext.FLOAT_MAT4x3 == value ? "FLOAT_MAT4x3" : "Unknown value " + value;
    }
  }
}
