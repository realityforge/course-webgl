package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = IterationCompositeOperation.class
)
public @interface IterationCompositeOperation {
  @Nonnull
  String accumulate = "accumulate";

  @Nonnull
  String replace = "replace";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return IterationCompositeOperation.accumulate.equals( value ) || IterationCompositeOperation.replace.equals( value );
    }
  }
}
