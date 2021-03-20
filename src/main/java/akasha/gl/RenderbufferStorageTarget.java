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
public @interface RenderbufferStorageTarget {
  final class Util {
    private Util() {
    }

    @RenderbufferStorageTarget
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@RenderbufferStorageTarget annotated value must be one of [WebGL2RenderingContext.RENDERBUFFER] but is " + value;
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
