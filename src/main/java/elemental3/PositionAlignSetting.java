package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PositionAlignSetting.class
)
public @interface PositionAlignSetting {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String center = "center";

  @Nonnull
  String line_left = "line_left";

  @Nonnull
  String line_right = "line_right";
}
