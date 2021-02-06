package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = OrientationLockType.class
)
public @interface OrientationLockType {
  @Nonnull
  String any = "any";

  @Nonnull
  String landscape = "landscape";

  @Nonnull
  String landscape_primary = "landscape-primary";

  @Nonnull
  String landscape_secondary = "landscape-secondary";

  @Nonnull
  String natural = "natural";

  @Nonnull
  String portrait = "portrait";

  @Nonnull
  String portrait_primary = "portrait-primary";

  @Nonnull
  String portrait_secondary = "portrait-secondary";

  final class Validator {
    private Validator() {
    }

    @OrientationLockType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return OrientationLockType.any.equals( value ) || OrientationLockType.landscape.equals( value ) || OrientationLockType.landscape_primary.equals( value ) || OrientationLockType.landscape_secondary.equals( value ) || OrientationLockType.natural.equals( value ) || OrientationLockType.portrait.equals( value ) || OrientationLockType.portrait_primary.equals( value ) || OrientationLockType.portrait_secondary.equals( value );
    }
  }
}
