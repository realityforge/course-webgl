package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = FrameType.class
)
public @interface FrameType {
  @Nonnull
  String auxiliary = "auxiliary";

  @Nonnull
  String nested = "nested";

  @Nonnull
  String none = "none";

  @Nonnull
  String top_level = "top-level";
}
