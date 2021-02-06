package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AutomationRate.class
)
public @interface AutomationRate {
  @Nonnull
  String a_rate = "a-rate";

  @Nonnull
  String k_rate = "k-rate";

  final class Validator {
    private Validator() {
    }

    @AutomationRate
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AutomationRate.a_rate.equals( value ) || AutomationRate.k_rate.equals( value );
    }
  }
}
