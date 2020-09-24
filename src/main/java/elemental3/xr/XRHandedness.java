package elemental3.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRHandedness.class
)
public @interface XRHandedness {
  @Nonnull
  String left = "left";

  @Nonnull
  String none = "none";

  @Nonnull
  String right = "right";
}
