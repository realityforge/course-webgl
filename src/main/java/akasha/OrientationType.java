package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = OrientationType.class
)
public @interface OrientationType {
  @Nonnull
  String landscape_primary = "landscape-primary";

  @Nonnull
  String landscape_secondary = "landscape-secondary";

  @Nonnull
  String portrait_primary = "portrait-primary";

  @Nonnull
  String portrait_secondary = "portrait-secondary";

  final class Util {
    private Util() {
    }

    @OrientationType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return OrientationType.landscape_primary.equals( value ) || OrientationType.landscape_secondary.equals( value ) || OrientationType.portrait_primary.equals( value ) || OrientationType.portrait_secondary.equals( value );
    }
  }
}
