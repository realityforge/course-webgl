package akasha.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = BitrateMode.class
)
public @interface BitrateMode {
  @Nonnull
  String constant = "constant";

  @Nonnull
  String variable = "variable";

  final class Util {
    private Util() {
    }

    @BitrateMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return BitrateMode.constant.equals( value ) || BitrateMode.variable.equals( value );
    }
  }
}
