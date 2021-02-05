package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.ARRAY_BUFFER,
        WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER,
        WebGL2RenderingContext.COPY_READ_BUFFER,
        WebGL2RenderingContext.COPY_WRITE_BUFFER,
        WebGL2RenderingContext.TRANSFORM_FEEDBACK_BUFFER,
        WebGL2RenderingContext.UNIFORM_BUFFER,
        WebGL2RenderingContext.PIXEL_PACK_BUFFER,
        WebGL2RenderingContext.PIXEL_UNPACK_BUFFER
    }
)
public @interface BufferTargetType {
  final class Validator {
    private Validator() {
    }

    @BufferTargetType
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@BufferTargetType annotated value must be one of [WebGL2RenderingContext.ARRAY_BUFFER, WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER, WebGL2RenderingContext.COPY_READ_BUFFER, WebGL2RenderingContext.COPY_WRITE_BUFFER, WebGL2RenderingContext.TRANSFORM_FEEDBACK_BUFFER, WebGL2RenderingContext.UNIFORM_BUFFER, WebGL2RenderingContext.PIXEL_PACK_BUFFER, WebGL2RenderingContext.PIXEL_UNPACK_BUFFER] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.ARRAY_BUFFER == value || WebGL2RenderingContext.ELEMENT_ARRAY_BUFFER == value || WebGL2RenderingContext.COPY_READ_BUFFER == value || WebGL2RenderingContext.COPY_WRITE_BUFFER == value || WebGL2RenderingContext.TRANSFORM_FEEDBACK_BUFFER == value || WebGL2RenderingContext.UNIFORM_BUFFER == value || WebGL2RenderingContext.PIXEL_PACK_BUFFER == value || WebGL2RenderingContext.PIXEL_UNPACK_BUFFER == value;
    }
  }
}
