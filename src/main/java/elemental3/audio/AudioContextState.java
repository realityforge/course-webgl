package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AudioContextState.class
)
public @interface AudioContextState {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String running = "running";

  @Nonnull
  String suspended = "suspended";
}
