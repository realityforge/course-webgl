package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.UNSIGNED_BYTE,
        WebGL2RenderingContext.UNSIGNED_SHORT,
        WebGL2RenderingContext.UNSIGNED_SHORT_5_6_5,
        WebGL2RenderingContext.UNSIGNED_SHORT_4_4_4_4,
        WebGL2RenderingContext.UNSIGNED_SHORT_5_5_5_1,
        WebGL2RenderingContext.BYTE,
        WebGL2RenderingContext.SHORT,
        WebGL2RenderingContext.UNSIGNED_INT,
        WEBGL_depth_texture.UNSIGNED_INT_24_8_WEBGL,
        WebGL2RenderingContext.INT,
        WebGL2RenderingContext.HALF_FLOAT,
        OES_texture_half_float.HALF_FLOAT_OES,
        WebGL2RenderingContext.FLOAT,
        WebGL2RenderingContext.UNSIGNED_INT_2_10_10_10_REV,
        WebGL2RenderingContext.UNSIGNED_INT_10F_11F_11F_REV,
        WebGL2RenderingContext.UNSIGNED_INT_5_9_9_9_REV,
        WebGL2RenderingContext.UNSIGNED_INT_24_8,
        WebGL2RenderingContext.FLOAT_32_UNSIGNED_INT_24_8_REV
    }
)
public @interface TexelDataType {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.UNSIGNED_BYTE == value || WebGL2RenderingContext.UNSIGNED_SHORT == value || WebGL2RenderingContext.UNSIGNED_SHORT_5_6_5 == value || WebGL2RenderingContext.UNSIGNED_SHORT_4_4_4_4 == value || WebGL2RenderingContext.UNSIGNED_SHORT_5_5_5_1 == value || WebGL2RenderingContext.BYTE == value || WebGL2RenderingContext.SHORT == value || WebGL2RenderingContext.UNSIGNED_INT == value || WEBGL_depth_texture.UNSIGNED_INT_24_8_WEBGL == value || WebGL2RenderingContext.INT == value || WebGL2RenderingContext.HALF_FLOAT == value || OES_texture_half_float.HALF_FLOAT_OES == value || WebGL2RenderingContext.FLOAT == value || WebGL2RenderingContext.UNSIGNED_INT_2_10_10_10_REV == value || WebGL2RenderingContext.UNSIGNED_INT_10F_11F_11F_REV == value || WebGL2RenderingContext.UNSIGNED_INT_5_9_9_9_REV == value || WebGL2RenderingContext.UNSIGNED_INT_24_8 == value || WebGL2RenderingContext.FLOAT_32_UNSIGNED_INT_24_8_REV == value;
    }
  }
}
