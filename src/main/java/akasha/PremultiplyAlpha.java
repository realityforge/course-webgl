package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PremultiplyAlpha.class
)
public @interface PremultiplyAlpha {
  @Nonnull
  String default_ = "default";

  @Nonnull
  String none = "none";

  @Nonnull
  String premultiply = "premultiply";

  final class Util {
    private Util() {
    }

    @PremultiplyAlpha
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PremultiplyAlpha.default_.equals( value ) || PremultiplyAlpha.none.equals( value ) || PremultiplyAlpha.premultiply.equals( value );
    }
  }
}
