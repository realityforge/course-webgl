package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
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

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.PACK_ALIGNMENT == value || WebGL2RenderingContext.UNPACK_ALIGNMENT == value || WebGL2RenderingContext.UNPACK_FLIP_Y_WEBGL == value || WebGL2RenderingContext.UNPACK_PREMULTIPLY_ALPHA_WEBGL == value || WebGL2RenderingContext.UNPACK_COLORSPACE_CONVERSION_WEBGL == value || WebGL2RenderingContext.PACK_ROW_LENGTH == value || WebGL2RenderingContext.PACK_SKIP_PIXELS == value || WebGL2RenderingContext.PACK_SKIP_ROWS == value || WebGL2RenderingContext.UNPACK_ROW_LENGTH == value || WebGL2RenderingContext.UNPACK_IMAGE_HEIGHT == value || WebGL2RenderingContext.UNPACK_SKIP_PIXELS == value || WebGL2RenderingContext.UNPACK_SKIP_ROWS == value || WebGL2RenderingContext.UNPACK_SKIP_IMAGES == value;
    }
  }
}
