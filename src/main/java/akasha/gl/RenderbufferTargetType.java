package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = WebGL2RenderingContext.RENDERBUFFER
)
public @interface RenderbufferTargetType {
  final class Util {
    private Util() {
    }

    @RenderbufferTargetType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@RenderbufferTargetType annotated value must be one of [WebGL2RenderingContext.RENDERBUFFER] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.RENDERBUFFER == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.RENDERBUFFER == value ? "RENDERBUFFER" : "Unknown value " + value;
    }
  }
}
