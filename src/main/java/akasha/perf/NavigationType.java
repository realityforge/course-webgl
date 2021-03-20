package akasha.perf;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = NavigationType.class
)
public @interface NavigationType {
  @Nonnull
  String back_forward = "back_forward";

  @Nonnull
  String navigate = "navigate";

  @Nonnull
  String prerender = "prerender";

  @Nonnull
  String reload = "reload";

  final class Util {
    private Util() {
    }

    @NavigationType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return NavigationType.back_forward.equals( value ) || NavigationType.navigate.equals( value ) || NavigationType.prerender.equals( value ) || NavigationType.reload.equals( value );
    }
  }
}
