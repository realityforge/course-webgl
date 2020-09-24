package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AnimationPlayState.class
)
public @interface AnimationPlayState {
  @Nonnull
  String finished = "finished";

  @Nonnull
  String idle = "idle";

  @Nonnull
  String paused = "paused";

  @Nonnull
  String running = "running";
}
