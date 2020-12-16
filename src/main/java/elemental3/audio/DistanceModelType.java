package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DistanceModelType.class
)
public @interface DistanceModelType {
  @Nonnull
  String exponential = "exponential";

  @Nonnull
  String inverse = "inverse";

  @Nonnull
  String linear = "linear";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return DistanceModelType.exponential.equals( value ) || DistanceModelType.inverse.equals( value ) || DistanceModelType.linear.equals( value );
    }
  }
}
