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

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AnimationPlayState.finished.equals( value ) || AnimationPlayState.idle.equals( value ) || AnimationPlayState.paused.equals( value ) || AnimationPlayState.running.equals( value );
    }
  }
}
