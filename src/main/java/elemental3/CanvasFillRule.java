package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanvasFillRule.class
)
public @interface CanvasFillRule {
  @Nonnull
  String evenodd = "evenodd";

  @Nonnull
  String nonzero = "nonzero";

  final class Validator {
    private Validator() {
    }

    @CanvasFillRule
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanvasFillRule.evenodd.equals( value ) || CanvasFillRule.nonzero.equals( value );
    }
  }
}
