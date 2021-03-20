package akasha.audio;

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

  final class Util {
    private Util() {
    }

    @AudioContextLatencyCategory
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AudioContextLatencyCategory.balanced.equals( value ) || AudioContextLatencyCategory.interactive.equals( value ) || AudioContextLatencyCategory.playback.equals( value );
    }
  }
}
