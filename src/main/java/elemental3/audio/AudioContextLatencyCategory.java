package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AudioContextLatencyCategory.class
)
public @interface AudioContextLatencyCategory {
  @Nonnull
  String balanced = "balanced";

  @Nonnull
  String interactive = "interactive";

  @Nonnull
  String playback = "playback";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AudioContextLatencyCategory.balanced.equals( value ) || AudioContextLatencyCategory.interactive.equals( value ) || AudioContextLatencyCategory.playback.equals( value );
    }
  }
}
