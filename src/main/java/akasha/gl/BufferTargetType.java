package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.ARRAY_BUFFER,
        WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER,
        WebGL2RenderingContext.PIXEL_PACK_BUFFER,
        WebGL2RenderingContext.PIXEL_UNPACK_BUFFER,
        WebGL2RenderingContext.UNIFORM_BUFFER,
        WebGL2RenderingContext.TRANSFORM_FEEDBACK_BUFFER,
        WebGL2RenderingContext.COPY_READ_BUFFER,
        WebGL2RenderingContext.COPY_WRITE_BUFFER
    }
)
public @interface BufferTargetType {
  final class Util {
    private Util() {
    }

    @BufferTargetType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@BufferTargetType annotated value must be one of [WebGL2RenderingContext.ARRAY_BUFFER, WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, WebGL2RenderingContext.COPY_READ_BUFFER, WebGL2RenderingContext.COPY_WRITE_BUFFER, WebGL2RenderingContext.TRANSFORM_FEEDBACK_BUFFER, WebGL2RenderingContext.UNIFORM_BUFFER, WebGL2RenderingContext.PIXEL_PACK_BUFFER, WebGL2RenderingContext.PIXEL_UNPACK_BUFFER] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.ARRAY_BUFFER == value || WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER == value || WebGL2RenderingContext.COPY_READ_BUFFER == value || WebGL2RenderingContext.COPY_WRITE_BUFFER == value || WebGL2RenderingContext.TRANSFORM_FEEDBACK_BUFFER == value || WebGL2RenderingContext.UNIFORM_BUFFER == value || WebGL2RenderingContext.PIXEL_PACK_BUFFER == value || WebGL2RenderingContext.PIXEL_UNPACK_BUFFER == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.ARRAY_BUFFER == value ? "ARRAY_BUFFER" : WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER == value ? "ELEMENT_ARRAY_BUFFER" : WebGL2RenderingContext.COPY_READ_BUFFER == value ? "COPY_READ_BUFFER" : WebGL2RenderingContext.COPY_WRITE_BUFFER == value ? "COPY_WRITE_BUFFER" : WebGL2RenderingContext.TRANSFORM_FEEDBACK_BUFFER == value ? "TRANSFORM_FEEDBACK_BUFFER" : WebGL2RenderingContext.UNIFORM_BUFFER == value ? "UNIFORM_BUFFER" : WebGL2RenderingContext.PIXEL_PACK_BUFFER == value ? "PIXEL_PACK_BUFFER" : WebGL2RenderingContext.PIXEL_UNPACK_BUFFER == value ? "PIXEL_UNPACK_BUFFER" : "Unknown value " + value;
    }
  }
}
