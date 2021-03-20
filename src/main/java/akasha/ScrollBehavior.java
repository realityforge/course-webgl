package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ScrollBehavior.class
)
public @interface ScrollBehavior {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String smooth = "smooth";

  final class Util {
    private Util() {
    }

    @ScrollBehavior
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ScrollBehavior.auto.equals( value ) || ScrollBehavior.smooth.equals( value );
    }
  }
}
