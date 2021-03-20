package akasha;

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

  final class Util {
    private Util() {
    }

    @AuthenticatorAttachment
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AuthenticatorAttachment.cross_platform.equals( value ) || AuthenticatorAttachment.platform.equals( value );
    }
  }
}
