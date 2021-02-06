package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = WakeLockType.class
)
public @interface WakeLockType {
  @Nonnull
  String screen = "screen";

  final class Validator {
    private Validator() {
    }

    @WakeLockType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return WakeLockType.screen.equals( value );
    }
  }
}
