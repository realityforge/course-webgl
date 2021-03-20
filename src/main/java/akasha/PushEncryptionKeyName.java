package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PushEncryptionKeyName.class
)
public @interface PushEncryptionKeyName {
  @Nonnull
  String auth = "auth";

  @Nonnull
  String p256dh = "p256dh";

  final class Util {
    private Util() {
    }

    @PushEncryptionKeyName
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PushEncryptionKeyName.auth.equals( value ) || PushEncryptionKeyName.p256dh.equals( value );
    }
  }
}
