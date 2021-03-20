package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ScrollRestoration.class
)
public @interface ScrollRestoration {
  @Nonnull
  String auto = "auto";

  @Nonnull
  String manual = "manual";

  final class Util {
    private Util() {
    }

    @ScrollRestoration
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ScrollRestoration.auto.equals( value ) || ScrollRestoration.manual.equals( value );
    }
  }
}
