package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PlaybackDirection.class
)
public @interface PlaybackDirection {
  @Nonnull
  String alternate = "alternate";

  @Nonnull
  String alternate_reverse = "alternate-reverse";

  @Nonnull
  String normal = "normal";

  @Nonnull
  String reverse = "reverse";

  final class Validator {
    private Validator() {
    }

    @PlaybackDirection
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PlaybackDirection.alternate.equals( value ) || PlaybackDirection.alternate_reverse.equals( value ) || PlaybackDirection.normal.equals( value ) || PlaybackDirection.reverse.equals( value );
    }
  }
}
