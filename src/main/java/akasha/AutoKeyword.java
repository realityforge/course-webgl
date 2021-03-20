package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AutoKeyword.class
)
public @interface AutoKeyword {
  @Nonnull
  String auto = "auto";

  final class Util {
    private Util() {
    }

    @AutoKeyword
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AutoKeyword.auto.equals( value );
    }
  }
}
