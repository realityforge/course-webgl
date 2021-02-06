package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = KeyUsage.class
)
public @interface KeyUsage {
  @Nonnull
  String decrypt = "decrypt";

  @Nonnull
  String deriveBits = "deriveBits";

  @Nonnull
  String deriveKey = "deriveKey";

  @Nonnull
  String encrypt = "encrypt";

  @Nonnull
  String sign = "sign";

  @Nonnull
  String unwrapKey = "unwrapKey";

  @Nonnull
  String verify = "verify";

  @Nonnull
  String wrapKey = "wrapKey";

  final class Validator {
    private Validator() {
    }

    @KeyUsage
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return KeyUsage.decrypt.equals( value ) || KeyUsage.deriveBits.equals( value ) || KeyUsage.deriveKey.equals( value ) || KeyUsage.encrypt.equals( value ) || KeyUsage.sign.equals( value ) || KeyUsage.unwrapKey.equals( value ) || KeyUsage.verify.equals( value ) || KeyUsage.wrapKey.equals( value );
    }
  }
}
