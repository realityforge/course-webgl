package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PublicKeyCredentialType.class
)
public @interface PublicKeyCredentialType {
  @Nonnull
  String public_key = "public-key";

  final class Validator {
    private Validator() {
    }

    @PublicKeyCredentialType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PublicKeyCredentialType.public_key.equals( value );
    }
  }
}
