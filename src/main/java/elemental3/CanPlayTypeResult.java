package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanPlayTypeResult.class
)
public @interface CanPlayTypeResult {
  @Nonnull
  String negative = "";

  @Nonnull
  String maybe = "maybe";

  @Nonnull
  String probably = "probably";

  final class Validator {
    private Validator() {
    }

    @CanPlayTypeResult
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanPlayTypeResult.negative.equals( value ) || CanPlayTypeResult.maybe.equals( value ) || CanPlayTypeResult.probably.equals( value );
    }
  }
}
