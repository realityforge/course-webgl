package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = KeyFormat.class
)
public @interface KeyFormat {
  @Nonnull
  String jwk = "jwk";

  @Nonnull
  String pkcs8 = "pkcs8";

  @Nonnull
  String raw = "raw";

  @Nonnull
  String spki = "spki";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return KeyFormat.jwk.equals( value ) || KeyFormat.pkcs8.equals( value ) || KeyFormat.raw.equals( value ) || KeyFormat.spki.equals( value );
    }
  }
}
