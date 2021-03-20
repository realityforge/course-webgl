package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.BYTE,
        WebGL2RenderingContext.UNSIGNED_BYTE,
        WebGL2RenderingContext.SHORT,
        WebGL2RenderingContext.UNSIGNED_SHORT,
        WebGL2RenderingContext.INT,
        WebGL2RenderingContext.UNSIGNED_INT,
        WebGL2RenderingContext.FLOAT,
        WebGL2RenderingContext.HALF_FLOAT,
        WebGL2RenderingContext.UNSIGNED_SHORT_4_4_4_4,
        WebGL2RenderingContext.UNSIGNED_SHORT_5_5_5_1,
        WebGL2RenderingContext.UNSIGNED_SHORT_5_6_5,
        WebGL2RenderingContext.UNSIGNED_INT_2_10_10_10_REV,
        WEBGL_depth_texture.UNSIGNED_INT_24_8_WEBGL,
        WebGL2RenderingContext.UNSIGNED_INT_24_8,
        WebGL2RenderingContext.UNSIGNED_INT_10F_11F_11F_REV,
        WebGL2RenderingContext.UNSIGNED_INT_5_9_9_9_REV,
        WebGL2RenderingContext.FLOAT_32_UNSIGNED_INT_24_8_REV
    }
)
public @interface TexelDataType {
  final class Util {
    private Util() {
    }

    @TexelDataType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@TexelDataType annotated value must be one of [WebGL2RenderingContext.UNSIGNED_BYTE, WebGL2RenderingContext.UNSIGNED_SHORT, WebGL2RenderingContext.UNSIGNED_SHORT_5_6_5, WebGL2RenderingContext.UNSIGNED_SHORT_4_4_4_4, WebGL2RenderingContext.UNSIGNED_SHORT_5_5_5_1, WebGL2RenderingContext.BYTE, WebGL2RenderingContext.SHORT, WebGL2RenderingContext.UNSIGNED_INT, WEBGL_depth_texture.UNSIGNED_INT_24_8_WEBGL, WebGL2RenderingContext.INT, WebGL2RenderingContext.HALF_FLOAT, WebGL2RenderingContext.FLOAT, WebGL2RenderingContext.UNSIGNED_INT_2_10_10_10_REV, WebGL2RenderingContext.UNSIGNED_INT_10F_11F_11F_REV, WebGL2RenderingContext.UNSIGNED_INT_5_9_9_9_REV, WebGL2RenderingContext.UNSIGNED_INT_24_8, WebGL2RenderingContext.FLOAT_32_UNSIGNED_INT_24_8_REV] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.UNSIGNED_BYTE == value || WebGL2RenderingContext.UNSIGNED_SHORT == value || WebGL2RenderingContext.UNSIGNED_SHORT_5_6_5 == value || WebGL2RenderingContext.UNSIGNED_SHORT_4_4_4_4 == value || WebGL2RenderingContext.UNSIGNED_SHORT_5_5_5_1 == value || WebGL2RenderingContext.BYTE == value || WebGL2RenderingContext.SHORT == value || WebGL2RenderingContext.UNSIGNED_INT == value || WEBGL_depth_texture.UNSIGNED_INT_24_8_WEBGL == value || WebGL2RenderingContext.INT == value || WebGL2RenderingContext.HALF_FLOAT == value || WebGL2RenderingContext.FLOAT == value || WebGL2RenderingContext.UNSIGNED_INT_2_10_10_10_REV == value || WebGL2RenderingContext.UNSIGNED_INT_10F_11F_11F_REV == value || WebGL2RenderingContext.UNSIGNED_INT_5_9_9_9_REV == value || WebGL2RenderingContext.UNSIGNED_INT_24_8 == value || WebGL2RenderingContext.FLOAT_32_UNSIGNED_INT_24_8_REV == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.UNSIGNED_BYTE == value ? "UNSIGNED_BYTE" : WebGL2RenderingContext.UNSIGNED_SHORT == value ? "UNSIGNED_SHORT" : WebGL2RenderingContext.UNSIGNED_SHORT_5_6_5 == value ? "UNSIGNED_SHORT_5_6_5" : WebGL2RenderingContext.UNSIGNED_SHORT_4_4_4_4 == value ? "UNSIGNED_SHORT_4_4_4_4" : WebGL2RenderingContext.UNSIGNED_SHORT_5_5_5_1 == value ? "UNSIGNED_SHORT_5_5_5_1" : WebGL2RenderingContext.BYTE == value ? "BYTE" : WebGL2RenderingContext.SHORT == value ? "SHORT" : WebGL2RenderingContext.UNSIGNED_INT == value ? "UNSIGNED_INT" : WEBGL_depth_texture.UNSIGNED_INT_24_8_WEBGL == value ? "UNSIGNED_INT_24_8_WEBGL" : WebGL2RenderingContext.INT == value ? "INT" : WebGL2RenderingContext.HALF_FLOAT == value ? "HALF_FLOAT" : WebGL2RenderingContext.FLOAT == value ? "FLOAT" : WebGL2RenderingContext.UNSIGNED_INT_2_10_10_10_REV == value ? "UNSIGNED_INT_2_10_10_10_REV" : WebGL2RenderingContext.UNSIGNED_INT_10F_11F_11F_REV == value ? "UNSIGNED_INT_10F_11F_11F_REV" : WebGL2RenderingContext.UNSIGNED_INT_5_9_9_9_REV == value ? "UNSIGNED_INT_5_9_9_9_REV" : WebGL2RenderingContext.UNSIGNED_INT_24_8 == value ? "UNSIGNED_INT_24_8" : WebGL2RenderingContext.FLOAT_32_UNSIGNED_INT_24_8_REV == value ? "FLOAT_32_UNSIGNED_INT_24_8_REV" : "Unknown value " + value;
    }
  }
}
