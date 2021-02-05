package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.FRAMEBUFFER,
        WebGL2RenderingContext.DRAW_FRAMEBUFFER,
        WebGL2RenderingContext.READ_FRAMEBUFFER
    }
)
public @interface FramebufferTargetType {
  final class Validator {
    private Validator() {
    }

    @FramebufferTargetType
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@FramebufferTargetType annotated value must be one of [WebGL2RenderingContext.FRAMEBUFFER, WebGL2RenderingContext.DRAW_FRAMEBUFFER, WebGL2RenderingContext.READ_FRAMEBUFFER] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.FRAMEBUFFER == value || WebGL2RenderingContext.DRAW_FRAMEBUFFER == value || WebGL2RenderingContext.READ_FRAMEBUFFER == value;
    }
  }
}
