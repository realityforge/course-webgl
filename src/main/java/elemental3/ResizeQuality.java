package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ResizeQuality.class
)
public @interface ResizeQuality {
  @Nonnull
  String high = "high";

  @Nonnull
  String low = "low";

  @Nonnull
  String medium = "medium";

  @Nonnull
  String pixelated = "pixelated";
}
