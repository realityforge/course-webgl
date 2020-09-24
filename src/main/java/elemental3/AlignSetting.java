package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AlignSetting.class
)
public @interface AlignSetting {
  @Nonnull
  String center = "center";

  @Nonnull
  String end = "end";

  @Nonnull
  String left = "left";

  @Nonnull
  String right = "right";

  @Nonnull
  String start = "start";
}
