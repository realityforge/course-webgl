package akasha.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.DEPTH_STENCIL_ATTACHMENT,
        WebGL2RenderingContext.COLOR_ATTACHMENT0,
        WebGL2RenderingContext.COLOR_ATTACHMENT1,
        WebGL2RenderingContext.COLOR_ATTACHMENT2,
        WebGL2RenderingContext.COLOR_ATTACHMENT3,
        WebGL2RenderingContext.COLOR_ATTACHMENT4,
        WebGL2RenderingContext.COLOR_ATTACHMENT5,
        WebGL2RenderingContext.COLOR_ATTACHMENT6,
        WebGL2RenderingContext.COLOR_ATTACHMENT7,
        WebGL2RenderingContext.COLOR_ATTACHMENT8,
        WebGL2RenderingContext.COLOR_ATTACHMENT9,
        WebGL2RenderingContext.COLOR_ATTACHMENT10,
        WebGL2RenderingContext.COLOR_ATTACHMENT11,
        WebGL2RenderingContext.COLOR_ATTACHMENT12,
        WebGL2RenderingContext.COLOR_ATTACHMENT13,
        WebGL2RenderingContext.COLOR_ATTACHMENT14,
        WebGL2RenderingContext.COLOR_ATTACHMENT15,
        WebGL2RenderingContext.DEPTH_ATTACHMENT,
        WebGL2RenderingContext.STENCIL_ATTACHMENT
    }
)
public @interface FramebufferAttachment {
  final class Util {
    private Util() {
    }

    @FramebufferAttachment
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@FramebufferAttachment annotated value must be one of [WebGL2RenderingContext.COLOR_ATTACHMENT0, WebGL2RenderingContext.DEPTH_ATTACHMENT, WebGL2RenderingContext.STENCIL_ATTACHMENT, WebGL2RenderingContext.DEPTH_STENCIL_ATTACHMENT, WebGL2RenderingContext.COLOR_ATTACHMENT1, WebGL2RenderingContext.COLOR_ATTACHMENT2, WebGL2RenderingContext.COLOR_ATTACHMENT3, WebGL2RenderingContext.COLOR_ATTACHMENT4, WebGL2RenderingContext.COLOR_ATTACHMENT5, WebGL2RenderingContext.COLOR_ATTACHMENT6, WebGL2RenderingContext.COLOR_ATTACHMENT7, WebGL2RenderingContext.COLOR_ATTACHMENT8, WebGL2RenderingContext.COLOR_ATTACHMENT9, WebGL2RenderingContext.COLOR_ATTACHMENT10, WebGL2RenderingContext.COLOR_ATTACHMENT11, WebGL2RenderingContext.COLOR_ATTACHMENT12, WebGL2RenderingContext.COLOR_ATTACHMENT13, WebGL2RenderingContext.COLOR_ATTACHMENT14, WebGL2RenderingContext.COLOR_ATTACHMENT15] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.COLOR_ATTACHMENT0 == value || WebGL2RenderingContext.DEPTH_ATTACHMENT == value || WebGL2RenderingContext.STENCIL_ATTACHMENT == value || WebGL2RenderingContext.DEPTH_STENCIL_ATTACHMENT == value || WebGL2RenderingContext.COLOR_ATTACHMENT1 == value || WebGL2RenderingContext.COLOR_ATTACHMENT2 == value || WebGL2RenderingContext.COLOR_ATTACHMENT3 == value || WebGL2RenderingContext.COLOR_ATTACHMENT4 == value || WebGL2RenderingContext.COLOR_ATTACHMENT5 == value || WebGL2RenderingContext.COLOR_ATTACHMENT6 == value || WebGL2RenderingContext.COLOR_ATTACHMENT7 == value || WebGL2RenderingContext.COLOR_ATTACHMENT8 == value || WebGL2RenderingContext.COLOR_ATTACHMENT9 == value || WebGL2RenderingContext.COLOR_ATTACHMENT10 == value || WebGL2RenderingContext.COLOR_ATTACHMENT11 == value || WebGL2RenderingContext.COLOR_ATTACHMENT12 == value || WebGL2RenderingContext.COLOR_ATTACHMENT13 == value || WebGL2RenderingContext.COLOR_ATTACHMENT14 == value || WebGL2RenderingContext.COLOR_ATTACHMENT15 == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return WebGL2RenderingContext.COLOR_ATTACHMENT0 == value ? "COLOR_ATTACHMENT0" : WebGL2RenderingContext.DEPTH_ATTACHMENT == value ? "DEPTH_ATTACHMENT" : WebGL2RenderingContext.STENCIL_ATTACHMENT == value ? "STENCIL_ATTACHMENT" : WebGL2RenderingContext.DEPTH_STENCIL_ATTACHMENT == value ? "DEPTH_STENCIL_ATTACHMENT" : WebGL2RenderingContext.COLOR_ATTACHMENT1 == value ? "COLOR_ATTACHMENT1" : WebGL2RenderingContext.COLOR_ATTACHMENT2 == value ? "COLOR_ATTACHMENT2" : WebGL2RenderingContext.COLOR_ATTACHMENT3 == value ? "COLOR_ATTACHMENT3" : WebGL2RenderingContext.COLOR_ATTACHMENT4 == value ? "COLOR_ATTACHMENT4" : WebGL2RenderingContext.COLOR_ATTACHMENT5 == value ? "COLOR_ATTACHMENT5" : WebGL2RenderingContext.COLOR_ATTACHMENT6 == value ? "COLOR_ATTACHMENT6" : WebGL2RenderingContext.COLOR_ATTACHMENT7 == value ? "COLOR_ATTACHMENT7" : WebGL2RenderingContext.COLOR_ATTACHMENT8 == value ? "COLOR_ATTACHMENT8" : WebGL2RenderingContext.COLOR_ATTACHMENT9 == value ? "COLOR_ATTACHMENT9" : WebGL2RenderingContext.COLOR_ATTACHMENT10 == value ? "COLOR_ATTACHMENT10" : WebGL2RenderingContext.COLOR_ATTACHMENT11 == value ? "COLOR_ATTACHMENT11" : WebGL2RenderingContext.COLOR_ATTACHMENT12 == value ? "COLOR_ATTACHMENT12" : WebGL2RenderingContext.COLOR_ATTACHMENT13 == value ? "COLOR_ATTACHMENT13" : WebGL2RenderingContext.COLOR_ATTACHMENT14 == value ? "COLOR_ATTACHMENT14" : WebGL2RenderingContext.COLOR_ATTACHMENT15 == value ? "COLOR_ATTACHMENT15" : "Unknown value " + value;
    }
  }
}
