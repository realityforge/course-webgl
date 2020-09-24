package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = OffscreenRenderingContextId.class
)
public @interface OffscreenRenderingContextId {
  @Nonnull
  String _2d = "2d";

  @Nonnull
  String bitmaprenderer = "bitmaprenderer";

  @Nonnull
  String webgl = "webgl";

  @Nonnull
  String webgl2 = "webgl2";
}
