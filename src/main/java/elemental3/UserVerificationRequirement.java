package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = UserVerificationRequirement.class
)
public @interface UserVerificationRequirement {
  @Nonnull
  String discouraged = "discouraged";

  @Nonnull
  String preferred = "preferred";

  @Nonnull
  String required = "required";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return UserVerificationRequirement.discouraged.equals( value ) || UserVerificationRequirement.preferred.equals( value ) || UserVerificationRequirement.required.equals( value );
    }
  }
}
