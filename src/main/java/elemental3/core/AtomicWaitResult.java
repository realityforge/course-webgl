package elemental3.core;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The result of waiting on a value.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AtomicWaitResult.class
)
public @interface AtomicWaitResult {
  @Nonnull
  String not_equal = "not-equal";

  @Nonnull
  String ok = "ok";

  @Nonnull
  String timed_out = "timed-out";

  final class Validator {
    private Validator() {
    }

    @AtomicWaitResult
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AtomicWaitResult.not_equal.equals( value ) || AtomicWaitResult.ok.equals( value ) || AtomicWaitResult.timed_out.equals( value );
    }
  }
}
