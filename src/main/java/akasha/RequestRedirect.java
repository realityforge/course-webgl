package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RequestRedirect.class
)
public @interface RequestRedirect {
  @Nonnull
  String error = "error";

  @Nonnull
  String follow = "follow";

  @Nonnull
  String manual = "manual";

  final class Util {
    private Util() {
    }

    @RequestRedirect
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RequestRedirect.error.equals( value ) || RequestRedirect.follow.equals( value ) || RequestRedirect.manual.equals( value );
    }
  }
}
