package akasha.crypto;

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

  final class Util {
    private Util() {
    }

    @KeyFormat
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return KeyFormat.jwk.equals( value ) || KeyFormat.pkcs8.equals( value ) || KeyFormat.raw.equals( value ) || KeyFormat.spki.equals( value );
    }
  }
}
