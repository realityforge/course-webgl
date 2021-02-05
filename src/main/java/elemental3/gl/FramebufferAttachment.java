package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.COLOR_ATTACHMENT0,
        WebGL2RenderingContext.DEPTH_ATTACHMENT,
        WebGL2RenderingContext.STENCIL_ATTACHMENT,
        WebGL2RenderingContext.DEPTH_STENCIL_ATTACHMENT,
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
        WEBGL_draw_buffers.COLOR_ATTACHMENT0_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT1_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT2_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT3_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT4_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT5_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT6_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT7_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT8_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT9_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT10_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT11_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT12_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT13_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT14_WEBGL,
        WEBGL_draw_buffers.COLOR_ATTACHMENT15_WEBGL
    }
)
public @interface FramebufferAttachment {
  final class Validator {
    private Validator() {
    }

    @FramebufferAttachment
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@FramebufferAttachment annotated value must be one of [WebGL2RenderingContext.COLOR_ATTACHMENT0, WebGL2RenderingContext.DEPTH_ATTACHMENT, WebGL2RenderingContext.STENCIL_ATTACHMENT, WebGL2RenderingContext.DEPTH_STENCIL_ATTACHMENT, WebGL2RenderingContext.COLOR_ATTACHMENT1, WebGL2RenderingContext.COLOR_ATTACHMENT2, WebGL2RenderingContext.COLOR_ATTACHMENT3, WebGL2RenderingContext.COLOR_ATTACHMENT4, WebGL2RenderingContext.COLOR_ATTACHMENT5, WebGL2RenderingContext.COLOR_ATTACHMENT6, WebGL2RenderingContext.COLOR_ATTACHMENT7, WebGL2RenderingContext.COLOR_ATTACHMENT8, WebGL2RenderingContext.COLOR_ATTACHMENT9, WebGL2RenderingContext.COLOR_ATTACHMENT10, WebGL2RenderingContext.COLOR_ATTACHMENT11, WebGL2RenderingContext.COLOR_ATTACHMENT12, WebGL2RenderingContext.COLOR_ATTACHMENT13, WebGL2RenderingContext.COLOR_ATTACHMENT14, WebGL2RenderingContext.COLOR_ATTACHMENT15, WEBGL_draw_buffers.COLOR_ATTACHMENT0_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT1_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT2_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT3_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT4_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT5_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT6_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT7_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT8_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT9_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT10_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT11_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT12_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT13_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT14_WEBGL, WEBGL_draw_buffers.COLOR_ATTACHMENT15_WEBGL] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.COLOR_ATTACHMENT0 == value || WebGL2RenderingContext.DEPTH_ATTACHMENT == value || WebGL2RenderingContext.STENCIL_ATTACHMENT == value || WebGL2RenderingContext.DEPTH_STENCIL_ATTACHMENT == value || WebGL2RenderingContext.COLOR_ATTACHMENT1 == value || WebGL2RenderingContext.COLOR_ATTACHMENT2 == value || WebGL2RenderingContext.COLOR_ATTACHMENT3 == value || WebGL2RenderingContext.COLOR_ATTACHMENT4 == value || WebGL2RenderingContext.COLOR_ATTACHMENT5 == value || WebGL2RenderingContext.COLOR_ATTACHMENT6 == value || WebGL2RenderingContext.COLOR_ATTACHMENT7 == value || WebGL2RenderingContext.COLOR_ATTACHMENT8 == value || WebGL2RenderingContext.COLOR_ATTACHMENT9 == value || WebGL2RenderingContext.COLOR_ATTACHMENT10 == value || WebGL2RenderingContext.COLOR_ATTACHMENT11 == value || WebGL2RenderingContext.COLOR_ATTACHMENT12 == value || WebGL2RenderingContext.COLOR_ATTACHMENT13 == value || WebGL2RenderingContext.COLOR_ATTACHMENT14 == value || WebGL2RenderingContext.COLOR_ATTACHMENT15 == value || WEBGL_draw_buffers.COLOR_ATTACHMENT0_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT1_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT2_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT3_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT4_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT5_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT6_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT7_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT8_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT9_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT10_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT11_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT12_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT13_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT14_WEBGL == value || WEBGL_draw_buffers.COLOR_ATTACHMENT15_WEBGL == value;
    }
  }
}
