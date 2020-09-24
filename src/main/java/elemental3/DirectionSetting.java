package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DirectionSetting.class
)
public @interface DirectionSetting {
  @Nonnull
  String horizontal = "";

  @Nonnull
  String lr = "lr";

  @Nonnull
  String rl = "rl";
}
