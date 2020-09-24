package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GamepadHand.class
)
public @interface GamepadHand {
  @Nonnull
  String other = "";

  @Nonnull
  String left = "left";

  @Nonnull
  String right = "right";
}
