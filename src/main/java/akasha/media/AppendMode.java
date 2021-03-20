package akasha.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AppendMode.class
)
public @interface AppendMode {
  @Nonnull
  String segments = "segments";

  @Nonnull
  String sequence = "sequence";

  final class Util {
    private Util() {
    }

    @AppendMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AppendMode.segments.equals( value ) || AppendMode.sequence.equals( value );
    }
  }
}
