package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.BLEND,
        WebGL2RenderingContext.CULL_FACE,
        WebGL2RenderingContext.DEPTH_TEST,
        WebGL2RenderingContext.DITHER,
        WebGL2RenderingContext.POLYGON_OFFSET_FILL,
        WebGL2RenderingContext.SAMPLE_ALPHA_TO_COVERAGE,
        WebGL2RenderingContext.SAMPLE_COVERAGE,
        WebGL2RenderingContext.SCISSOR_TEST,
        WebGL2RenderingContext.STENCIL_TEST,
        WebGL2RenderingContext.RASTERIZER_DISCARD
    }
)
public @interface Capability {
  final class Validator {
    private Validator() {
    }

    @Capability
    public static int cast(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@Capability annotated value must be one of [WebGL2RenderingContext.BLEND, WebGL2RenderingContext.CULL_FACE, WebGL2RenderingContext.DEPTH_TEST, WebGL2RenderingContext.DITHER, WebGL2RenderingContext.POLYGON_OFFSET_FILL, WebGL2RenderingContext.SAMPLE_ALPHA_TO_COVERAGE, WebGL2RenderingContext.SAMPLE_COVERAGE, WebGL2RenderingContext.SCISSOR_TEST, WebGL2RenderingContext.STENCIL_TEST, WebGL2RenderingContext.RASTERIZER_DISCARD] but is " + value;
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.BLEND == value || WebGL2RenderingContext.CULL_FACE == value || WebGL2RenderingContext.DEPTH_TEST == value || WebGL2RenderingContext.DITHER == value || WebGL2RenderingContext.POLYGON_OFFSET_FILL == value || WebGL2RenderingContext.SAMPLE_ALPHA_TO_COVERAGE == value || WebGL2RenderingContext.SAMPLE_COVERAGE == value || WebGL2RenderingContext.SCISSOR_TEST == value || WebGL2RenderingContext.STENCIL_TEST == value || WebGL2RenderingContext.RASTERIZER_DISCARD == value;
    }
  }
}
