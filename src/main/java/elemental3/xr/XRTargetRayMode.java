package elemental3.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRTargetRayMode.class
)
public @interface XRTargetRayMode {
  @Nonnull
  String gaze = "gaze";

  @Nonnull
  String screen = "screen";

  @Nonnull
  String tracked_pointer = "tracked-pointer";
}
