package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AuthenticatorAttachment.class
)
public @interface AuthenticatorAttachment {
  @Nonnull
  String cross_platform = "cross-platform";

  @Nonnull
  String platform = "platform";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AuthenticatorAttachment.cross_platform.equals( value ) || AuthenticatorAttachment.platform.equals( value );
    }
  }
}
