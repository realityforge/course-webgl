package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CredentialMediationRequirement.class
)
public @interface CredentialMediationRequirement {
  @Nonnull
  String optional = "optional";

  @Nonnull
  String required = "required";

  @Nonnull
  String silent = "silent";

  final class Util {
    private Util() {
    }

    @CredentialMediationRequirement
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CredentialMediationRequirement.optional.equals( value ) || CredentialMediationRequirement.required.equals( value ) || CredentialMediationRequirement.silent.equals( value );
    }
  }
}
