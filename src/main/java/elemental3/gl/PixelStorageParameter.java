package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.PACK_ALIGNMENT,
        WebGL2RenderingContext.UNPACK_ALIGNMENT,
        WebGL2RenderingContext.UNPACK_FLIP_Y_WEBGL,
        WebGL2RenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL,
        WebGL2RenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL,
        WebGL2RenderingContext.PACK_ROW_LENGTH,
        WebGL2RenderingContext.PACK_SKIP_PIXELS,
        WebGL2RenderingContext.PACK_SKIP_ROWS,
        WebGL2RenderingContext.UNPACK_ROW_LENGTH,
        WebGL2RenderingContext.UNPACK_IMAGE_HEIGHT,
        WebGL2RenderingContext.UNPACK_SKIP_PIXELS,
        WebGL2RenderingContext.UNPACK_SKIP_ROWS,
        WebGL2RenderingContext.UNPACK_SKIP_IMAGES
    }
)
public @interface PixelStorageParameter {
  final class Validator {
    private Validator() {
    }

    @PixelStorageParameter
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@PixelStorageParameter annotated value must be one of [WebGL2RenderingContext.PACK_ALIGNMENT, WebGL2RenderingContext.UNPACK_ALIGNMENT, WebGL2RenderingContext.UNPACK_FLIP_Y_WEBGL, WebGL2RenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL, WebGL2RenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL, WebGL2RenderingContext.PACK_ROW_LENGTH, WebGL2RenderingContext.PACK_SKIP_PIXELS, WebGL2RenderingContext.PACK_SKIP_ROWS, WebGL2RenderingContext.UNPACK_ROW_LENGTH, WebGL2RenderingContext.UNPACK_IMAGE_HEIGHT, WebGL2RenderingContext.UNPACK_SKIP_PIXELS, WebGL2RenderingContext.UNPACK_SKIP_ROWS, WebGL2RenderingContext.UNPACK_SKIP_IMAGES] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.PACK_ALIGNMENT == value || WebGL2RenderingContext.UNPACK_ALIGNMENT == value || WebGL2RenderingContext.UNPACK_FLIP_Y_WEBGL == value || WebGL2RenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL == value || WebGL2RenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL == value || WebGL2RenderingContext.PACK_ROW_LENGTH == value || WebGL2RenderingContext.PACK_SKIP_PIXELS == value || WebGL2RenderingContext.PACK_SKIP_ROWS == value || WebGL2RenderingContext.UNPACK_ROW_LENGTH == value || WebGL2RenderingContext.UNPACK_IMAGE_HEIGHT == value || WebGL2RenderingContext.UNPACK_SKIP_PIXELS == value || WebGL2RenderingContext.UNPACK_SKIP_ROWS == value || WebGL2RenderingContext.UNPACK_SKIP_IMAGES == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.PACK_ALIGNMENT == value ? "PACK_ALIGNMENT" : WebGL2RenderingContext.UNPACK_ALIGNMENT == value ? "UNPACK_ALIGNMENT" : WebGL2RenderingContext.UNPACK_FLIP_Y_WEBGL == value ? "UNPACK_FLIP_Y_WEBGL" : WebGL2RenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL == value ? "UNPACK_PREMULTIPLY_ALPHA_WEBGL" : WebGL2RenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL == value ? "UNPACK_COLORSPACE_CONVERSION_WEBGL" : WebGL2RenderingContext.PACK_ROW_LENGTH == value ? "PACK_ROW_LENGTH" : WebGL2RenderingContext.PACK_SKIP_PIXELS == value ? "PACK_SKIP_PIXELS" : WebGL2RenderingContext.PACK_SKIP_ROWS == value ? "PACK_SKIP_ROWS" : WebGL2RenderingContext.UNPACK_ROW_LENGTH == value ? "UNPACK_ROW_LENGTH" : WebGL2RenderingContext.UNPACK_IMAGE_HEIGHT == value ? "UNPACK_IMAGE_HEIGHT" : WebGL2RenderingContext.UNPACK_SKIP_PIXELS == value ? "UNPACK_SKIP_PIXELS" : WebGL2RenderingContext.UNPACK_SKIP_ROWS == value ? "UNPACK_SKIP_ROWS" : WebGL2RenderingContext.UNPACK_SKIP_IMAGES == value ? "UNPACK_SKIP_IMAGES" : "Unknown value " + value;
    }
  }
}
