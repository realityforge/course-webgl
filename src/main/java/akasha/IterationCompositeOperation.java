package akasha;

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

  final class Util {
    private Util() {
    }

    @IterationCompositeOperation
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return IterationCompositeOperation.accumulate.equals( value ) || IterationCompositeOperation.replace.equals( value );
    }
  }
}
